/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttribute
 * Package Name: icp.icpForCitln.platform.entity
 * Date: 2019/4/29 17:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.platform.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "PLANTFORM_DIRECTORY_ATTRIBUTE")  //平台目录属性表
@ToString(callSuper = true)
public class PlantformDirectoryAttribute extends BaseEntity {
    @Field("PLANTFORM_DIRECTORY_ID")
    private String plantformDirectoryId;    //系统目录id

    @Field("PLANTFORM_ATTRIBUTE_CODE")
    private String plantformAttributeCode;    //系统属性编码

    @Field("PLANTFORM_ATTRIBUTE_NAME")
    private String plantformAttributeName;    //系统属性名称

}
