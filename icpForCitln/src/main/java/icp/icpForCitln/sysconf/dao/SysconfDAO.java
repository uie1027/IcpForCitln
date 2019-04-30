/**
 * Project Name: icpForCitln
 * File Name: SysconfDAO
 * Package Name: icp.icpForCitln.sysconf.dao
 * Date: 2019-04-30 下午 5:16
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dao;

import icp.icpForCitln.sysconf.dto.SystemProductAttribuitAndValueDTO;

import java.util.List;

public interface SysconfDAO {
    List<SystemProductAttribuitAndValueDTO> systemProductAttribuitAndValueFind();   //产品属性和产品属性值联表查询
}
