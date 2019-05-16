/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDetailListView
 * Package Name: icp.icpForCitln.order.view
 * Date: 19/05/16 18:57
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.view;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("PURCHASE_ORDER_DETAIL_VIEW")
public class PurchaseOrderDetailListView {
    @Field("PURCHASE_ORDER_ROW_CODE")
    private String purchaseOrderRowCode;  //行项目编号

    @Field("PRODUCT.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("QUANTITY")
    private Double quantity;  //数量

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnitName;  //基本单位

    @Field("DELIVERY_DATE")
    private Date deliveryDate;  //交货日期

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;  //工厂id

    @Field("FACTORY.FACTORY_NAME")
    private String factoryName;  //工厂名称

    @Field("INVENTORY_LOCATION_INFO_ID")
    private String inventoryLocationInfoId;  //库存地点id

    @Field("INVENTORY_LOCATION.INVENTORY_LOCATION_NAME")
    private String inventoryLocationName;  //库存地点

}
