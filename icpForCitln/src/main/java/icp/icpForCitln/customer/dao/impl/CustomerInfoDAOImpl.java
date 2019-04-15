/**
 * Project Name: icpForCitln
 * File Name: CustomerInfoDAOImpl
 * Package Name: icp.icpForCitln.customer.dao.impl
 * Date: 2019-04-15 下午 2:12
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.dao.impl;

import icp.icpForCitln.customer.dao.CustomerInfoDAO;
import icp.icpForCitln.customer.eneity.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerInfoDAOImpl implements CustomerInfoDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 下午 2:14
     * @since: JDK 1.8
     *
     * @description: 保存 customerInfo 测试
     * @param: [customerInfo]
     * @return: void
     */
    @Override
    public void saveTest(CustomerInfo customerInfo) {
        mongoTemplate.save(customerInfo);
    }
}
