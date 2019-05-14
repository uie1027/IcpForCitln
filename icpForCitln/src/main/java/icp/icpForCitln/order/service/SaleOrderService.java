/**
 * Project Name: icpForCitln
 * File Name: SaleOrderService
 * Package Name: icp.icpForCitln.order.service
 * Date: 2019/5/7 17:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.order.dto.SaleOrderInfoDTO;

public interface SaleOrderService {
   MongoResult saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize);
   void saleOrderSave(SaleOrderInfoDTO saleOrderInfoDTO);
}
