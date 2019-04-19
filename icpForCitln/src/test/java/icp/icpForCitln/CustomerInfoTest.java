/**
 * Project Name: icpForCitln
 * File Name: CustomerInfoTest
 * Package Name: icp.icpForCitln
 * Date: 19/04/18 13:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln;

import icp.icpForCitln.customer.dao.CustomerInfoDAO;
import icp.icpForCitln.customer.eneity.CustomerInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerInfoTest {

    @Autowired
    CustomerInfoDAO customerInfoDAO;

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void updateTest(){
        CustomerInfo customerInfo = new CustomerInfo();

        System.out.println(mongoTemplate.save(customerInfo));
    }
}
