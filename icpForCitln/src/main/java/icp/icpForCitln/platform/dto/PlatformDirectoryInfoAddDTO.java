/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryInfoAddDTO
 * Package Name: icp.icpForCitln.platform.dto
 * Date: 2019-04-22 下午 2:17
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dto;

import lombok.Data;

@Data
public class PlatformDirectoryInfoAddDTO {

    private String platformDirectoryName;   //平台目录名称

    private Integer platformDirectoryLevel; //平台目录等级  1 1级 2 2级...

    private String parenetPlatformDirectoryCode;   //父级平台目录编码  1级目录存0

    private String platformDirectoryDescription;       //平台目录备注
}
