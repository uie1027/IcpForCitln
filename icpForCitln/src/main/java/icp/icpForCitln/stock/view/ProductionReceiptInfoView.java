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
@Document(collection = "PRODUCTION_RECEIPT_VIEW")
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

    @Field("PRODUCTION_ORDER.PRODUCTION_ORDER_CODE")
    private String productionOrderCode;  //生产订单编号

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;  //基本单位

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName;  //工厂名称

    @Field("FACTORY_INFO.FACTORY_CODE")
    private String factoryCode;  //工厂编号

    @Field("CREATE_TIME")
    private Date createTime;

    @Field("ORDER_CREATE_TIME")
    private Date orderCreateTime; //订单创建时间

    @Field("USER_INFO.USER_NAME")
    private String creater;
}
