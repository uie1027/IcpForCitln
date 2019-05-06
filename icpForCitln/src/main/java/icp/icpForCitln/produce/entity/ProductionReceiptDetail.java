/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptDetail
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/05 13:53
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document(collection = "PRODUCTION_RECEIPT_DETIL") //生产入库单详情
@ToString(callSuper = true)
public class ProductionReceiptDetail extends BaseEntity {
    @Field("PRODUCT_Id")
    private String productId; //产品编码

    @Field("PRODUCT_DESCRIPTION")
    private String productDescription; //产品描述

    @Field("PLANNED_QUANTITY")
    private BigDecimal plannedQuantity;  //计划数量

    @Field("ORDER_QUANTITY")
    private BigDecimal orderQuantity;  //订单数量

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位Id

    @Field("ORDER_CREATE_TIME")
    private String orderCreateTime; //订单创建时间

    @Field("RECEIVING_FACTORY_ID")
    private String receivingFactoryId; //收货工厂ID

    @Field("INVENTORY_LOCATION_ID")
    private String inventoryLocationId; //库存地点id

    @Field("WAREHOUSE_NUMBER")
    private String warehouseNumber; //入库数量

    @Field("UNSTOCKED_NUMBER")
    private String unstockedNumber; //未入库数量
}
