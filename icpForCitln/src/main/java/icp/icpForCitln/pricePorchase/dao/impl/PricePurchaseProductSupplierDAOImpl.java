/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplierDAOImpl
 * Package Name: icp.icpForCitln.pricePorchase.dao.impl
 * Date: 2019-04-15 下午 3:35
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.dao.impl;

import icp.icpForCitln.pricePorchase.dao.PricePurchaseProductSupplierDAO;
import icp.icpForCitln.pricePorchase.eneity.PricePurchaseProductSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PricePurchaseProductSupplierDAOImpl implements PricePurchaseProductSupplierDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 下午 3:37
     * @since: JDK 1.8
     *
     * @description: 保存 pricePurchaseProductSupplier 测试
     * @param: [pricePurchaseProductSupplier]
     * @return: void
     */
    @Override
    public void saveTest(PricePurchaseProductSupplier pricePurchaseProductSupplier) {
        mongoTemplate.save(pricePurchaseProductSupplier);
    }
}
