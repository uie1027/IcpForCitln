/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptListVO
 * Package Name: icp.icpForCitln.stock.vo
 * Date: 19/05/07 13:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.vo;

import lombok.Data;

import java.util.Date;

@Data
public class PurchaseReceiptListVO {
    private String id;

    private Date createTime;

    private String purchaseReceiptCode;  //采购入库单编码

    private Integer documentType; //凭证类型 1 采购入库

    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    private String purchaseOrderInfoCode; //采购订单编码

    private String supplierInfoName;  //供应商名称
}
