/**
 * Project Name: icpForCitln
 * File Name: CustomerService
 * Package Name: icp.icpForCitln.customer.service
 * Date: 2019-04-15 下午 2:16
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.service;

import icp.icpForCitln.customer.dto.CustomerInfoDTO;
import icp.icpForCitln.customer.eneity.CustomerInfo;
import icp.icpForCitln.customer.vo.CustomerInfoVO;

import java.util.List;

public interface CustomerService {
    void customerInfoSaveTest(CustomerInfo customerInfo);     //存储测试
    void saveCustomerInfo(CustomerInfoDTO customerInfo);  //储存客户信息
    List<CustomerInfoVO> customerInfoListByPage(Integer pageIndex, Integer pageSize, CustomerInfoDTO customerInfoDto); //根据客户编码或客户名称查询客户列表
    void updateCustomerInfo(CustomerInfoDTO customerInfoDto); //修改客户信息
    CustomerInfo getCustomerInfoById(CustomerInfoDTO customerInfoDto);  //查询客户详情
    void deleteCustomerInfo(CustomerInfoDTO customerInfoDto); //删除客户
}
