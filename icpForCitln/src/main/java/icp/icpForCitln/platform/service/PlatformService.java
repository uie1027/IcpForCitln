/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-12 下午 2:03
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.dto.PlatformDirectoryInfoAddDTO;
import icp.icpForCitln.platform.dto.PlatformDirectoryInfoDeleteDTO;
import icp.icpForCitln.platform.eneity.*;

public interface PlatformService {
    void platformDirectoryInfoSaveTest(PlatformDirectoryInfo platformDirectoryInfo);     //存储测试
    void platformDirectoryAttributeSaveTest(PlatformDirectoryAttribute platformDirectoryAttribute);     //存储测试
    void platformDirectoryAttributeValueSaveTest(PlatformDirectoryAttributeValue platformDirectoryAttributeValue);     //存储测试
    void platformUnitInfoSaveTest(PlatformUnitInfo platformUnitInfo);     //存储测试
    void platformMailDisplaySaveTest(PlatformMailDisplay platformMailDisplay);     //存储测试
    void addPlatformDirectoryInfo(PlatformDirectoryInfoAddDTO platformDirectoryInfoAddDTO);     //新增目录
    void deletePlatformDirectoryInfo(PlatformDirectoryInfoDeleteDTO platformDirectoryInfoDeleteDTO);     //删除目录
}
