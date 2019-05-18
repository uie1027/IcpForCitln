/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoEditVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019/5/18 18:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;

@Data
public class PlantformDirectoryInfoEditVO {
    private String id;  //ID

    private String plantformDirectoryCode;    //系统目录编码

    private String plantformDirectoryName;    //系统目录名称

    private String plantformDirectoryDescription;    //系统目录备注
}
