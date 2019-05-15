/**
 * Project Name: icpForCitln
 * File Name: ProductGroupTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/4/30 10:53
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import icp.icpForCitln.productGroup.entity.ProductGroupSystemAttribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductGroupTest {

    @Test
    public void   ProductGroupInfoSave(){
        ProductGroupInfo productGroupInfo = new ProductGroupInfo();
        productGroupInfo.setProductGroupCode("123");   //产品组编码
        productGroupInfo.setProductGroupName("123");     //产品组名称
        productGroupInfo.setPlantformFirstDirectory("123");      //系统一级目录
        productGroupInfo.setPlantformSecondDirectory("123");     //系统二级目录
        productGroupInfo.setSystemBrandInfoId("123");   //品牌ID
        productGroupInfo.setProductGroupDetailedInformation("123"); //详细信息
        MongoUtil.insert(productGroupInfo);
    }

    @Test
    public void  ProductGroupMailDisplaySave(){
        ProductGroupMailDisplay productGroupMailDisplay = new ProductGroupMailDisplay();
        productGroupMailDisplay.setProductGroupInfoId("123");
        productGroupMailDisplay.setPlantformMailDisplayId("123");
        MongoUtil.insert(productGroupMailDisplay);
    }

    @Test
    public void  ProductGroupSystemAttributeSave(){
        ProductGroupSystemAttribute productGroupSystemAttribute = new ProductGroupSystemAttribute();
        productGroupSystemAttribute.setProductGroupInfoId("123");
        productGroupSystemAttribute.setSystemProductAttribuitId("123");
        MongoUtil.insert(productGroupSystemAttribute);
    }
}
