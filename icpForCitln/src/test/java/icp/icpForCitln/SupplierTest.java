/**
 * Project Name: icpForCitln
 * File Name: SupplierTest
 * Package Name: icp.icpForCitln
 * Date: 19/04/17 11:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.supplier.dto.SupplierInfoDto;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupplierTest {
    @Autowired
    SupplierInfoService supplierInfoService;

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void supplierInfoSaveTest(){
        SupplierInfo supplierInfo = new SupplierInfo();
        supplierInfo.setId("TEST1");
        supplierInfo.setCompanyCode("gust");
        supplierInfo.setUnifiedSocialCreditCode("1234567980");
        supplierInfo.setCompanyName("华峰创享");
        supplierInfo.setCompanyShortName("创享");
        supplierInfo.setCompanyFax("021-1234567");
        supplierInfo.setCompanyEmail("chuangxiang@668.com");
        supplierInfo.setCompanyContact("小明");
        supplierInfo.setCompanyContactPhone("1234456790");
        supplierInfo.setCompanyTelephone("021-1234567");
        supplierInfo.setCurrency("中国");
        supplierInfo.setProvince("上海");
        supplierInfo.setCity("上海");
        supplierInfo.setDistrict("浦东新区");
        supplierInfo.setCompanyAddress("上海浦东康桥");
        supplierInfo.setCompanyIntroduction("公司介绍");
        supplierInfo.setCompanyPicture("AAAAAAAAAAAAAA");
        supplierInfo.setBankName("中国银行");
        supplierInfo.setCurrency("17%");
        supplierInfo.setBankAccount("6222121346546456456");
        supplierInfo.setFrozen(1);
        supplierInfo.setHandelCode("101.10.2335.66.5656.1111.00");
        supplierInfo.setCreater("TEST");
        supplierInfo.setCreateTime(new Date());
        supplierInfo.setLastMondifier("TEST");
        supplierInfo.setLastModificationTime(new Date());
        supplierInfo.setIsDelete(1);
        supplierInfoService.saveTest(supplierInfo);
        System.out.println("success");
    }

    @Test
    public void supplierListByPage(){
        System.out.println(supplierInfoService.supplierListByPage(0,20,""));
    }

    @Test
    public void supplierInfoById(){
        SupplierInfoDto supplierInfoDto = new SupplierInfoDto();
        supplierInfoDto.setId("TEST1");
        System.out.println(supplierInfoService.supplierInfoById(supplierInfoDto));
    }

    @Test
    public void updateSupplierInfo(){
        SupplierInfoDto supplierInfoDto = new SupplierInfoDto();
        supplierInfoDto.setId("TEST1");
        supplierInfoDto.setUnifiedSocialCreditCode("asddfsdcxv");
        supplierInfoDto.setCompanyName("huafe");

        supplierInfoService.updateSupplierInfo(supplierInfoDto);
    }

    @Test
    public void deleteSupplierInfo(){
        SupplierInfoDto supplierInfoDto = new SupplierInfoDto();

        supplierInfoDto.setId("1");

        supplierInfoService.deleteSupplierInfo(supplierInfoDto);

        System.out.println("success");
    }

    @Test
    public void thawSupplierInfo(){
        SupplierInfo supplierInfo = new SupplierInfo();

        List<SupplierInfo> supplierInfoList = MongoUtil.select(0,10,supplierInfo);

        System.out.println(supplierInfoList);
    }
}
