/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service;


import icp.icpForCitln.common.enetity.MongoResult;


public interface PriceSupplierService {
    MongoResult priceSupplierFindByPage(
            String supplierInfo,String productInfo,Integer pageIndex,Integer pageSize);

}
