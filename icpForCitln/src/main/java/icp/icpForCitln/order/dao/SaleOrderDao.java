/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDao
 * Package Name: icp.icpForCitln.order.dao
 * Date: 2019/5/7 18:03
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao;

import icp.icpForCitln.common.enetity.MongoResult;

public interface SaleOrderDao {
    MongoResult saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize);
}
