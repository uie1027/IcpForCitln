/**
 * Project Name: icpForCitln
 * File Name: FactoryInventoryLocation
 * Package Name: icp.icpForCitln.factory.entity
 * Date: 19/04/29 11:11
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.factory.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "FACTORY_INVENTORY_LOCATION") //工厂库存地点表
@ToString(callSuper = true)
public class FactoryInventoryLocation extends BaseEntity {
    @Field("FACTORY_INFO_ID")
    private String factoryInfoId; //工厂id

    @Field("INVENTORY_LOCATION_INFO_ID")
    private String inventoryLocationInfoId;  //库存地点id
}
