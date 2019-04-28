/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplierVO
 * Package Name: icp.icpForCitln.pricePorchase.vo
 * Date: 2019/4/24 10:21
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.pricePorchase.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PricePurchaseProductSupplierVO {
    private String id;

    private String productPriceCodeSupplier;        //供应商产品价格编码

    private String companyCode;     //供应商编码

    private String productCode;     //产品编码

    private String taxRate;     //税率

    private BigDecimal taxIncludedPrice;    //含税单价

    private String currency;        //币种

    private Double each;    //每

    private String basicUnit;   //基本单位
}
