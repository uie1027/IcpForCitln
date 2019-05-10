/**
 * Project Name: icpForCitln
 * File Name: ProductionConfirmOrderFindDTO
 * Package Name: icp.icpForCitln.produce.dto
 * Date: 19/05/10 19:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.dto;

import lombok.Data;

@Data
public class ProductionConfirmOrderFindDTO {
    private String productionConfirmOrderCode;  //生产确认单编号

    private String productionOrderCode;  //生产订单编号
}
