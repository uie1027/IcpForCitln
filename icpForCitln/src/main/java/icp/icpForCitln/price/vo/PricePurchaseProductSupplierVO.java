/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplier
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
//销售客户产品价格组
public class PricePurchaseProductSupplierVO {
    private String	pricePurchaseProductSupplierCode;   //供应商产品价格编码
    private String	supplierInfoId;   //供应商ID
    private String	productInfoId;   //产品ID
    private String	taxRateId;   //税率
    private BigDecimal taxIncludedPrice;   //含税单价
    private String	currencyId;   //币种
    private Integer	each;   //每
    private String	basicUnitId;   //基本BASIC_UNIT_ID
}
