/**
 * Project Name: icpForCitln
 * File Name: ProductInfo
 * Package Name: icp.icpForCitln.product.eneity
 * Date: 19/04/15 13:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "PRODUCT_INFO")  //产品基本信息
public class ProductInfo extends CommonField {
    @Field("PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("UNIT_CODE")
    private String unitCode;  //单位编码

    @Field("PRODUCT_GROUP_CODE")
    private String productGroupCode;  //产品组编码

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
    private Date financialCycle;  //财务周期

    @Field("FROZEN")
    private Integer frozen;  //冻结标识（0 未冻结， 1 已冻结）

    @Field("HANDLE_CODE")
    private String handleCode;  //handle编码

    @Field("IS_SHOW")
    private Integer isShow;  //是否显示旧产品编码 0显示 1不显示
}
