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
     * @date: 19/04/18 09:52
     * @since: JDK 1.8
     *
     * @description: 保存供应商数据
     * @param: [supplierInfo]
     * @return: void
     */
    @Override
    public void saveSupplierInfo(SupplierInfo supplierInfo){
        mongoTemplate.save(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:47
     * @since: JDK 1.8
     *
     * @description: 查询供应商列表
     * @param: [pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.supplier.entity.SupplierInfo>
     */
    @Override
    public List<SupplierInfo> supplierListByPage(Integer pageIndex, Integer pageSize){
        Pageable pageable = PageRequest.of(pageIndex,pageSize);

        Query query = new Query(Criteria.where("IS_DELETE").is(2)).with(pageable).with(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME"));

        return mongoTemplate.find(query,SupplierInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:48
     * @since: JDK 1.8
     *
     * @description: 根据供应商编码或供应商名称查询供应商列表
     * @param: [pageIndex, pageSize, CodeOrName]
     * @return: java.util.List<icp.icpForCitln.supplier.entity.SupplierInfo>
     */
    @Override
    public List<SupplierInfo> supplierListByCodeOrName(Integer pageIndex,Integer pageSize,String CodeOrName){
        Pageable pageable = PageRequest.of(pageIndex,pageSize);
        Criteria criteria = new Criteria();
        criteria.orOperator(Criteria.where("COMPANY_CODE").regex(CodeOrName),Criteria.where("COMPANY_NAME").regex(CodeOrName));
        Query query = new Query(criteria.and("IS_DELETE").is(2)).with(pageable).with(new Sort(Sort.Direction.DESC,"LAST_MODIFICATION_TIME"));

        return mongoTemplate.find(query,SupplierInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:49
     * @since: JDK 1.8
     *
     * @description: 修改供应商信息
     * @param: [supplierInfo]
     * @return: void
     */
    @Override
    public void updataSupplierInfo(SupplierInfo supplierInfo){
        Query query = new Query(Criteria.where("_id").is(supplierInfo.getId()));
        Update update = new Update();
        update.set("UNIFIED_SOCIAL_CREDIT_CODE",supplierInfo.getUnifiedSocialCreditCode());
        update.set("COMPANY_NAME",supplierInfo.getCompanyName());

        mongoTemplate.upsert(query,update,SupplierInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:49
     * @since: JDK 1.8
     *
     * @description: 通过id查询供应商详情
     * @param: [supplierInfo]
     * @return: icp.icpForCitln.supplier.entity.SupplierInfo
     */
    @Override
    public SupplierInfo supplierInfoById(SupplierInfo supplierInfo){
        Query query = new Query(Criteria.where("_id").is(supplierInfo.getId()).and("IS_DELETE").is(2));

        return mongoTemplate.findOne(query,SupplierInfo.class);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 09:49
     * @since: JDK 1.8
     *
     * @description: 删除供应商
     * @param: [supplierInfo]
     * @return: void
     */
    @Override
    public void deleteSupplierInfo(SupplierInfo supplierInfo){
        Query query = new Query(Criteria.where("_id").is(supplierInfo.getId()));

        Update update = new Update();
        update.set("IS_DELETE",1);

        mongoTemplate.upsert(query,update,SupplierInfo.class);
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
