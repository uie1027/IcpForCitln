/**
 * Project Name: icpForCitln
 * File Name: RoleInfo
 * Package Name: icp.icpForCitln.permission.entity
 * Date: 19/04/29 10:49
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.permission.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "ROLE_INFO") //角色信息表
@ToString(callSuper = true)
public class RoleInfo extends BaseEntity {
    @Field("ROLE_CODE")
    private String roleCode;  //角色编码

    @Field("ROLE_NAME")
    private String roleName;  //角色名称

    @Field("ROLE_DESCRIPTION")
    private String roleDescription;  //角色描述

    @Field("IS_FORBIDDEN")
    private Integer isForbidden;    //是否禁用 1禁用2不禁用
}
