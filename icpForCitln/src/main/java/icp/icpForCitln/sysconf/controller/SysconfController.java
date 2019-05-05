/**
 * Project Name: icpForCitln
 * File Name: SysconfController
 * Package Name: icp.icpForCitln.sysconf.controller
 * Date: 2019-04-30 上午 9:25
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.sysconf.dto.SystemDictionaryInfoGetListDTO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitDeleteDTO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitSaveDTO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitValueSaveDTO;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;
import icp.icpForCitln.sysconf.service.SysconfService;
import icp.icpForCitln.sysconf.vo.SystemBrandInfoVO;
import icp.icpForCitln.sysconf.vo.SystemDictionaryInfoGetListVO;
import icp.icpForCitln.sysconf.vo.SystemProductAttribuitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysconf")
public class SysconfController {
    @Autowired
    private SysconfService sysconfService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:18
     * @since: JDK 1.8
     *
     * @description: 字典下拉列表
     * @param: [systemDictionaryInfoGetListDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemDictionaryInfoListFindByPage")
    public PageResult systemDictionaryInfoListFindByPage(SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO){
        List<SystemDictionaryInfo> systemDictionaryInfoList = sysconfService.systemDictionaryInfoListFindByPage(systemDictionaryInfoGetListDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(systemDictionaryInfoList, SystemDictionaryInfoGetListVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 12:09
     * @since: JDK 1.8
     *
     * @description: 新增产品属性
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitSave")
    public PageResult systemProductAttribuitSave(SystemProductAttribuitSaveDTO systemProductAttribuitSaveDTO){
        sysconfService.systemProductAttribuitSave(systemProductAttribuitSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "新增产品属性成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 12:29
     * @since: JDK 1.8
     *
     * @description: 产品属性删除
     * @param: [systemProductAttribuitDeleteDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitDelete")
    public PageResult systemProductAttribuitDelete(SystemProductAttribuitDeleteDTO systemProductAttribuitDeleteDTO){
        sysconfService.systemProductAttribuitDelete(systemProductAttribuitDeleteDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "删除产品属性成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 5:09
     * @since: JDK 1.8
     *
     * @description: 新增产品属性值
     * @param: [systemProductAttribuitValueSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitValueSave")
    public PageResult systemProductAttribuitValueSave(SystemProductAttribuitValueSaveDTO systemProductAttribuitValueSaveDTO){
        sysconfService.systemProductAttribuitValueSave(systemProductAttribuitValueSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "产品属性值保存成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 12:38
     * @since: JDK 1.8
     *
     * @description: 产品属性列表返回（页面列表）
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/systemProductAttribuitAndValueGetList")
    public PageResult systemProductAttribuitAndValueGetList(){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, sysconfService.systemProductAttribuitAndValueGetList());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 上午 10:03
     * @since: JDK 1.8
     *
     * @description: 产品属性多选
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/systemProductAttribuitGetList")
    public PageResult systemProductAttribuitGetList(){
        List<SystemProductAttribuit> systemProductAttribuitList = sysconfService.systemProductAttribuitGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(systemProductAttribuitList, SystemProductAttribuitVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 1:12
     * @since: JDK 1.8
     *
     * @description: 品牌下拉列表
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/systemBrandInfoGetList")
    public PageResult systemBrandInfoGetList(){
        List<SystemBrandInfo> systemBrandInfoList = sysconfService.systemBrandInfoGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(systemBrandInfoList, SystemBrandInfoVO.class));
    }
}
