/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoDaoImpl
 * Package Name: icp.icpForCitln.supplier.dao
 * Date: 2019/4/12 16:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.dao.impl;

import icp.icpForCitln.supplier.dao.SupplierInfoDao;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SupplierInfoDaoImpl implements SupplierInfoDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveTest(SupplierInfo supplierInfo) {
        mongoTemplate.save(supplierInfo);
    }
}
