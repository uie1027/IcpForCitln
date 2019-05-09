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
       for(int i = 0 ; i <100 ; i++){
           PurchaseOrderInfo purchaseOrderInfo = new PurchaseOrderInfo();
           purchaseOrderInfo.setOrderOriginId("线下订单");
           purchaseOrderInfo.setOrderTypeId("标准订单");   //订单类型
           purchaseOrderInfo.setCompanyInfoId("2");  //公司ID
           purchaseOrderInfo.setCurrencyId("￥"); //币种
           purchaseOrderInfo.setPayentMethodId("2");    //付款方式
           purchaseOrderInfo.setPurchaseOrderCode(String.valueOf((int)(i+ Math.random()*1000))); //采购订单编号
           purchaseOrderInfo.setPurchaseContractCode(purchaseOrderInfo.getPurchaseOrderCode());  //采购合同编号
           purchaseOrderInfo.setPurchaseOrderStatus("已确认");   //订单状态
           purchaseOrderInfo.setPurchaseOrderTitleRemarks("订单备注"); //订单备注
           purchaseOrderInfo.setSupplierInfoId("cx5ccff31217ca8f17a0f85e4d");    //供应商ID
           MongoUtil.insert(purchaseOrderInfo);
       }
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
//        for(int i = 0 ; i < 100 ;i++){
            SaleOrderInfo saleOrderInfo = new SaleOrderInfo();
            saleOrderInfo.setOrderOriginId("商城订单");
            saleOrderInfo.setOrderTypeId("非标准订单");
            saleOrderInfo.setSaleOrderCode(String.valueOf((int)(Math.random()*1000000)));
            saleOrderInfo.setCustomerInfoId("cx5cd1142837db1c3460b01355");
            saleOrderInfo.setCompanyInfoId("AAA");
            saleOrderInfo.setCurrencyId("￥");
            saleOrderInfo.setPayentMethodId("现金");
            saleOrderInfo.setSaleContractCode("A12346789");
            saleOrderInfo.setSaleOrderStatus("已确认");
            saleOrderInfo.setSaleOrderTitleRemarks("备注");
            MongoUtil.insert(saleOrderInfo);
//        }
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
        saleOrderDetilInfo.setSaleOrderInfoId("2");
        saleOrderDetilInfo.setSaleOrderRowCode("2");
        saleOrderDetilInfo.setSaleOrderQuantity(5.23);
        saleOrderDetilInfo.setTaxRateId("2");
        saleOrderDetilInfo.setUnitPrice(new BigDecimal("123.56"));
        MongoUtil.insert(saleOrderDetilInfo);
    }
}
