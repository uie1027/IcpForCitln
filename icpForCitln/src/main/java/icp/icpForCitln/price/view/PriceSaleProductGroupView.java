/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroup
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
@Document("PRICE_SALE_PRODUCT_GROUP_VIEW")
//销售产品组价格
public class PriceSaleProductGroupView {
    @Field("PRICE_SALE_PRODUCT_GROUP_CODE")
    private String	priceSaleProductGroupCode;   //销售产品组价格编码
    @Field("PRODUCT_GROUP_INFO_ID")
    private String	productGroupInfoId;  //产品组ID
    @Field("PRODUCT_GROUP_INFO.PRODUCT_GROUP_CODE")
    private String productGroupCode;  //产品编码
    @Field("PRODUCT_GROUP_INFO.PRODUCT_GROUP_NAME")
    private String productGroupName;  //产品名称
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
