/**
 * Project Name: icpForCitln
 * File Name: MongoUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 19/04/22 15:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.user.eneity.UserInfo;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static boolean upsert(Object model){
        Query query = mongoUtil.getQuery(model);
        if (model == null){
            logger.info(model+"为空对象！");
            return false;
        }

        if (query ==null){
            logger.info("获取数据库信息失败!");
            return false;
        }
        Update update = mongoUtil.getUpdate(model,query);

        mongoUtil.mongoTemplate.upsert(query,update,model.getClass());

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

        UserInfo user = BeanCopyUtil.copy(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")), UserInfo.class);

        if (user==null){
            logger.info("获取redis失败");
            return false;
        }

        try {
            model.getClass().getMethod("setId",new Class[]{String.class}).invoke(model,new Object[]{"cx" + new ObjectId()});
            model.getClass().getMethod("setCreater",new Class[]{String.class}).invoke(model,new Object[]{user.getId()});
            model.getClass().getMethod("setCreateTime",new Class[]{Date.class}).invoke(model,new Object[]{new Date()});
            model.getClass().getMethod("setLastMondifier",new Class[]{String.class}).invoke(model,new Object[]{user.getId()});
            model.getClass().getMethod("setLastModificationTime",new Class[]{Date.class}).invoke(model,new Object[]{new Date()});
            model.getClass().getMethod("setIsDelete",new Class[]{Integer.class}).invoke(model,new Object[]{2});
            model.getClass().getMethod("setIsDisplay",new Class[]{Integer.class}).invoke(model,new Object[]{1});
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

        UserInfo userInfo = BeanCopyUtil.copy(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")), UserInfo.class);

        if (userInfo==null){
            logger.info("获取redis失败");
            return false;
        }

        update.set("LAST_MODIFIER",userInfo.getId());
        update.currentDate("LAST_MODIFICATION_TIME");
        update.set("IS_DELETE",1);

        mongoUtil.mongoTemplate.upsert(query,update,model.getClass());

        return true;
    }

    /**
     * @author: guoxs
     * @date: 19/04/23 13:19
     * @since: JDK 1.8
     *
     * @description: 单表查询方法，带分页
     * @param: [pageIndex, pageSize, model]
     * @return: java.util.List
     */
    public static List select(Integer pageIndex, Integer pageSize, Object model){
        Query query;
        Criteria criteria = mongoUtil.getCriteria(model,1);

        Pageable  pageable = PageRequest.of(pageIndex, pageSize);

             query = new Query(criteria).with(pageable).with(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME"));

        return mongoUtil.mongoTemplate.find(query,model.getClass());

    }

    /**
     * @author: guoxs
     * @date: 19/04/23 14:37
     * @since: JDK 1.8
     *
     * @description: 单表查询方法,不带分页
     * @param: [model]
     * @return: java.util.List
     */
    public static List select(Object model){
        Query query;
        Criteria criteria = mongoUtil.getCriteria(model,1);

        query = new Query(criteria).with(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME"));

        return mongoUtil.mongoTemplate.find(query,model.getClass());

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
            query = new Query(Criteria.where("_id").is(model.getClass().getMethod("getId").invoke(model,null)));
        }catch (Exception e){
            logger.info("无法获取"+model+"对象");
            return null;
        }

        return query;
    }

    /**
     * @author: guoxs
     * @date: 19/04/23 14:37
     * @since: JDK 1.8
     *
     * @description: 生成查询条件
     * @param: [model]
     * @return: org.springframework.data.mongodb.core.query.Criteria
     */
    public Criteria getCriteria(Object model,Integer flag){
        Criteria criteria = new Criteria();
        List<Criteria> criteriaList = new ArrayList<>();

        Object obj;
        String fieldName;

        for (Field field:model.getClass().getDeclaredFields()){
            try {
                fieldName = field.getName();
            }catch (Exception e){
                logger.info("无法获取"+model+"对象");
                return null;
            }

            String functionName = "get"+StringUtil.toInitialUpperCase(fieldName);

            String mongoFieldName = mongoUtil.getMongoName(fieldName,flag);

            try {
                obj = model.getClass().getMethod(functionName).invoke(model,null);
            }catch (Exception e){
                logger.info("无法获取"+model+"对象的值");
                return null;
            }

            if (obj!=null){
                Criteria cri = new Criteria(mongoFieldName).regex(obj.toString());
                criteriaList.add(cri);
            }
        }

        if (criteriaList.size()>0){
            Criteria[] criteriaNum= criteriaList.toArray(new Criteria[criteriaList.size()]);
            criteria.orOperator(criteriaNum);
        }

        return criteria.and("IS_DELETE").is(2).and("IS_DISPLAY").is(1);
    }

    /**
     * @author: guoxs
     * @date: 19/05/06 18:33
     * @since: JDK 1.8
     *
     * @description: 获取Mongodb 字段名
     * @param: [fieldName, flag]
     * @return: java.lang.String
     */
    public String getMongoName(String fieldName,Integer flag){
        if (flag == 1){
            return StringUtil.toMongoDBField(fieldName);
        }else{
            return StringUtil.toMongoDBFieldByFind(fieldName);
        }
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 16:20
     * @since: JDK 1.8
     *
     * @description: getUpdate 方法
     * @param: [model, query]
     * @return: boolean
     */
    public Update getUpdate(Object model,Query query) {
        Update update = new Update();
        Object obj;
        String fieldName;

        for (Field field:model.getClass().getDeclaredFields()){
            try {
                fieldName = field.getName();
            }catch (Exception e){
                logger.info("无法获取"+model+"对象");
                return null;
            }

            String functionName = "get"+StringUtil.toInitialUpperCase(fieldName);

            String mongoFieldName = StringUtil.toMongoDBField(fieldName);

            try {
                obj = model.getClass().getMethod(functionName).invoke(model, null);
            }catch (Exception e){
                logger.info("无法获取"+model+"对象的值");
                return null;
            }

            if (obj!=null) {
                update.set(mongoFieldName, obj);
            }
        }

        UserInfo userInfo = BeanCopyUtil.copy(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")), UserInfo.class);

        if (userInfo==null){
            logger.info("获取redis失败");
            return null;
        }

        update.currentDate("LAST_MODIFICATION_TIME");

        update.set("LAST_MODIFIER", userInfo.getId());



        return update;
    }
    /**
     * @author: guoxs
     * @date: 19/04/23 17:04
     * @since: JDK 1.8
     *
     * @description: 数据库删除 List方法
     * @param: [modelList]
     * @return: boolean
     */
    public static boolean delete(List modelList){
        boolean flag = true;

        if (CollectionUtils.isEmpty(modelList)){
            logger.info("传入参数"+modelList+"为空！");
            return false;
        }

        for (Object model:modelList){
            flag=MongoUtil.delete(model);

            if (flag==false){
                logger.info(modelList+"删除失败!");
                return false;
            }
        }

        return true;
    }

    /**
     * @author: guoxs
     * @date: 19/04/23 17:04
     * @since: JDK 1.8
     *
     * @description: 数据库更新 List方法
     * @param: [modelList]
     * @return: boolean
     */
    public static boolean upsert(List modelList){
        boolean flag = true;

        if (CollectionUtils.isEmpty(modelList)){
            logger.info("传入参数"+modelList+"为空！");
            return false;
        }

        for (Object model:modelList){
            flag=MongoUtil.upsert(model);

            if (flag==false){
                logger.info(modelList+"更新失败!");
                return false;
            }
        }

        return true;
    }

    /**
     * @author: guoxs
     * @date: 19/04/23 17:03
     * @since: JDK 1.8
     *
     * @description: 数据库新增 List方法
     * @param: [modelList]
     * @return: boolean
     */
    public static boolean insert(List modelList){
        boolean flag = true;

        if (CollectionUtils.isEmpty(modelList)){
            logger.info("传入参数"+modelList+"为空！");
            return false;
        }

        for (Object model:modelList){
            flag=MongoUtil.insert(model);

            if (flag==false){
                logger.info(modelList+"插入失败!");
                return false;
            }
        }

        return true;
    }

    public static boolean upsert(Object model,Integer flag){
        if (model == null||flag == null){
            logger.info("传入对象为空！");
            return false;
        }

        String fieldName = "";
        try {
            fieldName = model.getClass().getMethod("readField").invoke(model,null).toString();
        }catch (Exception e){
            return false;
        }

        String functionName = "get"+StringUtil.toInitialUpperCase(fieldName);

        String mongoFieldName = StringUtil.toMongoDBField(fieldName);

        Query query;

        Update update = new Update();

        if (flag == 1){
            try {
                query = new Query(Criteria.where(mongoFieldName).is(model.getClass().getMethod(functionName).invoke(model,null).toString()));
            }catch (Exception e){
                return false;
            }
            update = mongoUtil.getUpdate(model,query);

            UserInfo userInfo = BeanCopyUtil.copy(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")), UserInfo.class);
            if (userInfo==null){
                logger.info("获取redis失败");
                return false;
            }

            update.currentDate("LAST_MODIFICATION_TIME");

            update.set("LAST_MODIFIER", userInfo.getId());
            mongoUtil.mongoTemplate.updateMulti(query,update,model.getClass());

        }else if (flag == 2){
            query = mongoUtil.getQuery(model);
            try {
                update.set("IS_DISPLAY",2);

                UserInfo userInfo = BeanCopyUtil.copy(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")), UserInfo.class);

                if (userInfo==null){
                    logger.info("获取redis失败");
                    return false;
                }

                update.currentDate("LAST_MODIFICATION_TIME");

                update.set("LAST_MODIFIER", userInfo.getId());

                mongoUtil.mongoTemplate.upsert(query,update,model.getClass());
                model.getClass().getMethod("setId",new Class[]{String.class}).invoke(model,new Object[]{null});
                MongoUtil.insert(model);
            }catch (Exception e){
                return false;
            }

        }
        return true;
    }

    /**
     * @author: guoxs
     * @date: 19/05/06 18:34
     * @since: JDK 1.8
     *
     * @description: mongo聚合查询
     * @param: [minorClass, mainClass, model, returnClass, pageIndex, pageSize]
     * @return: java.util.List
     */
    public static List aggregateSelect(List<Class> minorClass,Class mainClass,Object model,Class returnClass,Integer pageIndex,Integer pageSize){
        if (mainClass == null||minorClass.size() == 0||returnClass == null){
            logger.error("传入参数出错！");
            return null;
        }
        List<AggregationOperation> list = new ArrayList<>();
        for (Class clazz:minorClass){
            String mongoName = StringUtil.ToTableName(clazz.getSimpleName());
            AggregationOperation lookup = Aggregation.lookup(mongoName,mongoName+"_ID","_id",mongoName);
            list.add(lookup);
        }

        list.add(Aggregation.match(mongoUtil.getCriteria(model,2)));
        list.add(Aggregation.skip(pageIndex));
        list.add(Aggregation.limit(pageSize));
        list.add(Aggregation.sort(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME")));
        Aggregation aggregation = Aggregation.newAggregation(
                list.toArray(new AggregationOperation[list.size()])
        );
        return   mongoUtil.mongoTemplate.aggregate(aggregation,StringUtil.ToTableName(mainClass.getSimpleName()),returnClass).getMappedResults();
    }
}
