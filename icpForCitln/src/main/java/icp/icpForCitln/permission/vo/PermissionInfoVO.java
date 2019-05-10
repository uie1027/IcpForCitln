/**
 * Project Name: icpForCitln
 * File Name: PermissionInfoVO
 * Package Name: icp.icpForCitln.permission.vo
 * Date: 2019/5/10 18:51
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.vo;

import lombok.Data;

@Data
public class PermissionInfoVO {     //权限信息返回
    private String roleInfoId;  //角色信息id

    private String menuInfoId;  //菜单信息id
}
