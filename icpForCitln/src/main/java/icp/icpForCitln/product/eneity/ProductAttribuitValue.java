/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitValue
 * Package Name: icp.icpForCitln.product.eneity
 * Date: 19/04/15 13:17
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_ATTRIBUIT_VALUE") //定义企业产品属性值
public class ProductAttribuitValue extends CommonField {
    @Field("PRODUCT_ATTRIBUIT_DEFINITION_CODE")
    private String productAttribuitDefinitionCode; //企业产品属性编码

    @Field("PRODUCT_ATTRIBUIT_VALUE_CODE")
    private String productAttribuitValueCode; //企业产品属性值编码

    @Field("PRODUCT_ATTRIBUIT_CONTENT")
    private String productAttribuitContent; //企业产品属性值内容
}
