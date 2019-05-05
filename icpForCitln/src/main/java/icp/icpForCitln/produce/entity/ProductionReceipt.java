/**
 * Project Name: icpForCitln
 * File Name: ProductionReceipt
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/05 13:42
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "PRODUCTION_RECEIPT") //生产入库单
@ToString(callSuper = true)
public class ProductionReceipt extends BaseEntity {
    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 生产订单 2 其他订单

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司ID

    @Field("ORDER_NUMBER_ID")
    private String orderNumberId; //订单编号ID

    @Field("FACTORY_ID")
    private String factoryId; //工厂ID

    @Field("PRODUCT_Id")
    private String productId; //产品ID

    @Field("WAREHOUSE_NUMBER")
    private BigDecimal warehouseNumber; //入库数量

    @Field("UNSTOCKED_NUMBER")
    private BigDecimal unstockedNumber; //未入库数量

    @Field("RECEIVING_FACTORY_ID")
    private String receivingFactoryId; //收货工厂ID

    @Field("INVENTORY_LOCATION_ID")
    private String inventoryLocationId; //库存地点id


    @Field("ORDER_CREATE_TIME")
    private Date orderCreateTime; //订单创建时间

    @Field("REMARK")
    private String remark; //备注
}
