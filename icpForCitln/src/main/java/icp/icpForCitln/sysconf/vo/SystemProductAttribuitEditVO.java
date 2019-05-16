/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitEditVO
 * Package Name: icp.icpForCitln.sysconf.vo
 * Date: 2019/5/16 18:17
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.vo;

import lombok.Data;

@Data
public class SystemProductAttribuitEditVO {
    private String id;      //ID

    private String systemProductAttribuitCode; //产品属性编码

    private Integer systemProductAttribuitType;  //产品属性类型   1定性 2定量

    private String systemProductAttribuitName;  //产品属性名称

    private String basicUnitId;  //基本单位id
}
