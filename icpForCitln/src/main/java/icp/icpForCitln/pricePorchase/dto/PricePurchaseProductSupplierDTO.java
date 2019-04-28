/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplierDTO
 * Package Name: icp.icpForCitln.pricePorchase.dto
 * Date: 2019/4/24 10:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.pricePorchase.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PricePurchaseProductSupplierDTO {
    private String id;

    private String productPriceCodeSupplier;        //供应商产品价格编码

    private String companyCode;     //供应商编码

    private String companyName;     //供应商名称

    private String productCode;     //产品编码

    private String productName;     //产品名称

    private String taxRate;     //税率

    private BigDecimal taxIncludedPrice;    //含税单价

    private String currency;        //币种

    private Double each;    //每

    private String basicUnit;   //基本单位
}
