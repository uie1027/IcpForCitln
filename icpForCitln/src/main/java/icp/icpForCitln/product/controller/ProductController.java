/**
 * Project Name: icpForCitln
 * File Name: ProductController
 * Package Name: icp.icpForCitln.product.controller
 * Date: 19/04/15 15:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.controller;

import icp.icpForCitln.product.eneity.ProductAttribuit;
import icp.icpForCitln.product.eneity.ProductAttribuitDefinition;
import icp.icpForCitln.product.eneity.ProductAttribuitValue;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * @author: guoxs
     * @date: 19/04/15 16:06
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuit 储存
     * @param: []
     * @return: void
     */
    @GetMapping("/productAttribuitSaveTest")
    public void productAttribuitSaveTest(){
        ProductAttribuit productAttribuit = new ProductAttribuit();

        productAttribuit.setProductAttribuitValueCode("111");
        productAttribuit.setProductCode("1");
        productAttribuit.setCreater("s");
        productAttribuit.setCreateTime(new Date());
        productAttribuit.setId("1");
        productAttribuit.setIsDelete(0);
        productAttribuit.setLastModificationTime(new Date());
        productAttribuit.setLastMondifier("w");

        productService.productAttribuitSaveTest(productAttribuit);
    }

    /**
     * @author: guoxs
     * @date: 19/04/15 16:07
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuitDefinition 储存
     * @param: []
     * @return: void
     */
    @GetMapping("/productAttribuitDefinitionSaveTest")
    public void productAttribuitDefinitionSaveTest(){
        ProductAttribuitDefinition productAttribuitDefinition = new ProductAttribuitDefinition();

        productAttribuitDefinition.setProductAttribuitDefinitionCode("1");
        productAttribuitDefinition.setProductAttribuitDefinitionName("2");
        productAttribuitDefinition.setProductAttribuitDefinitionType("2");
        productAttribuitDefinition.setUnitCode("!");
        productAttribuitDefinition.setCreater("s");
        productAttribuitDefinition.setCreateTime(new Date());
        productAttribuitDefinition.setId("1");
        productAttribuitDefinition.setIsDelete(0);
        productAttribuitDefinition.setLastModificationTime(new Date());
        productAttribuitDefinition.setLastMondifier("w");

        productService.productAttribuitDefinitionSaveTest(productAttribuitDefinition);
    }

    /**
     * @author: guoxs
     * @date: 19/04/15 16:07
     * @since: JDK 1.8
     *
     * @description: 测试 ProductAttribuitValue 储存
     * @param: []
     * @return: void
     */
    @GetMapping("/productAttribuitValueSaveTest")
    public void productAttribuitValueSaveTest(){
        ProductAttribuitValue productAttribuitValue = new ProductAttribuitValue();

        productAttribuitValue.setProductAttribuitContent("!");
        productAttribuitValue.setProductAttribuitDefinitionCode("!");
        productAttribuitValue.setProductAttribuitValueCode("2");
        productAttribuitValue.setCreater("s");
        productAttribuitValue.setCreateTime(new Date());
        productAttribuitValue.setId("1");
        productAttribuitValue.setIsDelete(0);
        productAttribuitValue.setLastModificationTime(new Date());
        productAttribuitValue.setLastMondifier("w");

        productService.productAttribuitValueSaveTest(productAttribuitValue);
    }

    /**
     * @author: guoxs
     * @date: 19/04/15 16:08
     * @since: JDK 1.8
     *
     * @description: 测试 ProductInfo 储存
     * @param: []
     * @return: void
     */
    @GetMapping("/productInfoSaveTest")
    public void productInfoSaveTest(){
        ProductInfo productInfo = new ProductInfo();

        productInfo.setFinancialContent("1");
        productInfo.setFinancialCycle(new Date());
        productInfo.setFrozen(0);
        productInfo.setHaulCycle(1);
        productInfo.setHandleCode("12");
        productInfo.setIsShow(0);
        productInfo.setLogisticsContent("2");
        productInfo.setOldProductCode("!");
        productInfo.setProductCode("12");
        productInfo.setProductGroupCode("2");
        productInfo.setProductionContent("@");
        productInfo.setProductionCycle(2);
        productInfo.setProductName("@");
        productInfo.setPurchaseContent("@");
        productInfo.setPurchasePlanDays(2);
        productInfo.setQualityContent("@");
        productInfo.setQualityInspectionCycle(2);
        productInfo.setSaleContent("3");
        productInfo.setUnitCode("@");
        productInfo.setCreater("s");
        productInfo.setCreateTime(new Date());
        productInfo.setId("1");
        productInfo.setIsDelete(0);
        productInfo.setLastModificationTime(new Date());
        productInfo.setLastMondifier("w");

        productService.productInfoSaveTest(productInfo);
    }
}
