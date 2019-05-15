/**
 * Project Name: icpForCitln
 * File Name: FactoryInventoryLocationView
 * Package Name: icp.icpForCitln.inventory.view
 * Date: 2019/5/15 15:34
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.view;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Data
@Document(collection = "FACTORY_INVENTORY_VIEW")
public class FactoryInventoryLocationView {
    @Field("FACTORY_INFOS.FACTORY_NAME")
    private String factoryName; //工厂名称

    @Field("FACTORY_INFOS.FACTORY_REMARK")
    private String factoryRemark;   //工厂描述

    @Field("INVENTORY_LOCATION_INFOS.INVENTORY_LOCATION_NAME")
    private String inventoryLocationName;   //库存地点名称

    @Field("INVENTORY_LOCATION_INFOS.Inventory_Location_Remark")
    private String inventoryLocationRemark;  //库存地点描述

}
