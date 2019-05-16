/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProduct
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
//销售产品价格
public class PriceSaleProductVO {
    private String	priceSaleProductCode;   //销售产品价格编码
    private String	productInfoId;  //产品ID
    private String productCode;  //产品编码
    private String productName;  //产品名称
    private String	taxRateId;  //税率
    private BigDecimal taxIncludedPrice;    //含税单价
    private String	currencyId;     //价格单位
    private Integer	each;   //每
    private String	basicUnitId;    //  基本单位BASIC_UNIT_ID
    private Date lastModificationTime;  ////最后修改时间
}
