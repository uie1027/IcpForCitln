/**
 * Project Name: icpForCitln
 * File Name: PriceSaleServiceImpl
 * Package Name: icp.icpForCitln.priceSale.service.impl
 * Date: 19/04/12 16:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.service.impl;

import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductDAO;
import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductGroupDAO;
import icp.icpForCitln.priceSale.dao.PriceSaleProductDAO;
import icp.icpForCitln.priceSale.dao.PriceSaleProductGroupDAO;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
import icp.icpForCitln.priceSale.service.PriceSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceSaleServiceImpl implements PriceSaleService {
    @Autowired
    private PriceSaleProductDAO priceSaleProductDAO;
    @Autowired
    private PriceSaleProductGroupDAO priceSaleProductGroupDAO;
    @Autowired
    private PriceSaleCustomerProductDAO priceSaleCustomerProductDAO;
    @Autowired
    private PriceSaleCustomerProductGroupDAO priceSaleCustomerProductGroupDAO;

    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProduct 保存
     * @param: [priceSaleProduct]
     * @return: void
     */
    @Override
    public void priceSaleProductSaveTest(PriceSaleProduct priceSaleProduct){
        priceSaleProductDAO.priceSaleProductSaveTest(priceSaleProduct);
    }

    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProductGroup 保存
     * @param: [priceSaleProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupSaveTest(PriceSaleProductGroup priceSaleProductGroup){
        priceSaleProductGroupDAO.priceSaleProductGroupSaveTest(priceSaleProductGroup);
    }

    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProduct 保存
     * @param: [priceSaleCustomerProduct]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductSaveTest(PriceSaleCustomerProduct priceSaleCustomerProduct){
        priceSaleCustomerProductDAO.priceSaleCustomerProductSaveTest(priceSaleCustomerProduct);
    }

    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProductGroup 保存
     * @param: [priceSaleCustomerProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductGroupSaveTest(PriceSaleCustomerProductGroup priceSaleCustomerProductGroup){
        priceSaleCustomerProductGroupDAO.priceSaleCustomerProductGroupSaveTest(priceSaleCustomerProductGroup);
    }
}
