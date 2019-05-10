/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.order.dao.PurchaseOrderDao;
import icp.icpForCitln.order.dto.PurchaseOrderDTO;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.view.PurchaseOrderView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

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
     public void  purchaseOrderSave(PurchaseOrderInfo purchaseOrderInfo){
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
//     @Override
//     public MongoResult purchaseOrderFindByPage(String searchField, Integer pageIndex , Integer pageSize) {
//          PurchaseOrderView purchaseOrderView = new PurchaseOrderView();
////          purchaseOrderView.set
//          return mongoTemplate.aggregate(aggregation,"PURCHASE_ORDER_INFO",PurchaseOrderDTO.class).getMappedResults();
//     }

}
