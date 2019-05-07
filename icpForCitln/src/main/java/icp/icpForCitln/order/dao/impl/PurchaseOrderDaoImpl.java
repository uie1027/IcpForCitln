/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao.impl;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.order.dao.PurchaseOrderDao;
import icp.icpForCitln.order.dto.PurchaseOrderDTO;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PurchaseOrderDaoImpl implements PurchaseOrderDao {
     @Autowired
     MongoTemplate mongoTemplate;

     /**
      * @author: Hujh
      * @date: 2019/5/6 9:26
      * @since: JDK 1.8
      *
      * @description: 创建采购订单
      * @param: [purchaseOrderInfo]
      * @return: void
      */
     public void  createOrder(PurchaseOrderInfo purchaseOrderInfo){
          MongoUtil.insert(purchaseOrderInfo);
     }


     /**
      * @author: Hujh
      * @date: 2019/5/6 9:25
      * @since: JDK 1.8
      *
      * @description: 分页查询采购订单列表
      * @param: [searchField, pageable]
      * @return: java.util.List<icp.icpForCitln.order.entity.PurchaseOrderInfo>
      */
     @Override
     public List<PurchaseOrderDTO> getOrderListFindByPage(String searchField, Integer pageIndex , Integer pageSize) {
          LookupOperation supplier = LookupOperation.newLookup().from("SUPPLIER_INFO").localField("SUPPLIER_INFO_ID").foreignField("_id").as("SUPPLIER");

          Criteria criteria = new Criteria();
          List<Criteria> list = new ArrayList<>();
          //订单号/供应商
          if (!StringUtil.isEmpty(searchField)){
               //供应商名称
               list.add(Criteria.where("SUPPLIER.SUPPLIER_NAME").regex(searchField));
               //订单号
               list.add(Criteria.where("PURCHASE_ORDER_CODE").regex(searchField));
          }

          AggregationOperation match = null;
          Aggregation aggregation = null;
          if(list.size() >0){
               match = Aggregation.match(criteria.orOperator(list.toArray(new Criteria[list.size()])));
               aggregation = Aggregation.newAggregation(supplier,match,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
          }else{
               aggregation = Aggregation.newAggregation(supplier,Aggregation.skip(pageIndex),Aggregation.limit(pageSize));
          }
          return mongoTemplate.aggregate(aggregation,"PURCHASE_ORDER_INFO",PurchaseOrderDTO.class).getMappedResults();
     }

}
