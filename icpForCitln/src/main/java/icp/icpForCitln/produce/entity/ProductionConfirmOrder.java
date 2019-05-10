/**
 * Project Name: icpForCitln
 * File Name: ProductionConfirmOrder
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/10 18:30
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "PRODUCTION_CONFIRM_ORDER")  //生产订单确认表
public class ProductionConfirmOrder extends BaseEntity {
    @Field("PRODUCTION_CONFIRM_ORDER_CODE")
    private String productionConfirmOrderCode;  //生产订单确认编号

    @Field("COMPLETION_NUMBER")
    private BigDecimal completionNumber;  //完成数量

    @Field("REMARKS")
    private String remarks;  //备注

    @Field("DOCUMENT_TIME")
    private Date documentTime; //凭证日期

    @Field("COMPLETION_TIME")
    private Date completionTime;  //完成时间

    @Field("PRODUCTION_ORDER_ID")
    private String productionOrderId;  //生产订单id
}
