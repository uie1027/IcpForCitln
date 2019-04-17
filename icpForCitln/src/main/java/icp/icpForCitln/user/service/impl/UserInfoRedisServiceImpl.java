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
    RedisTemplate<String, UserInfo> redisTemplate;

    @Override
    public void put(UserInfo userInfo) {
        redisTemplate.opsForHash().put(userInfo.getObjectKey(), userInfo.getKey(), userInfo);
    }

    @Override
    public UserInfo get(UserInfo userInfo) {
        return (UserInfo) redisTemplate.opsForHash().get(userInfo.getObjectKey(), userInfo.getKey());
    }

    @Override
    public void delete(UserInfo userInfo) {
        redisTemplate.opsForHash().delete(userInfo.getObjectKey(), userInfo.getKey());
    }
}
