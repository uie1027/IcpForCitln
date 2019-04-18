/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoRedisServiceImpl
 * Package Name: icp.icpForCitln.platform.service.impl
 * Date: 2019-04-18 上午 10:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service.impl;

import icp.icpForCitln.platform.eneity.PlatformUnitInfo;
import icp.icpForCitln.platform.service.PlatformUnitInfoRedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PlatformUnitInfoRedisServiceImpl implements PlatformUnitInfoRedisService {
    @Resource
    private RedisTemplate<String, PlatformUnitInfo> redisTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 10:45
     * @since: JDK 1.8
     *
     * @description: Redis 存储单位信息
     * @param: [platformUnitInfo]
     * @return: void
     */
    @Override
    public void put(PlatformUnitInfo platformUnitInfo) {
        redisTemplate.opsForHash().put(platformUnitInfo.getObjectKey(), platformUnitInfo.getKey(), platformUnitInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 10:46
     * @since: JDK 1.8
     *
     * @description: Redis 获取单位信息
     * @param: [platformUnitInfo]
     * @return: icp.icpForCitln.platform.eneity.PlatformUnitInfo
     */
    @Override
    public PlatformUnitInfo get(PlatformUnitInfo platformUnitInfo) {
        return (PlatformUnitInfo) redisTemplate.opsForHash().get(platformUnitInfo.getObjectKey(), platformUnitInfo.getKey());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 10:46
     * @since: JDK 1.8
     *
     * @description: Redis 删除单位信息
     * @param: [platformUnitInfo]
     * @return: void
     */
    @Override
    public void delete(PlatformUnitInfo platformUnitInfo) {
        redisTemplate.opsForHash().delete(platformUnitInfo.getObjectKey(), platformUnitInfo.getKey());
    }
}
