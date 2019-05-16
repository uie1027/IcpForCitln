/**
 * Project Name: icpForCitln
 * File Name: SysconfServiceImpl
 * Package Name: icp.icpForCitln.sysconf.service.impl
 * Date: 2019-04-30 上午 10:27
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.dto.*;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuitValue;
import icp.icpForCitln.sysconf.service.SysconfService;
import icp.icpForCitln.sysconf.view.SystemProductAttribuitAndValueView;
import icp.icpForCitln.sysconf.vo.SystemProductAttribuitAndValueVO;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 5:06
     * @since: JDK 1.8
     *
     * @description: 新增产品属性值
     * @param: [systemProductAttribuitValueSaveDTO]
     * @return: void
     */
    @Override
    public void systemProductAttribuitValueSave(SystemProductAttribuitValueSaveDTO systemProductAttribuitValueSaveDTO) {
        SystemProductAttribuitValue systemProductAttribuitValue = BeanCopyUtil.copy(systemProductAttribuitValueSaveDTO, SystemProductAttribuitValue.class);
        systemProductAttribuitValue.setSystemProductAttribuitValueCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(systemProductAttribuitValue);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 5:15
     * @since: JDK 1.8
     *
     * @description: 产品属性页面列表
     * @param: []
     * @return: java.util.List<icp.icpForCitln.sysconf.vo.SystemProductAttribuitAndValueVO>
     */
    @Override
    public MongoResult systemProductAttribuitAndValueGetList(SystemProductAttribuitAndValueListDTO systemProductAttribuitAndValueListDTO) {
        MongoResult mongoResult = MongoUtil.select(systemProductAttribuitAndValueListDTO.getPageIndex(), systemProductAttribuitAndValueListDTO.getPageSize(), new SystemProductAttribuitAndValueView());
        List<SystemProductAttribuitAndValueView> productAttribuitAndValueViewList = mongoResult.getResultList();
        List<SystemProductAttribuitAndValueVO> systemProductAttribuitAndValueVOList = BeanCopyUtil.copy(productAttribuitAndValueViewList, SystemProductAttribuitAndValueVO.class);
        for(int i = 0; i < productAttribuitAndValueViewList.size(); i++){
            String systemProductAttribuitValues = "";
            List<SystemProductAttribuitValue> systemProductAttribuitValueList = productAttribuitAndValueViewList.get(i).getSystemProductAttribuitValues();
            for(int j = 0; j < systemProductAttribuitValueList.size(); j++){
                systemProductAttribuitValues = systemProductAttribuitValues + systemProductAttribuitValueList.get(j).getSystemProductAttribuitContent() + " ";
            }
            systemProductAttribuitAndValueVOList.get(i).setSystemProductAttribuitValues(systemProductAttribuitValues);
        }
        mongoResult.setResultList(systemProductAttribuitAndValueVOList);
        return mongoResult;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 上午 10:07
     * @since: JDK 1.8
     *
     * @description: 获取产品属性 List
     * @param: []
     * @return: java.util.List<icp.icpForCitln.sysconf.entity.SystemProductAttribuit>
     */
    @Override
    public List<SystemProductAttribuit> systemProductAttribuitGetList() {
        List list = RedisUtil.getList(new SystemProductAttribuit());
        return BeanCopyUtil.copy(list, SystemProductAttribuit.class);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 1:14
     * @since: JDK 1.8
     *
     * @description: 品牌下拉列表
     * @param: []
     * @return: java.util.List<icp.icpForCitln.sysconf.entity.SystemBrandInfoVO>
     */
    @Override
    public List<SystemBrandInfo> systemBrandInfoGetList() {
        List list = RedisUtil.getList(new SystemBrandInfo());
        return BeanCopyUtil.copy(list, SystemBrandInfo.class);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/16 18:20
     * @since: JDK 1.8
     *
     * @description: 根据ID查询产品属性
     * @param: [id]
     * @return: icp.icpForCitln.sysconf.entity.SystemProductAttribuit
     */
    @Override
    public SystemProductAttribuit SystemProductAttribuitFindById(String id) {
        SystemProductAttribuit systemProductAttribuit = new SystemProductAttribuit();
        systemProductAttribuit.setId(id);
        List<SystemProductAttribuit> systemProductAttribuitList = MongoUtil.select(systemProductAttribuit);
        if(!CollectionUtils.isEmpty(systemProductAttribuitList)){
            return systemProductAttribuitList.get(0);
        } else {
            return null;
        }
    }
}
