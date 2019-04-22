/**
 * Project Name: icpForCitln
 * File Name: MongoUpsertUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 19/04/22 15:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
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

@Component
public class MongoUpsertUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    private static MongoUpsertUtil mongoUpsertUtil;

    @PostConstruct
    public void init() {
        mongoUpsertUtil = this;
        mongoUpsertUtil.mongoTemplate = this.mongoTemplate;
    }

    public static boolean upsert(Object model) {
        if (model == null){
            logger.info(model+"为空对象！");
            return false;
        }

        Query query;
        try {
            query = new Query(Criteria.where("_id").is(model.getClass().getMethod("getId").invoke(model, new Object[]{})));
        }catch (Exception e){
            logger.info("无法获取"+model+"对象");
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

        update.currentDate("LAST_MODIFICATION_TIME");

       // update.set("LAST_MODIFIER", UserInfoCache.get(SessionUtil.getByKey("userNum")).getUserNum());

        try {
            mongoUpsertUtil.mongoTemplate.upsert(query,update,model.getClass());
        }catch (Exception e){
            logger.info(model+"更新数据失败！");
            return false;
        }

        return true;
    }
}
