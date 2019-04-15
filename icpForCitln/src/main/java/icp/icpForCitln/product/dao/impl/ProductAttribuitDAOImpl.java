/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitDAOImpl
 * Package Name: icp.icpForCitln.product.dao.impl
 * Date: 19/04/15 15:36
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.dao.impl;

import icp.icpForCitln.product.dao.ProductAttribuitDAO;
import icp.icpForCitln.product.eneity.ProductAttribuit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductAttribuitDAOImpl implements ProductAttribuitDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * @date: 19/04/15 15:38
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuit 储存
     * @param: [productAttribuit]
     * @return: void
     */
    @Override
    public void productAttribuitSaveTest(ProductAttribuit productAttribuit){
        mongoTemplate.save(productAttribuit);
    }
}
