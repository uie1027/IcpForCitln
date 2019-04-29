/**
 * Project Name: icpForCitln
 * File Name: CompanyAddressInfo
 * Package Name: icp.icpForCitln.company.eneity
 * Date: 2019-04-29 下午 2:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.company.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "COMPANY_ADDRESS_INFO")  //公司地址表
@ToString(callSuper = true)
public class CompanyAddressInfo extends BaseEntity {
    @Field("COMPANY_INFO_ID")
    private String companyInfoId;   //公司ID

    @Field("COMPANY_ADDRESS")
    private String companyAddress;  //详细地址
}
