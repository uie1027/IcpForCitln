/**
 * Project Name: icpForCitln
 * File Name: PermissionController
 * Package Name: icp.icpForCitln.permission.controller
 * Date: 2019/5/9 9:14
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
