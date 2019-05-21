/**
 * Project Name: icpForCitln
 * File Name: PRICE_PURCHASE_PRODUCT_SUPPLIER_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 14:18
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.price.entity.PricePurchaseProductSupplier;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRICE_PURCHASE_PRODUCT_SUPPLIER_INSERT_TEST {

    /**
     * PRICE_PURCHASE_PRODUCT_SUPPLIER_INSERT_TEST  供应商产品价格表测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/21 14:19
     * @since: JDK 1.8
     *
     * @description: PRICE_PURCHASE_PRODUCT_SUPPLIER_INSERT_EXAMPLE  供应商产品价格表测试数据插入实例
     * @param:
     * @return:
     */

    @Test
    public void pricePurchaseproductSupplierInsertExample(){
        PricePurchaseProductSupplier pricePurchaseProductSupplier=new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier.setId("cx"+new ObjectId());
        pricePurchaseProductSupplier.setPricePurchaseProductSupplierCode("10000001");
        pricePurchaseProductSupplier.setSupplierInfoId("cx5cdd42d8abac563e18d9d567");
        pricePurchaseProductSupplier.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        pricePurchaseProductSupplier.setTaxRateId("J6");
        pricePurchaseProductSupplier.setTaxIncludedPrice(new BigDecimal("5.5"));
        pricePurchaseProductSupplier.setCurrencyId("CNY");
        pricePurchaseProductSupplier.setEach(100);
        pricePurchaseProductSupplier.setBasicUnitId("米");


        PricePurchaseProductSupplier pricePurchaseProductSupplier2=new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier2.setId("cx"+new ObjectId());
        pricePurchaseProductSupplier2.setPricePurchaseProductSupplierCode("10000002");
        pricePurchaseProductSupplier2.setSupplierInfoId("cx5cdd42d8abac563e18d9d567");
        pricePurchaseProductSupplier2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        pricePurchaseProductSupplier2.setTaxRateId("J6");
        pricePurchaseProductSupplier2.setTaxIncludedPrice(new BigDecimal("6.5"));
        pricePurchaseProductSupplier2.setCurrencyId("CNY");
        pricePurchaseProductSupplier2.setEach(100);
        pricePurchaseProductSupplier2.setBasicUnitId("米");


        PricePurchaseProductSupplier pricePurchaseProductSupplier3=new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier3.setId("cx"+new ObjectId());
        pricePurchaseProductSupplier3.setPricePurchaseProductSupplierCode("10000003");
        pricePurchaseProductSupplier3.setSupplierInfoId("cx5cdd42d8abac563e18d9d567");
        pricePurchaseProductSupplier3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        pricePurchaseProductSupplier3.setTaxRateId("J6");
        pricePurchaseProductSupplier3.setTaxIncludedPrice(new BigDecimal("7.5"));
        pricePurchaseProductSupplier3.setCurrencyId("CNY");
        pricePurchaseProductSupplier3.setEach(100);
        pricePurchaseProductSupplier3.setBasicUnitId("米");


        PricePurchaseProductSupplier pricePurchaseProductSupplier4=new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier4.setId("cx"+new ObjectId());
        pricePurchaseProductSupplier4.setPricePurchaseProductSupplierCode("10000004");
        pricePurchaseProductSupplier4.setSupplierInfoId("cx5cdd42d8abac563e18d9d568");
        pricePurchaseProductSupplier4.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        pricePurchaseProductSupplier4.setTaxRateId("J6");
        pricePurchaseProductSupplier4.setTaxIncludedPrice(new BigDecimal("5.8"));
        pricePurchaseProductSupplier4.setCurrencyId("CNY");
        pricePurchaseProductSupplier4.setEach(100);
        pricePurchaseProductSupplier4.setBasicUnitId("米");


        PricePurchaseProductSupplier pricePurchaseProductSupplier5=new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier5.setId("cx"+new ObjectId());
        pricePurchaseProductSupplier5.setPricePurchaseProductSupplierCode("10000005");
        pricePurchaseProductSupplier5.setSupplierInfoId("cx5cdd42d8abac563e18d9d568");
        pricePurchaseProductSupplier5.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        pricePurchaseProductSupplier5.setTaxRateId("J6");
        pricePurchaseProductSupplier5.setTaxIncludedPrice(new BigDecimal("6.8"));
        pricePurchaseProductSupplier5.setCurrencyId("CNY");
        pricePurchaseProductSupplier5.setEach(100);
        pricePurchaseProductSupplier5.setBasicUnitId("米");


        PricePurchaseProductSupplier pricePurchaseProductSupplier6=new PricePurchaseProductSupplier();
        pricePurchaseProductSupplier6.setId("cx"+new ObjectId());
        pricePurchaseProductSupplier6.setPricePurchaseProductSupplierCode("10000006");
        pricePurchaseProductSupplier6.setSupplierInfoId("cx5cdd42d8abac563e18d9d568");
        pricePurchaseProductSupplier6.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        pricePurchaseProductSupplier6.setTaxRateId("J6");
        pricePurchaseProductSupplier6.setTaxIncludedPrice(new BigDecimal("7.8"));
        pricePurchaseProductSupplier6.setCurrencyId("CNY");
        pricePurchaseProductSupplier6.setEach(100);
        pricePurchaseProductSupplier6.setBasicUnitId("米");


        MongoUtil.insert(pricePurchaseProductSupplier);

        MongoUtil.insert(pricePurchaseProductSupplier2);

        MongoUtil.insert(pricePurchaseProductSupplier3);

        MongoUtil.insert(pricePurchaseProductSupplier4);

        MongoUtil.insert(pricePurchaseProductSupplier5);

        MongoUtil.insert(pricePurchaseProductSupplier6);




    }


}
