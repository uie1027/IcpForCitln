/**
 * Project Name: icpForCitln
 * File Name: PRODUCTION_ORDER_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/22 10:59
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.DateUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.entity.ProductionOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCTION_ORDER_INSERT_TEST {
    /**
     * PRODUCTION_ORDER_INSERT_TEST 生产订单列表测试数据插入
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/22 11:00
     * @since: JDK 1.8
     *
     * @description: PRODUCTION_ORDER_INSERT_TEST 生产订单列表测试数据插入
     * @param:
     * @return:
     */



    @Test
    public void ProductionOrderInsertExample(){
        ProductionOrder productionOrder=new ProductionOrder();
        productionOrder.setId("cx5cdd42d8abac563e18d9d57f");
        productionOrder.setProductionOrderType("标准订单");
        productionOrder.setProductionOrderCode("PD10000001");
        productionOrder.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionOrder.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        productionOrder.setPlannedOrderDetailId("cx5cdd42d8abac563e18d9d585");
        productionOrder.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        productionOrder.setProductionNumber(new BigDecimal("5000"));
        productionOrder.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        productionOrder.setStartTime(DateUtil.stringToDate("2019/5/2","yyyy/MM/dd"));
        productionOrder.setEndTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionOrder.setCreateTime(DateUtil.stringToDate("2019/5/2 9:00:00","yyyy/MM/dd HH:mm:ss"));
        productionOrder.setRemark("暂无");


        ProductionOrder productionOrder2=new ProductionOrder();
        productionOrder2.setId("cx5cdd42d8abac563e18d9d580");
        productionOrder2.setProductionOrderType("标准订单");
        productionOrder2.setProductionOrderCode("PD10000002");
        productionOrder2.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionOrder2.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        productionOrder2.setPlannedOrderDetailId("cx5cdd42d8abac563e18d9d586");
        productionOrder2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        productionOrder2.setProductionNumber(new BigDecimal("5000"));
        productionOrder2.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        productionOrder2.setStartTime(DateUtil.stringToDate("2019/5/2","yyyy/MM/dd"));
        productionOrder2.setEndTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionOrder.setCreateTime(DateUtil.stringToDate("2019/5/2 9:05:00","yyyy/MM/dd HH:mm:ss"));
        productionOrder2.setRemark("暂无");



        ProductionOrder productionOrder3=new ProductionOrder();
        productionOrder3.setId("cx5cdd42d8abac563e18d9d581");
        productionOrder3.setProductionOrderType("标准订单");
        productionOrder3.setProductionOrderCode("PD10000003");
        productionOrder3.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionOrder3.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        productionOrder3.setPlannedOrderDetailId("cx5cdd42d8abac563e18d9d587");
        productionOrder3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        productionOrder3.setProductionNumber(new BigDecimal("5000"));
        productionOrder3.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        productionOrder3.setStartTime(DateUtil.stringToDate("2019/5/2","yyyy/MM/dd"));
        productionOrder3.setEndTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionOrder.setCreateTime(DateUtil.stringToDate("2019/5/2 9:10:00","yyyy/MM/dd HH:mm:ss"));
        productionOrder3.setRemark("暂无");



        ProductionOrder productionOrder4=new ProductionOrder();
        productionOrder4.setId("cx5cdd42d8abac563e18d9d582");
        productionOrder4.setProductionOrderType("标准订单");
        productionOrder4.setProductionOrderCode("PD10000004");
        productionOrder4.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionOrder4.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        productionOrder4.setPlannedOrderDetailId("cx5cdd42d8abac563e18d9d585");
        productionOrder4.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        productionOrder4.setProductionNumber(new BigDecimal("5000"));
        productionOrder4.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        productionOrder4.setStartTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionOrder4.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionOrder.setCreateTime(DateUtil.stringToDate("2019/5/2 9:15:00","yyyy/MM/dd HH:mm:ss"));
        productionOrder4.setRemark("暂无");



        ProductionOrder productionOrder5=new ProductionOrder();
        productionOrder5.setId("cx5cdd42d8abac563e18d9d583");
        productionOrder5.setProductionOrderType("标准订单");
        productionOrder5.setProductionOrderCode("PD10000005");
        productionOrder5.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionOrder5.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        productionOrder5.setPlannedOrderDetailId("cx5cdd42d8abac563e18d9d586");
        productionOrder5.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        productionOrder5.setProductionNumber(new BigDecimal("5000"));
        productionOrder5.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        productionOrder5.setStartTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionOrder5.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionOrder.setCreateTime(DateUtil.stringToDate("2019/5/2 9:20:00","yyyy/MM/dd HH:mm:ss"));
        productionOrder5.setRemark("暂无");



        ProductionOrder productionOrder6=new ProductionOrder();
        productionOrder6.setId("cx5cdd42d8abac563e18d9d584");
        productionOrder6.setProductionOrderType("标准订单");
        productionOrder6.setProductionOrderCode("PD10000006");
        productionOrder6.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionOrder6.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        productionOrder6.setPlannedOrderDetailId("cx5cdd42d8abac563e18d9d587");
        productionOrder6.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        productionOrder6.setProductionNumber(new BigDecimal("5000"));
        productionOrder6.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        productionOrder6.setStartTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionOrder6.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionOrder.setCreateTime(DateUtil.stringToDate("2019/5/2 9:25:00","yyyy/MM/dd HH:mm:ss"));
        productionOrder6.setRemark("暂无");


        MongoUtil.insert(productionOrder);
        MongoUtil.insert(productionOrder2);
        MongoUtil.insert(productionOrder3);
        MongoUtil.insert(productionOrder4);
        MongoUtil.insert(productionOrder5);
        MongoUtil.insert(productionOrder6);
    }
}
