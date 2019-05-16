/**
 * Project Name: icpForCitln
 * File Name: CompanyFactoryView
 * Package Name: icp.icpForCitln.factory.view
 * Date: 19/05/16 13:21
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.factory.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "COMPANY_FACTORY_VIEW")
public class CompanyFactoryView {
    @Id
    private String id;

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName; //工厂名称

    @Field("COMPANY_INFO_ID")
    private String companyInfoId;     //公司ID

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;   //工厂ID
}
