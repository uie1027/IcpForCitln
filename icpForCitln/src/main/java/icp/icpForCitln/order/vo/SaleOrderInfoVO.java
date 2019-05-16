/**
 * Project Name: icpForCitln
 * File Name: SaleOrderInfoVO
 * Package Name: icp.icpForCitln.order.vo
 * Date: 2019/5/7 18:00
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class SaleOrderInfoVO {
    private  String id;  //订单ID
    private String saleOrderCode;  //销售订单编码
    private String orderTypeId;  //订单类型ID
    private String orderType;  //订单类型
    private String orderOriginId;  //订单来源ID
    private String orderOrigin;  //订单来源
    private String customerInfoId; //客户ID
    private String customerName; //客户名称
    private String payentMethodId; //付款方式ID
    private String payentMethodName; //付款方式
    private String companyInfoId; //公司id
    private String saleContractCode; //采购合同编号
    private String currencyId; //币种ID
    private String currencyName; //币种
    private BigDecimal totalAmount; //订单总金额
    private String saleOrderTitleRemarks;//抬头备注
    private String saleOrderStatus;  //订单状态
    private Date createTime;    //创建时间
    private List<SaleOrderDetailVO> orderInfoDetailVOS; //订单行项目
}
