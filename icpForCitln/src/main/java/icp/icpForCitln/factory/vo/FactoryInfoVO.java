/**
 * Project Name: icpForCitln
 * File Name: FactoryInfo
 * Package Name: icp.icpForCitln.factory.entity
 * Date: 19/04/29 11:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.factory.vo;

import lombok.Data;

@Data
public class FactoryInfoVO{
    private String id; //工厂ID
    private String factoryCode;  //工厂编码
    private String factoryName; //工厂名称
    private String factoryRemark;   //工厂描述
}
