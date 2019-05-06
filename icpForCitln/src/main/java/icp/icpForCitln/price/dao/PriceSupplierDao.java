/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierDao
 * Package Name: icp.icpForCitln.price.dao
 * Date: 2019/5/6 13:24
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao;

import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;

import java.util.List;

public interface PriceSupplierDao {
    List<PricePurchaseProductSupplierDTO> priceSupplierFindByPage(
            String supplierInfo,String productInfo,Integer pageIndex,Integer pageSize);
}
