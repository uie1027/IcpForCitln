/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfoDaoImpl
 * Package Name: icp.icpForCitln.productGroup.dao.impl
 * Date: 2019/4/12 15:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.dao.impl;

import icp.icpForCitln.productGroup.dao.ProductGroupInfoDao;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductGroupInfoDaoImpl implements ProductGroupInfoDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveTest(ProductGroupInfo productGroupInfo) {
        mongoTemplate.save(productGroupInfo);
    }
}
