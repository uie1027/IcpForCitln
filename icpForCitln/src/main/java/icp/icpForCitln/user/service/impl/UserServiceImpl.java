/**
 * Project Name: icpForCitln
 * File Name: UserServiceImpl
 * Package Name: icp.icpForCitln.user.service.impl
 * Date: 2019/5/8 14:57
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.user.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.user.dto.UserInfoSaveDTO;
import icp.icpForCitln.user.eneity.UserCompanyDepartmentRole;
import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * @author: 汪明月
     * date: 2019/5/9 13:47
     * @since: JDK 1.8
     *
     * @description: 用户信息列表
     * @param: []
     * @return: java.util.List<icp.icpForCitln.user.eneity.UserInfo>
     */
    @Override
    public List<UserInfo> UserInfoGetList() {
        List userInfo = BeanCopyUtil.copy(MongoUtil.select(new UserInfo()), UserInfo.class);
        return userInfo;
    }
    /**
     * @author: 汪明月
     * date: 2019/5/9 15:02
     * @since: JDK 1.8
     *
     * @description: 用户信息保存
     * @param: [userInfoSaveDTO]
     * @return: void
     */

    @Override
    public void userInfoSave(UserInfoSaveDTO userInfoSaveDTO) {
        List<UserCompanyDepartmentRole> userCompanyDepartmentRoleList = userInfoSaveDTO.getUserCompanyDepartmentRoleList();

        UserInfo userInfo=BeanCopyUtil.copy(userInfoSaveDTO, UserInfo.class);
        MongoUtil.insert(userInfo);

        for(UserCompanyDepartmentRole userCompanyDepartmentRole:userCompanyDepartmentRoleList){
           MongoUtil.insert(userCompanyDepartmentRole);
        }




    }
}
