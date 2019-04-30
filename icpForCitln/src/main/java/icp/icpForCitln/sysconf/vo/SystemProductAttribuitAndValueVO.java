/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitAndValueVO
 * Package Name: icp.icpForCitln.sysconf.vo
 * Date: 2019-04-30 下午 12:40
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.vo;

import lombok.Data;

@Data

public class SystemProductAttribuitAndValueVO {     //产品属性页面返回
    private String systemProductAttribuitCode; //产品属性编码

    private Integer systemProductAttribuitType;  //产品属性类型   1定性 2定量

    private String systemProductAttribuitName;  //产品属性名称

    private String systemProductAttribuitValueStr;  //产品属性值字符串
}
