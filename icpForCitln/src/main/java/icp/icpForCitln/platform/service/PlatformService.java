/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-30 上午 10:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.dto.PlantformDirectoryInfoDeleteDTO;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoSaveDTO;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;

import java.util.List;

public interface PlatformService {
    void plantformDirectoryInfoSave(PlantformDirectoryInfoSaveDTO plantformDirectoryInfoSaveDTO);   //目录新增
    List<PlantformDirectoryInfo> plantformDirectoryInfoGetList();   //获取目录列表信息
    void plantformDirectoryInfoDelete(PlantformDirectoryInfoDeleteDTO plantformDirectoryInfoDeleteDTO);     //删除目录
    List<PlantformMailDisplay> plantformMailDisplayGetList();   //获取商城展示列表
}
