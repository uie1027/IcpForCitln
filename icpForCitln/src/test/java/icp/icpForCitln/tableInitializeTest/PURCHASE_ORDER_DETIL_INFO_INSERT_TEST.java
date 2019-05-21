/**
 * Project Name: icpForCitln
 * File Name: PURCHASE_ORDER_DETIL_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 14:48
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.order.entity.PurchaseOrderDetailInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PURCHASE_ORDER_DETIL_INFO_INSERT_TEST {

    /**
     * PURCHASE_ORDER_DETIL_INFO_INSERT_TEST  采购订单详情表测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/21 14:49
     * @since: JDK 1.8
     *
     * @description: PURCHASE_ORDER_DETIL_INFO_INSERT_EXAMPLE  采购订单详情表测试数据插入实例
     * @param:
     * @return:
     */

    @Test
    public void PurchaseOrderDetilInfoInsertExample(){
        PurchaseOrderDetailInfo purchaseOrderDetailInfo=new PurchaseOrderDetailInfo();
        purchaseOrderDetailInfo.setId("cx5cdd42d8abac563e18d9d597");
        purchaseOrderDetailInfo.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderDetailInfo.setPurchaseOrderRowCode("0001");
        purchaseOrderDetailInfo.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        purchaseOrderDetailInfo.setUnitPrice(new BigDecimal("5.5"));
        purchaseOrderDetailInfo.setQuantity(100000.0);
        purchaseOrderDetailInfo.setBasicUnitId("米");
        purchaseOrderDetailInfo.setAmount(new BigDecimal("5500"));
        purchaseOrderDetailInfo.setAgreementCode("暂无");
        purchaseOrderDetailInfo.setAgreementRowCode("暂无");
        purchaseOrderDetailInfo.setDeliveryDate(new Date("2019/5/10"));
        purchaseOrderDetailInfo.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        purchaseOrderDetailInfo.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        PurchaseOrderDetailInfo purchaseOrderDetailInfo2=new PurchaseOrderDetailInfo();
        purchaseOrderDetailInfo2.setId("cx5cdd42d8abac563e18d9d598");
        purchaseOrderDetailInfo2.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderDetailInfo2.setPurchaseOrderRowCode("0002");
        purchaseOrderDetailInfo2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        purchaseOrderDetailInfo2.setUnitPrice(new BigDecimal("6.5"));
        purchaseOrderDetailInfo2.setQuantity(100000.0);
        purchaseOrderDetailInfo2.setBasicUnitId("米");
        purchaseOrderDetailInfo2.setAmount(new BigDecimal("6500"));
        purchaseOrderDetailInfo2.setAgreementCode("暂无");
        purchaseOrderDetailInfo2.setAgreementRowCode("暂无");
        purchaseOrderDetailInfo2.setDeliveryDate(new Date("2019/5/10"));
        purchaseOrderDetailInfo2.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        purchaseOrderDetailInfo2.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");


        PurchaseOrderDetailInfo purchaseOrderDetailInfo3=new PurchaseOrderDetailInfo();
        purchaseOrderDetailInfo3.setId("cx5cdd42d8abac563e18d9d599");
        purchaseOrderDetailInfo3.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderDetailInfo3.setPurchaseOrderRowCode("0003");
        purchaseOrderDetailInfo3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        purchaseOrderDetailInfo3.setUnitPrice(new BigDecimal("7.5"));
        purchaseOrderDetailInfo3.setQuantity(100000.0);
        purchaseOrderDetailInfo3.setBasicUnitId("米");
        purchaseOrderDetailInfo3.setAmount(new BigDecimal("7500"));
        purchaseOrderDetailInfo3.setAgreementCode("");
        purchaseOrderDetailInfo3.setAgreementRowCode("");
        purchaseOrderDetailInfo3.setDeliveryDate(new Date("2019/5/10"));
        purchaseOrderDetailInfo3.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        purchaseOrderDetailInfo3.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");


        PurchaseOrderDetailInfo purchaseOrderDetailInfo4=new PurchaseOrderDetailInfo();
        purchaseOrderDetailInfo4.setId("cx5cdd42d8abac563e18d9d59a");
        purchaseOrderDetailInfo4.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderDetailInfo4.setPurchaseOrderRowCode("0004");
        purchaseOrderDetailInfo4.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        purchaseOrderDetailInfo4.setUnitPrice(new BigDecimal("8.5"));
        purchaseOrderDetailInfo4.setQuantity(100000.0);
        purchaseOrderDetailInfo4.setBasicUnitId("米");
        purchaseOrderDetailInfo4.setAmount(new BigDecimal("8500"));
        purchaseOrderDetailInfo4.setAgreementCode("暂无");
        purchaseOrderDetailInfo4.setAgreementRowCode("暂无");
        purchaseOrderDetailInfo4.setDeliveryDate(new Date("2019/5/10"));
        purchaseOrderDetailInfo4.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        purchaseOrderDetailInfo4.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");


        PurchaseOrderDetailInfo purchaseOrderDetailInfo5=new PurchaseOrderDetailInfo();
        purchaseOrderDetailInfo5.setId("cx5cdd42d8abac563e18d9d59b");
        purchaseOrderDetailInfo5.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderDetailInfo5.setPurchaseOrderRowCode("0005");
        purchaseOrderDetailInfo5.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        purchaseOrderDetailInfo5.setUnitPrice(new BigDecimal("9.5"));
        purchaseOrderDetailInfo5.setQuantity(100000.0);
        purchaseOrderDetailInfo5.setBasicUnitId("米");
        purchaseOrderDetailInfo5.setAmount(new BigDecimal("9500"));
        purchaseOrderDetailInfo5.setAgreementCode("暂无");
        purchaseOrderDetailInfo5.setAgreementRowCode("暂无");
        purchaseOrderDetailInfo5.setDeliveryDate(new Date("2019/5/10"));
        purchaseOrderDetailInfo5.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        purchaseOrderDetailInfo5.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");


        PurchaseOrderDetailInfo purchaseOrderDetailInfo6=new PurchaseOrderDetailInfo();
        purchaseOrderDetailInfo6.setId("cx5cdd42d8abac563e18d9d59c");
        purchaseOrderDetailInfo6.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderDetailInfo6.setPurchaseOrderRowCode("0006");
        purchaseOrderDetailInfo6.setProductInfoId("cx5cdd42d8abac563e18d9d562");
        purchaseOrderDetailInfo6.setUnitPrice(new BigDecimal("10.5"));
        purchaseOrderDetailInfo6.setQuantity(100000.0);
        purchaseOrderDetailInfo6.setBasicUnitId("米");
        purchaseOrderDetailInfo6.setAmount(new BigDecimal("10500"));
        purchaseOrderDetailInfo6.setAgreementCode("暂无");
        purchaseOrderDetailInfo6.setAgreementRowCode("暂无");
        purchaseOrderDetailInfo6.setDeliveryDate(new Date("2019/5/10"));
        purchaseOrderDetailInfo6.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        purchaseOrderDetailInfo6.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        MongoUtil.insert(purchaseOrderDetailInfo);
        MongoUtil.insert(purchaseOrderDetailInfo2);
        MongoUtil.insert(purchaseOrderDetailInfo3);
        MongoUtil.insert(purchaseOrderDetailInfo4);
        MongoUtil.insert(purchaseOrderDetailInfo5);
        MongoUtil.insert(purchaseOrderDetailInfo6);


    }


}
