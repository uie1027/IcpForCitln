/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.priceSale.controller
 * Date: 19/04/12 16:11
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.controller;


import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
import icp.icpForCitln.priceSale.service.PriceSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/priceSale")
public class PriceSaleController {
    @Autowired
    private PriceSaleService priceSaleService;

    /**
     * @author: guoxs
     * date: 19/04/12 16:30
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProduct 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleProductSaveTest")
    public void priceSaleProductSaveTest(){
        PriceSaleProduct priceSaleProduct = new PriceSaleProduct();

        priceSaleProduct.setId("test");
        priceSaleProduct.setEach(1);
        priceSaleProduct.setBasicUnit("个");
        priceSaleProduct.setCurrency("CNY");
        priceSaleProduct.setProductCode(12);
        priceSaleProduct.setProductPriceCpdeSale(11);
        priceSaleProduct.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleProduct.setTaxRate("22");
        priceSaleProduct.setCreater("1");
        priceSaleProduct.setCreateTime(new Date());
        priceSaleProduct.setIsDelete(0);
        priceSaleProduct.setLastModificationTime(new Date());
        priceSaleProduct.setLastMondifier("2");

        priceSaleService.priceSaleProductSaveTest(priceSaleProduct);
    }

    /**
     * @author: guoxs
     * date: 19/04/12 16:36
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProductGroup 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleProductGroupSaveTest")
    public void priceSaleProductGroupSaveTest(){
        PriceSaleProductGroup priceSaleProductGroup = new PriceSaleProductGroup();

        priceSaleProductGroup.setBasicUnit("s");
        priceSaleProductGroup.setCurrency("S");
        priceSaleProductGroup.setEach(1);
        priceSaleProductGroup.setProductGroupCode(1);
        priceSaleProductGroup.setProductGroupPriceCodeSale(1);
        priceSaleProductGroup.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleProductGroup.setTaxRate("1");
        priceSaleProductGroup.setCreater("1");
        priceSaleProductGroup.setCreateTime(new Date());
        priceSaleProductGroup.setId("!");
        priceSaleProductGroup.setIsDelete(0);
        priceSaleProductGroup.setLastModificationTime(new Date());
        priceSaleProductGroup.setLastMondifier("2");

        priceSaleService.priceSaleProductGroupSaveTest(priceSaleProductGroup);
    }

    /**
     * @author: guoxs
     * date: 19/04/12 16:40
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProduct 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductSaveTest")
    public void priceSaleCustomerProductSaveTest(){
        PriceSaleCustomerProduct priceSaleCustomerProduct = new PriceSaleCustomerProduct();

        priceSaleCustomerProduct.setBasicUnit("2");
        priceSaleCustomerProduct.setCompanyCode(1);
        priceSaleCustomerProduct.setCurrency("1");
        priceSaleCustomerProduct.setEach(1);
        priceSaleCustomerProduct.setProductCode(1);
        priceSaleCustomerProduct.setProductPriceCpdeSale(1);
        priceSaleCustomerProduct.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleCustomerProduct.setTaxRate("!");
        priceSaleCustomerProduct.setCreater("1");
        priceSaleCustomerProduct.setCreateTime(new Date());
        priceSaleCustomerProduct.setId("!");
        priceSaleCustomerProduct.setIsDelete(0);
        priceSaleCustomerProduct.setLastModificationTime(new Date());
        priceSaleCustomerProduct.setLastMondifier("2");

        priceSaleService.priceSaleCustomerProductSaveTest(priceSaleCustomerProduct);
    }

    /**
     * @author: guoxs
     * date: 19/04/12 16:44
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProductGroup 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductGroupSaveTest")
    public void priceSaleCustomerProductGroupSaveTest(){
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup = new PriceSaleCustomerProductGroup();

        priceSaleCustomerProductGroup.setBasicUnit("2");
        priceSaleCustomerProductGroup.setCompanyCode(1);
        priceSaleCustomerProductGroup.setCurrency("!");
        priceSaleCustomerProductGroup.setEach(1);
        priceSaleCustomerProductGroup.setProductGroupCode(1);
        priceSaleCustomerProductGroup.setProductGroupPriceCodeSale(2);
        priceSaleCustomerProductGroup.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleCustomerProductGroup.setTaxRate("!");
        priceSaleCustomerProductGroup.setCreater("1");
        priceSaleCustomerProductGroup.setCreateTime(new Date());
        priceSaleCustomerProductGroup.setId("!");
        priceSaleCustomerProductGroup.setIsDelete(0);
        priceSaleCustomerProductGroup.setLastModificationTime(new Date());
        priceSaleCustomerProductGroup.setLastMondifier("2");

        priceSaleService.priceSaleCustomerProductGroupSaveTest(priceSaleCustomerProductGroup);
    }

}
