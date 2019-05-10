/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderView
 * Package Name: icp.icpForCitln.order.view
 * Date: 2019/5/10 13:32
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.view;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document("PURCHASE_ORDER_VIEW")
public class PurchaseOrderView {
    @Field("PURCHASE_ORDER_CODE")
    private String purchaseOrderCode;  //采购订单编码

    @Field("ORDER_TYPE_ID")
    private String orderTypeId;  //订单类型

    @Field("ORDER_ORIGIN_ID")
    private String orderOriginId;  //订单来源

    @Field("SUPPLIER_INFO_ID")
    private String supplierInfoId; //供应商id

    @Field("SUPPLIER.SUPPLIER_CODE")
    private String supplierCode; //供应商编码

    @Field("SUPPLIER.SUPPLIER_NAME")
    private String supplierName; //供应商名称

    @Field("PAYMENT_METHOD_ID")
    private String payentMethodId; //付款方式ID

    @Field("PAYMENT_METHOD.SYSTEM_DICTIONARY_VALUE")
    private String payentMethodName; //付款方式

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司id

    @Field("PURCHASE_CONTRACT_CODE")
    private String purchaseContractCode; //采购合同编号

    @Field("CURRENCY_ID")
    private String currencyId; //币种ID

    @Field("CURRENCY.SYSTEM_DICTIONARY_VALUE")
    private String currencyName; //币种

    @Field("TOTAL_AMOUNT")
    private BigDecimal totalAmount; //订单总金额

    @Field("PURCHASE_ORDER_TITLE_REMARKS")
    private String purchaseOrderTitleRemarks;//抬头备注

    @Field("PURCHASE_ORDER_STATUS")
    private String purchaseOrderStatus;  //订单状态
}
