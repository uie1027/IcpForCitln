/**
 * Project Name: icpForCitln
 * File Name: FACTORY_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/20 17:38
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.factory.entity.FactoryInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FACTORY_INFO_INSERT_TEST {

    /**
     * FACTORY_INFO_INSERT   工厂信息测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/20 17:40
     * @since: JDK 1.8
     *
     * @description: FACTORY_INFO_INSERT_EXAMPLE  工厂信息测试数据插入实例1
     * @param:
     * @return:
     */


    @Test
    public void factoryInfoInsertExample1(){
        FactoryInfo factoryInfo= new FactoryInfo();
        factoryInfo.setId("cx5cdd42d8abac563e18d9d507");
        factoryInfo.setFactoryCode("10001");
        factoryInfo.setFactoryName("上海工厂");
        factoryInfo.setFactoryRemark("制造厂");
        MongoUtil.insert(factoryInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 17:40
     * @since: JDK 1.8
     *
     * @description: FACTORY_INFO_INSERT_EXAMPLE  工厂信息测试数据插入实例2
     * @param:
     * @return:
     */


    @Test
    public void factoryInfoInsertExample2(){
        FactoryInfo factoryInfo= new FactoryInfo();
        factoryInfo.setId("cx5cdd42d8abac563e18d9d508");
        factoryInfo.setFactoryCode("10002");
        factoryInfo.setFactoryName("江苏工厂");
        factoryInfo.setFactoryRemark("制造厂");
        MongoUtil.insert(factoryInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/20 17:40
     * @since: JDK 1.8
     *
     * @description: FACTORY_INFO_INSERT_EXAMPLE  工厂信息测试数据插入实例3
     * @param:
     * @return:
     */


    @Test
    public void factoryInfoInsertExample3(){
        FactoryInfo factoryInfo= new FactoryInfo();
        factoryInfo.setId("cx5cdd42d8abac563e18d9d509");
        factoryInfo.setFactoryCode("20001");
        factoryInfo.setFactoryName("上海工厂");
        factoryInfo.setFactoryRemark("制造厂");
        MongoUtil.insert(factoryInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 17:40
     * @since: JDK 1.8
     *
     * @description: FACTORY_INFO_INSERT_EXAMPLE  工厂信息测试数据插入实例4
     * @param:
     * @return:
     */


    @Test
    public void factoryInfoInsertExample4(){
        FactoryInfo factoryInfo= new FactoryInfo();
        factoryInfo.setId("cx5cdd42d8abac563e18d9d5a");
        factoryInfo.setFactoryCode("20002");
        factoryInfo.setFactoryName("江苏工厂");
        factoryInfo.setFactoryRemark("制造厂");
        MongoUtil.insert(factoryInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 17:40
     * @since: JDK 1.8
     *
     * @description: FACTORY_INFO_INSERT_EXAMPLE  工厂信息测试数据插入实例5
     * @param:
     * @return:
     */


    @Test
    public void factoryInfoInsertExample5(){
        FactoryInfo factoryInfo= new FactoryInfo();
        factoryInfo.setId("cx5cdd42d8abac563e18d9d5b");
        factoryInfo.setFactoryCode("30001");
        factoryInfo.setFactoryName("上海工厂");
        factoryInfo.setFactoryRemark("制造厂");
        MongoUtil.insert(factoryInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/20 17:40
     * @since: JDK 1.8
     *
     * @description: FACTORY_INFO_INSERT_EXAMPLE  工厂信息测试数据插入实例6
     * @param:
     * @return:
     */


    @Test
    public void factoryInfoInsertExample6(){
        FactoryInfo factoryInfo= new FactoryInfo();
        factoryInfo.setId("cx5cdd42d8abac563e18d9d5c");
        factoryInfo.setFactoryCode("30002");
        factoryInfo.setFactoryName("江苏工厂");
        factoryInfo.setFactoryRemark("制造厂");
        MongoUtil.insert(factoryInfo);
    }
}
