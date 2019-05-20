/**
 * Project Name: icpForCitln
 * File Name: ProductionOrderDetail
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/20 09:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCTION_ORDER_DETAIL")  //生产订单详情
public class ProductionOrderDetail extends BaseEntity {
    @Field("PRODUCTION_ORDER_DETAIL_CODE")
    private String productionOrderDetailCode;  //生产订单行项目编号

    @Field("PRODUCTION_ORDER_ID")
    private String productionOrderId;  //生产订单id

    @Field("SALE_ORDER_INFO_ID")
    private String saleOrderInfoId;  //销售订单id

    @Field("SALE_ORDER_DETAIL_INFO_ID")
    private String saleOrderDetailInfoId; //销售订单行项目id

    @Field("REMARK")
    private String remark;  //备注
}
