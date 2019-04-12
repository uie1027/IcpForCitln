/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 15:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceSaleCustomerProductDAOImpl implements PriceSaleCustomerProductDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 15:54
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProduct 保存
     * @param: [priceSaleCustomerProduct]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductSaveTest(PriceSaleCustomerProduct priceSaleCustomerProduct){
        mongoTemplate.save(priceSaleCustomerProduct);
    }
}
