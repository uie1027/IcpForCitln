/**
 * Project Name: icpForCitln
 * File Name: RedisCommonUtil
 * Package Name: icp.icpForCitln.common.cache
 * Date: 2019-04-24 上午 11:24
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Component
public class RedisUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private static RedisUtil redisCommonUtil;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:21
     * @since: JDK 1.8
     *
     * @description: 初始化 redisTemplate
     * @param: []
     * @return: void
     */
    @PostConstruct
    public void init() {
        redisCommonUtil = this;
        redisCommonUtil.redisTemplate = this.redisTemplate;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:22
     * @since: JDK 1.8
     *
     * @description: Redis 存
     * @param: [object]
     * @return: void
     */
    public static void put(Object object){
        if(StringUtil.isEmpty(getRedisObjectKey(object))){
            logger.info("Hash 值为空，保存数据失败");
            return;
        }
        if(StringUtil.isEmpty(getRedisKey(object))){
            logger.info("Hash key 值为空，保存数据失败");
            return;
        }
        try {
            redisCommonUtil.redisTemplate.opsForHash().put(getRedisObjectKey(object), getRedisKey(object), object);
        } catch (Exception e){
            logger.error("保存信息失败" + e);
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:27
     * @since: JDK 1.8
     *
     * @description: Redis 获取对象
     * @param: [object]
     * @return: java.lang.Object
     */
    public static Object get(Object object){
        if(StringUtil.isEmpty(getRedisObjectKey(object))){
            logger.info("Hash 值为空，未查询到数据");
            return null;
        }
        if(StringUtil.isEmpty(getRedisKey(object))){
            logger.info("Hash key 值为空，未查询到数据");
            return null;
        }
        try{
            return redisCommonUtil.redisTemplate.opsForHash().get(getRedisObjectKey(object), getRedisKey(object));
        } catch (Exception e){
            logger.error("查询信息失败" + e);
            return null;
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:28
     * @since: JDK 1.8
     *
     * @description: Redis 删除
     * @param: [object]
     * @return: void
     */
    public static void delete(Object object){
        if(StringUtil.isEmpty(getRedisObjectKey(object))){
            logger.info("Hash 值为空，删除数据失败");
            return;
        }
        if(StringUtil.isEmpty(getRedisKey(object))){
            logger.info("Hash key 值为空，删除数据失败");
            return;
        }
        try {
            redisCommonUtil.redisTemplate.opsForHash().delete(getRedisObjectKey(object), getRedisKey(object));
        } catch (Exception e){
            logger.error("删除数据失败" + e);
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:32
     * @since: JDK 1.8
     *
     * @description: Redis 获取列表
     * @param: [object]
     * @return: java.util.List<java.lang.Object>
     */
    public static List<Object> getList(Object object){
        if(StringUtil.isEmpty(getRedisObjectKey(object))){
            logger.info("Hash 值为空，未查询到数据");
            return null;
        }
        try {
            return redisCommonUtil.redisTemplate.opsForHash().values(getRedisObjectKey(object));
        } catch (Exception e){
            logger.error("查询信息失败" + e);
            return null;
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:20
     * @since: JDK 1.8
     *
     * @description: 获取 Redis 存储块名
     * @param: [object]
     * @return: java.lang.String
     */
    private static String getRedisObjectKey(Object object){
        String redisObjectKey = null;
        try {
            redisObjectKey = object.getClass().getMethod("redisObjectKey").invoke(object, null).toString();
        } catch (Exception e){
            logger.error("获取 " + object.getClass().getName() + " redisObjectKey() 方法失败");
        }
        return redisObjectKey;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:20
     * @since: JDK 1.8
     *
     * @description: 获取 Redis Hash 键名
     * @param: [object]
     * @return: java.lang.String
     */
    private static String getRedisKey(Object object){
        String redisKey = null;
        try {
            redisKey = object.getClass().getMethod("redisKey").invoke(object, null).toString();
        } catch (Exception e){
            logger.error("获取 " + object.getClass().getName() + " redisKey() 方法失败");
        }
        return redisKey;
    }

}
