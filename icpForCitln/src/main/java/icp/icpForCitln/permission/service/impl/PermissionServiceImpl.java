/**
 * Project Name: icpForCitln
 * File Name: PermissionServiceImpl
 * Package Name: icp.icpForCitln.permission.service.impl
 * Date: 2019/5/9 9:16
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.entity.RoleInfo;
import icp.icpForCitln.permission.service.PermissionService;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {
    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 9:20
     * @since: JDK 1.8
     *
     * @description: 角色新增
     * @param: [roleInfoSaveDTO]
     * @return: void
     */
    @Override
    public void roleInfoSave(RoleInfoSaveDTO roleInfoSaveDTO) {
        RoleInfo roleInfo = BeanCopyUtil.copy(roleInfoSaveDTO, RoleInfo.class);

        roleInfo.setRoleCode(GeneratedCodeUtil.generatedCode());
        roleInfo.setIsForbidden(2);

        MongoUtil.insert(roleInfo);
    }
}
