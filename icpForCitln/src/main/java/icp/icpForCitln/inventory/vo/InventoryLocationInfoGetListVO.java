/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfoGetListVO
 * Package Name: icp.icpForCitln.inventory.vo
 * Date: 2019/5/13 16:08
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.vo;

import lombok.Data;

@Data
public class InventoryLocationInfoGetListVO {
    private Integer pageIndex;      //页码

    private Integer pageSize;       //每页条数

    private String inventoryLocationName;   //库存地点名称






}
