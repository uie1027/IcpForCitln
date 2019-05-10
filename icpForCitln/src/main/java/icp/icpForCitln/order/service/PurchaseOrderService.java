/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/5 17:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.order.dto.PurchaseOrderDTO;
import icp.icpForCitln.order.vo.PurchaseOrderVO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PurchaseOrderService {
     void  purchaseOrderSave(PurchaseOrderDTO purchaseOrderDTO);
     MongoResult purchaseOrderListFindByPage (String searchField, Integer pageIndex, Integer pageSize);
}
