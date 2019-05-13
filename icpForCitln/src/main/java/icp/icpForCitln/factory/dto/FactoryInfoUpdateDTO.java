/**
 * Project Name: icpForCitln
 * File Name: FactoryInfoUpdateDTO
 * Package Name: icp.icpForCitln.factory.dto
 * Date: 2019/5/13 14:54
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.factory.dto;

import lombok.Data;

@Data
public class FactoryInfoUpdateDTO {

    private String id;   //工厂id

    private String factoryName; //工厂名称

    private String factoryRemark;   //工厂描述

    private Integer flag;   //是否更新到历史数据  1是2否
}
