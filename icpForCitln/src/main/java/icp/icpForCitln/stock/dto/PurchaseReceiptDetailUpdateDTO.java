/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptDetailUpdateDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/13 18:55
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PurchaseReceiptDetailUpdateDTO {
    private String id;
    private String receivingFactoryId;
    private String inventoryLocationId; //库存地点ID
    private BigDecimal warehouseNumber; //入库数量
}
