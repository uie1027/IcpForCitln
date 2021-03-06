/**
 * Project Name: icpForCitln
 * File Name: SysconfController
 * Package Name: icp.icpForCitln.sysconf.controller
 * Date: 2019-04-30 上午 9:25
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.controller;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.sysconf.dto.*;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuitValue;
import icp.icpForCitln.sysconf.service.SysconfService;
import icp.icpForCitln.sysconf.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public PageResult systemDictionaryInfoListFindByPage(@RequestBody SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO){
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
    public PageResult systemProductAttribuitSave(@RequestBody SystemProductAttribuitSaveDTO systemProductAttribuitSaveDTO){
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
    public PageResult systemProductAttribuitDelete(@RequestBody SystemProductAttribuitDeleteDTO systemProductAttribuitDeleteDTO){
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
    public PageResult systemProductAttribuitValueSave(@RequestBody SystemProductAttribuitValueSaveDTO systemProductAttribuitValueSaveDTO){
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
    @PostMapping("/systemProductAttribuitAndValueGetList")
    public PageResult systemProductAttribuitAndValueGetList(@RequestBody SystemProductAttribuitAndValueListDTO systemProductAttribuitAndValueListDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, sysconfService.systemProductAttribuitAndValueGetList(systemProductAttribuitAndValueListDTO));
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

    /**
     * @author: 方瑞冬
     * @date: 2019/5/16 18:19
     * @since: JDK 1.8
     *
     * @description: 产品属性编辑显示
     * @param: [id]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitFindById")
    public PageResult SystemProductAttribuitFindById(@RequestBody SystemProductAttribuitFindByIdDTO systemProductAttribuitFindByIdDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(sysconfService.SystemProductAttribuitFindById(systemProductAttribuitFindByIdDTO), SystemProductAttribuitEditVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/16 19:33
     * @since: JDK 1.8
     *
     * @description: 产品属性编辑保存
     * @param: [systemProductAttribuitEditDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitEdit")
    public PageResult SystemProductAttribuitEdit(@RequestBody SystemProductAttribuitEditDTO systemProductAttribuitEditDTO){
        sysconfService.SystemProductAttribuitEdit(systemProductAttribuitEditDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "产品属性编辑成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/17 14:55
     * @since: JDK 1.8
     *
     * @description: 产品属性值列表显示
     * @param: [systemProductAttribuitId]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitValueGetList")
    public PageResult systemProductAttribuitValueFindById(@RequestBody SystemProductAttribuitValueFindByIdDTO systemProductAttribuitValueFindByIdDTO){
        MongoResult mongoResult = sysconfService.systemProductAttribuitValueFindById(systemProductAttribuitValueFindByIdDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, mongoResult);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/17 16:55
     * @since: JDK 1.8
     *
     * @description: 产品属性值删除
     * @param: [systemProductAttribuitValueDeleteDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitValueDelete")
    public PageResult systemProductAttribuitValueDelete(@RequestBody SystemProductAttribuitValueDeleteDTO systemProductAttribuitValueDeleteDTO){
        sysconfService.systemProductAttribuitValueDelete(systemProductAttribuitValueDeleteDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "产品属性值删除成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/17 16:16
     * @since: JDK 1.8
     *
     * @description: 产品属性值编辑保存
     * @param: [systemProductAttribuitValueEditDTOList]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitValueEditSave")
    public PageResult systemProductAttribuitValueEditSave(@RequestBody SystemProductAttribuitValueEditSaveDTO systemProductAttribuitValueEditSaveDTO){
        sysconfService.systemProductAttribuitValueEditSave(systemProductAttribuitValueEditSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "产品属性值编辑成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 14:37
     * @since: JDK 1.8
     *
     * @description: 产品属性编辑显示
     * @param: [systemProductAttribuitValueEditDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemProductAttribuitValueEdit")
    public PageResult systemProductAttribuitValueEdit(@RequestBody SystemProductAttribuitValueEditDTO systemProductAttribuitValueEditDTO){
        SystemProductAttribuitValue systemProductAttribuitValue = sysconfService.systemProductAttribuitValueEdit(systemProductAttribuitValueEditDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(systemProductAttribuitValue, SystemProductAttribuitValueVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/20 11:26
     * @since: JDK 1.8
     *
     * @description: 根据 ID 获取数据字典数据
     * @param: [systemDictionaryInfoAllGetByIdDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemDictionaryInfoAllGetById")
    public PageResult systemDictionaryInfoAllGetById(@RequestBody SystemDictionaryInfoAllGetByIdDTO systemDictionaryInfoAllGetByIdDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(sysconfService.systemDictionaryInfoAllGetById(systemDictionaryInfoAllGetByIdDTO), SystemDictionaryInfoGetListVO.class));
    }
}
