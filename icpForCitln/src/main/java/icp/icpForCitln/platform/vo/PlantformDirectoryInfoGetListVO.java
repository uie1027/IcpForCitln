/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoGetListVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019-04-30 上午 11:00
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;

@Data
public class PlantformDirectoryInfoGetListVO {
    private String id;  //ID

    private String plantformDirectoryName;    //系统目录名称

    private Integer plantformDirectoryLevel;    //系统目录等级1 1级 2 2级...

    private String plantformDirectoryId;    //父级系统目录ID	1级目录存0
}
