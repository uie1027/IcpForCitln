/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoController
 * Package Name: icp.icpForCitln.supplier.controller
 * Date: 2019/4/12 16:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.controller;


import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/supplierInfo")
public class SupplierInfoController {
    @Autowired
    private SupplierInfoService supplierInfoService;
    @RequestMapping("/supplierInfoSaveTest")
    public void supplierInfoSaveTest(){
        SupplierInfo supplierInfo = new SupplierInfo();
        supplierInfo.setId("TEST");
        supplierInfo.setCompanyCode(12345);
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
    }
}
