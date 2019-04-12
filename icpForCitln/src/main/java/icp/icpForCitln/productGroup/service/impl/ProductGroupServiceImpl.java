/**
 * Project Name: icpForCitln
 * File Name: ProductGroupServiceImpl
 * Package Name: icp.icpForCitln.productGroup.service.impl
 * Date: 2019/4/12 16:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.service.impl;

import icp.icpForCitln.productGroup.dao.ProductGroupEnterpeiseAttributeDao;
import icp.icpForCitln.productGroup.dao.ProductGroupInfoDao;
import icp.icpForCitln.productGroup.dao.ProductGroupMailDisplayDao;
import icp.icpForCitln.productGroup.dao.ProductGroupPlatformAttributeDao;
import icp.icpForCitln.productGroup.entity.ProductGroupEnterpeiseAttribute;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import icp.icpForCitln.productGroup.entity.ProductGroupPlatformAttribute;
import icp.icpForCitln.productGroup.service.ProductGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {
    @Autowired
    private ProductGroupEnterpeiseAttributeDao productGroupEnterpeiseAttributeDao;

    @Autowired
    private ProductGroupInfoDao productGroupInfoDao;

    @Autowired
    private ProductGroupMailDisplayDao productGroupMailDisplayDao;

    @Autowired
    private ProductGroupPlatformAttributeDao productGroupPlatformAttributeDao;


    @Override
    public void productGroupEnterpeiseAttributeSaveTest(
            ProductGroupEnterpeiseAttribute productGroupEnterpeiseAttribute) {
        productGroupEnterpeiseAttributeDao.saveTest(productGroupEnterpeiseAttribute);
    }

    @Override
    public void productGroupInfoSaveTest(ProductGroupInfo productGroupInfo) {
        productGroupInfoDao.saveTest(productGroupInfo);
    }

    @Override
    public void productGroupMailDisplaySaveTest(ProductGroupMailDisplay productGroupMailDisplay) {
        productGroupMailDisplayDao.saveTest(productGroupMailDisplay);
    }

    @Override
    public void productGroupPlatformAttributeSaveTest(
            ProductGroupPlatformAttribute productGroupPlatformAttribute) {
        productGroupPlatformAttributeDao.saveTest(productGroupPlatformAttribute);
    }
}
