/**
 * Project Name: icpForCitln
 * File Name: ProductionOrderFindView
 * Package Name: icp.icpForCitln.produce.view
 * Date: 19/05/13 11:31
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.view;

import icp.icpForCitln.produce.entity.ProductionConfirmOrder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "PRODUCTION_ORDER_FIND_VIEW")
public class ProductionOrderFindView {
    @Id
    private String id;

    @Field("PRODUCTION_ORDER_TYPE")
    private String productionOrderType; //订单类型

    @Field("PRODUCTION_ORDER_STATUS")
    private Integer productionOrderStatus;  //生产订单状态

    @Field("PRODUCTION_ORDER_CODE")
    private String productionOrderCode;  //订单编号

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("PRODUCTION_NUMBER")
    private BigDecimal productionNumber;  //生产数量

    @Field("START_TIME")
    private Date startTime;  //开始时间

    @Field("END_TIME")
    private Date endTime;  //结束时间

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;  //单位

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName; //工厂名称

    @Field("PRODUCTION_CONFIRM_ORDER")
    private List<ProductionConfirmOrder> productionConfirmOrders;

    @Field("PRODUCTION_CONFIRM_ORDER.COMPLETION_NUMBER")
    private BigDecimal completionNumber;


}
