/**
 * Project Name: icpForCitln
 * File Name: INVENTORY_LOCATION_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 9:21
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.inventory.entity.InventoryLocationInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class INVENTORY_LOCATION_INFO_INSERT_TEST {

    /**
     * INVENTORY_LOCATION_INFO_INSERT   库存地点信息表测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例1
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample1(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d50d");
        inventoryLocationInfo.setInventoryLocationCode("10001");
        inventoryLocationInfo.setInventoryLocationName("原材料仓");
        MongoUtil.insert(inventoryLocationInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例2
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample2(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d50e");
        inventoryLocationInfo.setInventoryLocationCode("10002");
        inventoryLocationInfo.setInventoryLocationName("半成品仓");
        MongoUtil.insert(inventoryLocationInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例3
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample3(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d50f");
        inventoryLocationInfo.setInventoryLocationCode("10003");
        inventoryLocationInfo.setInventoryLocationName("成品仓");
        MongoUtil.insert(inventoryLocationInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例4
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample4(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d510");
        inventoryLocationInfo.setInventoryLocationCode("20001");
        inventoryLocationInfo.setInventoryLocationName("原材料仓");
        MongoUtil.insert(inventoryLocationInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例5
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample5(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d511");
        inventoryLocationInfo.setInventoryLocationCode("20002");
        inventoryLocationInfo.setInventoryLocationName("半成品仓");
        MongoUtil.insert(inventoryLocationInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例6
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample6(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d512");
        inventoryLocationInfo.setInventoryLocationCode("20003");
        inventoryLocationInfo.setInventoryLocationName("成品仓");
        MongoUtil.insert(inventoryLocationInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例7
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample7(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d513");
        inventoryLocationInfo.setInventoryLocationCode("30001");
        inventoryLocationInfo.setInventoryLocationName("原材料仓");
        MongoUtil.insert(inventoryLocationInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例8
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample8(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d514");
        inventoryLocationInfo.setInventoryLocationCode("30002");
        inventoryLocationInfo.setInventoryLocationName("半成品仓");
        MongoUtil.insert(inventoryLocationInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:23
     * @since: JDK 1.8
     *
     * @description: INVENTORY_LOCATION_INFO_INSERT_EXAMPLE  库存地点信息表测试数据插入实例9
     * @param:
     * @return:
     */

    @Test
    public void inventoryLocationInfoInsertExample9(){
        InventoryLocationInfo inventoryLocationInfo=new InventoryLocationInfo();
        inventoryLocationInfo.setId("cx5cdd42d8abac563e18d9d515");
        inventoryLocationInfo.setInventoryLocationCode("30003");
        inventoryLocationInfo.setInventoryLocationName("成品仓");
        MongoUtil.insert(inventoryLocationInfo);
    }



}
