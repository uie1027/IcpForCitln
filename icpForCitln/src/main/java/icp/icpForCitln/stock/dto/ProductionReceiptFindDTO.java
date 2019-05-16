/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptFindDTO
 * Package Name: icp.icpForCitln.produce.dto
 * Date: 19/05/06 10:13
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

@Data
public class ProductionReceiptFindDTO {
    private String productionReceiptCode;  //生产入库单号

    private String factoryName;  //工厂名称

    private String factoryCode;  //工厂编码
}
