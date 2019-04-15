/**
 * Project Name: icpForCitln
 * File Name: ProductServiceImpl
 * Package Name: icp.icpForCitln.product.service.impl
 * Date: 19/04/15 15:45
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.service.impl;

import icp.icpForCitln.product.dao.ProductAttribuitDAO;
import icp.icpForCitln.product.dao.ProductAttribuitDefinitionDAO;
import icp.icpForCitln.product.dao.ProductAttribuitValueDAO;
import icp.icpForCitln.product.dao.ProductInfoDAO;
import icp.icpForCitln.product.eneity.ProductAttribuit;
import icp.icpForCitln.product.eneity.ProductAttribuitDefinition;
import icp.icpForCitln.product.eneity.ProductAttribuitValue;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductAttribuitDAO productAttribuitDAO;

    @Autowired
    ProductAttribuitDefinitionDAO productAttribuitDefinitionDAO;

    @Autowired
    ProductAttribuitValueDAO productAttribuitValueDAO;

    @Autowired
    ProductInfoDAO productInfoDAO;

    /**
     * @author: guoxs
     * @date: 19/04/15 15:51
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuit 储存
     * @param: [productAttribuit]
     * @return: void
     */
    @Override
    public void productAttribuitSaveTest(ProductAttribuit productAttribuit){
        productAttribuitDAO.productAttribuitSaveTest(productAttribuit);
    }

    /**
     * @author: guoxs
     * @date: 19/04/15 15:51
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuitDefinition 储存
     * @param: [productAttribuitDefinition]
     * @return: void
     */
    @Override
    public void productAttribuitDefinitionSaveTest(ProductAttribuitDefinition productAttribuitDefinition){
        productAttribuitDefinitionDAO.productAttribuitDefinitionSaveTest(productAttribuitDefinition);
    }

    /**
     * @author: guoxs
     * @date: 19/04/15 15:51
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuitValue 储存
     * @param: [productAttribuitValue]
     * @return: void
     */
    @Override
    public void productAttribuitValueSaveTest(ProductAttribuitValue productAttribuitValue){
        productAttribuitValueDAO.productAttribuitValueSaveTest(productAttribuitValue);
    }

    /**
     * @author: guoxs
     * @date: 19/04/15 15:51
     * @since: JDK 1.8
     *
     * @description: 测试 ProductInfo 储存
     * @param: [productInfo]
     * @return: void
     */
    @Override
    public void productInfoSaveTest(ProductInfo productInfo){
        productInfoDAO.productInfoSaveTest(productInfo);
    }
}
