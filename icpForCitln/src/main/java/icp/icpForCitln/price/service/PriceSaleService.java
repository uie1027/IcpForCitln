/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service;


import icp.icpForCitln.common.enetity.MongoResult;

public interface PriceSaleService {
    MongoResult priceSaleProductGroupFindByPage(String searchField, Integer pageIndex , Integer pageSize);
    MongoResult  priceSaleProductFindByPage(String searchField, Integer pageIndex , Integer pageSize);
    MongoResult priceSaleCustomerProductGroupFindByPage(String customerInfo,String productGroupInfo,Integer pageIndex, Integer pageSize);
    MongoResult priceSaleCustomerProductFindByPage(String customerInfo,String productInfo,Integer pageIndex, Integer pageSize);
}
