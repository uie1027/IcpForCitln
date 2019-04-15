/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplier
 * Package Name: icp.icpForCitln.pricePorchase.eneity
 * Date: 2019-04-15 下午 3:06
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document(collection = "PRICE_PURCHASE_PRODUCT_SUPPLIER")  //供应商产品价格表
public class PricePurchaseProductSupplier extends CommonField {

    @Field("PRODUCT_PRICE_CODE_SUPPLIER")
    private String productPriceCodeSupplier;        //供应商产品价格编码

    @Field("COMPANY_CODE")
    private String companyCode;     //供应商编码

    @Field("PRODUCT_CODE")
    private String productCode;     //产品编码

    @Field("TAX_RATE")
    private String taxRate;     //税率

    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice;    //含税单价

    @Field("CURRENCY")
    private String currency;        //币种

    @Field("EACH")
    private Double each;    //每

    @Field("BASIC_UNIT")
    private String basicUnit;   //基本单位
}
