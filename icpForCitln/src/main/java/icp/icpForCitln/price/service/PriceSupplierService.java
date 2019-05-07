/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service;


import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.price.entity.PricePurchaseProductSupplier;

import java.util.List;

public interface PriceSupplierService {
    List<PricePurchaseProductSupplierDTO> priceSupplierFindByPage(
            String supplierInfo,String productInfo,Integer pageIndex,Integer pageSize);

}
