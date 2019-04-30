/**
 * Project Name: icpForCitln
 * File Name: SysconfService
 * Package Name: icp.icpForCitln.sysconf.service
 * Date: 2019-04-30 上午 10:27
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.service;

import icp.icpForCitln.sysconf.dto.SystemDictionaryInfoGetListDTO;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;

import java.util.List;

public interface SysconfService {
    List<SystemDictionaryInfo> systemDictionaryInfoListFindByPage(SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO);   //根据字典类别查询字典 List
}
