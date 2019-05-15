/**
 * Project Name: icpForCitln
 * File Name: RoleInfoFindByIdVO
 * Package Name: icp.icpForCitln.permission.vo
 * Date: 2019/5/9 13:04
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.vo;

import lombok.Data;

@Data
public class RoleInfoFindByIdVO {   //部门下拉
    private String id;      //ID

    private String roleName;  //角色名称

    private String roleDescription;  //角色描述
}
