/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptFindView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/09 16:19
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
public class ProductionReceiptFindView {
    @Id
    private String id;

    @Field("PRODUCTION_RECEIPT_CODE")
    private String productionReceiptCode;  //生产入库单号

    @Field("DOCUMENT_TYPE")
    private String documentType; //凭证类型 1 生产订单 2 其他订单

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("WAREHOUSE_NUMBER")
    private BigDecimal warehouseNumber; //入库数量

    @Field("PRODUCTION_ORDER.PRODUCTION_ORDER_CODE")
    private String productionOrderCode;

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName;

    @Field("FACTORY_INFO.FACTORY_CODE")
    private String factoryCode;

    @Field("CREATE_TIME")
    private Date createTime;
}
