/**
 * Project Name: icpForCitln
 * File Name: OranizationView
 * Package Name: icp.icpForCitln.factory.view
 * Date: 2019/5/14 16:08
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.factory.view;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "ORANIZATION")  //组织列表视图
public class OranizationView {

    @Field("COMPANY_INFOS.COMPANY_NAME")
    private String companyName;     //公司名称

    @Field("FACTORY_INFOS.FACTORY_NAME")
    private String factoryName; //工厂名称

    @Field("USER_INFOS.USER_NAME")
    private String lastMondifier;   //最后更改人






}
