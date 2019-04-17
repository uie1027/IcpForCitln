/**
 * Project Name: icpForCitln
 * File Name: PriceSaleProductGroupDAOImpl
 * Package Name: icp.icpForCitln.priceSale.dao.impl
 * Date: 19/04/12 16:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.dao.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleProductGroupDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
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
public class PriceSaleProductGroupDAOImpl implements PriceSaleProductGroupDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: guoxs
     * date: 19/04/12 16:09
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProductGroup 保存
     * @param: [priceSaleProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupSaveTest(PriceSaleProductGroup priceSaleProductGroup){
        mongoTemplate.save(priceSaleProductGroup);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 16:03
     * @since: JDK 1.8
     *
     * @description: 删除选择行项目
     * @param: [idParam]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupDel(List<String> idParam) {

        Criteria criteria = Criteria.where("_id").in(idParam);
        Query query = Query.query(criteria);
        //TODO 操作人和最后修改时间
        Update update = new Update();
        update.set("IS_DELETE",2);
        update.currentDate("LAST_MODIFICATION_TIME");
        mongoTemplate.updateMulti(query, update, PriceSaleProductGroup.class);
    }

    @Override
    public void priceSaleProductGroupUpdate(List<PriceSaleProductGroup> list) {
        for (PriceSaleProductGroup priceSaleProductGroup : list){
            Criteria criteria = Criteria.where("_id").is(priceSaleProductGroup.getId());
            Query query = Query.query(criteria);
            Update update = new Update();
            update.set("TAX_RATE" ,priceSaleProductGroup.getTaxRate());
            update.set("TAX_INCLUDED_PRICE" ,priceSaleProductGroup.getTaxIncludedPrice());
            update.set("CURRENCY" ,priceSaleProductGroup.getCurrency());
            update.set("EACH" ,priceSaleProductGroup.getEach());
            update.currentDate("LAST_MODIFICATION_TIME");
            //TODO 操作人和最后修改时间
            mongoTemplate.updateFirst(query, update, PriceSaleProductGroup.class);
        }
    }

    @Override
    public List<PriceSaleProductGroup> priceSaleProductGroupListByPage(Integer pageIndex, Integer pageSize) {
        Query query = new Query();
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        query.with(pageable);
        return mongoTemplate.find(query, PriceSaleProductGroup.class);
    }


}
