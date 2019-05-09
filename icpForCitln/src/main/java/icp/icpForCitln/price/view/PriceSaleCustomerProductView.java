/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProduct
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.view;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document("PRICE_SALE_CUSTOMER_PRODUCT_VIEW")
//销售客户产品价格组
public class PriceSaleCustomerProductView {
    @Field("PRICE_SALE_CUSTOMER_PRODUCT_CODE")
    private String	priceSaleCustomerProductCode;  //销售客户产品价格编码
    @Field("CUSTOMER_INFO_ID")
    private String	customerInfoId;     //客户ID
    @Field("CUSTOMER_INFO.CUSTOMER_CODE")
    private String	customerCode;   //客户编码
    @Field("CUSTOMER_INFO.CUSTOMER_NAME")
    private String	customerName;   //客户名称
    @Field("PRODUCT_INFO_ID")
    private String	productInfoId;  //产品组ID
    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;  //产品编码
    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;  //产品名称
    @Field("TAX_RATE_ID")
    private String	taxRateId;  //税率ID
    @Field("TAX_RATE.SYSTEM_DICTIONARY_VALUE")
    private String	taxRate;  //税率
    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice;    //含税单价
    @Field("CURRENCY_ID")
    private String	currencyId;     //价格单位ID
    @Field("CURRENCY.SYSTEM_DICTIONARY_VALUE")
    private String	currency;     //价格单位
    @Field("EACH")
    private Integer	each;   //每
    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String	basicUnit;    //  基本单位BASIC_UNIT_ID
    @Field("BASIC_UNIT_ID")
    private String	basicUnitId;    //  基本单位BASIC_UNIT_ID
    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  ////最后修改时间
}
