/**
 * Project Name: icpForCitln
 * File Name: ProduceDAOImpl
 * Package Name: icp.icpForCitln.produce.dao.impl
 * Date: 19/05/06 10:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.dao.impl;

import icp.icpForCitln.produce.dao.ProduceDAO;
import icp.icpForCitln.produce.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.produce.dto.ProductionReceiptListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProduceDAOImpl implements ProduceDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    public List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        LookupOperation factory = LookupOperation.newLookup().from("FACTORY_INFO").localField("FACTORY_ID").foreignField("_id").as("FACTORY");
        LookupOperation order = LookupOperation.newLookup().from("PRODUCTION_ORDER").localField("PRODUCTION_ORDER_ID").foreignField("_id").as("ORDER");
       List<Criteria> list = new ArrayList<>();
       Criteria criteria = new Criteria();
        if (productionReceiptFindDTO.getFactoryCode()!=null){
            list.add(Criteria.where("FACTORY.FACTORY_CODE").regex(productionReceiptFindDTO.getFactoryCode()));
        }
        if (productionReceiptFindDTO.getFactoryName()!=null){
            list.add(Criteria.where("FACTORY.FACTORY_NAME").regex(productionReceiptFindDTO.getFactoryName()));
        }
        if (productionReceiptFindDTO.getProductionReceiptCode()!=null){
            list.add(Criteria.where("PRODUCTION_RECEIPT_CODE").regex(productionReceiptFindDTO.getProductionReceiptCode()));
        }
        AggregationOperation match = Aggregation.match(criteria.orOperator(list.toArray(new Criteria[list.size()])));
        Aggregation aggregation = Aggregation.newAggregation(factory,order,match,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        return mongoTemplate.aggregate(aggregation,"PRODUCTION_RECEIPT",ProductionReceiptListDTO.class).getMappedResults();
    }
}