/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitDefinitionDAOImpl
 * Package Name: icp.icpForCitln.product.dao.impl
 * Date: 19/04/15 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.dao.impl;

import icp.icpForCitln.product.dao.ProductAttribuitDefinitionDAO;
import icp.icpForCitln.product.eneity.ProductAttribuitDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductAttribuitDefinitionDAOImpl implements ProductAttribuitDefinitionDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * @date: 19/04/15 15:40
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuitDefinition 储存
     * @param: [productAttribuitDefinition]
     * @return: void
     */
    @Override
    public void productAttribuitDefinitionSaveTest(ProductAttribuitDefinition productAttribuitDefinition){
        mongoTemplate.save(productAttribuitDefinition);
    }
}
