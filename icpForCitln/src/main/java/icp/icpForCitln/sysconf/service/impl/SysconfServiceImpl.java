/**
 * Project Name: icpForCitln
 * File Name: SysconfServiceImpl
 * Package Name: icp.icpForCitln.sysconf.service.impl
 * Date: 2019-04-30 上午 10:27
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.dto.SystemDictionaryInfoGetListDTO;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.service.SysconfService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysconfServiceImpl implements SysconfService {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:34
     * @since: JDK 1.8
     *
     * @description: 根据字典类别查询字典 List 从 Redis 中
     * @param: [systemDictionaryInfoGetListDTO]
     * @return: java.util.List<icp.icpForCitln.sysconf.entity.SystemDictionaryInfo>
     */
    @Override
    public List<SystemDictionaryInfo> systemDictionaryInfoListFindByPage(SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO) {
        List<Object> objectList = RedisUtil.getList(BeanCopyUtil.copy(systemDictionaryInfoGetListDTO, SystemDictionaryInfo.class));
        return BeanCopyUtil.copy(objectList, SystemDictionaryInfo.class);
    }
}
