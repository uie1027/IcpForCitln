/**
 * Project Name: icpForCitln
 * File Name: CompanyDepartmentInfo
 * Package Name: icp.icpForCitln.company.eneity
 * Date: 2019-04-29 下午 2:30
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.company.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "COMPANY_DEPARTMENT_INFO")  //公司部门表
@ToString(callSuper = true)
public class CompanyDepartmentInfo extends BaseEntity {
    @Field("COMPANY_INFO_ID")
    private String companyInfoId;   //公司ID

    @Field("COMPANY_DEPARTMENT_CODE")
    private String companyDepartmentCode;   //公司部门编码

    @Field("COMPANY_DEPARTMENT_NAME")
    private String companyDepartmentName;   //公司部门名称

    @Field("COMPANY_DEPARTMENT_REMARK")
    private String companyDepartmentRemark;     //公司部门备注
}
