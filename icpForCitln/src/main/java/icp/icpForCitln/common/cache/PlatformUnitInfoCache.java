/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoCache
 * Package Name: icp.icpForCitln.common.cache
 * Date: 2019-04-18 上午 11:18
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.cache;

import icp.icpForCitln.IcpForCitlnApplication;
import icp.icpForCitln.platform.eneity.PlatformUnitInfo;
import icp.icpForCitln.platform.service.PlatformUnitInfoRedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;

@Component
public class PlatformUnitInfoCache {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    @Autowired
    private PlatformUnitInfoRedisService platformUnitInfoRedisService;

    private static PlatformUnitInfoCache platformUnitInfoCache;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:32
     * @since: JDK 1.8
     *
     * @description: 初始化 platformUnitInfoRedisService
     * @param: []
     * @return: void
     */
    @PostConstruct
    public void init() {
        platformUnitInfoCache = this;
        platformUnitInfoCache.platformUnitInfoRedisService = this.platformUnitInfoRedisService;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:33
     * @since: JDK 1.8
     *
     * @description: Redis 存单位信息信息
     * @param: [platformUnitInfo]
     * @return: void
     */
    public static void put(PlatformUnitInfo platformUnitInfo) {
        platformUnitInfoCache.platformUnitInfoRedisService.put(platformUnitInfo);
    }


    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:34
     * @since: JDK 1.8
     *
     * @description: Redis 取单位信息信息
     * @param: [unitVariety, unitCode]
     * @return: icp.icpForCitln.platform.eneity.PlatformUnitInfo
     */
    public static PlatformUnitInfo get(Integer unitVariety, String unitCode){
        if(StringUtils.isEmpty(unitVariety)){
            logger.error("传入参数单位种类 unitVariety 为空，查询单位信息失败");
            return null;
        }
        if(StringUtils.isEmpty(unitCode)){
            logger.error("传入参数单位编码 unitCode 为空，查询单位信息失败");
            return null;
        }

        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();

        platformUnitInfo.setUnitVariety(unitVariety);
        platformUnitInfo.setUnitCode(unitCode);

        PlatformUnitInfo platformUnitInfoResult = platformUnitInfoCache.platformUnitInfoRedisService.get(platformUnitInfo);
        if(platformUnitInfoResult == null){
            logger.info("未查询到 " + unitCode + " 单位信息");
            return null;
        } else {
            return platformUnitInfoResult;
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:34
     * @since: JDK 1.8
     *
     * @description: Redis 删单位信息信息
     * @param: [unitVariety, unitCode]
     * @return: void
     */
    public static void delete(Integer unitVariety, String unitCode){
        if(StringUtils.isEmpty(unitVariety)){
            logger.error("传入参数单位种类 unitVariety 为空，删除缓存失败");
        }
        if(StringUtils.isEmpty(unitCode)){
            logger.error("传入参数单位编码 unitCode 为空，删除缓存失败");
        }

        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();

        platformUnitInfo.setUnitVariety(unitVariety);
        platformUnitInfo.setUnitCode(unitCode);

        platformUnitInfoCache.platformUnitInfoRedisService.delete(platformUnitInfo);
    }
}
