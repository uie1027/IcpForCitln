/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderInfo
 * Package Name: icp.icpForCitln.order.entity
 * Date: 19/04/29 13:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PURCHASE_ORDER_INFO") //采购订单表
@ToString(callSuper = true)
public class PurchaseOrderInfo extends BaseEntity {
    @Field("PURCHASE_ORDER_CODE")
    private String purchaseOrderCode;  //采购订单编码

    @Field("ORDER_TYPE_ID")
    private String orderTypeId;  //订单类型

    @Field("SUPPLIE_INFO_ID")
    private String supplieInfoId; //供应商id

    @Field("PAYMENT_METHOD_ID")
    private String payentMethodId; //付款方式

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司id

    @Field("PURCHASE_CONTRACT_CODE")
    private String purchaseContractCode; //采购合同编号

    @Field("CURRENCY_ID")
    private String currencyId; //币种

    @Field("PURCHASE_ORDER_TITLE_REMARKS")
    private String purchaseOrderTitleRemarks;//抬头备注

    @Field("PURCHASE_ORDER_STATUS")
    private String purchaseOrderStatus;  //订单状态
}
