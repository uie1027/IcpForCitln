/**
 * Project Name: icpForCitln
 * File Name: ProductionOrder
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/05 14:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCTION_ORDER") //生产订单表
@ToString(callSuper = true)
public class ProductionOrder extends BaseEntity {
    @Field("PRODUCTION_ORDER_TYPE")
    private String productionOrderType; //订单类型

    @Field("PRODUCTION_ORDER_CODE")
    private String productionOrderCode;  //订单编号
}
