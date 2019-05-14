/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptInfoView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/13 16:33
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "PRODUCTION_RECEIPT_UPDATE_VIEW")
public class ProductionReceiptInfoView {
    @Id
    private String id;

    @Field("PRODUCTION_RECEIPT_CODE")
    private String productionReceiptCode;  //生产入库单号

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 生产订单 2 其他订单

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("WAREHOUSE_NUMBER")
    private BigDecimal warehouseNumber; //入库数量

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName;  //工厂名称

    @Field("ORDER_CREATE_TIME")
    private Date orderCreateTime; //订单创建时间

    @Field("USER_INFO.USER_NAME")
    private String creater;

    @Field("PRODUCTION_ORDER.PRODUCTION_ORDER_CODE")
    private String productionOrderCode;

    @Field("RECEIVING__FACTORY.FACTORY_NAME")
    private String receivingFactoryName;

    @Field("PRODUCTION_ORDER.CREATE_TIME")
    private Date productionOrderCreateTime;

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;

    @Field("UNSTOCKED_NUMBER")
    private BigDecimal unstockedNumber; //未入库数量

    @Field("PRODUCTION_ORDER.PRODUCTION_NUMBER")
    private BigDecimal productionNumber;

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;

    @Field("REMARK")
    private String remark;

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;

    @Field("RECEIVING_FACTORY_ID")
    private String receivingFactoryId; //收货工厂ID

    @Field("PRODUCT_INFO_ID")
    private String productInfoId; //产品ID
}
