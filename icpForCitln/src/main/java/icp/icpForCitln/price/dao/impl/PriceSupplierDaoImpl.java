/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierDaoImpl
 * Package Name: icp.icpForCitln.price.dao.impl
 * Date: 2019/5/6 13:25
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao.impl;

import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.price.dao.PriceSupplierDao;
import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
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
public class PriceSupplierDaoImpl implements PriceSupplierDao{
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/5/6 17:31
     * @since: JDK 1.8
     *
     * @description: 供应商产品价格分页查询
     * @param: [supplierInfo, productInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO>
     */
    @Override
    public List<PricePurchaseProductSupplierDTO> priceSupplierFindByPage(String supplierInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        LookupOperation supplier = LookupOperation.newLookup().from("SUPPLIER_INFO").localField("SUPPLIER_INFO_ID").foreignField("_id").as("SUPPLIER");
        LookupOperation product = LookupOperation.newLookup().from("PRODUCT_INFO").localField("PRODUCT_INFO_ID").foreignField("_id").as("PRODUCT");

        Criteria criteria = new Criteria();
        List<Criteria> list = new ArrayList<>();
        if (!StringUtil.isEmpty(supplierInfo)){
            //供应商编码
            list.add(Criteria.where("SUPPLIER.SUPPLIER_CODE").regex(supplierInfo));
            //供应商名称
            list.add(Criteria.where("SUPPLIER.SUPPLIER_NAME").regex(supplierInfo));
        }
        if (!StringUtil.isEmpty(productInfo)){
            //商品编码
            list.add(Criteria.where("PRODUCT.PRODUCT_CODE").regex(productInfo));
            //商品名称
            list.add(Criteria.where("PRODUCT.PRODUCT_NAME").regex(productInfo));
        }
        AggregationOperation match = null;
        Aggregation aggregation = null;
        if(list.size() >0){
             match = Aggregation.match(criteria.orOperator(list.toArray(new Criteria[list.size()])));
            aggregation = Aggregation.newAggregation(supplier,product,match,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        }else{
            aggregation = Aggregation.newAggregation(supplier,product,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        }
        return mongoTemplate.aggregate(aggregation,"PRICE_PURCHASE_PRODUCT_SUPPLIER",PricePurchaseProductSupplierDTO.class).getMappedResults();
    }
}
