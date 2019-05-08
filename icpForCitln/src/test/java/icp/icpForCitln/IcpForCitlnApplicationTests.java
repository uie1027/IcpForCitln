/**
 * Project Name: icpForCitln
 * File Name: IcpForCitlnApplicationTests
 * Package Name: icp.icpForCitln
 * Date: 2019-04-12 上午 11:02
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.UserAndCompanyInfo;
import icp.icpForCitln.common.util.SessionUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IcpForCitlnApplicationTests {
    @Test
    public void contextLoads() {
        UserAndCompanyInfo userNum = UserAndCompanyCache.get(SessionUtil.getByKey("userNum"));
        System.out.println(userNum);

    }
}
