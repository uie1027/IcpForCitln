/**
 * Project Name: icpForCitln
 * File Name: UserInfoCacheTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-17 下午 1:11
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.user.eneity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoCacheTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 1:27
     * @since: JDK 1.8
     *
     * @description: UserInfoCache 存测试
     * @param: []
     * @return: void
     */
    @Test
    public void putCache() {
        UserInfo userInfo1 = new UserInfo();

        userInfo1.setId("testId3");
        userInfo1.setUserNum("num3");
        userInfo1.setUserPassword("pwd3");
        userInfo1.setUserName("uname3");
        userInfo1.setCreater("admin");
        userInfo1.setCreateTime(new Date());
        userInfo1.setLastMondifier("lastman");
        userInfo1.setLastModificationTime(new Date());
        userInfo1.setIsDelete(2);

        UserInfoCache.put(userInfo1);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 1:35
     * @since: JDK 1.8
     *
     * @description: UserInfoCache 取测试
     * @param: []
     * @return: void
     */
    @Test
    public void getCache(){
        System.out.println(UserInfoCache.get("num3").getUserName());
        System.out.println(UserInfoCache.get("errorNum"));
        System.out.println(UserInfoCache.get(""));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 2:06
     * @since: JDK 1.8
     *
     * @description: UserInfoCache 删测试
     * @param: []
     * @return: void
     */
    @Test
    public void deleteCache(){
        UserInfoCache.delete("num3");
        UserInfoCache.delete("errorNum");
        UserInfoCache.delete("");
    }
}
