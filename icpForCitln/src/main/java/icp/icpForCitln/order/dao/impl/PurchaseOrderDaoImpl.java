/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao.impl;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.order.dao.PurchaseOrderDao;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseOrderDaoImpl implements PurchaseOrderDao {

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
     public List<PurchaseOrderInfo> getOrderListFindByPage(String searchField, Pageable pageable) {
          PurchaseOrderInfo purchaseOrderInfo = new PurchaseOrderInfo();
          purchaseOrderInfo.setPurchaseOrderCode(searchField);
          purchaseOrderInfo.setSupplieInfoId(searchField);
         return  MongoUtil.select(pageable.getPageNumber(), pageable.getPageSize(),purchaseOrderInfo);
     }

}
