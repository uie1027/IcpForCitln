/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProduct
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dto;

import icp.icpForCitln.product.eneity.ProductInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
//销售产品价格
public class PriceSaleProductDTO {
    @Field("PRICE_SALE_PRODUCT_CODE")
    private Integer	priceSaleProductCode;   //销售产品价格编码
    @Field("PRODUCT_INFO_ID")
    private String	productInfoId;  //产品ID
    private String productCode;  //产品编码
    private String productName;  //产品名称
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
    @Field("PRODUCT")
    private ProductInfo productInfo;
    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;

}
