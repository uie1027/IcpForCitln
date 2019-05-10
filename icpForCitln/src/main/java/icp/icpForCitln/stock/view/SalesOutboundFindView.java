/**
 * Project Name: icpForCitln
 * File Name: SalesOutboundFindView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/10 17:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("SALES_OUTBOUND_FIND_VIEW")
public class SalesOutboundFindView {

    @Field("OUTBOUND_STATUS")
    private Integer outboundStatus;  //出库状态 1已出库

    @Field("OUTBOUND_TYPE_ID")
    private String outboundTypeId;  //出库类型

    @Id
    private String id;

    @Field("SALES_OUTBOUND_CODE")
    private String salesOutbountCode;  //销售出库单号

    @Field("SALES_DELIVERY.SALES_DELIVERY_CODE")
    private String salesDeliveryCode;  //销售发货单编号

    @Field("CUSTOMER_INFO.CUSTOMER_NAME")
    private String customerName;

    @Field("CREATE_TIME")
    private Date createTime;
}
