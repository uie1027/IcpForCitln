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
       for(int i=0;i<100;i++){
           PriceSaleCustomerProductGroup priceSaleCustomerProductGroup = new PriceSaleCustomerProductGroup();
           priceSaleCustomerProductGroup.setPriceSaleCustomerProductGroupCode(String.valueOf((int) (Math.random()*1000000)));
           priceSaleCustomerProductGroup.setCustomerInfoId("cx5cd1142837db1c3460b01355");
           priceSaleCustomerProductGroup.setProductGroupInfoId("cx5cce93c8ba4b7038b04a4ba4");
           priceSaleCustomerProductGroup.setTaxRateId("进项税 17% 中国");
           priceSaleCustomerProductGroup.setTaxIncludedPrice(new BigDecimal(String.valueOf(18.8+i)));
           priceSaleCustomerProductGroup.setCurrencyId("￥");
           priceSaleCustomerProductGroup.setEach(100);
           priceSaleCustomerProductGroup.setBasicUnitId("米");
           MongoUtil.insert(priceSaleCustomerProductGroup);
       }
    }

    @Test
    public void   PriceSaleCustomerProductSave(){
        for(int i = 0; i <100 ; i++){
            PriceSaleCustomerProduct priceSaleCustomerProduct = new PriceSaleCustomerProduct();
            priceSaleCustomerProduct.setPriceSaleCustomerProductCode(String.valueOf((int) (Math.random()*1000000)));
            priceSaleCustomerProduct.setCustomerInfoId("cx5cd1142837db1c3460b01355");
            priceSaleCustomerProduct.setProductInfoId("cx5cd0eb46abac560cb41e7476");
            priceSaleCustomerProduct.setTaxRateId("进项税 17% 中国");
            priceSaleCustomerProduct.setTaxIncludedPrice(new BigDecimal(String.valueOf(18.8+i)));
            priceSaleCustomerProduct.setCurrencyId("￥");
            priceSaleCustomerProduct.setEach(100);
            priceSaleCustomerProduct.setBasicUnitId("米");
            MongoUtil.insert(priceSaleCustomerProduct);
        }
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
