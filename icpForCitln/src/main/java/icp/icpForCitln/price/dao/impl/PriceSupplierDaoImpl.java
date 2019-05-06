/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierDaoImpl
 * Package Name: icp.icpForCitln.price.dao.impl
 * Date: 2019/5/6 13:25
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao.impl;

import icp.icpForCitln.price.dao.PriceSupplierDao;
import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.price.entity.PricePurchaseProductSupplier;
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
public class PriceSupplierDaoImpl implements PriceSupplierDao {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<PricePurchaseProductSupplierDTO> priceSupplierFindByPage(String supplierInfo, String productInfo, Integer pageIndex, Integer pageSize) {

        LookupOperation supplier = LookupOperation.newLookup().from("SUPPLIER_INFO").localField("SUPPLIER_INFO_ID").foreignField("_id").as("SUPPLIER");
        LookupOperation product = LookupOperation.newLookup().from("PRODUCT_INFO").localField("PRODUCT_INFO_ID").foreignField("_id").as("PRODUCT");


        Criteria criteria = new Criteria();
        List<Criteria> list = new ArrayList<>();
        if (supplierInfo != null){
            //供应商编码
            list.add(Criteria.where("SUPPLIER.SUPPLIER_CODE").regex(supplierInfo));
        }
        if (supplierInfo != null){
            //供应商名称
            list.add(Criteria.where("SUPPLIER.SUPPLIER_NAME").regex(supplierInfo));
        }
        if (supplierInfo != null){
            //商品编码
            list.add(Criteria.where("PRODUCT.PRODUCT_CODE").regex(productInfo));
        }
        if (supplierInfo != null){
            //商品名称
            list.add(Criteria.where("PRODUCT.PRODUCT_NAME").regex(productInfo));
        }
        AggregationOperation match = Aggregation.match(criteria.orOperator(list.toArray(new Criteria[list.size()])));
        Aggregation aggregation = Aggregation.newAggregation(supplier,product,match,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        return mongoTemplate.aggregate(aggregation,"PRICE_SALE_CUSTOMER_PRODUCT",PricePurchaseProductSupplierDTO.class).getMappedResults();
    }
}
