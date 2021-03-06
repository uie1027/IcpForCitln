/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDetailInfo
 * Package Name: icp.icpForCitln.order.entity
 * Date: 19/04/29 14:02
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
@Document(collection = "SALE_ORDER_DETAIL_INFO")  //采购订单详情表
@ToString(callSuper = true)
public class SaleOrderDetailInfo extends BaseEntity {
    @Field("SALE_ORDER_INFO_ID")
    private String saleOrderInfoId;  //销售订单表id

    @Field("SALE_ORDER_ROW_CODE")
    private String saleOrderRowCode;  //销售订单编码

    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品id

    @Field("TAX_RATE_ID")
    private String taxRateId;  //税率

    @Field("UNIT_PRICE")
    private BigDecimal unitPrice; //含税单价

    @Field("SALE_ORDER_QUANTITY")
    private Double saleOrderQuantity;  //数量

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位id

    @Field("PRODUCT_CONTRAST_ID")
    private String productContrastId;  //产品物料对照id

    @Field("DELIVERY_DATE")
    private Date deliveryDate;  //交货日期

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;  //工厂id

    @Field("INVENTORY_LOCATION_INFO_ID")
    private String inventoryLocationInfoId;  //库存地点id

    @Field("DELIVERY_ADDRESS")
    private String deliveryAddress;     //送货地址

    @Field("INVOICE_ADDRESS")
    private String invoiceAddress;     //发票地址

    @Field("DETAIL_REMARK")
    private String detailRemark;     //行项目备注（优先取值产品数据表采购文本内容）
}
