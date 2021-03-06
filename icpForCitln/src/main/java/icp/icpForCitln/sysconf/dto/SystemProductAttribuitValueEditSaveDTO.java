/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitValueEditSaveDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019/5/17 16:14
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import lombok.Data;

@Data
public class SystemProductAttribuitValueEditSaveDTO {
    private String id;  //ID

    private String systemProductAttribuitContent;       //产品属性值内容

    private Integer flag;       //是否更新到历史数据 1 更新 2不更新
}
