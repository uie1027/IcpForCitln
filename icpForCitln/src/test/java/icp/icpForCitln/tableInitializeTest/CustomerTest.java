/**
 * Project Name: icpForCitln
 * File Name: CustomerTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/04/29 14:10
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.customer.contorller.CustomerController;
import icp.icpForCitln.customer.dto.CustomerInfoSaveDTO;
import icp.icpForCitln.customer.entity.CustomerInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {
    @Autowired
    CustomerController customerController;

    /**
     * @author: guoxs
     * @date: 19/04/29 14:41
     * @since: JDK 1.8
     *
     * @description: customerInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void customerInfoSaveTest(){
        CustomerInfo customerInfo = new CustomerInfo();

        customerInfo.setBankAccount("test");
        customerInfo.setBankName("test");
        customerInfo.setCityCode("1");
        customerInfo.setCountryCode("2");
        customerInfo.setCurrencyId("1");
        customerInfo.setCustomerAddress("there");
        customerInfo.setCustomerCode("2");
        customerInfo.setCustomerContact("@");
        customerInfo.setCustomerContactPhone("12345678911");
        customerInfo.setCustomerEmail("asd@qq.com");
        customerInfo.setCustomerFax("223123");
        customerInfo.setCustomerIntroduction("asdaxcdf");
        customerInfo.setCustomerName("567");
        customerInfo.setCustomerPicture("234");
        customerInfo.setCustomerShortName("5");
        customerInfo.setCustomerTelephone("12345670");
        customerInfo.setDistrictCode("23");
        customerInfo.setFrozen(2);
        customerInfo.setProvinceCode("3");
        customerInfo.setUnifiedSocialCreditCode("asdvc21351");

        MongoUtil.insert(customerInfo);
    }

    @Test
    public void test(){
        CustomerInfoSaveDTO customerInfoSaveDTO = new CustomerInfoSaveDTO();
        customerInfoSaveDTO.setBankAccount("333");
        Class c = customerInfoSaveDTO.getClass();
        try {
            Object m = c.newInstance();
            m.getClass().getMethod("setBankAccount",new Class[]{String.class}).invoke(m,new Object[]{"222"});
            System.out.println(m);
        }catch (Exception e){
            System.out.println("asd");
        }
        System.out.println(customerInfoSaveDTO);
    }
}
