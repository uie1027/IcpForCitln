/**
 * Project Name: icpForCitln
 * File Name: CustomerService
 * Package Name: icp.icpForCitln.customer.service
 * Date: 2019-04-15 下午 2:16
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.service;

import icp.icpForCitln.customer.CustomerInfoVO;
import icp.icpForCitln.customer.dto.CustomerInfoDto;
import icp.icpForCitln.customer.eneity.CustomerInfo;

import java.util.List;

public interface CustomerService {
    void customerInfoSaveTest(CustomerInfo customerInfo);     //存储测试
    void saveCustomerInfo(CustomerInfoDto customerInfo);  //储存客户信息
    List<CustomerInfoVO> customerInfoListByPage(Integer pageIndex,Integer pageSize,String CodeOrName); //根据客户编码或客户名称查询客户列表
    void updataCustomerInfo(CustomerInfoDto customerInfoDto); //修改客户信息
    CustomerInfoVO getCustomerInfoById(CustomerInfoDto customerInfoDto);  //查询客户详情
    void deleteCustomerInfo(CustomerInfoDto customerInfoDto); //删除客户
}
