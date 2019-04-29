/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplier
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document(collection = "PRICE_SALE_CUSTOMER_PRODUCT") //销售客户产品价格组
public class PricePurchaseProductSupplier extends BaseEntity{
    @Field("PRICE_PURCHASE_PRODUCT_SUPPLIER_CODE")
    private String	pricePurchaseProductSupplierCode;   //供应商产品价格编码
    @Field("SUPPLIER_INFO_ID")
    private String	supplierInfoId;   //供应商ID
    @Field("PRODUCT_INFO_ID")
    private String	productInfoId;   //产品ID
    @Field("TAX_RATE_ID")
    private String	taxRateId;   //税率
    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice;   //含税单价
    @Field("CURRENCY_ID")
    private String	currencyId;   //币种
    @Field("EACH")
    private Integer	each;   //每
    @Field("BASIC_UNIT_ID")
    private String	basicUnitId;   //基本BASIC_UNIT_ID
}
