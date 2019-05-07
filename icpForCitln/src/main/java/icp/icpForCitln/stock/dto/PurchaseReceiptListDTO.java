/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptListDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/07 11:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import icp.icpForCitln.common.enetity.BaseEntity;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class PurchaseReceiptListDTO extends BaseEntity {
    @Field("PURCHASE_RECEIPT_CODE")
    private String purchaseReceiptCode;  //采购入库单编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 采购入库

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("PURCHASE_ORDER_INFO")
    private PurchaseOrderInfo purchaseOrderInfo; //采购订单

    @Field("SUPPLIER_INFO")
    private SupplierInfo supplierInfo; //供应商

    private String purchaseOrderInfoCode; //采购订单编码

    private String supplierInfoName;  //供应商名称
}
