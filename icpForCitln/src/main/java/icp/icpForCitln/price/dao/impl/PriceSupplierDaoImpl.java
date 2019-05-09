/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierDaoImpl
 * Package Name: icp.icpForCitln.price.dao.impl
 * Date: 2019/5/6 13:25
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.price.dao.PriceSupplierDao;
import icp.icpForCitln.price.view.PriceProductSupplierView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class PriceSupplierDaoImpl implements PriceSupplierDao{
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/5/6 17:31
     * @since: JDK 1.8
     *
     * @description: 供应商产品价格分页查询
     * @param: [supplierInfo, productInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO>
     */
    @Override
    public MongoResult priceSupplierFindByPage(String supplierInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        PriceProductSupplierView priceProductSupplierView = new PriceProductSupplierView();
        priceProductSupplierView.setProductCode(productInfo);
        priceProductSupplierView.setProductName(productInfo);
        priceProductSupplierView.setSupplierCode(supplierInfo);
        priceProductSupplierView.setSupplierName(supplierInfo);
        return MongoUtil.select(pageIndex, pageSize, priceProductSupplierView);
    }
 }
