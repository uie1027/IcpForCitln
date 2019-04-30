/**
 * Project Name: icpForCitln
 * File Name: SysconfServiceImpl
 * Package Name: icp.icpForCitln.sysconf.service.impl
 * Date: 2019-04-30 上午 10:27
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.dto.SystemDictionaryInfoGetListDTO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitDeleteDTO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitSaveDTO;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;
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

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 12:15
     * @since: JDK 1.8
     *
     * @description: 新增产品属性
     * @param: [systemProductAttribuitSaveDTO]
     * @return: void
     */
    @Override
    public void systemProductAttribuitSave(SystemProductAttribuitSaveDTO systemProductAttribuitSaveDTO) {
        SystemProductAttribuit systemProductAttribuit = BeanCopyUtil.copy(systemProductAttribuitSaveDTO, SystemProductAttribuit.class);
        systemProductAttribuit.setSystemProductAttribuitCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(systemProductAttribuit);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 12:30
     * @since: JDK 1.8
     *
     * @description: 删除产品属性
     * @param: [systemProductAttribuitDeleteDTO]
     * @return: void
     */
    @Override
    public void systemProductAttribuitDelete(SystemProductAttribuitDeleteDTO systemProductAttribuitDeleteDTO) {
        MongoUtil.delete(BeanCopyUtil.copy(systemProductAttribuitDeleteDTO, SystemProductAttribuit.class));
    }
}
