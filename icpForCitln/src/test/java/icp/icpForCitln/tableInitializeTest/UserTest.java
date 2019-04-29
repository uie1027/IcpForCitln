/**
 * Project Name: icpForCitln
 * File Name: UserTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 上午 11:05
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.user.eneity.UserCompany;
import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.eneity.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 12:30
     * @since: JDK 1.8
     *
     * @description: UserInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void userInfoTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setUserCode(GeneratedCodeUtil.generatedCode());
        userInfo.setUserNum("测试帐号");
        userInfo.setUserPassword("测试密码");
        userInfo.setUserName("小明");
        userInfo.setUserPhone("手机号");
        userInfo.setUserEmail("邮箱");
        userInfo.setUserType(1);
        userInfo.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        userInfo.setCreateTime(new Date());
        userInfo.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        userInfo.setLastModificationTime(new Date());
        userInfo.setIsDelete(2);
        userInfo.setIsDisplay(1);

        MongoUtil.insert(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 1:36
     * @since: JDK 1.8
     *
     * @description: UserRole 测试
     * @param: []
     * @return: void
     */
    @Test
    public void userRoleTest(){
        UserRole userRole = new UserRole();

        userRole.setUserRoleCode(GeneratedCodeUtil.generatedCode());
        userRole.setUserInfoId("5cc68b96ba4b701984cc8d5e");
        userRole.setRoleInfoId("5cc68b96ba4b701984cc8d5e");
        userRole.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        userRole.setCreateTime(new Date());
        userRole.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        userRole.setLastModificationTime(new Date());
        userRole.setIsDelete(2);
        userRole.setIsDisplay(1);

        MongoUtil.insert(userRole);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 1:45
     * @since: JDK 1.8
     *
     * @description: UserCompany 测试
     * @param: []
     * @return: void
     */
    @Test
    public void userCompanyTest(){
        UserCompany userCompany = new UserCompany();

        userCompany.setUserInfoId("5cc68b96ba4b701984cc8d5e");
        userCompany.setCompanyInfoId("5cc68b96ba4b701984cc8d5e");
        userCompany.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        userCompany.setCreateTime(new Date());
        userCompany.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        userCompany.setLastModificationTime(new Date());
        userCompany.setIsDelete(2);
        userCompany.setIsDisplay(1);

        MongoUtil.insert(userCompany);
    }
}
