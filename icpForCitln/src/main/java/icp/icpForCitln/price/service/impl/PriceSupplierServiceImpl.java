/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import icp.icpForCitln.price.entity.PricePurchaseProductSupplier;
import icp.icpForCitln.price.service.PriceSupplierService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceSupplierServiceImpl implements PriceSupplierService {


    @Override
    public List<PricePurchaseProductSupplier> priceSupplierFindByPage(
            String supplierInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        return null;
    }
}
