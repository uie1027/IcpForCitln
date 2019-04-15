/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitDefinition
 * Package Name: icp.icpForCitln.product.eneity
 * Date: 19/04/15 13:11
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_ATTRIBUIT_DEFINITION")  //定义企业产品属性
public class ProductAttribuitDefinition extends CommonField {
    @Field("PRODUCT_ATTRIBUIT_DEFINITION_CODE")
    private String productAttribuitDefinitionCode; //企业产品属性编码

    @Field("PRODUCT_ATTRIBUIT_DEFINITION_TYPE")
    private String productAttribuitDefinitionType; //企业产品属性类型

    @Field("PRODUCT_ATTRIBUIT_DEFINITION_NAME")
    private String productAttribuitDefinitionName; //企业产品属性名称

    @Field("UNIT_CODE")
    private String unitCode; //单位编码
}
