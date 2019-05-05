/**
 * Project Name: icpForCitln
 * File Name: PlantformMailDisplayTest
 * Package Name: icp.icpForCitln.redisInitializeTest
 * Date: 2019-05-05 下午 1:30
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.redisInitializeTest;

import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlantformMailDisplayTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 1:39
     * @since: JDK 1.8
     *
     * @description: 商城展示假数据
     * @param: []
     * @return: void
     */
    @Test
    public void plantformMailDisplaySave(){
        PlantformMailDisplay plantformMailDisplay1 = new PlantformMailDisplay();

        plantformMailDisplay1.setMailDisplayCode(GeneratedCodeUtil.generatedCode());
        plantformMailDisplay1.setMailName("工业品超市");

        MongoUtil.insert(plantformMailDisplay1);
        RedisUtil.put(plantformMailDisplay1);

        PlantformMailDisplay plantformMailDisplay2 = new PlantformMailDisplay();

        plantformMailDisplay2.setMailDisplayCode(GeneratedCodeUtil.generatedCode());
        plantformMailDisplay2.setMailName("集采中心");

        MongoUtil.insert(plantformMailDisplay2);
        RedisUtil.put(plantformMailDisplay2);
    }
}
