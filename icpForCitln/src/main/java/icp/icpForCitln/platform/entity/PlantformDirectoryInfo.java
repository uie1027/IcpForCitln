/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfo
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
@Document(value = "PLANTFORM_DIRECTORY_INFO")   //平台目录表
public class PlantformDirectoryInfo extends BaseEntity {
    @Field("PLANTFORM_DIRECTORY_CODE")
    private String plantformDirectoryCode;    //系统目录编码

    @Field("PLANTFORM_DIRECTORY_NAME")
    private String plantformDirectoryName;    //系统目录名称

    @Field("PLANTFORM_DIRECTORY_LEVEL")
    private Integer plantformDirectoryLevel;    //系统目录等级1 1级 2 2级...

    @Field("PLANTFORM_DIRECTORY_ID")
    private String plantformDirectoryId;    //父级系统目录ID	1级目录存0

    @Field("PLANTFORM_DIRECTORY_DESCRIPTION")
    private String plantformDirectoryDescription;    //系统目录备注
}
