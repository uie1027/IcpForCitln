/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-12 下午 2:03
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.eneity.PlatformDirectoryAttributeValue;
import icp.icpForCitln.platform.eneity.PlatformDirectoryInfo;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttribute;

public interface PlatformService {
    void platformDirectorySaveTest(PlatformDirectoryInfo platformDirectoryInfo);     //存储测试
    void platformDirectoryAttributeSaveTest(PlatformDirectoryAttribute platformDirectoryAttribute);     //存储测试
    void platformDirectoryAttributeValueSaveTest(PlatformDirectoryAttributeValue platformDirectoryAttributeValue);     //存储测试
}
