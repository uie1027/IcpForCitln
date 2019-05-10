/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao;

import icp.icpForCitln.order.entity.PurchaseOrderInfo;

public interface PurchaseOrderDao {
     void  purchaseOrderSave(PurchaseOrderInfo purchaseOrderInfo);
//     MongoResult purchaseOrderFindByPage (String searchField, Integer pageIndex , Integer pageSize);
}
