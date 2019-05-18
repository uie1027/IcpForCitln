/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoEditSaveDTO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019/5/18 18:44
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlantformDirectoryInfoEditSaveDTO {
    private String id;  //ID

    private String plantformDirectoryName;    //系统目录名称

    private String plantformDirectoryDescription;    //系统目录备注

    private Integer flag;   //是否更新到历史 1更新2不更新
}
