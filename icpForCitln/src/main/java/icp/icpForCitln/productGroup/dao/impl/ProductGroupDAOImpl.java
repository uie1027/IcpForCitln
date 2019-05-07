/**
 * Project Name: icpForCitln
 * File Name: ProductGroupDAOImpl
 * Package Name: icp.icpForCitln.productGroup.dao.impl
 * Date: 2019/5/6 18:23
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.dao.impl;

import icp.icpForCitln.productGroup.dao.ProductGroupDAO;
import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeDTO;
import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeFindDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductGroupDAOImpl implements ProductGroupDAO {
    @Autowired
    private MongoTemplate mongoTemplate;
    /**
     * @author: 方瑞冬
     * @date: 2019/5/6 18:23
     * @since: JDK 1.8
     *
     * @description: 新建产品查询产品组属性
     * @param: [productGroupSystemAttributeDTO]
     * @return: java.util.List<icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeFindDTO>
     */
    @Override
    public List<ProductGroupSystemAttributeFindDTO> productGroupAttributeFindByPage(ProductGroupSystemAttributeDTO productGroupSystemAttributeDTO) {
        LookupOperation productGroupSystemAttribute = LookupOperation.newLookup().from("PRODUCT_GROUP_SYSTEM_ATTRIBUTE").localField("_id").foreignField("SYSTEM_PRODUCT_ATTRIBUIT_ID").as("PRODUCT_GROUP_SYSTEM_ATTRIBUTES");
        LookupOperation systemProductAttribuitValue = LookupOperation.newLookup().from("SYSTEM_PRODUCT_ATTRIBUIT_VALUE").localField("_id").foreignField("SYSTEM_PRODUCT_ATTRIBUIT_ID").as("SYSTEM_PRODUCT_ATTRIBUIT_VALUES");
        Criteria criteria = Criteria.where("PRODUCT_GROUP_SYSTEM_ATTRIBUTES.PRODUCT_GROUP_INFO_ID").is(productGroupSystemAttributeDTO.getId());
        AggregationOperation aggregationOperation = Aggregation.match(criteria);
        Aggregation aggregation = Aggregation.newAggregation(productGroupSystemAttribute,systemProductAttribuitValue,aggregationOperation);
        return mongoTemplate.aggregate(aggregation,"SYSTEM_PRODUCT_ATTRIBUIT",ProductGroupSystemAttributeFindDTO.class).getMappedResults();
    }
}
