/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfoGetListDTO
 * Package Name: icp.icpForCitln.inventory.dto
 * Date: 2019/5/15 15:35
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.dto;

import lombok.Data;

@Data
public class InventoryLocationInfoGetListDTO {
    private Integer pageIndex;      //页码

    private Integer pageSize;       //每页条数
}
