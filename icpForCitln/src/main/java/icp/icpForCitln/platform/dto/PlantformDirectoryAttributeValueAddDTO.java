/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeValueAddDTO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019/5/18 19:50
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlantformDirectoryAttributeValueAddDTO {
    private String plantformDirectoryAttributeId;    //系统目录属性ID

    private String plantformAttributeContent;    //系统目录属性值内容
}
