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
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class SupplierInfoDaoImpl implements SupplierInfoDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/4/15 11:27
     * @since: JDK 1.8
     *
     * @description: 保存SupplierInfo对象
     * @param: [supplierInfo]
     * @return: void
     */
    @Override
    public void saveTest(SupplierInfo supplierInfo) {
        mongoTemplate.save(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:50
     * @since: JDK 1.8
     *
     * @description: 冻结供应商
     * @param: [supplierInfo]
     * @return: void
     */
    @Override
    public void frozenSupplierInfo(SupplierInfo supplierInfo){
        Query query = new Query(Criteria.where("_id").is(supplierInfo.getId()));

        Update update = new Update();
        update.set("FROZEN",1);

        mongoTemplate.upsert(query,update,SupplierInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:50
     * @since: JDK 1.8
     *
     * @description: 解冻供应商
     * @param: [supplierInfo]
     * @return: void
     */
    @Override
    public void thawSupplierInfo(SupplierInfo supplierInfo){
        Query query = new Query(Criteria.where("_id").is(supplierInfo.getId()));

        Update update = new Update();
        update.set("FROZEN",2);

        mongoTemplate.upsert(query,update,SupplierInfo.class);
    }
}
