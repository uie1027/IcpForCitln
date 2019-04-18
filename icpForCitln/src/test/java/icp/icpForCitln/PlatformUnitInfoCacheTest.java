/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoCacheTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-18 下午 12:59
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.cache.PlatformUnitInfoCache;
import icp.icpForCitln.platform.eneity.PlatformUnitInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformUnitInfoCacheTest {

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 下午 1:13
     * @since: JDK 1.8
     *
     * @description: Redis 存单位信息信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void putTest(){
        PlatformUnitInfo platformUnitInfo1 = new PlatformUnitInfo();

        platformUnitInfo1.setId("11111");
        platformUnitInfo1.setUnitCode("testCode11111");
        platformUnitInfo1.setUnitVariety(1);
        platformUnitInfo1.setUnitValue("m");
        platformUnitInfo1.setUnitDescription("米");

        PlatformUnitInfoCache.put(platformUnitInfo1);

        PlatformUnitInfo platformUnitInfo2 = new PlatformUnitInfo();

        platformUnitInfo2.setId("222222");
        platformUnitInfo2.setUnitCode("testCodexxxxxx");
        platformUnitInfo2.setUnitVariety(2);
        platformUnitInfo2.setUnitValue("RMB");
        platformUnitInfo2.setUnitDescription("人民币");

        PlatformUnitInfoCache.put(platformUnitInfo2);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 下午 1:15
     * @since: JDK 1.8
     *
     * @description: Redis 取单位信息信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getTest(){
        System.out.println(PlatformUnitInfoCache.get(2, "testCodexxxxxx"));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 下午 1:16
     * @since: JDK 1.8
     *
     * @description: Redis 删单位信息信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void deleteTest(){
        PlatformUnitInfoCache.delete(2, "testCodexxxxxx");
    }
}
