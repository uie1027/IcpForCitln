/**
 * Project Name: icpForCitln
 * File Name: PRODUCT_ATTRIBUIT_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 13:41
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.product.eneity.ProductAttribuit;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCT_ATTRIBUIT_INSERT_TEST {

    /**
     * PRODUCT_ATTRIBUIT_INSERT_EXAMPLE 产品属性信息测试数据插入
     */



    /**
     * @author: Wangzq
     * @date: 2019/5/21 13:55
     * @since: JDK 1.8
     *
     * @description: PRODUCT_ATTRIBUIT_INSERT_EXAMPLE 产品属性信息测试数据插入
     * @param:
     * @return:
     */

    @Test
    public void productAttribuitInsertExample() {
        ProductAttribuit productAttribuit = new ProductAttribuit();
        productAttribuit.setId("cx" + new ObjectId());
        productAttribuit.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        productAttribuit.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        productAttribuit.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d539");
        productAttribuit.setSystemProductAttribuitValue("不定岛纤维");


        ProductAttribuit productAttribuit2 = new ProductAttribuit();
        productAttribuit2.setId("cx" + new ObjectId());
        productAttribuit2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        productAttribuit2.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        productAttribuit2.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53b");
        productAttribuit2.setSystemProductAttribuitValue("彩色基布");


        ProductAttribuit productAttribuit3 = new ProductAttribuit();
        productAttribuit3.setId("cx" + new ObjectId());
        productAttribuit3.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        productAttribuit3.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        productAttribuit3.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53a");
        productAttribuit3.setSystemProductAttribuitValue("一面磨光一面拉毛");


        ProductAttribuit productAttribuit4 = new ProductAttribuit();
        productAttribuit4.setId("cx" + new ObjectId());
        productAttribuit4.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        productAttribuit4.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        productAttribuit4.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53c");
        productAttribuit4.setSystemProductAttribuitValue("非染色后处理基布");


        ProductAttribuit productAttribuit5 = new ProductAttribuit();
        productAttribuit5.setId("cx" + new ObjectId());
        productAttribuit5.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        productAttribuit5.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d537");
        productAttribuit5.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53a");
        productAttribuit5.setSystemProductAttribuitValue("黑色");


        ProductAttribuit productAttribuit6 = new ProductAttribuit();
        productAttribuit6.setId("cx" + new ObjectId());
        productAttribuit6.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        productAttribuit6.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        productAttribuit6.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53d");
        productAttribuit6.setSystemProductAttribuitValue("原生基布");


        ProductAttribuit productAttribuit7 = new ProductAttribuit();
        productAttribuit7.setId("cx" + new ObjectId());
        productAttribuit7.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        productAttribuit7.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d537");
        productAttribuit7.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d539");
        productAttribuit7.setSystemProductAttribuitValue("白色");


        ProductAttribuit productAttribuit8 = new ProductAttribuit();
        productAttribuit8.setId("cx" + new ObjectId());
        productAttribuit8.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        productAttribuit8.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        productAttribuit8.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53e");
        productAttribuit8.setSystemProductAttribuitValue("不定岛贴面革");


        ProductAttribuit productAttribuit9 = new ProductAttribuit();
        productAttribuit9.setId("cx" + new ObjectId());
        productAttribuit9.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        productAttribuit9.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d533");
        productAttribuit9.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d539");
        productAttribuit9.setSystemProductAttribuitValue("自然光感");


        ProductAttribuit productAttribuit10 = new ProductAttribuit();
        productAttribuit10.setId("cx" + new ObjectId());
        productAttribuit10.setProductInfoId("cx5cdd42d8abac563e18d9d562");
        productAttribuit10.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        productAttribuit10.setSystemProductAttribuitValueId("cx5cdd42d8abac563e18d9d53f");
        productAttribuit10.setSystemProductAttribuitValue("彩色基布和绒面革");


        MongoUtil.insert(productAttribuit);
        MongoUtil.insert(productAttribuit2);
        MongoUtil.insert(productAttribuit3);
        MongoUtil.insert(productAttribuit4);
        MongoUtil.insert(productAttribuit5);
        MongoUtil.insert(productAttribuit6);
        MongoUtil.insert(productAttribuit7);
        MongoUtil.insert(productAttribuit8);
        MongoUtil.insert(productAttribuit9);
        MongoUtil.insert(productAttribuit10);


    }
}
