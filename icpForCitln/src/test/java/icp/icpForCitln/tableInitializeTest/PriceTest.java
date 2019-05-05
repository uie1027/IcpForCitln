/**
 * Project Name: icpForCitln
 * File Name: PriceTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/4/30 10:37
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.price.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceTest {

    @Test
    public void   PriceSaleProductSave(){
        PriceSaleProduct priceSaleProduct = new PriceSaleProduct();
        priceSaleProduct.setPriceSaleProductCode("123");
        priceSaleProduct.setProductInfoId("456");
        priceSaleProduct.setTaxRateId("789");
        priceSaleProduct.setTaxIncludedPrice(new BigDecimal("18.8"));
        priceSaleProduct.setCurrencyId("321");
        priceSaleProduct.setEach(100);
        priceSaleProduct.setBasicUnitId("A001");
        MongoUtil.insert(priceSaleProduct);
    }
    @Test
    public void   PriceSaleProductGroupSave(){
        PriceSaleProductGroup priceSaleProductGroup =  new PriceSaleProductGroup();
        priceSaleProductGroup.setPriceSaleProductGroupCode("123");
        priceSaleProductGroup.setProductGroupInfoId("123");
        priceSaleProductGroup.setTaxRateId("123");
        priceSaleProductGroup.setTaxIncludedPrice(new BigDecimal("18.8"));
        priceSaleProductGroup.setCurrencyId("123");
        priceSaleProductGroup.setEach(100);
        priceSaleProductGroup.setBasicUnitId("123");
        MongoUtil.insert(priceSaleProductGroup);
    }
    @Test
    public void   PriceSaleCustomerProductGroupSave(){
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup.setPriceSaleCustomerProductGroupCode("123");
        priceSaleCustomerProductGroup.setCustomerInfoId("123");
        priceSaleCustomerProductGroup.setProductGroupInfoId("123");
        priceSaleCustomerProductGroup.setTaxRateId("123");
        priceSaleCustomerProductGroup.setTaxIncludedPrice(new BigDecimal("18.8"));
        priceSaleCustomerProductGroup.setCurrencyId("123");
        priceSaleCustomerProductGroup.setEach(100);
        priceSaleCustomerProductGroup.setBasicUnitId("123");
        MongoUtil.insert(priceSaleCustomerProductGroup);
    }
    @Test
    public void   PriceSaleCustomerProductSave(){
        PriceSaleCustomerProduct priceSaleCustomerProduct = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct.setPriceSaleCustomerProductCode("123");
        priceSaleCustomerProduct.setCustomerInfoId("");
        priceSaleCustomerProduct.setProductInfoId("123");
        priceSaleCustomerProduct.setTaxRateId("123");
        priceSaleCustomerProduct.setTaxIncludedPrice(new BigDecimal("12.2"));
        priceSaleCustomerProduct.setCurrencyId("123");
        priceSaleCustomerProduct.setEach(100);
        priceSaleCustomerProduct.setBasicUnitId("123");
        MongoUtil.insert(priceSaleCustomerProduct);
    }
    @Test
    public void   PricePurchaseProductSupplierSave(){
        PricePurchaseProductSupplier pricePurchaseProductSupplier = new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier.setPricePurchaseProductSupplierCode("123");
        pricePurchaseProductSupplier.setSupplierInfoId("123");
        pricePurchaseProductSupplier.setProductInfoId("123");
        pricePurchaseProductSupplier.setTaxRateId("123");
        pricePurchaseProductSupplier.setTaxIncludedPrice(new BigDecimal("12.2"));
        pricePurchaseProductSupplier.setCurrencyId("123");
        pricePurchaseProductSupplier.setEach(100);
        pricePurchaseProductSupplier.setBasicUnitId("123");
        MongoUtil.insert(pricePurchaseProductSupplier);
    }
}
