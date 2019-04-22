/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 15:58
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleProductDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
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
public class PriceSaleProductDAOImpl implements PriceSaleProductDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 16:01
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProduct 保存
     * @param: [priceSaleProduct]
     * @return: void
     */
    @Override
    public void priceSaleProductSaveTest(PriceSaleProduct priceSaleProduct){
        mongoTemplate.save(priceSaleProduct);
    }


    /**
     * @author: Hujh
     * @date: 2019/4/15 17:25
     * @since: JDK 1.8
     *
     * @description:  根据ID删除数据
     * @param: [ids]
     * @return: void
     */
    @Override
    public void priceSaleProductDel( List<String> idParam) {
        Criteria criteria = Criteria.where("_id").in(idParam);
        Query query = Query.query(criteria);
        //TODO 操作人和最后修改时间
        Update update = new Update();
        update.set("IS_DELETE",1);
        update.currentDate("LAST_MODIFICATION_TIME");
        mongoTemplate.updateMulti(query, update, PriceSaleProduct.class);
    }


    /**
     * @author: Hujh
     * @date: 2019/4/16 11:40
     * @since: JDK 1.8
     *
     * @description: 产品价格批量修改
     * @param: [list]
     * @return: void
     */
    @Override
    public void priceSaleProductUpdate(List<PriceSaleProduct> list) {
        for (PriceSaleProduct priceSaleProduct : list){
            Criteria criteria = Criteria.where("_id").is(priceSaleProduct.getId());
            Query query = Query.query(criteria);
            Update update = new Update();
            update.set("TAX_RATE" ,priceSaleProduct.getTaxRate());
            update.set("TAX_INCLUDED_PRICE" ,priceSaleProduct.getTaxIncludedPrice());
            update.set("CURRENCY" ,priceSaleProduct.getCurrency());
            update.set("EACH" ,priceSaleProduct.getEach());
            update.currentDate("LAST_MODIFICATION_TIME");
            //TODO 操作人和最后修改时间
            mongoTemplate.updateFirst(query, update, PriceSaleProduct.class);
        }
    }


    /**
     * @author: Hujh
     * @date: 2019/4/16 15:22
     * @since: JDK 1.8
     *
     * @description: 查询页面显示行项目
     * @param: [pageSize, pageNum]
     * @return: java.util.List<icp.icpForCitln.priceSale.eneity.PriceSaleProduct>
     */
    @Override
    public List<PriceSaleProduct> priceSaleProductListByPage(Integer pageIndex , Integer pageSize ) {
        Query query = new Query();
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        query.with(pageable);
        return mongoTemplate.find(query, PriceSaleProduct.class);
    }
}
