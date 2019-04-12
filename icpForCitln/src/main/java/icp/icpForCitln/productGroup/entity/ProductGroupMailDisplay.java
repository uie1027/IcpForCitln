/**
 * Project Name: icpForCitln
 * File Name: ProductGroupMailDisplay
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/4/12 15:47
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PRODUCT_GROUP_MAIL_DISPLAY") //产品组商城展示表
public class ProductGroupMailDisplay extends CommonField {

    @Field("PRODUCT_GROUP_CODE")
    private  String productGroupCode;   //产品组编码
    @Field("MAIL_DISPLAY_CODE")
    private  String mailDisplayCode;   //商城展示编码
}
