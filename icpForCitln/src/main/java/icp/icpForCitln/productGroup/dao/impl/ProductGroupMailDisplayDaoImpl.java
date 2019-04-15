/**
 * Project Name: icpForCitln
 * File Name: ProductGroupMailDisplayDaoImpl
 * Package Name: icp.icpForCitln.productGroup.dao.impl
 * Date: 2019/4/12 15:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.dao.impl;

import icp.icpForCitln.productGroup.dao.ProductGroupMailDisplayDao;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductGroupMailDisplayDaoImpl implements ProductGroupMailDisplayDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/4/15 11:28
     * @since: JDK 1.8
     *
     * @description: 保存productGroupMailDisplay对象
     * @param: [productGroupMailDisplay]
     * @return: void
     */
    @Override
    public void saveTest(ProductGroupMailDisplay productGroupMailDisplay) {
        mongoTemplate.save(productGroupMailDisplay);
    }
}
