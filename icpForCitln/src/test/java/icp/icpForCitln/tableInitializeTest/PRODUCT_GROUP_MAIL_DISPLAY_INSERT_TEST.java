/**
 * Project Name: icpForCitln
 * File Name: PRODUCT_GROUP_MAIL_DISPLAY_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 11:15
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCT_GROUP_MAIL_DISPLAY_INSERT_TEST {

    /**
     * PRODUCT_GROUP_MAIL_DISPLAY_INSERT 产品组商城展示表测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/21 12:58
     * @since: JDK 1.8
     *
     * @description: PRODUCT_GROUP_MAIL_DISPLAY_INSERT_EXAMPLE  产品组商城展示表测试数据插入
     * @param:
     * @return:
     */

    @Test
    public void PRODUCT_GROUP_MAIL_DISPLAY_INSERT_EXAMPLE(){
        ProductGroupMailDisplay productGroupMailDisplay1=new ProductGroupMailDisplay();
        productGroupMailDisplay1.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        productGroupMailDisplay1.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d516");

        ProductGroupMailDisplay productGroupMailDisplay2=new ProductGroupMailDisplay();
        productGroupMailDisplay2.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        productGroupMailDisplay2.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d517");

        ProductGroupMailDisplay productGroupMailDisplay3=new ProductGroupMailDisplay();
        productGroupMailDisplay3.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        productGroupMailDisplay3.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d518");

        ProductGroupMailDisplay productGroupMailDisplay4=new ProductGroupMailDisplay();
        productGroupMailDisplay4.setProductGroupInfoId("cx5cdd42d8abac563e18d9d558");
        productGroupMailDisplay4.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d516");

        ProductGroupMailDisplay productGroupMailDisplay5=new ProductGroupMailDisplay();
        productGroupMailDisplay5.setProductGroupInfoId("cx5cdd42d8abac563e18d9d558");
        productGroupMailDisplay5.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d517");

        ProductGroupMailDisplay productGroupMailDisplay6=new ProductGroupMailDisplay();
        productGroupMailDisplay6.setProductGroupInfoId("cx5cdd42d8abac563e18d9d559");
        productGroupMailDisplay6.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d516");

        ProductGroupMailDisplay productGroupMailDisplay7=new ProductGroupMailDisplay();
        productGroupMailDisplay7.setProductGroupInfoId("cx5cdd42d8abac563e18d9d559");
        productGroupMailDisplay7.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d517");

        ProductGroupMailDisplay productGroupMailDisplay8=new ProductGroupMailDisplay();
        productGroupMailDisplay8.setProductGroupInfoId("cx5cdd42d8abac563e18d9d560");
        productGroupMailDisplay8.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d516");

        ProductGroupMailDisplay productGroupMailDisplay9=new ProductGroupMailDisplay();
        productGroupMailDisplay9.setProductGroupInfoId("cx5cdd42d8abac563e18d9d560");
        productGroupMailDisplay9.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d517");

        ProductGroupMailDisplay productGroupMailDisplay10=new ProductGroupMailDisplay();
        productGroupMailDisplay10.setProductGroupInfoId("cx5cdd42d8abac563e18d9d561");
        productGroupMailDisplay10.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d516");

        ProductGroupMailDisplay productGroupMailDisplay11=new ProductGroupMailDisplay();
        productGroupMailDisplay11.setProductGroupInfoId("cx5cdd42d8abac563e18d9d562");
        productGroupMailDisplay11.setPlantformMailDisplayId("cx5cdd42d8abac563e18d9d516");


        MongoUtil.insert(productGroupMailDisplay1);
        MongoUtil.insert(productGroupMailDisplay2);
        MongoUtil.insert(productGroupMailDisplay3);
        MongoUtil.insert(productGroupMailDisplay4);
        MongoUtil.insert(productGroupMailDisplay5);
        MongoUtil.insert(productGroupMailDisplay6);
        MongoUtil.insert(productGroupMailDisplay7);
        MongoUtil.insert(productGroupMailDisplay8);
        MongoUtil.insert(productGroupMailDisplay9);
        MongoUtil.insert(productGroupMailDisplay10);
        MongoUtil.insert(productGroupMailDisplay11);


    }


}
