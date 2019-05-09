/**
 * Project Name: icpForCitln
 * File Name: PurchaseReceiptFindView
 * Package Name: icp.icpForCitln.price.view
 * Date: 2019/5/9 14:29
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.view;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document("PRICE_PRODUCT_SUPPLIER_VIEW")
public class PriceProductSupplierView {
    @Field("PRICE_PURCHASE_PRODUCT_SUPPLIER_CODE")
    private String	pricePurchaseProductSupplierCode;   //供应商产品价格编码
    @Field("SUPPLIER_INFO_ID")
    private String	supplierInfoId;   //供应商ID
    @Field("SUPPLIER_INFO.SUPPLIER_CODE")
    private String	supplierCode;   //供应商编码
    @Field("SUPPLIER_INFO.SUPPLIER_NAME")
    private String	supplierName;   //供应商名称
    @Field("PRODUCT_INFO_ID")
    private String	productInfoId;   //产品ID
    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String	productCode;   //产品编码
    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String	productName;   //产品名称
    @Field("TAX_INCLUDED_PRICE")
    private BigDecimal taxIncludedPrice;   //含税单价
    @Field("TAX_RATE_ID")
    private String	taxRateId;   //税率
    @Field("CURRENCY_ID")
    private String	currencyId;   //币种
    @Field("EACH")
    private Integer	each;   //每
    @Field("BASIC_UNIT_ID")
    private String	basicUnitId;   //基本BASIC_UNIT_ID
    @Field("CREATE_TIME")
    private Date createTime;   //创建时间
}
