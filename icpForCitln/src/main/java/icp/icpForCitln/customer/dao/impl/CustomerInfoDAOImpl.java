/**
 * Project Name: icpForCitln
 * File Name: CustomerInfoDAOImpl
 * Package Name: icp.icpForCitln.customer.dao.impl
 * Date: 2019-04-15 下午 2:12
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.customer.dao.impl;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.customer.dao.CustomerInfoDAO;
import icp.icpForCitln.customer.eneity.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerInfoDAOImpl implements CustomerInfoDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

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

    /**
     * @author: guoxs
     * @date: 19/04/19 16:06
     * @since: JDK 1.8
     *
     * @description: 保存客户信息
     * @param: [customerInfo]
     * @return: void
     */
    @Override
    public void saveCustomerInfo(CustomerInfo customerInfo){
        mongoTemplate.save(customerInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:06
     * @since: JDK 1.8
     *
     * @description: 获取用户列表
     * @param: [pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.customer.eneity.CustomerInfo>
     */
    @Override
    public List<CustomerInfo> customerInfoListByPage(Integer pageIndex, Integer pageSize){
        Pageable pageable = PageRequest.of(pageIndex,pageSize);

        Query query = new Query(Criteria.where("IS_DELETE").is(2)).with(pageable).with(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME"));

        return mongoTemplate.find(query,CustomerInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:06
     * @since: JDK 1.8
     *
     * @description: 通过公司编码或客户名称查询公司列表
     * @param: [pageIndex, pageSize, CodeOrName]
     * @return: java.util.List<icp.icpForCitln.customer.eneity.CustomerInfo>
     */
    @Override
    public List<CustomerInfo> customerInfoListByCodeOrName(Integer pageIndex,Integer pageSize,String CodeOrName){
        Pageable pageable = PageRequest.of(pageIndex,pageSize);

        Criteria criteria = new Criteria();
        criteria.orOperator(Criteria.where("COMPANY_CODE").regex(CodeOrName),Criteria.where("COMPANY_NAME").regex(CodeOrName)).and("IS_DELETE").is(2);

        Query query = new Query(criteria).with(pageable).with(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME"));

        return mongoTemplate.find(query,CustomerInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:07
     * @since: JDK 1.8
     *
     * @description: 编辑公司信息
     * @param: [customerInfo]
     * @return: void
     */
    @Override
    public void updateCustomerInfo(CustomerInfo customerInfo) {
            MongoUtil.upsert(customerInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:07
     * @since: JDK 1.8
     *
     * @description: 获取公司信息详情
     * @param: [customerInfo]
     * @return: icp.icpForCitln.customer.eneity.CustomerInfo
     */
    @Override
    public CustomerInfo getCustomerInfoById(CustomerInfo customerInfo){
        Query query = new Query(Criteria.where("_id").is(customerInfo.getId()));

        return mongoTemplate.findOne(query,CustomerInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/19 16:08
     * @since: JDK 1.8
     *
     * @description: 删除客户
     * @param: [customerInfo]
     * @return: void
     */
    @Override
    public void deleteCustomerInfo(CustomerInfo customerInfo){
        Query query = new Query(Criteria.where("_id").is(customerInfo.getId()));

        Update update = new Update();
        update.set("IS_DELETE",1);

        mongoTemplate.upsert(query,update,CustomerInfo.class);
    }
}
