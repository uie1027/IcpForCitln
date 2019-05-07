/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProduct
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "PRICE_SALE_PRODUCT") //销售产品价格
@ToString(callSuper = true)
public class PriceSaleProduct extends BaseEntity {
    @Field("PRICE_SALE_PRODUCT_CODE")
    private String	priceSaleProductCode;   //销售产品价格编码
    @Field("PRODUCT_INFO_ID")
    private String	productInfoId;  //产品ID
    @Field("TAX_RATE_ID")
    private String	taxRateId;  //税率
    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice;    //含税单价
    @Field("CURRENCY_ID")
    private String	currencyId;     //货币
    @Field("EACH")
    private Integer	each;   //每
    @Field("BASIC_UNIT_ID")
    private String	basicUnitId;    //  基本单位BASIC_UNIT_ID
}
