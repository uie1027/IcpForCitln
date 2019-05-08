/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDetailInfo
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
@Document(collection = "PURCHASE_ORDER_DETAIL_INFO")  //采购订单详情表
@ToString(callSuper = true)
public class PurchaseOrderDetailInfo extends BaseEntity {
    @Field("PURCHASE_ORDER_INFO_ID")
    private String purchaseOrderInfoId;  //采购订单表ID

    @Field("PURCHASE_ORDER_ROW_CODE")
    private String purchaseOrderRowCode;  //行项目编号

    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品id

    @Field("UNIT_PRICE")
    private BigDecimal unitPrice; //含税单价

    @Field("QUANTITY")
    private Double quantity;  //数量

    @Field("AMOUNT")
    private BigDecimal amount;  //金额

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

    @Field("PRICE_STRATEGY")
    private String priceStrategy;     //价格策略优先级：01-客户产品价格，02-客户产品组价格，03-产品价格，04-产品组价格

    @Field("DELIVERY_ADDRESS")
    private String deliveryAddress;     //送货地址

    @Field("INVOICE_ADDRESS")
    private String invoiceAddress;     //发票地址

    @Field("DETAIL_REMARK")
    private String detailRemark;     //行项目备注（优先取值产品数据表采购文本内容）
}
