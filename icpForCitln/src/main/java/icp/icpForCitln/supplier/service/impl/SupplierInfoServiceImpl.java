/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoServiceImpl
 * Package Name: icp.icpForCitln.supplier.service.impl
 * Date: 2019/4/12 16:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.service.impl;

import icp.icpForCitln.supplier.dao.SupplierInfoDao;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierInfoServiceImpl implements SupplierInfoService {
    @Autowired
    private SupplierInfoDao supplierInfoDao;

    @Override
    public void saveTest(SupplierInfo supplierInfo) {
        supplierInfoDao.saveTest(supplierInfo);
    }
}
