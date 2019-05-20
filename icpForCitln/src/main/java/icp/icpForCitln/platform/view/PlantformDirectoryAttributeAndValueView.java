/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryAttributeAndValueView
 * Package Name: icp.icpForCitln.platform.view
 * Date: 2019/5/20 10:01
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.view;

import icp.icpForCitln.platform.vo.PlantformDirectoryAttributeValuesVO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "PLANTFORM_DIRECTORY_ATTRIBUTE_AND_VALUE")
public class PlantformDirectoryAttributeAndValueView {
    @Id
    private String id;      //系统属性ID

    @Field("PLANTFORM_DIRECTORY_ID")
    private String plantformDirectoryId;    //系统目录id

    @Field("PLANTFORM_ATTRIBUTE_NAME")
    private String plantformAttributeName;    //系统属性名称

    @Field("PLANTFORM_DIRECTORY_ATTRIBUTE_VALUES")
    private List<PlantformDirectoryAttributeValuesVO> plantformDirectoryAttributeValuesVO;    //产品属性值List
}
