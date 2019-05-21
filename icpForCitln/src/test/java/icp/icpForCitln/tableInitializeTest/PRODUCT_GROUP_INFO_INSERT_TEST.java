/**
 * Project Name: icpForCitln
 * File Name: PRODUCT_GROUP_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 10:46
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCT_GROUP_INFO_INSERT_TEST {

    /**
     * PRODUCT_GROUP_INFO_INSERT  产品组基本信息表测试数据插入
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/21 10:47
     * @since: JDK 1.8
     *
     * @description: PRODUCT_GROUP_INFO_INSERT_EXAMPLE   产品组基本信息表测试数据插入实例1
     * @param:
     * @return:
     */

    @Test
    public void productGroupInfoInsertExample1(){
        ProductGroupInfo productGroupInfo=new ProductGroupInfo();
        productGroupInfo.setId("cx5cdd42d8abac563e18d9d557");
        productGroupInfo.setProductGroupCode("10000001");
        productGroupInfo.setProductGroupName("纺丝产品");
        productGroupInfo.setPlantformFirstDirectory("cx5cdd42d8abac563e18d9d51c");
        productGroupInfo.setPlantformSecondDirectory("cx5cdd42d8abac563e18d9d525");
        productGroupInfo.setSystemBrandInfoId("cx5cdd42d8abac563e18d9d551");
        productGroupInfo.setProductGroupDetailedInformation("暂无");
        MongoUtil.insert(productGroupInfo);

    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 10:47
     * @since: JDK 1.8
     *
     * @description: PRODUCT_GROUP_INFO_INSERT_EXAMPLE   产品组基本信息表测试数据插入实例2
     * @param:
     * @return:
     */

    @Test
    public void productGroupInfoInsertExample2(){
        ProductGroupInfo productGroupInfo=new ProductGroupInfo();
        productGroupInfo.setId("cx5cdd42d8abac563e18d9d558");
        productGroupInfo.setProductGroupCode("10000002");
        productGroupInfo.setProductGroupName("超纤彩色基布");
        productGroupInfo.setPlantformFirstDirectory("cx5cdd42d8abac563e18d9d51c");
        productGroupInfo.setPlantformSecondDirectory("cx5cdd42d8abac563e18d9d525");
        productGroupInfo.setSystemBrandInfoId("cx5cdd42d8abac563e18d9d551");
        productGroupInfo.setProductGroupDetailedInformation("暂无");
        MongoUtil.insert(productGroupInfo);

    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 10:47
     * @since: JDK 1.8
     *
     * @description: PRODUCT_GROUP_INFO_INSERT_EXAMPLE   产品组基本信息表测试数据插入实例3
     * @param:
     * @return:
     */

    @Test
    public void productGroupInfoInsertExample3(){
        ProductGroupInfo productGroupInfo=new ProductGroupInfo();
        productGroupInfo.setId("cx5cdd42d8abac563e18d9d559");
        productGroupInfo.setProductGroupCode("10000003");
        productGroupInfo.setProductGroupName("超纤后处理基布");
        productGroupInfo.setPlantformFirstDirectory("cx5cdd42d8abac563e18d9d51c");
        productGroupInfo.setPlantformSecondDirectory("cx5cdd42d8abac563e18d9d527");
        productGroupInfo.setSystemBrandInfoId("cx5cdd42d8abac563e18d9d551");
        productGroupInfo.setProductGroupDetailedInformation("在各种性能不同的超纤基材上，通过干法转移膜技术，将不同花纹、颜色的PU膜与超纤基材完美贴合，成为各种用途的成品。通过对超纤基材和贴面工艺的调整，华锋超纤贴面合成革产品可用于运动鞋、沙发、休闲鞋、箱包、护具、汽车内饰等各种不同的领域。");
        MongoUtil.insert(productGroupInfo);

    }


    /**
     * @author: Wangzq
     * @date: 2019/5/21 10:47
     * @since: JDK 1.8
     *
     * @description: PRODUCT_GROUP_INFO_INSERT_EXAMPLE   产品组基本信息表测试数据插入实例4
     * @param:
     * @return:
     */

    @Test
    public void productGroupInfoInsertExample4(){
        ProductGroupInfo productGroupInfo=new ProductGroupInfo();
        productGroupInfo.setId("cx5cdd42d8abac563e18d9d560");
        productGroupInfo.setProductGroupCode("10000004");
        productGroupInfo.setProductGroupName("原生基布");
        productGroupInfo.setPlantformFirstDirectory("cx5cdd42d8abac563e18d9d51c");
        productGroupInfo.setPlantformSecondDirectory("cx5cdd42d8abac563e18d9d5b");
        productGroupInfo.setSystemBrandInfoId("cx5cdd42d8abac563e18d9d551");
        productGroupInfo.setProductGroupDetailedInformation("暂无");
        MongoUtil.insert(productGroupInfo);

    }




    /**
     * @author: Wangzq
     * @date: 2019/5/21 10:47
     * @since: JDK 1.8
     *
     * @description: PRODUCT_GROUP_INFO_INSERT_EXAMPLE   产品组基本信息表测试数据插入实例5
     * @param:
     * @return:
     */

    @Test
    public void productGroupInfoInsertExample5(){
        ProductGroupInfo productGroupInfo5=new ProductGroupInfo();
        productGroupInfo5.setId("cx5cdd42d8abac563e18d9d561");
        productGroupInfo5.setProductGroupCode("10000005");
        productGroupInfo5.setProductGroupName("贴面产品");
        productGroupInfo5.setPlantformFirstDirectory("cx5cdd42d8abac563e18d9d51c");
        productGroupInfo5.setPlantformSecondDirectory("cx5cdd42d8abac563e18d9d527");
        productGroupInfo5.setSystemBrandInfoId("cx5cdd42d8abac563e18d9d551");
        productGroupInfo5.setProductGroupDetailedInformation("在各种性能不同的超纤基材上，通过干法转移膜技术，将不同花纹、颜色的PU膜与超纤基材完美贴合，成为各种用途的成品。通过对超纤基材和贴面工艺的调整，华锋超纤贴面合成革产品可用于运动鞋、沙发、休闲鞋、箱包、护具、汽车内饰等各种不同的领域。");



        ProductGroupInfo productGroupInfo6=new ProductGroupInfo();
        productGroupInfo6.setId("cx5cdd42d8abac563e18d9d562");
        productGroupInfo6.setProductGroupCode("10000006");
        productGroupInfo6.setProductGroupName("超纤绒面");
        productGroupInfo6.setPlantformFirstDirectory("cx5cdd42d8abac563e18d9d51c");
        productGroupInfo6.setPlantformSecondDirectory("cx5cdd42d8abac563e18d9d527");
        productGroupInfo6.setSystemBrandInfoId("cx5cdd42d8abac563e18d9d551");
        productGroupInfo6.setProductGroupDetailedInformation("彩色超细纤维尼龙聚氨酯绒面革是华锋超纤自主研发的在超纤应用领域方面的又一次突破，采用在纺丝过程中选择性的直接对岛组分尼龙进行原液着色，同时采用聚氨酯树脂湿法加工及后整理技术生产而成，产品既具有天然皮革的手感和绒感，且没有天然皮革的气味，弹性、拉伸强度、耐磨、色牢度等性能出色，制造方法已获得国家发明专利，可用于手套、制鞋、箱包、礼品装饰等众多领域");




        MongoUtil.insert(productGroupInfo5);
        MongoUtil.insert(productGroupInfo6);

    }



}
