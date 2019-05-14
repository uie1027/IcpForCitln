/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfoUpdateDTO
 * Package Name: icp.icpForCitln.inventory.dto
 * Date: 2019/5/14 9:52
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.dto;

import lombok.Data;

@Data
public class InventoryLocationInfoUpdateDTO {

    private String inventoryLocationInfoId;  //库存地点id

    private String inventoryLocationName;   //库存地点名称

    private Integer flag;   //是否更新到历史数据  1是2否
}
