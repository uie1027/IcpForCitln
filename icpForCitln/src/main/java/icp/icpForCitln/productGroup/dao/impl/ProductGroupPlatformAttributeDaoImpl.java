/**
 * Project Name: icpForCitln
 * File Name: ProductGroupPlatformAttributeDaoImpl
 * Package Name: icp.icpForCitln.productGroup.dao.impl
 * Date: 2019/4/12 16:00
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.dao.impl;

import icp.icpForCitln.productGroup.dao.ProductGroupPlatformAttributeDao;
import icp.icpForCitln.productGroup.entity.ProductGroupPlatformAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductGroupPlatformAttributeDaoImpl implements ProductGroupPlatformAttributeDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveTest(ProductGroupPlatformAttribute productGroupPlatformAttribute) {
        mongoTemplate.save(productGroupPlatformAttribute);
    }
}
