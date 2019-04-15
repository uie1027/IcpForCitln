/**
 * Project Name: icpForCitln
 * File Name: CustomerController
 * Package Name: icp.icpForCitln.customer.controller
 * Date: 2019-04-15 下午 2:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.controller;

import icp.icpForCitln.customer.eneity.CustomerInfo;
import icp.icpForCitln.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customerInfoSaveTest")
    public void customerInfoSaveTest(){
        CustomerInfo customerInfo = new CustomerInfo();

        customerInfo.setId("testId");
        customerInfo.setCompanyCode("testccode");
        customerInfo.setUnifiedSocialCreditCode("usccodetest");
        customerInfo.setCompanyName("testname");
        customerInfo.setCompanyShortName("testsname");
        customerInfo.setCompanytFax("testfax");
        customerInfo.setCompanyEmail("testemail");
        customerInfo.setCompanyContact("testcc");
        customerInfo.setCompanyContactPhone("testccphone");
        customerInfo.setCompanyTelephone("testctel");
        customerInfo.setCountry("china");
        customerInfo.setProvince("sh");
        customerInfo.setCity("sh");
        customerInfo.setDistrict("pd");
        customerInfo.setCompanyAddress("testaddress");
        customerInfo.setCompanyIntroduction("testintru");
        customerInfo.setCompanyPicture("testpicture");
        customerInfo.setBankName("testbank");
        customerInfo.setCurrency("rmb");
        customerInfo.setBankAccount("testbac");
        customerInfo.setFrozen(2);
        customerInfo.setHandelCode("testhandle");
        customerInfo.setCreater("testcreater");
        customerInfo.setCreateTime(new Date());
        customerInfo.setLastMondifier("lastman");
        customerInfo.setLastModificationTime(new Date());
        customerInfo.setIsDelete(2);

        customerService.customerInfoSaveTest(customerInfo);
    }
}
