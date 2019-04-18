/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoRedisService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-18 上午 9:25
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.eneity.PlatformUnitInfo;

public interface PlatformUnitInfoRedisService {
    void put(PlatformUnitInfo platformUnitInfo);    //Redis 存储单位信息
    PlatformUnitInfo get(PlatformUnitInfo platformUnitInfo);    //Redis 获取单位信息
    void delete(PlatformUnitInfo platformUnitInfo);    //Redis 删除单位信息
}
