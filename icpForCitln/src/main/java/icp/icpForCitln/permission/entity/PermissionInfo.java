/**
 * Project Name: icpForCitln
 * File Name: PermissionInfo
 * Package Name: icp.icpForCitln.permission.entity
 * Date: 19/04/29 10:54
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.permission.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PERMISSION_INFO") //权限信息表
@ToString(callSuper = true)
public class PermissionInfo extends BaseEntity {
    @Field("ROLE_INFO_ID")
    private String roleInfoId;  //角色信息id

    @Field("MENU_INFO_ID")
    private String menuInfoId;  //菜单信息id
}
