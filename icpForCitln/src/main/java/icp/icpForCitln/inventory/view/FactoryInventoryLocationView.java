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
    @Field("INVENTORY_LOCATION_INFO_ID")
    private String inventoryLocationId;

    @Field("INVENTORY_LOCATION_INFOS.INVENTORY_LOCATION_NAME")
    private String inventoryLocationName;   //库存地点名称

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId;

}
