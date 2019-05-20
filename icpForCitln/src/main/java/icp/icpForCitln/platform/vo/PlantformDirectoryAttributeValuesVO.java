/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeValuesVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019/5/20 10:07
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class PlantformDirectoryAttributeValuesVO {
    @Id
    private String id;  //系统属性值ID

    @Field("PLANTFORM_ATTRIBUTE_CONTENT")
    private String plantformAttributeContent;    //系统目录属性值内容
}
