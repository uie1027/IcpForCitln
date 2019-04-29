/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuit
 * Package Name: icp.icpForCitln.product.eneity
 * Date: 19/04/15 13:40
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_ATTRIBUIT") //产品属性表
@ToString(callSuper = true)
public class ProductAttribuit extends BaseEntity {
    @Field("PRODUCT_INFO_ID")
    private String productInfoId;  //产品id

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_ID")
    private String systemProductAttribuitId;  //系统产品属性ID

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_VALUE_ID")
    private String systemProductAttribuitValueId;   //系统产品属性值ID    定性  与下面互补

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_VALUE")
    private String systemProductAttribuitValue;     //系统产品属性值     定量  与上面互补
}
