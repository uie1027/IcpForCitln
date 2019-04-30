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

import java.io.Serializable;

@Data
@Document(value = "PLANTFORM_DIRECTORY_INFO")   //平台目录表
public class PlantformDirectoryInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PLANTFORM_DIRECTORY_INFO";

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

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return super.getId();
    }
}
