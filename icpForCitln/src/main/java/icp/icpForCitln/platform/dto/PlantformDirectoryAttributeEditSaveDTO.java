/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeEditSaveDTO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019/5/18 19:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlantformDirectoryAttributeEditSaveDTO {
    private String id;   //ID

    private String plantformAttributeName;    //系统属性名称

    private Integer flag;   //是否更新到历史数据 1更新 2不更新
}
