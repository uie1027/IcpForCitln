/**
 * Project Name: icpForCitln
 * File Name: ProductionConfirmOrderFindView
 * Package Name: icp.icpForCitln.produce.view
 * Date: 19/05/10 19:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "PRODUCTION_CONFIRM_ORDER_FIND_VIEW") //生产确认订单列表视图
public class ProductionConfirmOrderFindView {
    @Id
    private String id;

    @Field("COMPLETION_TIME")
    private Date completionTime; //实际完成时间

    @Field("PRODUCTION_CONFIRM_ORDER_CODE")
    private String productionConfirmOrderCode;  //生产确认单编号

    @Field("PRODUCTION_ORDER.PRODUCTION_ORDER_CODE")
    private String productionOrderCode;  //生产订单编号

    @Field("PRODUCTION_ORDER.PRODUCTION_NUMBER")
    private BigDecimal productionNumber;  //生产数量

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnitId;  //单位ID

    @Field("USER_INFO.USER_NAME")
    private String creater;

    @Field("CREATE_TIME")
    private String createTime;

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName; //工厂名称

}
