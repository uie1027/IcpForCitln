/**
 * Project Name: icpForCitln
 * File Name: ProductInfo
 * Package Name: icp.icpForCitln.product.eneity
 * Date: 19/04/15 13:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_INFO")  //产品基本信息
@ToString(callSuper = true)
public class ProductInfo extends BaseEntity {
    @Field("PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //单位ID

    @Field("PRODUCT_GROUP_INFO_ID")
    private String productGroupInfoId;  //产品组ID

    @Field("OLD_PRODUCT_CODE")
    private String oldProductCode;  //旧产品编码

    @Field("PURCHASE_CONTENT")
    private String purchaseContent;  //采购文本

    @Field("PURCHASE_PLAN_DAYS")
    private Integer purchasePlanDays;  //采购计划天数

    @Field("SALE_CONTENT")
    private String saleContent;  //销售文本

    @Field("PRODUCTION_CONTENT")
    private String productionContent;  //生产文本

    @Field("PRODUCTIONG_CYCLE")
    private Integer productionCycle;  //生产周期

    @Field("QUALITY_CONTENT")
    private String qualityContent;  //质检文本

    @Field("QUALITY_INSPECTION_CYCLE")
    private Integer qualityInspectionCycle;  //质检周期

    @Field("LOGISTICS_CONTENT")
    private String logisticsContent;  //物流文本

    @Field("HAUL_CYCLE")
    private Integer haulCycle;  //运输周期

    @Field("FINANCIAL_CONTENT")
    private String financialContent;  //财务文本

    @Field("FINANCIAL_CYCLE")
    private Integer financialCycle;  //财务周期

    @Field("FROZEN")
    private Integer frozen;  //冻结标识（1冻结 2未冻结）
}
