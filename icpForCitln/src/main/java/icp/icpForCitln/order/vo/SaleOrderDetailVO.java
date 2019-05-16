/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDetailVO
 * Package Name: icp.icpForCitln.order.vo
 * Date: 2019/5/15 15:31
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SaleOrderDetailVO {
    private  String id; //订单行项目ID
    private String saleOrderInfoId;  //销售订单表id
    private String saleOrderRowCode;  //销售订单行项目号
    private String productInfoId;  //产品id
    private String productCode;  //产品编码
    private String productName;  //产品名称
    private String taxRateId;  //税率
    private String taxRateCode;  //税率CODE
    private String taxRateName;  //税率
    private BigDecimal unitPrice; //含税单价
    private Double saleOrderQuantity;  //数量
    private String basicUnitId;  //基本单位id
    private String basicUnitName;  //基本单位
    private String productContrastId;  //产品物料对照id
    private Date deliveryDate;  //交货日期
    private String factoryInfoId;  //工厂id
    private String factoryName;  //工厂名称
    private String inventoryLocationInfoId;  //库存地点id
    private String inventoryLocationName;  //库存地点
    private String deliveryAddress;     //送货地址
    private String invoiceAddress;     //发票地址
    private String detailRemark;     //行项目备注（优先取值产品数据表采购文本内容）
}