/**
 * Project Name: icpForCitln
 * File Name: FactoryTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/04/29 14:17
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.factory.entity.FactoryInventoryLocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: FactoryInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void FactoryInfoSaveTest(){
        FactoryInfo factoryInfo = new FactoryInfo();

        factoryInfo.setFactoryCode("2");
        factoryInfo.setFactoryName("sd");

        MongoUtil.insert(factoryInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: FactoryInventoryLocation 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void FactoryInventoryLocationSaveTest(){
        FactoryInventoryLocation factoryInventoryLocation = new FactoryInventoryLocation();

        factoryInventoryLocation.setFactoryInfoId("2");
        factoryInventoryLocation.setInventoryLocationInfoId("324");

        MongoUtil.insert(factoryInventoryLocation);
    }
}
