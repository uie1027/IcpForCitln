/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuit
 * Package Name: icp.icpForCitln.product.eneity
 * Date: 19/04/15 13:40
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_ATTRIBUIT") //产品属性表
public class ProductAttribuit extends CommonField {
    @Field("PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_ATTRIBUIT_VALUE_CODE")
    private String productAttribuitValueCode;  //企业产品属性值编码
}
