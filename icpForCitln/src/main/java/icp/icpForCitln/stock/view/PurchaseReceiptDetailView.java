/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptDetailView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/13 18:33
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
@Document(collection = "PURCHASE_RECEIPT_DETAIL_VIEW")
public class PurchaseReceiptDetailView {
    @Id
    private String id;

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("PURCHASE_ORDER_DETAIL_INFO.PURCHASE_ORDER_ROW_CODE")
    private String purchaseOrderRowCode;  //行项目编号

    @Field("PURCHASE_ORDER_DETAIL_INFO.QUANTITY")
    private Double quantity;  //数量

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;  //基本单位id

    @Field("PURCHASE_ORDER_DETAIL_INFO.DELIVERY_DATE")
    private Date deliveryDate;  //交货日期

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName;

    @Field("WAREHOUSE_NUMBER")
    private BigDecimal warehouseNumber; //入库数量

    @Field("UNSTOCKED_NUMBER")
    private BigDecimal unstockedNumber; //未入库数量
}
