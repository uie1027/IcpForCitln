/**
 * Project Name: icpForCitln
 * File Name: RedisCommonUtilTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-24 上午 11:56
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.RedisCommonUtil;
import icp.icpForCitln.user.eneity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCommonUtilTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:35
     * @since: JDK 1.8
     *
     * @description: Redis 存 测试
     * @param: []
     * @return: void
     */
    @Test
    public void putTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setId("testId1");
        userInfo.setUserCode("1111");
        userInfo.setUserNum("num12");
        userInfo.setUserPassword("pwd1");
        userInfo.setUserName("uname1");
        userInfo.setCreater("admin");
        userInfo.setCreateTime(new Date());
        userInfo.setLastMondifier("lastman");
        userInfo.setLastModificationTime(new Date());
        userInfo.setIsDelete(2);

        RedisCommonUtil.put(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:36
     * @since: JDK 1.8
     *
     * @description: Redis 获取对象 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setUserNum("num12");

        userInfo = (UserInfo) RedisCommonUtil.get(userInfo);

        System.out.println(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:36
     * @since: JDK 1.8
     *
     * @description: Redis 删除 测试
     * @param: []
     * @return: void
     */
    @Test
    public void deleteTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setUserNum("num12");

        RedisCommonUtil.delete(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:37
     * @since: JDK 1.8
     *
     * @description: Redis 获取列表 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getListTest(){
        List<UserInfo> userInfoList = BeanCopyUtil.copy(RedisCommonUtil.getList(new UserInfo()), UserInfo.class);
        System.out.println(userInfoList);
    }
}
