/**
 * Project Name: icpForCitln
 * File Name: SaleOrderInfoVO
 * Package Name: icp.icpForCitln.order.vo
 * Date: 2019/5/7 18:00
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.vo;

import icp.icpForCitln.customer.entity.CustomerInfo;
import lombok.Data;

import java.util.Date;

@Data
public class SaleOrderInfoVO {
    private String saleOrderCode;  //销售订单编码
    private String customerInfoId; //客户id
    private String customerCode; //客户编码
    private String customerName; //客户名称
    private String saleOrderStatus;  //订单状态
    private String saleContractCode; //销售合同编号
    private Date createTime;    //创建时间
    private CustomerInfo customerInfo; //客户信息
}
