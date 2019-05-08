/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDao
 * Package Name: icp.icpForCitln.order.dao
 * Date: 2019/5/7 18:03
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao;

import icp.icpForCitln.order.dto.SaleOrderInfoDTO;
import icp.icpForCitln.order.vo.SaleOrderInfoVO;

import java.util.List;

public interface SaleOrderDao {
    List<SaleOrderInfoDTO> saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize);
}
