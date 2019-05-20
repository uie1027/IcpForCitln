/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeValueGetListVO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019/5/18 20:06
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlantformDirectoryAttributeValueGetListDTO {
    private String plantformDirectoryAttributeId;    //系统目录属性ID

    private Integer pageIndex;  //页码

    private Integer pageSize;   //页面大小
}
