/**
 * Project Name: icpForCitln
 * File Name: UserInfoRedisServiceImpl
 * Package Name: icp.icpForCitln.user.service.impl
 * Date: 2019-04-17 上午 10:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.service.impl;

import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.service.UserInfoRedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoRedisServiceImpl implements UserInfoRedisService {
    @Resource
    private RedisTemplate<String, UserInfo> redisTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 10:44
     * @since: JDK 1.8
     *
     * @description: Redis 存储用户信息
     * @param: [userInfo]
     * @return: void
     */
    @Override
    public void put(UserInfo userInfo) {
        redisTemplate.opsForHash().put(userInfo.redisObjectKey(), userInfo.redisKey(), userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 10:44
     * @since: JDK 1.8
     *
     * @description: Redis 获取用户信息
     * @param: [userInfo]
     * @return: icp.icpForCitln.user.eneity.UserInfo
     */
    @Override
    public UserInfo get(UserInfo userInfo) {
        return (UserInfo) redisTemplate.opsForHash().get(userInfo.redisObjectKey(), userInfo.redisKey());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 10:44
     * @since: JDK 1.8
     *
     * @description: Redis 删除用户信息
     * @param: [userInfo]
     * @return: void
     */
    @Override
    public void delete(UserInfo userInfo) {
        redisTemplate.opsForHash().delete(userInfo.redisObjectKey(), userInfo.redisKey());
    }
}
