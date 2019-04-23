/**
 * Project Name: icpForCitln
 * File Name: UserController
 * Package Name: icp.icpForCitln.user.controller
 * Date: 2019-04-17 上午 11:02
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.controller;

import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 上午 11:08
     * @since: JDK 1.8
     *
     * @description: 保存 userInfo 测试
     * @param: []
     * @return: void
     */
    @GetMapping("/userInfoSaveTest")
    public void userInfoSaveTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setId("testId");
        userInfo.setUserCode("1111");
        userInfo.setUserNum("numlast");
        userInfo.setUserPassword("pwd");
        userInfo.setUserName("uname");
        userInfo.setCreater("admin");
        userInfo.setCreateTime(new Date());
        userInfo.setLastMondifier("lastman");
        userInfo.setLastModificationTime(new Date());
        userInfo.setIsDelete(2);

        userService.userInfoSaveTest(userInfo);
    }
}
