/**
 * Project Name: icpForCitln
 * File Name: UserCompanyDepartmentRole
 * Package Name: icp.icpForCitln.user.eneity
 * Date: 2019-04-29 下午 1:40
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "USER_COMPANY_DEPARTMENT_ROLE")  //用户公司部门角色表
@ToString(callSuper = true)
public class UserCompanyDepartmentRole extends BaseEntity {
    @Field("USER_COMPANY_DEPARTMENT_ROLE_CODE")
    private String userCompanyDepartmentRoleCode;    //用户公司部门角色编码

    @Field("USER_INFO_ID")
    private String userInfoId;  //用户ID

    @Field("COMPANY_INFO_ID")
    private String companyInfoId;   //公司ID

    @Field("COMPANY_DEPARTMENT_INFO_ID")
    private String companyDepartmentInfoId;     //部门表ID

    @Field("ROLE_INFO_ID")
    private String roleInfoId;  //角色信息ID
}
