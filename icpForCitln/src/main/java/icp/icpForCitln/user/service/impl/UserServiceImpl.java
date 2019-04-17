/**
 * Project Name: icpForCitln
 * File Name: UserServiceImpl
 * Package Name: icp.icpForCitln.user.service.impl
 * Date: 2019-04-17 上午 10:58
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.service.impl;

import icp.icpForCitln.user.dao.UserInfoDAO;
import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoDAO userInfoDAO;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 上午 11:00
     * @since: JDK 1.8
     *
     * @description: 保存 userInfo 测试
     * @param: [userInfo]
     * @return: void
     */
    @Override
    public void userInfoSaveTest(UserInfo userInfo) {
        userInfoDAO.saveTest(userInfo);
    }
}
