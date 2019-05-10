/**
 * Project Name: icpForCitln
 * File Name: PermissionController
 * Package Name: icp.icpForCitln.permission.controller
 * Date: 2019/5/9 9:14
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.permission.dto.PermissionInfoSaveDTO;
import icp.icpForCitln.permission.dto.RoleInfoGetListDTO;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.dto.RoleInfoUpdateDTO;
import icp.icpForCitln.permission.entity.PermissionInfo;
import icp.icpForCitln.permission.entity.RoleInfo;
import icp.icpForCitln.permission.service.PermissionService;
import icp.icpForCitln.permission.vo.PermissionInfoVO;
import icp.icpForCitln.permission.vo.RoleInfoFindByIdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 9:19
     * @since: JDK 1.8
     *
     * @description: 新建角色保存
     * @param: [roleInfoSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/roleInfoSave")
    public PageResult roleInfoSave(@RequestBody RoleInfoSaveDTO roleInfoSaveDTO){
        permissionService.roleInfoSave(roleInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "角色保存成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 9:36
     * @since: JDK 1.8
     *
     * @description: 角色列表返回
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/roleInfoGetList")
    public PageResult roleInfoGetList(@RequestBody RoleInfoGetListDTO roleInfoGetListDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, permissionService.roleInfoGetList(roleInfoGetListDTO));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 13:03
     * @since: JDK 1.8
     *
     * @description: 根据 ID 查询角色信息
     * @param: [id]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/roleInfoFindById")
    public PageResult roleInfoFindById(@RequestParam String id){
        RoleInfo roleInfo = permissionService.roleInfoFindById(id);
        if(roleInfo == null){
            return PageResult.returnResult(PageResult.ERROR_CODE, "未查询到角色");
        } else {
            return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(roleInfo, RoleInfoFindByIdVO.class));
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 15:48
     * @since: JDK 1.8
     *
     * @description: 角色编辑更新
     * @param: [roleInfoUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/roleInfoUpdate")
    public PageResult roleInfoUpdate(@RequestBody RoleInfoUpdateDTO roleInfoUpdateDTO){
        permissionService.roleInfoUpdate(roleInfoUpdateDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "角色编辑成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 17:29
     * @since: JDK 1.8
     *
     * @description: 角色列表获取 不带分页 不带查询条件
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/roleInfoPermissionGetList")
    public PageResult roleInfoPermissionGetList(){
        List<RoleInfo> roleInfoList = permissionService.roleInfoPermissionGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(roleInfoList, RoleInfoFindByIdVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 18:24
     * @since: JDK 1.8
     *
     * @description: 权限保存接口
     * @param: [permissionInfoSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/permissionInfoSave")
    public PageResult permissionInfoSave(PermissionInfoSaveDTO permissionInfoSaveDTO){
        permissionService.permissionInfoSave(permissionInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "权限保存成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 18:47
     * @since: JDK 1.8
     *
     * @description:
     * @param: [id]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/permissionInfoUpdateGet")
    public PageResult permissionInfoUpdateGet(@RequestParam String roleInfoId){
        List<PermissionInfo> permissionInfoList = permissionService.permissionInfoUpdateGet(roleInfoId);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(permissionInfoList, PermissionInfoVO.class));
    }
}
