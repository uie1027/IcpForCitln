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

import java.math.BigDecimal;
import java.util.Date;

@Data
//销售产品价格
public class PriceSaleProductDTO {
    public PriceSaleProductDTO(){
        super();
    }
    private String id;
    private Integer	priceSaleProductCode;   //销售产品价格编码
    private String	productInfoId;  //产品ID
    private String productCode;  //产品编码
    private String productName;  //产品名称
    private String	taxRateId;  //税率
    private BigDecimal taxIncludedPrice;    //含税单价
    private String	currencyId;     //货币
    private Integer	each;   //每
    private String	basicUnitId;    //  基本单位BASIC_UNIT_ID
    private ProductInfo productInfo;
    private Date lastModificationTime;

}
