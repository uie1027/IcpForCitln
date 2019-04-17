/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductGroupDto
 * Package Name: icp.icpForCitln.priceSale.dto
 * Date: 2019/4/16 16:51
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dto;

import java.math.BigDecimal;

public class PriceSaleCustomerProductGroupDto {
    private Integer productGroupPriceCodeSale; //销售产品组价格编码

    private Integer productGroupCode;  //产品组编码

    private Integer companyCode; //客户编码

    private String taxRate; //税率

    private BigDecimal taxIncludedPrice; //含税单价

    private String currency; //币种

    private Integer each; //每

    private String basicUnit; //基本单位
}
