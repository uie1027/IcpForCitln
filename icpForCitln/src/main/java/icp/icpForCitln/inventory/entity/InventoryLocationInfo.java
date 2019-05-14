/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfo
 * Package Name: icp.icpForCitln.inventory
 * Date: 2019-04-29 下午 3:34
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.inventory.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "INVENTORY_LOCATION_INFO")  //库存地点信息表
@ToString(callSuper = true)
public class InventoryLocationInfo extends BaseEntity {
    @Field("INVENTORY_LOCATION_CODE")
    private String inventoryLocationCode;   //库存地点编码

    @Field("INVENTORY_LOCATION_NAME")
    private String inventoryLocationName;   //库存地点名称

    @Field("Inventory_Location_Remark")
    private String inventoryLocationRemark;  //库存地点描述
}
