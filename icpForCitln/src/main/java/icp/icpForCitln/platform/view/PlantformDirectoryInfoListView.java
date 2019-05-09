/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoListView
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019-04-30 上午 11:00
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.view;

import icp.icpForCitln.platform.vo.PlantformDirectoryInfoListVO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "PLANTFORM_DIRECTORY_INFO_LIST")
public class PlantformDirectoryInfoListView {
    @Id
    private String id;  //ID

    @Field("PLANTFORM_DIRECTORY_NAME")
    private String plantformDirectoryName;    //系统目录名称

    @Field("PLANTFORM_DIRECTORY_LEVEL")
    private Integer plantformDirectoryLevel;    //系统目录等级1 1级 2 2级...

    @Field("PLANTFORM_DIRECTORY_ID")
    private String plantformDirectoryId;    //父级系统目录ID	1级目录存0

    @Field("PLANTFORM_DIRECTORY_INFO_CHILDREN")
    private List<PlantformDirectoryInfoListVO> plantformDirectoryInfoListVOList;    //子目录
}
