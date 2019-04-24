/**
 * Project Name: icpForCitln
 * File Name: CustomerServiceImpl
 * Package Name: icp.icpForCitln.customer.service.impl
 * Date: 2019-04-15 下午 2:17
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.customer.dao.CustomerInfoDAO;
import icp.icpForCitln.customer.dto.CustomerInfoDTO;
import icp.icpForCitln.customer.eneity.CustomerInfo;
import icp.icpForCitln.customer.service.CustomerService;
import icp.icpForCitln.customer.vo.CustomerInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * @author: guoxs
     * @date: 19/04/19 16:10
     * @since: JDK 1.8
     *
     * @description: 保存公司信息
     * @param: [customerInfoDto]
     * @return: void
     */
    @Override
    public void saveCustomerInfo(CustomerInfoDTO customerInfoDto){
        CustomerInfo customerInfo = BeanCopyUtil.copy(customerInfoDto,CustomerInfo.class);
        MongoUtil.insert(customerInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:10
     * @since: JDK 1.8
     *
     * @description: 获取客户列表
     * @param: [pageIndex, pageSize, codeOrName]
     * @return: java.util.List<icp.icpForCitln.customer.CustomerInfoVO>
     */
    @Override
    public List<CustomerInfoVO> customerInfoListByPage(Integer pageIndex, Integer pageSize, CustomerInfoDTO customerInfoDto){
        CustomerInfo customerInfo = BeanCopyUtil.copy(customerInfoDto,CustomerInfo.class);
        return MongoUtil.select(pageIndex,pageSize,customerInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:09
     * @since: JDK 1.8
     *
     * @description: 编辑客户信息
     * @param: [customerInfoDto]
     * @return: void
     */
    @Override
    public void updateCustomerInfo(CustomerInfoDTO customerInfoDto){
        CustomerInfo customerInfo = BeanCopyUtil.copy(customerInfoDto,CustomerInfo.class);
        MongoUtil.upsert(customerInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:09
     * @since: JDK 1.8
     *
     * @description: 获取公司详情
     * @param: [customerInfoDto]
     * @return: icp.icpForCitln.customer.CustomerInfoVO
     */
    @Override
    public CustomerInfo getCustomerInfoById(CustomerInfoDTO customerInfoDto){
        CustomerInfo customerInfo = BeanCopyUtil.copy(customerInfoDto,CustomerInfo.class);
        return (CustomerInfo) MongoUtil.select(customerInfo).get(0);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:08
     * @since: JDK 1.8
     *
     * @description: 删除客户
     * @param: [customerInfoDto]
     * @return: void
     */
    @Override
    public void deleteCustomerInfo(CustomerInfoDTO customerInfoDto){
        CustomerInfo customerInfo = BeanCopyUtil.copy(customerInfoDto,CustomerInfo.class);
        MongoUtil.delete(customerInfo);
    }
}
