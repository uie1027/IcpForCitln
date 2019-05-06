/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptListDTO
 * Package Name: icp.icpForCitln.produce.dto
 * Date: 19/05/06 10:23
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.dto;

import icp.icpForCitln.common.enetity.BaseEntity;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.produce.entity.ProductionOrder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ProductionReceiptListDTO extends BaseEntity {
    @Field("PRODUCTION_RECEIPT_CODE")
    private String productionReceiptCode;  //生产入库单号

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 生产订单 2 其他订单

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    private String orderCode; //订单编号

    private String factoryName; //工厂名

    @Field("FACTORY_INFO")
    private FactoryInfo factoryInfo; //工厂信息

    @Field("PRODUCTION_ORDER")
    private ProductionOrder productionOrder; //订单信息
}
