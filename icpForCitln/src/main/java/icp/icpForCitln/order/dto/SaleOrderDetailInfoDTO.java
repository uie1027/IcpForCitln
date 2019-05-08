/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDetailInfoDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/8 10:54
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SaleOrderDetailInfoDTO {
    private String saleOrderInfoId;  //采购订单表id
    private String saleOrderRowCode;  //采购订单编码
    private String productInfoId;  //产品id
    private String taxRateId;  //税率
    private BigDecimal unitPrice; //含税单价
    private Double saleOrderQuantity;  //数量
    private String basicUnitId;  //基本单位id
    private String productContrastId;  //产品物料对照id
    private Date deliveryDate;  //交货日期
    private String factoryInfoId;  //工厂id
    private String inventoryLocationInfoId;  //库存地点id
}
