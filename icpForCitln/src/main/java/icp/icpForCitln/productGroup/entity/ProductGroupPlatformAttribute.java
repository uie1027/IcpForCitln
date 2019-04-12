/**
 * Project Name: icpForCitln
 * File Name: ProductGroupPlatformAttribute
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/4/12 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_GROUP_PLATFORM_ATTRIBUTE") //产品组平台属性表
public class ProductGroupPlatformAttribute extends CommonField {
    @Field("PRODUCT_GROUP_CODE")
    private String productGroupCode;    //产品组编码
    @Field("PLATFORM_ATTRIBUTE_CODE")
    private String platformAttributeCode;   //平台属性值编码
}
