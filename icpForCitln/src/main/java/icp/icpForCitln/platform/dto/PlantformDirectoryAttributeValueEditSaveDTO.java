/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeValueEditSaveDTO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019/5/18 20:26
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlantformDirectoryAttributeValueEditSaveDTO {
    private String id;  //ID

    private String plantformAttributeContent;    //系统目录属性值内容

    private Integer flag;   //是否更新到历史数据 1更新2不更新
}
