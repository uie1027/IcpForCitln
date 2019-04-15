/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseServiceImpl
 * Package Name: icp.icpForCitln.pricePorchase.service.impl
 * Date: 2019-04-15 下午 3:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.service.impl;

import icp.icpForCitln.pricePorchase.dao.PricePurchaseProductSupplierDAO;
import icp.icpForCitln.pricePorchase.eneity.PricePurchaseProductSupplier;
import icp.icpForCitln.pricePorchase.service.PricePurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PricePurchaseServiceImpl implements PricePurchaseService {
    @Autowired
    PricePurchaseProductSupplierDAO pricePurchaseProductSupplierDAO;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 下午 3:41
     * @since: JDK 1.8
     *
     * @description: 保存 pricePurchaseProductSupplier 测试
     * @param: [pricePurchaseProductSupplier]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierSaveTest(PricePurchaseProductSupplier pricePurchaseProductSupplier) {
        pricePurchaseProductSupplierDAO.saveTest(pricePurchaseProductSupplier);
    }
}
