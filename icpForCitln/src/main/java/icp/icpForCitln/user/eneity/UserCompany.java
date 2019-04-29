/**
 * Project Name: icpForCitln
 * File Name: UserCompany
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
@Document(collection = "USER_COMPANY")  //用户公司表
@ToString(callSuper = true)
public class UserCompany extends BaseEntity {
    @Field("USER_INFO_ID")
    private String userInfoId;  //用户ID

    @Field("COMPANY_INFO_ID")
    private String companyInfoId;   //公司ID
}
