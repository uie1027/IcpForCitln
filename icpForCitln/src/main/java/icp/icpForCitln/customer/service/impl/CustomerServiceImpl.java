/**
 * Project Name: icpForCitln
 * File Name: CustomerServiceImpl
 * Package Name: icp.icpForCitln.customer.service.impl
 * Date: 2019-04-15 下午 2:17
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.service.impl;

import icp.icpForCitln.customer.dao.CustomerInfoDAO;
import icp.icpForCitln.customer.eneity.CustomerInfo;
import icp.icpForCitln.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerInfoDAO customerInfoDAO;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 下午 2:18
     * @since: JDK 1.8
     *
     * @description: 保存 customerInfo 测试
     * @param: [customerInfo]
     * @return: void
     */
    @Override
    public void customerInfoSaveTest(CustomerInfo customerInfo) {
        customerInfoDAO.saveTest(customerInfo);
    }
}
