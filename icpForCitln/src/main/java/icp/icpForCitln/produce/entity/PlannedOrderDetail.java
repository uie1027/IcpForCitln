/**
 * Project Name: icpForCitln
 * File Name: PlannedOrderDetail
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/07 14:00
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
@Document(collection = "PLANNED_ORDER_DETAIL")
@ToString(callSuper = true)
public class PlannedOrderDetail extends BaseEntity {
    @Field("PLANNED_ORDER_DETAIL_CODE")
    private String plannedOrderDetailCode; //行项目编码

    @Field("PLANNED_ORDER_ID")
    private String plannedOrderId;  //计划订单ID

    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品ID

    @Field("ORDER_QUANTITY")
    private BigDecimal orderQuantity;  //订单数量

    @Field("STATR_TIME")
    private Date startTime;  //开始日期

    @Field("END_TIME")
    private Date endTime;  //结束日期

    @Field("FACTORY_ID")
    private String factoryId; //工厂ID

    @Field("REMARK")
    private String remark; //备注

    @Field("ORDER_STATUS")
    private Integer orderStatus; //行项目状态 1创建 2下达 3关闭
}
