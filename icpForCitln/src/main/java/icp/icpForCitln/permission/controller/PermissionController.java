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
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.permission.dto.RoleInfoGetListDTO;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.entity.RoleInfo;
import icp.icpForCitln.permission.service.PermissionService;
import icp.icpForCitln.permission.vo.RoleInfoFindByIdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public PageResult roleInfoSave(RoleInfoSaveDTO roleInfoSaveDTO){
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
    public PageResult roleInfoGetList(RoleInfoGetListDTO roleInfoGetListDTO){
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
        if(StringUtil.isEmpty(id)){
            return PageResult.returnResult(PageResult.ERROR_CODE, "角色id不能为空");
        }
        RoleInfo roleInfo = permissionService.roleInfoFindById(id);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(roleInfo, RoleInfoFindByIdVO.class));
    }
}
