/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-30 上午 10:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.dto.*;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.platform.view.MenuInfoListView;
import icp.icpForCitln.platform.view.PlantformDirectoryInfoListView;

import java.util.List;

public interface PlatformService {
    void plantformDirectoryInfoSave(PlantformDirectoryInfoSaveDTO plantformDirectoryInfoSaveDTO);   //目录新增
    List<PlantformDirectoryInfoListView> plantformDirectoryInfoGetList();   //获取目录列表信息
    void plantformDirectoryInfoDelete(PlantformDirectoryInfoDeleteDTO plantformDirectoryInfoDeleteDTO);     //删除目录
    List<PlantformMailDisplay> plantformMailDisplayGetList();   //获取商城展示列表
    List<MenuInfoListView> menuInfoGetList();   //获取菜单列表
    PlantformDirectoryInfo plantformDirectoryInfoEdit(PlantformDirectoryInfoEditDTO plantformDirectoryInfoEditDTO);    //目录编辑显示
    void plantformDirectoryInfoEditSave(PlantformDirectoryInfoEditSaveDTO plantformDirectoryInfoEditSaveDTO);   //目录编辑保存
    void plantformDirectoryAttributeAdd(PlantformDirectoryAttributeAddDTO pantformDirectoryAttributeAdd);  //目录属性新增
}
