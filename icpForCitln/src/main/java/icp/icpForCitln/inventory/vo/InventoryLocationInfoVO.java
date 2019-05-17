/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfo
 * Package Name: icp.icpForCitln.inventory
 * Date: 2019-04-29 下午 3:34
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.inventory.vo;

import lombok.Data;

@Data
public class InventoryLocationInfoVO {
    private String id;
    private String inventoryLocationCode;   //库存地点编码
    private String inventoryLocationName;   //库存地点名称
    private String inventoryLocationRemark;  //库存地点描述
}
