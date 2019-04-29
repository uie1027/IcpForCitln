/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDetilInfo
 * Package Name: icp.icpForCitln.order.entity
 * Date: 19/04/29 13:47
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "PURCHASE_ORDER_DETIL_INFO")  //采购订单详情表
@ToString(callSuper = true)
public class PurchaseOrderDetilInfo extends BaseEntity {
    @Field("PURCHASE_ORDER_INFO_ID")
    private String purchaseOrderInfoId;  //采购订单表id

    @Field("PURCHASE_ORDER_ROW_CODE")
    private String purchaseOrderRowCode;  //采购订单编码

    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品id

    @Field("UNIT_PRICE")
    private BigDecimal unitPrice; //含税单价

    @Field("QUANTITY")
    private Double quantity;  //数量

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位id

    @Field("AGREEMENT_CODE")
    private String agreementCode;  //协议编号

    @Field("AGREEMENT_ROW_CODE")
    private String agreementRowCode; //协议行号

    @Field("DELIVERY_DATE")
    private Date deliveryDate;  //交货日期

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;  //工厂id

    @Field("INVENTORY_LOCATION_INFO_ID")
    private String inventoryLocationInfoId;  //库存地点id
}
