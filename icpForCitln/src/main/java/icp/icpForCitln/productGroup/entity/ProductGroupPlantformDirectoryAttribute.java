/**
 * Project Name: icpForCitln
 * File Name: ProductGroupPlantformDirectoryAttribute
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/5/20 13:48
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PRODUCT_GROUP_INFO_PLANTFORM_DIRECTORY_ATTRIBUTE")     //产品组目录属性表
@ToString(callSuper = true)
public class ProductGroupPlantformDirectoryAttribute extends BaseEntity {
    @Field("PRODUCT_GROUP_INFO_ID")
    private String productGroupInfoId;     //产品组ID

    @Field("PLANTFORM_DIRECTORY_ATTRIBUTE_ID")
    private String plantformDirectoryAttributeId;    //系统目录属性ID

    @Field("PLANTFORM_DIRECTORY_ATTRIBUTE_VALUE_ID")
    private String plantformDirectoryAttributeValueId;      //系统目录属性值ID
}
