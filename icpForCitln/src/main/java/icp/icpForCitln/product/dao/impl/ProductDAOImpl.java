/**
 * Project Name: icpForCitln
 * File Name: ProductDAOImpl
 * Package Name: icp.icpForCitln.product.dao.impl
 * Date: 19/05/05 16:47
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.dao.impl;

import icp.icpForCitln.product.dao.ProductDAO;
import icp.icpForCitln.product.dto.ProductInfoDTO;
import icp.icpForCitln.product.eneity.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<ProductInfoDTO> productInfoFind(ProductInfo productInfo){
        LookupOperation lookupOperation = LookupOperation.newLookup().from("SYSTEM_DICTIONARY_INFO").localField("BASIC_UNIT_ID").foreignField("_id").as("INFO");

        AggregationOperation match = Aggregation.match(Criteria.where("PRODUCT_CODE").regex(productInfo.getProductCode()));

        Aggregation aggregation = Aggregation.newAggregation(match,lookupOperation);

        return mongoTemplate.aggregate(aggregation,"PRODUCT_INFO",ProductInfoDTO.class).getMappedResults();
    }
}
