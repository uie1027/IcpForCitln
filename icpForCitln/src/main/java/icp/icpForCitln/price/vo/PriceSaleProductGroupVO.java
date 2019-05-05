/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroup
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
//销售产品组价格
public class PriceSaleProductGroupVO {
    private Integer	priceSaleProductGroupCode;  //销售产品组价格编码
    private String	productGroupInfoId;     //产品组ID
    private String	taxRateId;  //税率
    private BigDecimal taxIncludedPrice;    //含税单价
    private String	currencyId;    //币种
    private Integer	each;   //每
    private String	basicUnitId;    //基本单位BASIC_UNIT_ID
}
