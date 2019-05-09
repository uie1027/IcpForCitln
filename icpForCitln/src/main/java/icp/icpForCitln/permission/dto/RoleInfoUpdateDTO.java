/**
 * Project Name: icpForCitln
 * File Name: RoleInfoUpdateDTO
 * Package Name: icp.icpForCitln.permission.dto
 * Date: 2019/5/9 15:46
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.dto;

import lombok.Data;

@Data
public class RoleInfoUpdateDTO {   //角色更新
    private String id;  //  ID

    private String roleName;  //角色名称

    private String roleDescription;  //角色描述

    private Integer flag;   //是否更新到历史数据  1是2否
}
