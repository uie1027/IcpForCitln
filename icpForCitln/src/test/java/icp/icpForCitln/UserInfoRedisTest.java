/**
 * Project Name: icpForCitln
 * File Name: UserInfoRedisTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-17 上午 11:31
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.user.eneity.UserInfo;
import icp.icpForCitln.user.service.UserInfoRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRedisTest {
    @Autowired
    private UserInfoRedisService userInfoRedisService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 上午 11:32
     * @since: JDK 1.8
     *
     * @description: 测试 userInfo Redis 存
     * @param: []
     * @return: void
     */
    @Test
    public void putTest() {
        UserInfo userInfo1 = new UserInfo();

        userInfo1.setId("testId1");
        userInfo1.setUserCode("1111");
        userInfo1.setUserNum("num1");
        userInfo1.setUserPassword("pwd1");
        userInfo1.setUserName("uname1");
        userInfo1.setCreater("admin");
        userInfo1.setCreateTime(new Date());
        userInfo1.setLastMondifier("lastman");
        userInfo1.setLastModificationTime(new Date());
        userInfo1.setIsDelete(2);

        userInfoRedisService.put(userInfo1);

        UserInfo userInfo2 = new UserInfo();

        userInfo2.setId("testId2");
        userInfo2.setUserCode("222");
        userInfo2.setUserNum("num2");
        userInfo2.setUserPassword("pwd2");
        userInfo2.setUserName("uname2");
        userInfo2.setCreater("admin");
        userInfo2.setCreateTime(new Date());
        userInfo2.setLastMondifier("lastman");
        userInfo2.setLastModificationTime(new Date());
        userInfo2.setIsDelete(2);

        userInfoRedisService.put(userInfo2);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 上午 11:39
     * @since: JDK 1.8
     *
     * @description: 测试 userInfo Redis 取
     * @param: []
     * @return: void
     */
    @Test
    public void getTest(){
        UserInfo userInfo1 = new UserInfo();

        userInfo1.setUserNum("num1");

        System.out.println(userInfoRedisService.get(userInfo1));

        UserInfo userInfo2 = new UserInfo();

        userInfo2.setUserNum("errorNum");

        System.out.println(userInfoRedisService.get(userInfo2));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 12:34
     * @since: JDK 1.8
     *
     * @description: 测试 userInfo Redis 删
     * @param: []
     * @return: void
     */
    @Test
    public void deleteTest(){
        UserInfo userInfo1 = new UserInfo();

        userInfo1.setUserNum("num1");

        userInfoRedisService.delete(userInfo1);
        System.out.println(userInfoRedisService.get(userInfo1));

        UserInfo userInfo2 = new UserInfo();

        userInfo2.setUserNum("errorNum");

        userInfoRedisService.get(userInfo2);
    }
}
