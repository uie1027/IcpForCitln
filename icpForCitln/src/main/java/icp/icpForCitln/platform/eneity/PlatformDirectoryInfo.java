/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryInfo
 * Package Name: icp.icpForCitln.platform.eneity
 * Date: 2019-04-12 下午 1:51
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PLATFORM_DIRECTORY_INFO")   //平台目录表
public class PlatformDirectoryInfo extends CommonField {

    @Field("PLATFORM_DIRECTORY_CODE")
    private String platformDirectoryCode;   //平台目录编码

    @Field("PLATFORM_DIRECTORY_NAME")
    private String platformDirectoryName;   //平台目录名称

    @Field("PLATFORM_DIRECTORY_LEVEL")
    private Integer platformDirectoryLevel; //平台目录等级  1 1级 2 2级...

    @Field("PARENT_PLATFORM_DIRECTORY_CODE")
    private String parenetPlatformDirectoryCode;   //父级平台目录编码  1级目录存0

    @Field("PLATFORM_DIRECTORY_DESCRIPTION")
    private String platformDirectoryDescription;       //平台目录备注
}
