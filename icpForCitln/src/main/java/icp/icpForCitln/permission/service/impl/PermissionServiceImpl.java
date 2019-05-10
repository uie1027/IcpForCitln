/**
 * Project Name: icpForCitln
 * File Name: PermissionServiceImpl
 * Package Name: icp.icpForCitln.permission.service.impl
 * Date: 2019/5/9 9:16
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.permission.dto.PermissionInfoSaveDTO;
import icp.icpForCitln.permission.dto.RoleInfoGetListDTO;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.dto.RoleInfoUpdateDTO;
import icp.icpForCitln.permission.entity.PermissionInfo;
import icp.icpForCitln.permission.entity.RoleInfo;
import icp.icpForCitln.permission.service.PermissionService;
import icp.icpForCitln.permission.view.RoleInfoUserView;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

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

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 9:51
     * @since: JDK 1.8
     *
     * @description: 角色列表查询 带分页
     * @param: [roleInfoGetListDTO]
     * @return: icp.icpForCitln.permission.vo.RoleInfoVO
     */
    @Override
    public MongoResult roleInfoGetList(RoleInfoGetListDTO roleInfoGetListDTO) {
        RoleInfoUserView roleInfoUserView = new RoleInfoUserView();
        roleInfoUserView.setRoleName(roleInfoGetListDTO.getRoleName());
        return MongoUtil.select(roleInfoGetListDTO.getPageIndex(), roleInfoGetListDTO.getPageSize(), roleInfoUserView);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 13:11
     * @since: JDK 1.8
     *
     * @description: 根据 ID 查询角色信息
     * @param: [id]
     * @return: icp.icpForCitln.permission.entity.RoleInfo
     */
    @Override
    public RoleInfo roleInfoFindById(String id) {
        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setId(id);
        List<RoleInfo> roleInfoList = MongoUtil.select(roleInfo);
        if(CollectionUtils.isEmpty(roleInfoList)){
            return null;
        } else {
            return roleInfoList.get(0);
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 15:52
     * @since: JDK 1.8
     *
     * @description: 角色更新
     * @param: [roleInfoUpdateDTO]
     * @return: void
     */
    @Override
    public void roleInfoUpdate(RoleInfoUpdateDTO roleInfoUpdateDTO) {
        RoleInfo roleInfo = BeanCopyUtil.copy(roleInfoUpdateDTO, RoleInfo.class);
        MongoUtil.upsert(roleInfo, roleInfoUpdateDTO.getFlag());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 17:31
     * @since: JDK 1.8
     *
     * @description: 角色列表查询 不带分页
     * @param: []
     * @return: java.util.List<icp.icpForCitln.permission.entity.RoleInfo>
     */
    @Override
    public List<RoleInfo> roleInfoPermissionGetList() {
        return MongoUtil.select(new RoleInfo());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 18:24
     * @since: JDK 1.8
     *
     * @description: 权限保存
     * @param: [permissionInfoSaveDTO]
     * @return: void
     */
    @Override
    public void permissionInfoSave(PermissionInfoSaveDTO permissionInfoSaveDTO) {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setRoleInfoId(permissionInfoSaveDTO.getRoleInfoId());
        for(int i = 0; i < permissionInfoSaveDTO.getMenuInfoId().length; i++){
            permissionInfo.setMenuInfoId(permissionInfoSaveDTO.getMenuInfoId()[i]);
            MongoUtil.insert(permissionInfo);
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 18:48
     * @since: JDK 1.8
     *
     * @description: 权限编辑 菜单勾选获取
     * @param: [id]
     * @return: java.util.List<icp.icpForCitln.permission.entity.PermissionInfo>
     */
    @Override
    public List<PermissionInfo> permissionInfoUpdateGet(String roleInfoId) {
        PermissionInfo permissionInfo = new PermissionInfo();
        permissionInfo.setRoleInfoId(roleInfoId);
        return MongoUtil.select(permissionInfo);
    }
}
