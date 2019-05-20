/**
 * Project Name: icpForCitln
 * File Name: ProductGroupSystemAttribute
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/4/29 16:29
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PRODUCT_GROUP_SYSTEM_ATTRIBUTE")     //产品组系统属性表
@ToString(callSuper = true)
public class ProductGroupSystemAttribute extends BaseEntity {
    @Field("PRODUCT_GROUP_INFO_ID")
    private String productGroupInfoId;     //产品组ID

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_ID")
    private String systemProductAttribuitId;    //系统产品属性ID
}
