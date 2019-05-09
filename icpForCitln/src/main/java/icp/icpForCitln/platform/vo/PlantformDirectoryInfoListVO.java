/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoListVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019/5/9 17:57
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class PlantformDirectoryInfoListVO {
    @Id
    private String id;  //ID

    @Field("PLANTFORM_DIRECTORY_NAME")
    private String plantformDirectoryName;    //系统目录名称

    @Field("PLANTFORM_DIRECTORY_LEVEL")
    private Integer plantformDirectoryLevel;    //系统目录等级1 1级 2 2级...

    @Field("PLANTFORM_DIRECTORY_ID")
    private String plantformDirectoryId;    //父级系统目录ID	1级目录存0
}
