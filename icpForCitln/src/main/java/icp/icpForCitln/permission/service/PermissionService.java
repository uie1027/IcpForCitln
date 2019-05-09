/**
 * Project Name: icpForCitln
 * File Name: PermissionService
 * Package Name: icp.icpForCitln.permission.service
 * Date: 2019/5/9 9:15
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.service;

import icp.icpForCitln.permission.dto.RoleInfoGetListDTO;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.vo.RoleInfoVO;

public interface PermissionService {
    void roleInfoSave(RoleInfoSaveDTO roleInfoSaveDTO);     //角色新增

    RoleInfoVO roleInfoGetList(RoleInfoGetListDTO roleInfoGetListDTO);   //查询角色列表 带分页
}
