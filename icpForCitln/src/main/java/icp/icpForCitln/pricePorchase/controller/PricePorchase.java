/**
 * Project Name: icpForCitln
 * File Name: PricePorchase
 * Package Name: icp.icpForCitln.pricePorchase.controller
 * Date: 2019-04-15 下午 3:43
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.controller;

import icp.icpForCitln.pricePorchase.eneity.PricePurchaseProductSupplier;
import icp.icpForCitln.pricePorchase.service.PricePurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/pricePorchase")
public class PricePorchase {
    @Autowired
    PricePurchaseService pricePurchaseService;

    @GetMapping("/pricePurchaseProductSupplierSaveTest")
    public void pricePurchaseProductSupplierSaveTest(){
        PricePurchaseProductSupplier pricePurchaseProductSupplier = new PricePurchaseProductSupplier();

        pricePurchaseProductSupplier.setId("testId");
        pricePurchaseProductSupplier.setProductPriceCodeSupplier("testppdodep");
        pricePurchaseProductSupplier.setCompanyCode("companyCodeTest");
        pricePurchaseProductSupplier.setProductCode("testpcode");
        pricePurchaseProductSupplier.setTaxRate("testTaxrate");
        pricePurchaseProductSupplier.setTaxIncludedPrice(new BigDecimal(5.0));
        pricePurchaseProductSupplier.setCurrency("testcu");
        pricePurchaseProductSupplier.setEach(5.0);
        pricePurchaseProductSupplier.setBasicUnit("testbu");
        pricePurchaseProductSupplier.setCreater("testcreater");
        pricePurchaseProductSupplier.setCreateTime(new Date());
        pricePurchaseProductSupplier.setLastMondifier("lastman");
        pricePurchaseProductSupplier.setLastModificationTime(new Date());
        pricePurchaseProductSupplier.setIsDelete(2);

        pricePurchaseService.pricePurchaseProductSupplierSaveTest(pricePurchaseProductSupplier);
    }
}
