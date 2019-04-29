/**
 * Project Name: icpForCitln
 * File Name: ProductTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 下午 3:18
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.product.eneity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 3:21
     * @since: JDK 1.8
     *
     * @description: ProductInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void productInfoTest(){
        ProductInfo productInfo = new ProductInfo();

        productInfo.setFinancialContent("1");
        productInfo.setFinancialCycle(new Date());
        productInfo.setFrozen(0);
        productInfo.setHaulCycle(1);
        productInfo.setLogisticsContent("2");
        productInfo.setOldProductCode("!");
        productInfo.setProductCode("12");
        productInfo.setProductGroupInfoId("2");
        productInfo.setProductionContent("@");
        productInfo.setProductionCycle(2);
        productInfo.setProductName("@");
        productInfo.setPurchaseContent("@");
        productInfo.setPurchasePlanDays(2);
        productInfo.setQualityContent("@");
        productInfo.setQualityInspectionCycle(2);
        productInfo.setSaleContent("3");
        productInfo.setBasicUnitId("@");
        productInfo.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        productInfo.setCreateTime(new Date());
        productInfo.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        productInfo.setLastModificationTime(new Date());
        productInfo.setIsDelete(2);
        productInfo.setIsDisplay(1);

        MongoUtil.insert(productInfo);
    }
}
