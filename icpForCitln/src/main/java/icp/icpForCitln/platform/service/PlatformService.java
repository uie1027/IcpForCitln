/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-12 下午 2:03
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.eneity.PlatformDirectory;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttribute;

public interface PlatformService {
    void platformDirectorySaveTest(PlatformDirectory platformDirectory);     //存储测试
    void platformDirectoryAttributeSaveTest(PlatformDirectoryAttribute platformDirectoryAttribute);     //存储测试
}
