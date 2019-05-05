/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitVO
 * Package Name: icp.icpForCitln.sysconf.vo
 * Date: 2019-05-05 上午 11:21
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.vo;

import lombok.Data;

@Data
public class SystemProductAttribuitVO {     //产品属性多选返回

    private String id;      //产品属性ID

    private String systemProductAttribuitCode; //产品属性编码

    private String systemProductAttribuitName;  //产品属性名称
}
