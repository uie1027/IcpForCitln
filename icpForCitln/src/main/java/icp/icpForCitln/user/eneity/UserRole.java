/**
 * Project Name: icpForCitln
 * File Name: UserRole
 * Package Name: icp.icpForCitln.user.eneity
 * Date: 2019-04-29 下午 1:32
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "USER_ROLE")  //用户角色表
@ToString(callSuper = true)
public class UserRole extends BaseEntity {
    @Field("USER_ROLE_CODE")
    private String userRoleCode;    //用户角色编码

    @Field("USER_INFO_ID")
    private String userInfoId;  //用户ID

    @Field("ROLE_INFO_ID")
    private String roleInfoId;  //角色信息ID
}
