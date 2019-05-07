/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptDetail
 * Package Name: icp.icpForCitln.stock.entity
 * Date: 19/05/07 10:07
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document(collection = "PURCHASE_RECEIPT_DETAIL") //采购入库单行项目
@ToString(callSuper = true)
public class PurchaseReceiptDetail extends BaseEntity {
    @Field("PURCHASE_RECEIPT_ID")
    private String purchaseReceiptId; //采购入库单ID

    @Field("PURCHASE_ORDER_DETAIL_INFO_ID")
    private String purchaseOrderDetailInfoId; //采购订单行项目ID

    @Field("RECEIVING_FACTORY_ID")
    private String receivingFactoryId; //收货工厂ID

    @Field("INVENTORY_LOCATION_ID")
    private String inventoryLocationId; //库存地点ID

    @Field("WAREHOUSE_NUMBER")
    private BigDecimal warehouseNumber; //入库数量

    @Field("UNSTOCKED_NUMBER")
    private BigDecimal unstockedNumber; //未入库数量
}
