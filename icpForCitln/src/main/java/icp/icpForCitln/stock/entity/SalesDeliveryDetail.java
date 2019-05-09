/**
 * Project Name: icpForCitln
 * File Name: SalesDeliveryDetail
 * Package Name: icp.icpForCitln.stock.entity
 * Date: 19/05/09 17:16
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Document(collection = "SALES_DELIVER_DETAIL")  //销售发货单行项目
public class SalesDeliveryDetail extends BaseEntity {
    @Field("SALES_DELIVER_DETAIL_CODE")
    private String salesDeliveryDetailCode;  //销售发货单行项目编码

    @Field("SALES_DELIVER_ID")
    private String salesDeliverId; //销售发货单id

    @Field("SALE_ORDER_INFO_ID")
    private String saleOrderInfoId; //销售订单id

    @Field("SALE_ORDER_DETIL_INFO_ID")
    private String saleOrderDetilInfoId; //销售订单行项目id

    @Field("DELIVERY_NUMBER")
    private BigDecimal deliveryNumber; //发货数量

    @Field("DELIVERY_FACTORY_ID")
    private String deliveryFactoryId; //发货工厂ID

    @Field("INVENTORY_LOCATION_ID")
    private String inventoryLocationId; //库存地点id
}
