/**
 * Project Name: icpForCitln
 * File Name: CompanyFactory
 * Package Name: icp.icpForCitln.company.eneity
 * Date: 2019-04-29 下午 2:47
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.company.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "COMPANY_FACTORY")  //公司工厂表
@ToString(callSuper = true)
public class CompanyFactory extends BaseEntity {
    @Field("COMPANY_INFO_ID")
    private String companyInfoId;     //公司ID

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;   //工厂ID
}
