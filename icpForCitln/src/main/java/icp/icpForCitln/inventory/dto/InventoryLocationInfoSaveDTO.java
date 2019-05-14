/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfoSaveDTO
 * Package Name: icp.icpForCitln.inventory.dto
 * Date: 2019/5/13 13:15
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.dto;

import lombok.Data;

@Data
public class InventoryLocationInfoSaveDTO {

    private String factoryInfoId;  //工厂id

    private String inventoryLocationName;   //库存地点名称

    private String inventoryLocationRemark;  //库存地点描述


}
