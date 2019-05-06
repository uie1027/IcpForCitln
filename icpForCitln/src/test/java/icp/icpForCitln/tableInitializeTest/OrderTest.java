/**
 * Project Name: icpForCitln
 * File Name: OrderTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/04/29 14:33
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.order.entity.PurchaseOrderDetailInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.entity.SaleOrderDetilInfo;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {

    /**
     * @author: guoxs
     * @date: 19/04/29 14:41
     * @since: JDK 1.8
     *
     * @description: PurchaseOrderInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void PurchaseOrderInfoSaveTest(){
        PurchaseOrderInfo purchaseOrderInfo = new PurchaseOrderInfo();
        purchaseOrderInfo.setCompanyInfoId("2");
        purchaseOrderInfo.setCurrencyId("2");
        purchaseOrderInfo.setOrderTypeId("2");
        purchaseOrderInfo.setPayentMethodId("2");
        purchaseOrderInfo.setPurchaseContractCode("2");
        purchaseOrderInfo.setPurchaseOrderCode("2");
        purchaseOrderInfo.setPurchaseOrderStatus("2");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("222.2"));
        purchaseOrderInfo.setPurchaseOrderTitleRemarks("2");
        purchaseOrderInfo.setSupplieInfoId("2");
        MongoUtil.insert(purchaseOrderInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:41
     * @since: JDK 1.8
     *
     * @description: PurchaseOrderDetailInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void PurchaseOrderDetilInfoSaveTest(){
        PurchaseOrderDetailInfo purchaseOrderDetilInfo = new PurchaseOrderDetailInfo();

        purchaseOrderDetilInfo.setAgreementCode("2");
        purchaseOrderDetilInfo.setAgreementRowCode("2");
        purchaseOrderDetilInfo.setBasicUnitId("2");
        purchaseOrderDetilInfo.setDeliveryDate(new Date());
        purchaseOrderDetilInfo.setFactoryInfoId("2");
        purchaseOrderDetilInfo.setInventoryLocationInfoId("2");
        purchaseOrderDetilInfo.setProductInfoId("2");
        purchaseOrderDetilInfo.setPurchaseOrderInfoId("2");
        purchaseOrderDetilInfo.setPurchaseOrderRowCode("2");
        purchaseOrderDetilInfo.setQuantity(2.15);
        purchaseOrderDetilInfo.setUnitPrice(new BigDecimal("17.00"));

        MongoUtil.insert(purchaseOrderDetilInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:41
     * @since: JDK 1.8
     *
     * @description: SaleOrderInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void SaleOrderInfoSaveTest(){
        SaleOrderInfo saleOrderInfo = new SaleOrderInfo();

        saleOrderInfo.setCompanyInfoId("2");
        saleOrderInfo.setCustomerInfoId("2");
        saleOrderInfo.setCurrencyId("s");
        saleOrderInfo.setPayentMethodId("2");
        saleOrderInfo.setPurchaseContractCode("2");
        saleOrderInfo.setPurchaseOrderCode("2");
        saleOrderInfo.setPurchaseOrderStatus("2");
        saleOrderInfo.setPurchaseOrderTitleRemarks("2");

        MongoUtil.insert(saleOrderInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:41
     * @since: JDK 1.8
     *
     * @description: SaleOrderDetilInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void SaleOrderDetilInfoSaveTest(){
        SaleOrderDetilInfo saleOrderDetilInfo = new SaleOrderDetilInfo();

        saleOrderDetilInfo.setBasicUnitId("2");
        saleOrderDetilInfo.setDeliveryDate(new Date());
        saleOrderDetilInfo.setFactoryInfoId("2");
        saleOrderDetilInfo.setInventoryLocationInfoId("2");
        saleOrderDetilInfo.setProductContrastId("s");
        saleOrderDetilInfo.setProductInfoId("2");
        saleOrderDetilInfo.setPurchaseOrderInfoId("2");
        saleOrderDetilInfo.setPurchaseOrderRowCode("2");
        saleOrderDetilInfo.setSaleOrderQuantity(5.23);
        saleOrderDetilInfo.setTaxRateId("2");
        saleOrderDetilInfo.setUnitPrice(new BigDecimal("123.56"));

        MongoUtil.insert(saleOrderDetilInfo);
    }
}
