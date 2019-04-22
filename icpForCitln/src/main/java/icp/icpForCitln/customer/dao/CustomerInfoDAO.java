/**
 * Project Name: icpForCitln
 * File Name: CustomerInfoDAOImpl
 * Package Name: icp.icpForCitln.customer.dao
 * Date: 2019-04-15 下午 2:12
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.dao;

import icp.icpForCitln.customer.eneity.CustomerInfo;

import java.util.List;

public interface CustomerInfoDAO {
    void saveTest(CustomerInfo customerInfo);     //存储测试接口
    void saveCustomerInfo(CustomerInfo customerInfo);  //储存客户信息
    List<CustomerInfo> customerInfoListByPage(Integer pageIndex, Integer pageSize);  //获取客户列表
    List<CustomerInfo> customerInfoListByCodeOrName(Integer pageIndex,Integer pageSize,String CodeOrName); //根据客户编码或客户名称查询客户列表
    void updataCustomerInfo(CustomerInfo customerInfo); //修改客户信息
    CustomerInfo getCustomerInfoById(CustomerInfo customerInfo);  //查询客户详情
    void deleteCustomerInfo(CustomerInfo customerInfo); //删除客户
}
