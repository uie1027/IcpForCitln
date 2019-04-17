/**
 * Project Name: icpForCitln
 * File Name: SessionUtilTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-17 下午 3:48
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.common.util.SessionUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SessionUtilTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 3:56
     * @since: JDK 1.8
     *
     * @description: 测试 SessionUtil 存取
     * @param: []
     * @return: void
     */
    @Test
    public void sessionUtilTest(){
        SessionUtil.save("userNum", "test");
        System.out.println(SessionUtil.getByKey("userNum"));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 3:56
     * @since: JDK 1.8
     *
     * @description: session redis 联合测试获取用户信息
     * @param: []
     * @return: void
     */
    @Test
    public void sessionRedisTest(){
        System.out.println(UserInfoCache.get(SessionUtil.getByKey("userNum")));
    }
}
