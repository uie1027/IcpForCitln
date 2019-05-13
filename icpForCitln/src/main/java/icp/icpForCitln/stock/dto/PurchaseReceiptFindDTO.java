/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptFindDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/07 11:01
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

@Data
public class PurchaseReceiptFindDTO {
    private String purchaseReceiptCode;  //采购入库单编码
    private String purchaseOrderCode;  //采购订单编码
    private String supplierCode;    //供应商编码
    private String supplierName;    //公司名称
    private String id;
}
