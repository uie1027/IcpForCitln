/**
 * Project Name: icpForCitln
 * File Name: MongoUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 19/04/22 15:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.user.eneity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.Date;

@Component
public class MongoUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    private static MongoUtil mongoUtil;

    /**
     * @author: guoxs
     * @date: 19/04/23 10:51
     * @since: JDK 1.8
     *
     * @description: 初始化 mongoTemplate
     * @param: []
     * @return: void
     */
    @PostConstruct
    public void init() {
        mongoUtil = this;
        mongoUtil.mongoTemplate = this.mongoTemplate;
    }

    /**
     * @author: guoxs
     * @date: 19/04/23 10:51
     * @since: JDK 1.8
     *
     * @description: 数据库更新方法
     * @param: [model]
     * @return: boolean
     */
    public static boolean upsert(Object model) {
        if (model == null){
            logger.info(model+"为空对象！");
            return false;
        }

        Query query = mongoUtil.getQuery(model);
        if (query ==null){
            logger.info("获取数据库信息失败!");
            return false;
        }
        Update update = new Update();
        Object obj;
        String fieldName;

        for (Field field:model.getClass().getDeclaredFields()){
            try {
                fieldName = field.getName();
            }catch (Exception e){
                logger.info("无法获取"+model+"对象");
                return false;
            }

            String functionName = "get"+StringUtil.toInitialUpperCase(fieldName);

            String mongoFieldName = StringUtil.toMongoDBField(fieldName);

            try {
                obj = model.getClass().getMethod(functionName).invoke(model, new Object[]{});
            }catch (Exception e){
                logger.info("无法获取"+model+"对象的值");
                return false;
            }

            if (obj!=null) {
                update.set(mongoFieldName, obj);
            }
        }

        UserInfo userInfo = UserInfoCache.get(SessionUtil.getByKey("userNum"));

        if (userInfo==null){
            logger.info("获取redis失败");
            return false;
        }

        update.currentDate("LAST_MODIFICATION_TIME");

        update.set("LAST_MODIFIER", userInfo.getUserCode());

        try {
            mongoUtil.mongoTemplate.upsert(query,update,model.getClass());
        }catch (Exception e){
            logger.info(model+"更新数据失败！");
            return false;
        }

        return true;
    }


    /**
     * @author: guoxs
     * @date: 19/04/23 10:52
     * @since: JDK 1.8
     *
     * @description: 数据库新增方法
     * @param: [model]
     * @return: boolean
     */
    public static boolean insert (Object model){
        if (model == null){
            logger.info(model+"为空对象");
            return false;
        }

        Query query = mongoUtil.getQuery(model);
        if (query==null){
            logger.info("获取数据库信息失败!");
            return false;
        }

        UserInfo user = UserInfoCache.get(SessionUtil.getByKey("userNum"));

        if (user==null){
            logger.info("获取redis失败");
            return false;
        }

        try {
            model.getClass().getMethod("setCreater",new Class[]{String.class}).invoke(model,new Object[]{user.getUserCode()});
            model.getClass().getMethod("setCreateTime",new Class[]{Date.class}).invoke(model,new Object[]{new Date()});
            model.getClass().getMethod("setLastMondifier",new Class[]{String.class}).invoke(model,new Object[]{user.getUserCode()});
            model.getClass().getMethod("setLastModificationTime",new Class[]{Date.class}).invoke(model,new Object[]{new Date()});
            model.getClass().getMethod("setIsDelete",new Class[]{Integer.class}).invoke(model,new Object[]{2});
        }catch (Exception e){
            return false;
        }

        mongoUtil.mongoTemplate.insert(model);
        return true;

    }

    /**
     * @author: guoxs
     * @date: 19/04/23 10:52
     * @since: JDK 1.8
     *
     * @description: 数据库假删除方法
     * @param: [model]
     * @return: boolean
     */
    public static boolean delete(Object model){
        if (model == null){
            logger.info(model+"为空对象");
            return false;
        }

        Query query = mongoUtil.getQuery(model);

        if (query==null){
            logger.info("获取数据库信息失败!");
            return false;
        }

        Update update = new Update();

        UserInfo userInfo = UserInfoCache.get(SessionUtil.getByKey("userNum"));

        if (userInfo==null){
            logger.info("获取redis失败");
            return false;
        }

        update.set("LAST_MODIFIER",userInfo.getUserCode());
        update.currentDate("LAST_MODIFICATION_TIME");
        update.set("IS_DELETE",1);

        mongoUtil.mongoTemplate.upsert(query,update,model.getClass());

        return true;
    }


    /**
     * @author: guoxs
     * @date: 19/04/23 10:53
     * @since: JDK 1.8
     *
     * @description: 获取数据库信息方法
     * @param: [model]
     * @return: org.springframework.data.mongodb.core.query.Query
     */
    public  Query getQuery(Object model){
        Query query;
        try {
            query = new Query(Criteria.where("_id").is(model.getClass().getMethod("getId").invoke(model, new Object[]{})));
        }catch (Exception e){
            logger.info("无法获取"+model+"对象");
            return null;
        }

        return query;
    }

}
