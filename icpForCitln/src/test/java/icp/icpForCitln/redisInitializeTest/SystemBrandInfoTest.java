/**
 * Project Name: icpForCitln
 * File Name: SystemBrandInfoTest
 * Package Name: icp.icpForCitln.redisInitializeTest
 * Date: 2019-05-05 下午 1:28
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.redisInitializeTest;

import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemBrandInfoTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 上午 11:40
     * @since: JDK 1.8
     *
     * @description: 品牌存假数据
     * @param: []
     * @return: void
     */
    @Test
    public void systemBrandInfoSave(){
        SystemBrandInfo systemBrandInfo1 = new SystemBrandInfo();

        systemBrandInfo1.setSystemBrandCode(GeneratedCodeUtil.generatedCode());
        systemBrandInfo1.setSystemBrandName("金坷垃");

        MongoUtil.insert(systemBrandInfo1);
        RedisUtil.put(systemBrandInfo1);

        SystemBrandInfo systemBrandInfo2 = new SystemBrandInfo();

        systemBrandInfo2.setSystemBrandCode(GeneratedCodeUtil.generatedCode());
        systemBrandInfo2.setSystemBrandName("漏油车");

        MongoUtil.insert(systemBrandInfo2);
        RedisUtil.put(systemBrandInfo2);
    }
}
