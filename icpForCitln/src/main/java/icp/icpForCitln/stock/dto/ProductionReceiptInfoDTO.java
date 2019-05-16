/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptInfoDTO
 * Package Name: icp.icpForCitln.produce.dto
 * Date: 19/05/05 14:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductionReceiptInfoDTO {
    private String documentType; //凭证类型

    private String companyInfoId; //公司ID

    private String productionOrderId; //订单编号ID

    private String factoryInfoId; //工厂ID

    private String productInfoId; //产品ID

    private BigDecimal warehouseNumber; //入库数量

    private BigDecimal unstockedNumber; //未入库数量

    private String receivingFactoryId; //收货工厂ID

    private String inventoryLocationId; //库存地点id

    private String remark; //备注

    private Date orderCreateTime; //订单创建时间
}
