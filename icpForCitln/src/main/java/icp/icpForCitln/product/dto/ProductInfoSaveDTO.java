/**
 * Project Name: icpForCitln
 * File Name: ProductInfoSaveDTO
 * Package Name: icp.icpForCitln.product.dto
 * Date: 2019/5/7 9:24
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.product.dto;

import icp.icpForCitln.product.eneity.ProductAttribuit;
import lombok.Data;

import java.util.List;

@Data
public class ProductInfoSaveDTO {
    private String productName;  //产品名称

    private String basicUnitId;  //单位ID

    private String productGroupInfoId;  //产品组ID

    private String oldProductCode;  //旧产品编码

    private String purchaseContent;  //采购文本

    private Integer purchasePlanDays;  //采购计划天数

    private String saleContent;  //销售文本

    private String productionContent;  //生产文本

    private Integer productionCycle;  //生产周期

    private String qualityContent;  //质检文本

    private Integer qualityInspectionCycle;  //质检周期

    private String logisticsContent;  //物流文本

    private Integer haulCycle;  //运输周期

    private String financialContent;  //财务文本

    private Integer financialCycle;  //财务周期

    private List<ProductAttribuit> productAttribuitList;    //产品属性信息
}
