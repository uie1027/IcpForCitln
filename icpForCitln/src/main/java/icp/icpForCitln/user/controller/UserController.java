/**
 * Project Name: icpForCitln
 * File Name: userController
 * Package Name: icp.icpForCitln.user.controller
 * Date: 2019/5/8 15:01
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.user.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.user.dto.UserInfoListFindByPageDTO;
import icp.icpForCitln.user.dto.UserInfoSaveDTO;
import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @author: 汪明月
     * date: 2019/5/8 15:07
     * @since: JDK 1.8
     *
     * @description: 用户信息列表显示
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/userInfoGetList")
    public PageResult userInfoGetList(){
        List<UserInfo> userInfoList = userService.UserInfoGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, userInfoList);
    }

    /**
     * @author: 汪明月
     * date: 2019/5/9 13:56
     * @since: JDK 1.8
     *
     * @description: 用户新增
     * @param: [userInfoSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/userInfoSave")
    public PageResult userInfoSave(@RequestBody  UserInfoSaveDTO userInfoSaveDTO){
        userService.userInfoSave(userInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "增加成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 16:44
     * @since: JDK 1.8
     *
     * @description: 用户列表返回 带分页 带查询条件
     * @param: [userInfoListFindByPageDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/userInfoListFindByPage")
    public PageResult userInfoListFindByPage(UserInfoListFindByPageDTO userInfoListFindByPageDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, userService.userInfoListFindByPage(userInfoListFindByPageDTO));
    }
}
