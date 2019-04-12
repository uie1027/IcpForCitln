/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectory
 * Package Name: icp.icpForCitln.platformDirectory.eneity
 * Date: 2019-04-12 下午 1:51
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platformDirectory.eneity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PLATFORM_DIRECTORY")
public class PlatformDirectory {
    @Id
    private String id;  //主键

    @Field("PLATFORM_DIRECTORY_CODE")
    private String platformDirectoryCode;   //平台目录编码

    @Field("PLATFORM_DIRECTORY_NAME")
    private String platformDirectoryName;   //平台目录名称

    @Field("PLATFORM_DIRECTORY_LEVEL")
    private Integer platformDirectoryLevel; //平台目录等级  1 1级 2 2级...
}
