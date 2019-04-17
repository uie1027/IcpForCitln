/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductDto
 * Package Name: icp.icpForCitln.priceSale.dto
 * Date: 2019/4/16 16:50
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dto;

import java.math.BigDecimal;

public class PriceSaleCustomerProductDto {
    private Integer productPriceCpdeSale; //销售产品价格编码

    private Integer productCode; //产品编码

    private Integer companyCode; //客户编码

    private String taxRate; //税率

    private BigDecimal taxIncludedPrice; //含税单价

    private String currency; //币种

    private Integer each; //每

    private String basicUnit; //基本单位
}
