/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderInfoVO
 * Package Name: icp.icpForCitln.order.vo
 * Date: 2019/5/5 18:29
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PurchaseOrderInfoVO {
    private String id; //订单ID
    private String orderOriginId;  //订单来源ID
    private String orderOrigin;  //订单来源
    private String orderTypeId;  //订单类型ID
    private String orderType;  //订单类型
    private String purchaseOrderCode;   //采购订单编号
    private String supplierInfoId; //供应商ID
    private String supplierCode; //供应商编码
    private String supplierName; //供应商名称
    private String purchaseOrderStatus;  //订单状态
    private String payentMethodId; //付款方式ID
    private String payentMethodName; //付款方式
    private String currencyName; //币种
    private String purchaseContractCode; //采购合同编号
    private Date createTime;    //创建时间
    private Date purchaseOrderDate;  //订单日期
    private List<PurchaseOrderDetailVO> purchaseOrderDetailVOS; //采购订单行项目

}
