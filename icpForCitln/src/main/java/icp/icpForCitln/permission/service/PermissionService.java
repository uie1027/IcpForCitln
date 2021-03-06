/**
 * Project Name: icpForCitln
 * File Name: PermissionService
 * Package Name: icp.icpForCitln.permission.service
 * Date: 2019/5/9 9:15
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.permission.dto.PermissionInfoSaveDTO;
import icp.icpForCitln.permission.dto.RoleInfoGetListDTO;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.dto.RoleInfoUpdateDTO;
import icp.icpForCitln.permission.entity.PermissionInfo;
import icp.icpForCitln.permission.entity.RoleInfo;

import java.util.List;

public interface PermissionService {
    void roleInfoSave(RoleInfoSaveDTO roleInfoSaveDTO);     //角色新增

    MongoResult roleInfoGetList(RoleInfoGetListDTO roleInfoGetListDTO);   //查询角色列表 带分页

    RoleInfo roleInfoFindById(String id);   //通过 ID 查询角色

    void roleInfoUpdate(RoleInfoUpdateDTO roleInfoUpdateDTO);   //角色更新

    List<RoleInfo> roleInfoPermissionGetList();     //角色列表获取 不带分页

    void permissionInfoSave(PermissionInfoSaveDTO permissionInfoSaveDTO);      //权限保存

    List<PermissionInfo> permissionInfoUpdateGet(String roleInfoId);    //权限编辑菜单勾选
}
