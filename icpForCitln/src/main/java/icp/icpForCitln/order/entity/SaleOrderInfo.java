/**
 * Project Name: icpForCitln
 * File Name: SaleOrderInfo
 * Package Name: icp.icpForCitln.order.entity
 * Date: 19/04/29 13:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SALE_ORDER_INFO") //销售订单表
@ToString(callSuper = true)
public class SaleOrderInfo extends BaseEntity {
    @Field("SALE_ORDER_CODE")
    private String purchaseOrderCode;  //销售订单编码

    @Field("CUSTOMER_INFO_ID")
    private String customerInfoId; //客户id

    @Field("PAYMENT_METHOD_ID")
    private String payentMethodId; //付款方式

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司id

    @Field("SALE_CONTRACT_CODE")
    private String purchaseContractCode; //销售合同编号

    @Field("CURRENCY_ID")
    private String currencyId; //币种

    @Field("SALE_ORDER_TITLE_REMARKS")
    private String purchaseOrderTitleRemarks;//抬头备注

    @Field("SALE_ORDER_STATUS")
    private String purchaseOrderStatus;  //订单状态
}
