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
import java.util.Date;

@Data
public class PricePurchaseProductSupplierVO {
    private String	pricePurchaseProductSupplierCode;   //供应商产品价格编码
    private String	supplierInfoId;   //供应商ID
    private String	supplierCode;   //供应商编码
    private String	supplierName;   //供应商名称
    private String	productInfoId;   //产品ID
    private String	productCode;   //产品编码
    private String	productName;   //产品名称

    private String	taxRateId;   //税率
    private BigDecimal taxIncludedPrice;   //含税单价
    private String	currencyId;   //币种
    private Integer	each;   //每
    private String	basicUnitId;   //基本BASIC_UNIT_ID
    private Date createTime;   //创建时间
}
