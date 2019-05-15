/**
 * Project Name: icpForCitln
 * File Name: ProductGroupPicture
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/5/15 18:21
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_GROUP_PICTURE")     //产品组图片
@ToString(callSuper = true)
public class ProductGroupPicture extends BaseEntity {
    @Field("PRODUCT_GROUP_INFO_ID")
    private String productGroupInfoId;  //产品组ID

    @Field("PRODUCT_GROUP_PICTURE")
    private String	productGroupPicture;  //图片
}
