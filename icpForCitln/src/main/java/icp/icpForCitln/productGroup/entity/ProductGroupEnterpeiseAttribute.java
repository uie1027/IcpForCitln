/**
 * Project Name: icpForCitln
 * File Name: ProductGroupEnterpeiseAttribute
 * Package Name: icp.icpForCitln.platformDirectory.eneity
 * Date: 2019/4/12 15:37
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PRODUCT_GROUP_ENTERPEISE_ATTRIBUTE") //产品组企业属性表
public class ProductGroupEnterpeiseAttribute extends CommonField {
    @Field("PRODUCT_GROUP_CODE")
    private String productGroupCode;    //产品组编码
    @Field("PLATFORM_ATTRIBUTE_CODE")
    private String platformAttributeCode;    //企业产品属性编码
}
