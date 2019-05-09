/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.price.dao.PriceSupplierDao;
import icp.icpForCitln.price.service.PriceSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceSupplierServiceImpl implements PriceSupplierService {
    @Autowired
    private PriceSupplierDao priceSupplierDao;

    /**
     * @author: Hujh
     * @date: 2019/5/6 15:51
     * @since: JDK 1.8
     *
     * @description: 分页查询供应商产品价格
     * @param: [supplierInfo, productInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO>
     */
    @Override
    public MongoResult priceSupplierFindByPage(
            String supplierInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        return  priceSupplierDao.priceSupplierFindByPage(supplierInfo,productInfo,pageIndex,pageSize);
    }
}
