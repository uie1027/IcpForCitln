/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/5 14:18
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PurchaseOrderDTO  {
    private String id; //订单ID
    private String orderTypeId;  //订单类型
    private String orderOriginId;  //订单来源
    private String purchaseOrderCode;  //采购订单编码
    private String supplierInfoId; //供应商ID
    private String supplierName; //供应商名称
    private String payentMethodId; //付款方式
    private String companyInfoId; //公司id
    private String companyName; //公司名称
    private String purchaseContractCode; //采购合同编号
    private BigDecimal amount; //订单总金额
    private String currencyId; //币种
    private String purchaseOrderTitleRemarks;//抬头备注
    private String purchaseOrderStatus;  //订单状态
    private Date createTime; //创建日期
    private String purchaseOrderDate; //订单日期
    private List<PurchaseOrderDetailDTO> purchaseOrderDetailDTOS; //订单明细

}
