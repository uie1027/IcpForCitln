/**
 * Project Name: icpForCitln
 * File Name: SysconfService
 * Package Name: icp.icpForCitln.sysconf.service
 * Date: 2019-04-30 上午 10:27
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.sysconf.dto.*;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;

import java.util.List;

public interface SysconfService {
    List<SystemDictionaryInfo> systemDictionaryInfoListFindByPage(SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO);   //根据字典类别查询字典 List
    void systemProductAttribuitSave(SystemProductAttribuitSaveDTO systemProductAttribuitSaveDTO);   //新增产品属性
    void systemProductAttribuitDelete(SystemProductAttribuitDeleteDTO systemProductAttribuitDeleteDTO);     //删除产品属性
    void systemProductAttribuitValueSave(SystemProductAttribuitValueSaveDTO systemProductAttribuitValueSaveDTO);    //新增产品属性值
    MongoResult systemProductAttribuitAndValueGetList(SystemProductAttribuitAndValueListDTO systemProductAttribuitAndValueListDTO);     //产品属性页面列表
    List<SystemProductAttribuit> systemProductAttribuitGetList();       //产品属性 List
    List<SystemBrandInfo> systemBrandInfoGetList();     //品牌下拉列表
    SystemProductAttribuit SystemProductAttribuitFindById(String id);       //通过ID查询 产品属性
    void SystemProductAttribuitEdit(SystemProductAttribuitEditDTO systemProductAttribuitEditDTO);  //产品属性编辑保存
}
