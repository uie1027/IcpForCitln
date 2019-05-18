/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeValueEditVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019/5/18 20:21
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;

@Data
public class PlantformDirectoryAttributeValueEditVO {
    private String id;  //ID

    private String plantformAttributeCode;    //系统目录属性值编码

    private String plantformAttributeContent;    //系统目录属性值内容
}
