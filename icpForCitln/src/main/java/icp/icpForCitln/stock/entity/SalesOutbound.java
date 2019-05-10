/**
 * Project Name: icpForCitln
 * File Name: SalesOutbound
 * Package Name: icp.icpForCitln.stock.entity
 * Date: 19/05/10 16:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SALES_OUTBOUND")
public class SalesOutbound extends BaseEntity {
    @Field("SALES_DELIVERY_ID")
    private String salesDeliveryId;  //销售发货单ID

    @Field("SALES_OUTBOUND_CODE")
    private String salesOutbountCode;  //销售出库单号

    @Field("OUTBOUND_STATUS")
    private Integer outboundStatus;  //出库状态 1已出库

    @Field("OUTBOUND_TYPE_ID")
    private String outboundTypeId;  //出库类型
}
