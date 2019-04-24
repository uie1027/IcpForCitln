/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoRedisServiceTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-18 上午 10:47
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.platform.eneity.PlatformUnitInfo;
import icp.icpForCitln.platform.service.PlatformUnitInfoRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformUnitInfoRedisServiceTest {
    @Autowired
    private PlatformUnitInfoRedisService platformUnitInfoRedisService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:13
     * @since: JDK 1.8
     *
     * @description: Redis 存储单位信息 测试
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

        platformUnitInfoRedisService.put(platformUnitInfo1);

        PlatformUnitInfo platformUnitInfo2 = new PlatformUnitInfo();

        platformUnitInfo2.setId("222222");
        platformUnitInfo2.setUnitCode("testCodexxxxxx");
        platformUnitInfo2.setUnitVariety(2);
        platformUnitInfo2.setUnitValue("RMB");
        platformUnitInfo2.setUnitDescription("人民币");

        platformUnitInfoRedisService.put(platformUnitInfo2);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:14
     * @since: JDK 1.8
     *
     * @description: Redis 获取单个单位信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getTest(){
        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();

        platformUnitInfo.setUnitVariety(2);
        platformUnitInfo.setUnitCode("testCodexxxxxx");

        System.out.println(platformUnitInfoRedisService.get(platformUnitInfo));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-18 上午 11:14
     * @since: JDK 1.8
     *
     * @description: Redis 删除单位信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void deleteTest(){
        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();

        platformUnitInfo.setUnitVariety(2);
        platformUnitInfo.setUnitCode("testCodexxxxxx");

        platformUnitInfoRedisService.delete(platformUnitInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 上午 10:41
     * @since: JDK 1.8
     *
     * @description: Redis 获取多个单位信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getList(){
        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();

        platformUnitInfo.setUnitVariety(1);

        System.out.println(platformUnitInfoRedisService.getList(platformUnitInfo));
    }
}
