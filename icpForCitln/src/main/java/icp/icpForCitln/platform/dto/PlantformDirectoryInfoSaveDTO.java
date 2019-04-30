/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoSaveDTO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019-04-30 上午 10:23
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlantformDirectoryInfoSaveDTO {        //保存目录
    private String plantformDirectoryName;    //系统目录名称

    private Integer plantformDirectoryLevel;    //系统目录等级1 1级 2 2级...

    private String plantformDirectoryId;    //父级系统目录ID	1级目录存0

    private String plantformDirectoryDescription;    //系统目录备注
}
