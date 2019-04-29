/**
 * Project Name: icpForCitln
 * File Name: InventoryTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 下午 3:37
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.inventory.InventoryLocationInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InventoryTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 3:38
     * @since: JDK 1.8
     *
     * @description: InventoryLocationInfo 表创建
     * @param: []
     * @return: void
     */
    @Test
    public void inventoryLocationInfoTest(){
        InventoryLocationInfo inventoryLocationInfo = new InventoryLocationInfo();

        inventoryLocationInfo.setInventoryLocationCode("5646541");
        inventoryLocationInfo.setInventoryLocationName("5465");

        MongoUtil.insert(inventoryLocationInfo);
    }
}
