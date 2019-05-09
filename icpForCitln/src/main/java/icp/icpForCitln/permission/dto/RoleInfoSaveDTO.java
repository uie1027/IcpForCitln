/**
 * Project Name: icpForCitln
 * File Name: RoleInfoSaveDTO
 * Package Name: icp.icpForCitln.permission.dto
 * Date: 2019/5/9 9:17
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.dto;

import lombok.Data;

@Data
public class RoleInfoSaveDTO {      //角色新增
    private String roleName;  //角色名称

    private String roleDescription;  //角色描述
}
