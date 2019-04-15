/**
 * Project Name: icpForCitln
 * File Name: GetPropertiesUtilTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-15 下午 4:10
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.util.GetPropertiesUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetPropertiesUtilTest {
    @Test
    public void getPropertiesUtilTest() {
        String msg = GetPropertiesUtil.getPropertiesVal("message", "test");
        System.out.println("************");
        System.out.println(msg);
        System.out.println("************");
    }
}