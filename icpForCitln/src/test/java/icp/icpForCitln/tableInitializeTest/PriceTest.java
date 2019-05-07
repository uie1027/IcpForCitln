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
        for(int i = 0; i <100 ;i++){
            PriceSaleProduct priceSaleProduct = new PriceSaleProduct();
            priceSaleProduct.setPriceSaleProductCode(String.valueOf((int) (Math.random()*1000000)));
            priceSaleProduct.setProductInfoId("cx5ccff39617ca8f33c0db2859");
            priceSaleProduct.setTaxRateId("进项税 17% 中国");
            priceSaleProduct.setTaxIncludedPrice(new BigDecimal(String.valueOf(18.8+i)));
            priceSaleProduct.setCurrencyId("￥");
            priceSaleProduct.setEach(100);
            priceSaleProduct.setBasicUnitId("米");
            MongoUtil.insert(priceSaleProduct);
        }

    }
    @Test
    public void   PriceSaleProductGroupSave(){
        for(int i = 0; i <100 ;i++) {
            PriceSaleProductGroup priceSaleProductGroup = new PriceSaleProductGroup();
            priceSaleProductGroup.setPriceSaleProductGroupCode(String.valueOf((int) (Math.random()*1000000)));
            priceSaleProductGroup.setProductGroupInfoId("cx5cce93c8ba4b7038b04a4ba4");
            priceSaleProductGroup.setTaxRateId("进项税 17% 中国");
            priceSaleProductGroup.setTaxIncludedPrice(new BigDecimal(String.valueOf(18.8+i)));
            priceSaleProductGroup.setCurrencyId("￥");
            priceSaleProductGroup.setEach(100);
            priceSaleProductGroup.setBasicUnitId("米");
            MongoUtil.insert(priceSaleProductGroup);
        }
    }
    @Test
    public void   PriceSaleCustomerProductGroupSave(){
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup.setPriceSaleCustomerProductGroupCode("");
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
        for(int i = 0 ; i <1000 ; i++){
            PricePurchaseProductSupplier pricePurchaseProductSupplier = new PricePurchaseProductSupplier();
            pricePurchaseProductSupplier.setPricePurchaseProductSupplierCode(
                    String.valueOf((int)(Math.random()*1000)));
            pricePurchaseProductSupplier.setSupplierInfoId("cx5ccff31217ca8f17a0f85e4d");
            pricePurchaseProductSupplier.setProductInfoId("cx5ccff39617ca8f33c0db2859");
            pricePurchaseProductSupplier.setTaxRateId("123");
            pricePurchaseProductSupplier.setTaxIncludedPrice(new BigDecimal("12.2"));
            pricePurchaseProductSupplier.setCurrencyId("123");
            pricePurchaseProductSupplier.setEach(100);
            pricePurchaseProductSupplier.setBasicUnitId("123");
            MongoUtil.insert(pricePurchaseProductSupplier);
        }
    }
}
