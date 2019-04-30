/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitValueSaveDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019-04-30 下午 5:03
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import lombok.Data;

@Data
public class SystemProductAttribuitValueSaveDTO {       //新增产品属性值
    private String systemProductAttribuitId; //产品属性ID

    private String systemProductAttribuitContent;  //产品属性值内容
}
