/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryInfoVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019-04-22 下午 2:40
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;

@Data
public class PlatformDirectoryInfoVO {      //目录返显

    private String platformDirectoryCode;   //平台目录编码

    private String platformDirectoryName;   //平台目录名称

    private Integer platformDirectoryLevel; //平台目录等级  1 1级 2 2级...

    private String parenetPlatformDirectoryCode;   //父级平台目录编码  1级目录存0

    private String platformDirectoryDescription;       //平台目录备注
}
