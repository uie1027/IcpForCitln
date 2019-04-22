/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryInfoDAO
 * Package Name: icp.icpForCitln.platform.dao
 * Date: 2019-04-12 下午 1:57
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao;

import icp.icpForCitln.platform.eneity.PlatformDirectoryInfo;

import java.util.List;

public interface PlatformDirectoryInfoDAO {
    void saveTest(PlatformDirectoryInfo platformDirectoryInfo);     //存储测试接口
    List<PlatformDirectoryInfo> getPlatformDirectoryInfoList();     //获取平台目录所有信息列表
}
