/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeValue
 * Package Name: icp.icpForCitln.platform.entity
 * Date: 2019/4/29 17:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.platform.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PLANTFORM_DIRECTORY_ATTRIBUTE_VALUE")    //平台目录属性值表
public class PlantformDirectoryAttributeValue extends BaseEntity {
    @Field("PLANTFORM_DIRECTORY_ATTRIBUTE_ID")
    private String plantformDirectoryAttributeId;    //系统目录属性ID

    @Field("PLANTFORM_ATTRIBUTE_CODE")
    private String plantformAttributeCode;    //系统目录属性值编码

    @Field("PLANTFORM_ATTRIBUTE_CONTENT")
    private String plantformAttributeContent;    //系统目录属性值内容

}
