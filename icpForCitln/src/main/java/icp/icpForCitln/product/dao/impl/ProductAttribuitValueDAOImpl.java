/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitValueDAOImpl
 * Package Name: icp.icpForCitln.product.dao.impl
 * Date: 19/04/15 15:40
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.dao.impl;

import icp.icpForCitln.product.dao.ProductAttribuitValueDAO;
import icp.icpForCitln.product.eneity.ProductAttribuitValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductAttribuitValueDAOImpl implements ProductAttribuitValueDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * @date: 19/04/15 15:41
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuitValue 储存
     * @param: [productAttribuitValue]
     * @return: void
     */
    @Override
    public  void productAttribuitValueSaveTest(ProductAttribuitValue productAttribuitValue){
        mongoTemplate.save(productAttribuitValue);
    }
}
