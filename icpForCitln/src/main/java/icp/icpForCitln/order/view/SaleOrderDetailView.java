/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDetailView
 * Package Name: icp.icpForCitln.order.view
 * Date: 2019/5/10 13:32
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
@Document("SALE_ORDER_DETAIL_VIEW")
public class SaleOrderDetailView {
    @Id
    private  String id;

    @Field("SALE_ORDER_INFO_ID")
    private String saleOrderInfoId;  //销售订单表id

    @Field("SALE_ORDER_ROW_CODE")
    private String saleOrderRowCode;  //销售订单编码

    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品id

    @Field("PRODUCT.PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT.PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("TAX_RATE_ID")
    private String taxRateId;  //税率

    @Field("TAX_RATE.SYSTEM_DICTIONARY_CODE")
    private String taxRateCode;  //税率CODE

    @Field("TAX_RATE.SYSTEM_DICTIONARY_VALUE")
    private String taxRateName;  //税率

    @Field("UNIT_PRICE")
    private BigDecimal unitPrice; //含税单价

    @Field("SALE_ORDER_QUANTITY")
    private Double saleOrderQuantity;  //数量

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位id

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnitName;  //基本单位

    @Field("PRODUCT_CONTRAST_ID")
    private String productContrastId;  //产品物料对照id

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

    @Field("DELIVERY_ADDRESS")
    private String deliveryAddress;     //送货地址

    @Field("INVOICE_ADDRESS")
    private String invoiceAddress;     //发票地址

    @Field("DETAIL_REMARK")
    private String detailRemark;     //行项目备注（优先取值产品数据表采购文本内容）
}
