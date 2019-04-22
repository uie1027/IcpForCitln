/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-12 下午 2:03
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.eneity.*;

import java.util.List;

public interface PlatformService {
    void platformDirectoryInfoSaveTest(PlatformDirectoryInfo platformDirectoryInfo);     //存储测试
    void platformDirectoryAttributeSaveTest(PlatformDirectoryAttribute platformDirectoryAttribute);     //存储测试
    void platformDirectoryAttributeValueSaveTest(PlatformDirectoryAttributeValue platformDirectoryAttributeValue);     //存储测试
    void platformUnitInfoSaveTest(PlatformUnitInfo platformUnitInfo);     //存储测试
    void platformMailDisplaySaveTest(PlatformMailDisplay platformMailDisplay);     //存储测试
    List<PlatformDirectoryInfo> getPlatformDirectoryInfoList(); //获取平台目录所有信息列表
}
