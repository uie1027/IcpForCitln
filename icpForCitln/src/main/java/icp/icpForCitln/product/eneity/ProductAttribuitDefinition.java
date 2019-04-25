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

import java.io.Serializable;

@Data
@Document(collection = "PRODUCT_ATTRIBUIT_DEFINITION")  //定义企业产品属性
public class ProductAttribuitDefinition extends CommonField implements Serializable {
    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PRODUCT_ATTRIBUIT_DEFINITION";

    @Field("PRODUCT_ATTRIBUIT_DEFINITION_CODE")
    private String productAttribuitDefinitionCode; //企业产品属性编码

    @Field("PRODUCT_ATTRIBUIT_DEFINITION_TYPE")
    private String productAttribuitDefinitionType; //企业产品属性类型

    @Field("PRODUCT_ATTRIBUIT_DEFINITION_NAME")
    private String productAttribuitDefinitionName; //企业产品属性名称

    @Field("UNIT_CODE")
    private String unitCode; //单位编码

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return this.productAttribuitDefinitionCode;
    }
}
