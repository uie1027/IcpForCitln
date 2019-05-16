/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDetailView
 * Package Name: icp.icpForCitln.order.view
 * Date: 2019/5/15 17:51
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.order.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document("PURCHASE_ORDER_DETAIL_VIEW")
public class PurchaseOrderDetailView {
    @Id
    private String id;

    @Field("PURCHASE_ORDER_INFO_ID")
    private String purchaseOrderInfoId;  //采购订单表ID

    @Field("PURCHASE_ORDER_ROW_CODE")
    private String purchaseOrderRowCode;  //行项目编号

    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品id

    @Field("PRODUCT.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("UNIT_PRICE")
    private BigDecimal unitPrice; //含税单价

    @Field("QUANTITY")
    private Double quantity;  //数量

    @Field("AMOUNT")
    private BigDecimal amount;  //金额

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位id

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnitName;  //基本单位

    @Field("AGREEMENT_CODE")
    private String agreementCode;  //协议编号

    @Field("AGREEMENT_ROW_CODE")
    private String agreementRowCode; //协议行号

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

    @Field("PRICE_STRATEGY")
    private String priceStrategy;     //价格策略优先级：01-客户产品价格，02-客户产品组价格，03-产品价格，04-产品组价格

    @Field("DELIVERY_ADDRESS")
    private String deliveryAddress;     //送货地址

    @Field("INVOICE_ADDRESS")
    private String invoiceAddress;     //发票地址

    @Field("DETAIL_REMARK")
    private String detailRemark;     //行项目备注（优先取值产品数据表采购文本内容）
}