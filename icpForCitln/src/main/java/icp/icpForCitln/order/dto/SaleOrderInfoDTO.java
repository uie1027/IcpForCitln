/**
 * Project Name: icpForCitln
 * File Name: SaleOrderInfoDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/7 18:04
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import icp.icpForCitln.customer.entity.CustomerInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class SaleOrderInfoDTO {
    @Field("ORDER_TYPE_ID")
    private String orderTypeId;  //订单类型
    @Field("ORDER_ORIGIN_ID")
    private String orderOriginId;  //订单来源
    @Field("SALE_ORDER_CODE")
    private String saleOrderCode;  //销售订单编码
    private String companyInfoId; //公司id
    private String payentMethodId; //付款方式
    private String saleOrderTitleRemarks;//抬头备注
    @Field("CUSTOMER_INFO_ID")
    private String customerInfoId; //客户id
    private String customerCode; //客户编码
    private String customerName; //客户名称
    @Field("SALE_ORDER_STATUS")
    private String saleOrderStatus;  //订单状态
    @Field("SALE_CONTRACT_CODE")
    private String saleContractCode; //销售合同编号
    @Field("CREATE_TIME")
    private Date createTime;    //创建时间
    @Field("CUSTOMER_INFO")
    private CustomerInfo customerInfo; //客户信息
    private String currencyId; //币种
    private BigDecimal totalAmount; //订单总金额
    private List<SaleOrderDetailInfoDTO> saleOrderDetailInfoDTOS;
}
