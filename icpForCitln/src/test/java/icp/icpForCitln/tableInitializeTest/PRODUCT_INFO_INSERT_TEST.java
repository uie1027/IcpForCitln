/**
 * Project Name: icpForCitln
 * File Name: PRODUCT_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 13:14
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.product.eneity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCT_INFO_INSERT_TEST {


    /**
     * PRODUCT_INFO_INSERT  产品基本信息测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/21 13:15
     * @since: JDK 1.8
     *
     * @description: PRODUCT_INFO_INSERT_EXAMPLE  产品基本信息测试数据插入实例
     * @param:
     * @return:
     */

    @Test
    public void productInfoInsertExampleI(){
        ProductInfo productInfo1=new ProductInfo();
        productInfo1.setId("cx5cdd42d8abac563e18d9d55d");
        productInfo1.setProductCode("10000001");
        productInfo1.setProductName("原棉\\不定岛纤维\\沙发家具类\\白色\\5051-000");
        productInfo1.setBasicUnitId("米");
        productInfo1.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        productInfo1.setOldProductCode("A8SW5051-000");
        productInfo1.setPurchaseContent("暫無");
        productInfo1.setPurchasePlanDays(2);
        productInfo1.setSaleContent("暫無");
        productInfo1.setProductionContent("暫無");
        productInfo1.setProductionCycle(2);
        productInfo1.setQualityContent("暫無");
        productInfo1.setQualityInspectionCycle(2);
        productInfo1.setLogisticsContent("暫無");
        productInfo1.setHaulCycle(2);
        productInfo1.setFinancialContent("暫無");
        productInfo1.setFinancialCycle(2);
        productInfo1.setFrozen(1);




        ProductInfo productInfo2=new ProductInfo();
        productInfo2.setId("cx5cdd42d8abac563e18d9d55e");
        productInfo2.setProductCode("10000002");
        productInfo2.setProductName("彩色基布和绒面革\\HF的软版\\R0195-120\\一面磨光一面拉毛上油");
        productInfo2.setBasicUnitId("米");
        productInfo2.setProductGroupInfoId("cx5cdd42d8abac563e18d9d558");
        productInfo2.setOldProductCode("HHKR0195-120A05");
        productInfo2.setPurchaseContent("暫無");
        productInfo2.setPurchasePlanDays(2);
        productInfo2.setSaleContent("暫無");
        productInfo2.setProductionContent("暫無");
        productInfo2.setProductionCycle(2);
        productInfo2.setQualityContent("暫無");
        productInfo2.setQualityInspectionCycle(2);
        productInfo2.setLogisticsContent("暫無");
        productInfo2.setHaulCycle(2);
        productInfo2.setFinancialContent("暫無");
        productInfo2.setFinancialCycle(2);
        productInfo2.setFrozen(1);


        ProductInfo productInfo3=new ProductInfo();
        productInfo3.setId("cx5cdd42d8abac563e18d9d55f");
        productInfo3.setProductCode("10000003");
        productInfo3.setProductName("非染色后处理基布\\扩幅版HF\\普黑\\060\\片后未处理");
        productInfo3.setBasicUnitId("米");
        productInfo3.setProductGroupInfoId("cx5cdd42d8abac563e18d9d559");
        productInfo3.setOldProductCode("EXPB0-060K00");
        productInfo3.setPurchaseContent("暫無");
        productInfo3.setPurchasePlanDays(2);
        productInfo3.setSaleContent("暫無");
        productInfo3.setProductionContent("暫無");
        productInfo3.setProductionCycle(2);
        productInfo3.setQualityContent("暫無");
        productInfo3.setQualityInspectionCycle(2);
        productInfo3.setLogisticsContent("暫無");
        productInfo3.setHaulCycle(2);
        productInfo3.setFinancialContent("暫無");
        productInfo3.setFinancialCycle(2);
        productInfo3.setFrozen(1);




        ProductInfo productInfo4=new ProductInfo();
        productInfo4.setId("cx5cdd42d8abac563e18d9d560");
        productInfo4.setProductCode("10000004");
        productInfo4.setProductName("原生基布\\HF的软版\\白色\\180\\普通工艺");
        productInfo4.setBasicUnitId("米");
        productInfo4.setProductGroupInfoId("cx5cdd42d8abac563e18d9d560");
        productInfo4.setOldProductCode("DHKD2-180Y00");
        productInfo4.setPurchaseContent("暫無");
        productInfo4.setPurchasePlanDays(2);
        productInfo4.setSaleContent("暫無");
        productInfo4.setProductionContent("暫無");
        productInfo4.setProductionCycle(2);
        productInfo4.setQualityContent("暫無");
        productInfo4.setQualityInspectionCycle(2);
        productInfo4.setLogisticsContent("暫無");
        productInfo4.setHaulCycle(2);
        productInfo4.setFinancialContent("暫無");
        productInfo4.setFinancialCycle(2);
        productInfo4.setFrozen(1);



        ProductInfo productInfo5=new ProductInfo();
        productInfo5.setId("cx5cdd42d8abac563e18d9d561");
        productInfo5.setProductCode("10000005");
        productInfo5.setProductName("不定岛贴面革\\412\\R5781-145\\干揉-FA\\R0069");
        productInfo5.setBasicUnitId("米");
        productInfo5.setProductGroupInfoId("cx5cdd42d8abac563e18d9d561");
        productInfo5.setOldProductCode("G412R5781-145R01-FAR0069");
        productInfo5.setPurchaseContent("暫無");
        productInfo5.setPurchasePlanDays(2);
        productInfo5.setSaleContent("暫無");
        productInfo5.setProductionContent("暫無");
        productInfo5.setProductionCycle(2);
        productInfo5.setQualityContent("暫無");
        productInfo5.setQualityInspectionCycle(2);
        productInfo5.setLogisticsContent("暫無");
        productInfo5.setHaulCycle(2);
        productInfo5.setFinancialContent("暫無");
        productInfo5.setFinancialCycle(2);
        productInfo5.setFrozen(1);



        ProductInfo productInfo6=new ProductInfo();
        productInfo6.setId("cx5cdd42d8abac563e18d9d562");
        productInfo6.setProductCode("10000006");
        productInfo6.setProductName("彩色基布和绒面革\\DG\\N0146-085\\绒面双磨单面印刷");
        productInfo6.setBasicUnitId("米");
        productInfo6.setProductGroupInfoId("cx5cdd42d8abac563e18d9d562");
        productInfo6.setOldProductCode("HDGN0146-085P90");
        productInfo6.setPurchaseContent("暫無");
        productInfo6.setPurchasePlanDays(2);
        productInfo6.setSaleContent("暫無");
        productInfo6.setProductionContent("暫無");
        productInfo6.setProductionCycle(2);
        productInfo6.setQualityContent("暫無");
        productInfo6.setQualityInspectionCycle(2);
        productInfo6.setLogisticsContent("暫無");
        productInfo6.setHaulCycle(2);
        productInfo6.setFinancialContent("暫無");
        productInfo6.setFinancialCycle(2);
        productInfo6.setFrozen(1);

        MongoUtil.insert(productInfo1);
        MongoUtil.insert(productInfo2);
        MongoUtil.insert(productInfo3);
        MongoUtil.insert(productInfo4);
        MongoUtil.insert(productInfo5);
        MongoUtil.insert(productInfo6);

    }


}
