/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao;

import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PurchaseOrderDao {
     void  createOrder(PurchaseOrderInfo purchaseOrderInfo);
     List<PurchaseOrderInfo> getOrderListFindByPage (String searchField, Pageable pageable);
}
