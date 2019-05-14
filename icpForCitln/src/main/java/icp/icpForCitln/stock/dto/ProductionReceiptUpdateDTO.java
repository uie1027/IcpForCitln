/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptUpdateDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/13 16:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductionReceiptUpdateDTO {
    private String id;
    private BigDecimal warehouseNumber;
    private String factoryInfoId;
    private String remark;
    private String productInfoId; //产品ID
    private String receivingFactoryId;

    private Integer flag;
}
