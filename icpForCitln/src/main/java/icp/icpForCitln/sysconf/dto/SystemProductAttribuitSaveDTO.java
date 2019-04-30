/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitSaveDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019-04-30 下午 12:12
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import lombok.Data;

@Data
public class SystemProductAttribuitSaveDTO {
    private Integer systemProductAttribuitType;  //产品属性类型

    private String systemProductAttribuitName;  //产品属性名称

    private String basicUnitId;  //基本单位id
}
