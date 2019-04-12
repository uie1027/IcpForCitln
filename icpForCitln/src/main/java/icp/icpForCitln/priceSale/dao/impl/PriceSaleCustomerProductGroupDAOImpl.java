/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductGroupDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 15:55
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductGroupDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceSaleCustomerProductGroupDAOImpl implements PriceSaleCustomerProductGroupDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 15:57
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProductGroup 保存
     * @param: [priceSaleCustomerProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductGroupSaveTest(PriceSaleCustomerProductGroup priceSaleCustomerProductGroup){
        mongoTemplate.save(priceSaleCustomerProductGroup);
    }
}
