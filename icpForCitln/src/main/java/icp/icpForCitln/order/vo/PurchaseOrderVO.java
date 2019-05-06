/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderVO
 * Package Name: icp.icpForCitln.order.vo
 * Date: 2019/5/5 18:29
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PurchaseOrderVO {

    private String orderOriginId;  //订单来源

    private String orderTypeId;  //订单类型

    private String purchaseOrderCode;   //采购订单编号

    private String supplieInfoId; //供应商编码/名称

    private String purchaseOrderStatus;  //订单状态

    private String purchaseContractCode; //采购合同编号

    private Date createTime;    //创建时间

}
