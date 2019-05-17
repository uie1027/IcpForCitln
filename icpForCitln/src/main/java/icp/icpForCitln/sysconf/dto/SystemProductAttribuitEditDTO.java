/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitEditDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019/5/16 19:10
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import lombok.Data;

@Data
public class SystemProductAttribuitEditDTO {
    private String id;  //ID

    private Integer systemProductAttribuitType;  //产品属性类型

    private String systemProductAttribuitName;  //产品属性名称

    private String basicUnitId;  //基本单位id

    private Integer flag;   //是否更新到历史数据  1是2否
}
