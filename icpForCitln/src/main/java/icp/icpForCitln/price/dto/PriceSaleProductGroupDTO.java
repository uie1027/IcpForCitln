/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroup
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
//销售产品组价格
public class PriceSaleProductGroupDTO {
    private String id;
    private String	priceSaleProductGroupCode;  //销售产品组价格编码
    private String	productGroupInfoId;     //产品组ID
    private String	productGroupCode;     //产品组编码
    private String	productGroupName;     //产品组名称
    private String	taxRateId;  //税率
    private BigDecimal taxIncludedPrice;    //含税单价
    private String	currencyId;    //币种
    private Integer	each;   //每
    private String	basicUnitId;    //基本单位BASIC_UNIT_ID
    private Date lastModificationTime;  //最后更改时间
}
