/**
 * Project Name: icpForCitln
 * File Name: PlatformService
 * Package Name: icp.icpForCitln.platform.service
 * Date: 2019-04-30 上午 10:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service;

import icp.icpForCitln.platform.dto.*;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttribute;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue;
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
    void plantformDirectoryAttributeDelete(PlantformDirectoryAttributeDeleteDTO plantformDirectoryAttributeDeleteDTO);  //目录属性删除
    List<PlantformDirectoryAttribute> plantformDirectoryAttributeGetList(PlantformDirectoryAttributeGetListDTO plantformDirectoryAttributeGetListDTO);  //目录属性列表
    PlantformDirectoryAttribute plantformDirectoryAttributeEdit(PlantformDirectoryAttributeEditDTO plantformDirectoryAttributeEditDTO);     //通过ID获取目录属性
    void plantformDirectoryAttributeEditSave(PlantformDirectoryAttributeEditSaveDTO plantformDirectoryAttributeEditSaveDTO); //目录属性编辑保存
    void plantformDirectoryAttributeValueAdd(PlantformDirectoryAttributeValueAddDTO plantformDirectoryAttributeValueAddDTO);    //目录属性值新增
    void plantformDirectoryAttributeValueDelete(PlantformDirectoryAttributeValueDeleteDTO plantformDirectoryAttributeValueDeleteDTO);   //目录属性值删除
    List<PlantformDirectoryAttributeValue> plantformDirectoryAttributeValueGetList(PlantformDirectoryAttributeValueGetListDTO plantformDirectoryAttributeValueGetListDTO);   //目录属性值列表
    PlantformDirectoryAttributeValue plantformDirectoryAttributeValueEdit(PlantformDirectoryAttributeValueEditDTO plantformDirectoryAttributeValueEditDTO);     //根据ID查询目录属性值
    void plantformDirectoryAttributeValueEditSave(PlantformDirectoryAttributeValueEditSaveDTO plantformDirectoryAttributeValueEditSaveDTO);    //目录属性值编辑保存
}
