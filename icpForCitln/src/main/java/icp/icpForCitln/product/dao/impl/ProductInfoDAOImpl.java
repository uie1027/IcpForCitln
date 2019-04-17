/**
 * Project Name: icpForCitln
 * File Name: ProductInfoDAOImpl
 * Package Name: icp.icpForCitln.product.dao.impl
 * Date: 19/04/15 15:41
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.dao.impl;

import icp.icpForCitln.product.dao.ProductInfoDAO;
import icp.icpForCitln.product.eneity.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductInfoDAOImpl implements ProductInfoDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * @date: 19/04/15 15:42
     * @since: JDK 1.8
     *
     * @description: 测试 ProductInfo 储存
     * @param: [productInfo]
     * @return: void
     */
    @Override
    public void productInfoSaveTest(ProductInfo productInfo){
        mongoTemplate.save(productInfo);
    }
}
