/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProduct
 * Package Name: icp.icpForCitln.priceSale.eneity
 * Date: 19/04/12 15:29
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document(collection = "PRICE_SALE_PRODUCT") //销售产品价格
public class PriceSaleProduct extends CommonField {
    @Field("PRODUCT_PRICE_CODE_SALE")
    private Integer productPriceCpdeSale; //销售产品价格编码

    @Field("PRODUCT_CODE")
    private Integer productCode; //产品编码

    @Field("TAX_RATE")
    private String taxRate; //税率

    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice; //含税单价

    @Field("CURRENCY")
    private String currency; //币种

    @Field("EACH")
    private Integer each; //每

    @Field("BASIC_UNIT")
    private String basicUnit; //基本单位
}