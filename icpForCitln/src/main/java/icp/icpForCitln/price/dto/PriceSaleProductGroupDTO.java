/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroup
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dto;

import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
//销售产品组价格
public class PriceSaleProductGroupDTO {

    @Field("PRICE_SALE_PRODUCT_GROUP")
    private Integer	priceSaleProductGroupCode;  //销售产品组价格编码
    @Field("PRODUCT_GROUP_INFO_ID")
    private String	productGroupInfoId;     //产品组ID
    private String	productGroupCode;     //产品组编码
    private String	productGroupName;     //产品组名称
    @Field("TAX_RATE_ID")
    private String	taxRateId;  //税率
    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice;    //含税单价
    @Field("CURRENCY_ID")
    private String	currencyId;    //币种
    @Field("EACH")
    private Integer	each;   //每
    @Field("BASIC_UNIT_ID")
    private String	basicUnitId;    //基本单位BASIC_UNIT_ID
    @Field("PRODUCTGROUP")
    private ProductGroupInfo productGroupInfo;
    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;
}
