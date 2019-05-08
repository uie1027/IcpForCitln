/**
 * Project Name: icpForCitln
 * File Name: PriceSaleDaoImpl
 * Package Name: icp.icpForCitln.price.dao.impl
 * Date: 2019/5/6 19:37
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.customer.entity.CustomerInfo;
import icp.icpForCitln.price.dao.PriceSaleDao;
import icp.icpForCitln.price.dto.*;
import icp.icpForCitln.price.entity.PriceSaleCustomerProduct;
import icp.icpForCitln.price.entity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
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
public class PriceSaleDaoImpl implements PriceSaleDao {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/5/6 21:37
     * @since: JDK 1.8
     *
     * @description: 商品组价格分页查询（销售）
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleProductGroupDTO>
     */
    @Override
    public List<PriceSaleProductGroupDTO> priceSaleProductGroupFindByPage(String searchField, Integer pageIndex, Integer pageSize) {

        //产品组表关联 PRODUCT_GROUP_INFO
        LookupOperation productGroup = LookupOperation.newLookup().from("PRODUCT_GROUP_INFO").localField("PRODUCT_GROUP_INFO_ID").foreignField("_id").as("PRODUCTGROUP");
        //查询条件
        Criteria criteria = new Criteria();
        List<Criteria> list = new ArrayList<>();
        if (!StringUtil.isEmpty(searchField)){
            //产品组编码
            list.add(Criteria.where("PRODUCTGROUP.PRODUCT_GROUP_CODE").regex(searchField));
            //产品组名称
            list.add(Criteria.where("PRODUCTGROUP.PRODUCT_GROUP_NAME").regex(searchField));
        }

        AggregationOperation match = null;
        Aggregation aggregation = null;
        if(list.size() >0){
            match = Aggregation.match(criteria.orOperator(list.toArray(new Criteria[list.size()])));
            aggregation = Aggregation.newAggregation(productGroup,match,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        }else{
            aggregation = Aggregation.newAggregation(productGroup,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        }
        return mongoTemplate.aggregate(aggregation,"PRICE_SALE_PRODUCT_GROUP",PriceSaleProductGroupDTO.class).getMappedResults();

    }


    /**
     * @author: Hujh
     * @date: 2019/5/6 21:37
     * @since: JDK 1.8
     *
     * @description: 商品价格分页查询
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleProductDTO>
     */
    @Override
    public List<PriceSaleProductDTO> priceSaleProductFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        //产品PRODUCT_INFO
        LookupOperation product = LookupOperation.newLookup().from("PRODUCT_INFO").localField("PRODUCT_INFO_ID").foreignField("_id").as("PRODUCT");
        //查询条件
        Criteria criteria = new Criteria();
        List<Criteria> list = new ArrayList<>();
        if (!StringUtil.isEmpty(searchField)){
            //产品编码
            list.add(Criteria.where("PRODUCT.PRODUCT_CODE").regex(searchField));
            //产品名称
            list.add(Criteria.where("PRODUCT.PRODUCT_NAME").regex(searchField));
        }
        AggregationOperation match = null;
        Aggregation aggregation = null;
        if(list.size() >0){
            match = Aggregation.match(criteria.orOperator(list.toArray(new Criteria[list.size()])));
            aggregation = Aggregation.newAggregation(product,match,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        }else{
            aggregation = Aggregation.newAggregation(product,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
        }
        return mongoTemplate.aggregate(aggregation,"PRICE_SALE_PRODUCT",PriceSaleProductDTO.class).getMappedResults();

    }



    /**
     * @author: Hujh
     * @date: 2019/5/7 11:18
     * @since: JDK 1.8
     *
     * @description:
     * @param: [customerInfo, productGroupInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO>
     */
    @Override
    public List<PriceSaleCustomerProductGroupDTO> priceSaleCustomerProductGroupFindByPage(
            String customerInfo, String productGroupInfo, Integer pageIndex, Integer pageSize) {
        //关联表
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(ProductGroupInfo.class); //产品组表关联
        minorClass.add(CustomerInfo.class); //客户表关联
        //查询条件赋值
        PriceSaleSearchDTO priceSaleSearchDTO = new PriceSaleSearchDTO();
        priceSaleSearchDTO.setCustomerInfo_customerCode(customerInfo);
        priceSaleSearchDTO.setCustomerInfo_customerName(customerInfo);
        priceSaleSearchDTO.setProductGroupInfo_productGroupCode(productGroupInfo);
        priceSaleSearchDTO.setProductGroupInfo_productGroupName(productGroupInfo);
        MongoResult mongoResult = MongoUtil.aggregateSelect(minorClass, PriceSaleCustomerProductGroup.class,priceSaleSearchDTO,PriceSaleCustomerProductGroupDTO.class,pageIndex,pageSize);
        return BeanCopyUtil.copy(mongoResult.getResultList(),PriceSaleCustomerProductGroupDTO.class);
    }

    /**
     * @author: Hujh
     * @date: 2019/5/7 11:18
     * @since: JDK 1.8
     *
     * @description: 这里用一句话描述这个方法的作用
     * @param: [customerInfo, productInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO>
     */
    @Override
    public List<PriceSaleCustomerProductDTO> priceSaleCustomerProductFindByPage(
            String customerInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        //关联表
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(ProductInfo.class); //产品表关联
        minorClass.add(CustomerInfo.class); //客户表关联
        //查询条件赋值
        PriceSaleSearchDTO priceSaleSearchDTO = new PriceSaleSearchDTO();
        priceSaleSearchDTO.setCustomerInfo_customerCode(customerInfo);
        priceSaleSearchDTO.setCustomerInfo_customerName(customerInfo);
        priceSaleSearchDTO.setProductInfo_productCode(productInfo);
        priceSaleSearchDTO.setProductInfo_productName(productInfo);
        MongoResult mongoResult =  MongoUtil.aggregateSelect(minorClass, PriceSaleCustomerProduct.class,priceSaleSearchDTO,PriceSaleCustomerProductDTO.class,pageIndex,pageSize);
        return BeanCopyUtil.copy(mongoResult.getResultList(),PriceSaleCustomerProductDTO.class);
    }


}
