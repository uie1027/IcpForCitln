/**
 * Project Name: icpForCitln
 * File Name: FactoryInfoSaveDTO
 * Package Name: icp.icpForCitln.factory.dto
 * Date: 2019/5/13 9:26
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.factory.dto;

import icp.icpForCitln.company.eneity.CompanyFactory;
import lombok.Data;

@Data
public class FactoryInfoSaveDTO {
    private  String companyFactoryId; //公司id

    private String factoryName; //工厂名称

    private String factoryRemark;   //工厂描述

}
