/**
 * Project Name: icpForCitln
 * File Name: PermissionInfoSaveDTO
 * Package Name: icp.icpForCitln.permission.dto
 * Date: 2019/5/10 18:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.dto;

import lombok.Data;

@Data
public class PermissionInfoSaveDTO {
    private String roleInfoId;  //角色信息id

    private String[] menuInfoId;  //菜单信息id
}
