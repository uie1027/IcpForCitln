/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptUpdateView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/13 17:24
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "PURCHASE_RECEIPT_UPDATE_VIEW") //采购入库视图
public class PurchaseReceiptUpdateView {
    @Field("PURCHASE_RECEIPT_CODE")
    private String purchaseReceiptCode;  //采购入库单编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 采购入库

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("REMARK")
    private String remark; //备注

    @Field("SUPPLIER_INFO.SUPPLIER_NAME")
    private String supplierName;

    @Field("PURCHASE_ORDER_INFO.PURCHASE_ORDER_CODE")
    private String purchaseOrderCode;

    @Field("USER_INFO.USER_NAME")
    private String creater;

    @Field("ORDER_CREATE_TIME")
    private Date orderCreateTime; //订单创建时间

    @Field("PURCHASE_RECEIPT_DETAIL")
    private List<PurchaseReceiptDetailView> purchaseReceiptDetailList;

    @Id
    private String id;
}
