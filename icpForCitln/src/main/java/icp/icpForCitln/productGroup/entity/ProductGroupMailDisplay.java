/**
 * Project Name: icpForCitln
 * File Name: ProductGroupMailDisplay
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/4/29 16:29
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PRODUCT_GROUP_MAIL_DISPLAY")     //产品组商城展示表
public class ProductGroupMailDisplay extends BaseEntity{
    @Field("PRODUCT_GROUP_INFO_ID")
    private String productGroupInfoId;  //产品组ID
    @Field("PLANTFORM_MAIL_DISPLAY_ID")
    private String plantformMailDisplayId;  //平台商城展示ID
}
