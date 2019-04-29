/**
 * Project Name: icpForCitln
 * File Name: SupplierTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 下午 3:59
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.supplier.SupplierInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupplierTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 4:00
     * @since: JDK 1.8
     *
     * @description: SupplierInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void supplierInfoTest(){
        SupplierInfo supplierInfo = new SupplierInfo();

        supplierInfo.setSupplierCode("123456");
        supplierInfo.setUnifiedSocialCreditCode("1234567980");
        supplierInfo.setSupplierName("华峰创享");
        supplierInfo.setSupplierShortName("创享");
        supplierInfo.setSupplierFax("021-1234567");
        supplierInfo.setSupplierEmail("chuangxiang@668.com");
        supplierInfo.setSupplierContact("小明");
        supplierInfo.setSupplierContactPhone("1234456790");
        supplierInfo.setSupplierTelephone("021-1234567");
        supplierInfo.setCountryCode("中国");
        supplierInfo.setProvinceCode("上海");
        supplierInfo.setCityCode("上海");
        supplierInfo.setDistrictCode("浦东新区");
        supplierInfo.setSupplierAddress("上海浦东康桥");
        supplierInfo.setSupplierIntroduction("公司介绍");
        supplierInfo.setSupplierPicture("AAAAAAAAAAAAAA");
        supplierInfo.setBankName("中国银行");
        supplierInfo.setCurrencyId("17%");
        supplierInfo.setBankAccount("6222121346546456456");
        supplierInfo.setFrozen(1);

        MongoUtil.insert(supplierInfo);
    }
}
