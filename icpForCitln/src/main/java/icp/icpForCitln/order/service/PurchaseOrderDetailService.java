/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service;

import icp.icpForCitln.order.entity.PurchaseOrderDetailInfo;

import java.util.List;

public interface PurchaseOrderDetailService {
     void  createOrderDetail(List<PurchaseOrderDetailInfo> purchaseOrderDetailInfos);

}
