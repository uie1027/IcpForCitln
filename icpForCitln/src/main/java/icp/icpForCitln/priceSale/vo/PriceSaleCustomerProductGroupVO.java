/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductGroupVO
 * Package Name: icp.icpForCitln.priceSale.vo
 * Date: 2019/4/16 16:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.vo;

import java.math.BigDecimal;

public class PriceSaleCustomerProductGroupVO {
    private String productGroupPriceCodeSale; //销售产品组价格编码

    private String productGroupCode;  //产品组编码

    private String companyCode; //客户编码

    private String taxRate; //税率

    private BigDecimal taxIncludedPrice; //含税单价

    private String currency; //币种

    private Integer each; //每

    private String basicUnit; //基本单位
}
