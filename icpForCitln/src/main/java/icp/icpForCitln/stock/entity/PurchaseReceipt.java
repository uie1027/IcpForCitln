/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceipt
 * Package Name: icp.icpForCitln.stock.entity
 * Date: 19/05/07 09:43
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "PURCHASE_RECEIPT") //采购入库单
@ToString(callSuper = true)
public class PurchaseReceipt extends BaseEntity {
    @Field("PURCHASE_RECEIPT_CODE")
    private String purchaseReceiptCode;  //采购入库单编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 采购入库

    @Field("SUPPLIER_INFO_ID")
    private String supplierInfoId; //供应商ID

    @Field("PURCHASE_ORDER_INFO_ID")
    private String purchaseOrderInfoId;  //采购订单id

    @Field("ORDER_CREATE_TIME")
    private Date orderCreateTime; //订单创建时间

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("REMARK")
    private String remark; //备注
}
