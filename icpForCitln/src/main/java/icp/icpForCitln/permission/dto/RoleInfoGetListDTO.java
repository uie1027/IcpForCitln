/**
 * Project Name: icpForCitln
 * File Name: RoleInfoGetListDTO
 * Package Name: icp.icpForCitln.permission.dto
 * Date: 2019/5/9 9:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.dto;

import lombok.Data;

@Data
public class RoleInfoGetListDTO {       //角色列表查询条件
    private Integer pageIndex;      //页码

    private Integer pageSize;       //每页条数

    private String roleName;  //角色名称
}
