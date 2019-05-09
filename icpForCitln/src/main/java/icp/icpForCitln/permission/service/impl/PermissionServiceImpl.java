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
import icp.icpForCitln.permission.dto.RoleInfoGetListDTO;
import icp.icpForCitln.permission.dto.RoleInfoSaveDTO;
import icp.icpForCitln.permission.entity.RoleInfo;
import icp.icpForCitln.permission.service.PermissionService;
import icp.icpForCitln.permission.vo.RoleInfoGetListVO;
import icp.icpForCitln.permission.vo.RoleInfoVO;
import org.springframework.stereotype.Service;

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
    public RoleInfoVO roleInfoGetList(RoleInfoGetListDTO roleInfoGetListDTO) {
        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setRoleName(roleInfoGetListDTO.getRoleName());
        MongoResult mongoResult = MongoUtil.select(roleInfoGetListDTO.getPageIndex(), roleInfoGetListDTO.getPageSize(), roleInfo);
        List<RoleInfoGetListVO> roleInfoGetListVOList = BeanCopyUtil.copy(mongoResult.getResultList(), RoleInfoGetListVO.class);
        RoleInfoVO roleInfoVO = new RoleInfoVO();
        roleInfoVO.setRoleInfoGetListVOList(roleInfoGetListVOList);
        roleInfoVO.setCount(mongoResult.getCount());
        return roleInfoVO;
    }
}
