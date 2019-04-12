/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 15:58
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleProductDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceSaleProductDAOImpl implements PriceSaleProductDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 16:01
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProduct 保存
     * @param: [priceSaleProduct]
     * @return: void
     */
    @Override
    public void priceSaleProductSaveTest(PriceSaleProduct priceSaleProduct){
        mongoTemplate.save(priceSaleProduct);
    }
}
