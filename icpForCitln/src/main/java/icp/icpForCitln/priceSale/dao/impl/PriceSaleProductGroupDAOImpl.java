/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroupDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 16:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleProductGroupDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceSaleProductGroupDAOImpl implements PriceSaleProductGroupDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 16:09
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProductGroup 保存
     * @param: [priceSaleProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupSaveTest(PriceSaleProductGroup priceSaleProductGroup){
        mongoTemplate.save(priceSaleProductGroup);
    }
}
