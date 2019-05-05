/**
 * Project Name: icpForCitln
 * File Name: ProductionOrderVO
 * Package Name: icp.icpForCitln.produce.vo
 * Date: 19/05/05 14:43
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductionOrderVO {
    private String id;
    private String productionOrderNumber;
    private String factory;
    private String productCode;
    private String productName;
    private BigDecimal productionQuantity;
    private String basicUnit;
}
