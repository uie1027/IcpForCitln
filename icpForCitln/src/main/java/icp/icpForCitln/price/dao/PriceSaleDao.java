/**
 * Project Name: icpForCitln
 * File Name: PriceSaleDao
 * Package Name: icp.icpForCitln.price.dao
 * Date: 2019/5/6 19:36
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao;

import icp.icpForCitln.common.enetity.MongoResult;

public interface PriceSaleDao {
    MongoResult priceSaleProductGroupFindByPage(String searchField, Integer pageIndex , Integer pageSize);

    MongoResult  priceSaleProductFindByPage(String searchField, Integer pageIndex , Integer pageSize);

    MongoResult priceSaleCustomerProductGroupFindByPage(String customerInfo, String productGroupInfo, Integer pageIndex, Integer pageSize);

    MongoResult priceSaleCustomerProductFindByPage(String customerInfo, String productInfo, Integer pageIndex, Integer pageSize);
}
