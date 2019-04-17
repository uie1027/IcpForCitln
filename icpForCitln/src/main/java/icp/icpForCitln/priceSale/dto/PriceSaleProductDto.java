/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroupDto
 * Package Name: icp.icpForCitln.priceSale.vo
 * Date: 2019/4/16 10:00
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceSaleProductDto {

    private String id; //主键

    private String productPriceCpdeSale; //销售产品价格编码

    private String productCode; //产品编码

    private String taxRate; //税率

    private BigDecimal taxIncludedPrice; //含税单价

    private String currency; //币种

    private Integer each; //每

    private String basicUnit; //基本单位
}
