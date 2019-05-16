/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptSaveDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/07 10:35
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import icp.icpForCitln.stock.entity.PurchaseReceiptDetail;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PurchaseReceiptSaveDTO {
    private String documentType; //凭证类型

    private String supplierInfoId; //供应商ID

    private String purchaseOrderInfoId;  //采购订单id

    private Date orderCreateTime; //订单创建时间

    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    private String remark; //备注

    private List<PurchaseReceiptDetail> purchaseReceiptDetailList;
}
