/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductGroupDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 15:55
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductGroupDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PriceSaleCustomerProductGroupDAOImpl implements PriceSaleCustomerProductGroupDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 15:57
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProductGroup 保存
     * @param: [priceSaleCustomerProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductGroupSaveTest(PriceSaleCustomerProductGroup priceSaleCustomerProductGroup){
        mongoTemplate.save(priceSaleCustomerProductGroup);
    }


    /**
     * @author: Hujh
     * @date: 2019/4/16 17:10
     * @since: JDK 1.8
     *
     * @description: 删除选择行项目（IS_DELETE=1）
     * @param: [idParam]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProducGrouptDel(List<String> idParam) {
        Criteria criteria = Criteria.where("_id").in(idParam);
        Query query = Query.query(criteria);
        //TODO 操作人和最后修改时间
        Update update = new Update();
        update.set("IS_DELETE",1);
        update.currentDate("LAST_MODIFICATION_TIME");
        mongoTemplate.updateMulti(query, update, PriceSaleCustomerProductGroup.class);
    }
    
    /**
     * @author: Hujh  
     * @date: 2019/4/16 17:12
     * @since: JDK 1.8
     * 
     * @description: 更细选择行项目
     * @param: 
     * @return: 
     */
    @Override
    public void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroup> list) {
        for (PriceSaleCustomerProductGroup priceSaleCustomerProductGroup : list){
            Criteria criteria = Criteria.where("_id").is(priceSaleCustomerProductGroup.getId());
            Query query = Query.query(criteria);
            Update update = new Update();
            update.set("TAX_RATE" ,priceSaleCustomerProductGroup.getTaxRate());
            update.set("TAX_INCLUDED_PRICE" ,priceSaleCustomerProductGroup.getTaxIncludedPrice());
            update.set("CURRENCY" ,priceSaleCustomerProductGroup.getCurrency());
            update.set("EACH" ,priceSaleCustomerProductGroup.getEach());
            update.currentDate("LAST_MODIFICATION_TIME");
            //TODO 操作人和最后修改时间
            mongoTemplate.updateFirst(query, update, PriceSaleCustomerProductGroup.class);
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 17:13
     * @since: JDK 1.8
     *
     * @description: 分页查询
     * @param: [pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup>
     */
    @Override
    public List<PriceSaleCustomerProductGroup> priceSaleCustomerProductGroupListByPage(Integer pageIndex, Integer pageSize) {
        Query query = new Query();
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        query.with(pageable);
        return mongoTemplate.find(query, PriceSaleCustomerProductGroup.class);
    }
}
