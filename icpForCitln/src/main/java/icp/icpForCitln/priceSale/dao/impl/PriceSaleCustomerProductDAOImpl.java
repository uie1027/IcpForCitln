/**
 * Project Name: icpForCitln
 * File Name: PriceSaleCustomerProductDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 15:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
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
public class PriceSaleCustomerProductDAOImpl implements PriceSaleCustomerProductDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 15:54
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProduct 保存
     * @param: [priceSaleCustomerProduct]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductSaveTest(PriceSaleCustomerProduct priceSaleCustomerProduct){
        mongoTemplate.save(priceSaleCustomerProduct);
    }

    @Override
    public void priceSaleCustomerProductDel(List<String> idParam) {
        Criteria criteria = Criteria.where("_id").in(idParam);
        Query query = Query.query(criteria);
        //TODO 操作人和最后修改时间
        Update update = new Update();
        update.set("IS_DELETE",2);
        update.currentDate("LAST_MODIFICATION_TIME");
        mongoTemplate.updateMulti(query, update, PriceSaleCustomerProduct.class);
    }

    @Override
    public void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProduct> list) {
        for (PriceSaleCustomerProduct priceSaleCustomerProduct : list){
            Criteria criteria = Criteria.where("_id").is(priceSaleCustomerProduct.getId());
            Query query = Query.query(criteria);
            Update update = new Update();
            update.set("TAX_RATE" ,priceSaleCustomerProduct.getTaxRate());
            update.set("TAX_INCLUDED_PRICE" ,priceSaleCustomerProduct.getTaxIncludedPrice());
            update.set("CURRENCY" ,priceSaleCustomerProduct.getCurrency());
            update.set("EACH" ,priceSaleCustomerProduct.getEach());
            update.currentDate("LAST_MODIFICATION_TIME");
            //TODO 操作人和最后修改时间
            mongoTemplate.updateFirst(query, update, PriceSaleCustomerProduct.class);
        }
    }

    @Override
    public List<PriceSaleCustomerProduct> priceSaleCustomerProductListByPage(Integer pageIndex, Integer pageSize) {
        Query query = new Query();
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        query.with(pageable);
        return mongoTemplate.find(query, PriceSaleCustomerProduct.class);
    }


}
