/**
 * Project Name: icpForCitln
 * File Name: PRODUCTION_CONFIRM_ORDER_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/22 13:26
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.DateUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.entity.ProductionConfirmOrder;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCTION_CONFIRM_ORDER_INSERT_TEST {

    /**
     * PRODUCTION_CONFIRM_ORDER_INSERT_TEST 生产完工确认表测试数据插入
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/22 13:28
     * @since: JDK 1.8
     *
     * @description: PRODUCTION_CONFIRM_ORDER_INSERT_TEST 生产完工确认表测试数据插入实例
     * @param:
     * @return:
     */

    @Test
    public void productionConfirmOrderInsertExample(){
        ProductionConfirmOrder productionConfirmOrder=new ProductionConfirmOrder();
        productionConfirmOrder.setId("cx"+new ObjectId());
        productionConfirmOrder.setProductionConfirmOrderCode("PC10000001");
        productionConfirmOrder.setDocumentTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionConfirmOrder.setProductionOrderId("cx5cdd42d8abac563e18d9d57f");
        productionConfirmOrder.setCompletionNumber(new BigDecimal("5000"));
        productionConfirmOrder.setCompletionTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionConfirmOrder.setRemarks("暂无");


        ProductionConfirmOrder productionConfirmOrder2=new ProductionConfirmOrder();
        productionConfirmOrder2.setId("cx"+new ObjectId());
        productionConfirmOrder2.setProductionConfirmOrderCode("PC10000002");
        productionConfirmOrder2.setDocumentTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionConfirmOrder2.setProductionOrderId("cx5cdd42d8abac563e18d9d580");
        productionConfirmOrder2.setCompletionNumber(new BigDecimal("5000"));
        productionConfirmOrder2.setCompletionTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionConfirmOrder2.setRemarks("暂无");


        ProductionConfirmOrder productionConfirmOrder3=new ProductionConfirmOrder();
        productionConfirmOrder3.setId("cx"+new ObjectId());
        productionConfirmOrder3.setProductionConfirmOrderCode("PC10000003");
        productionConfirmOrder3.setDocumentTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionConfirmOrder3.setProductionOrderId("cx5cdd42d8abac563e18d9d581");
        productionConfirmOrder3.setCompletionNumber(new BigDecimal("5000"));
        productionConfirmOrder3.setCompletionTime(DateUtil.stringToDate("2019/5/5","yyyy/MM/dd"));
        productionConfirmOrder3.setRemarks("暂无");


        ProductionConfirmOrder productionConfirmOrder4=new ProductionConfirmOrder();
        productionConfirmOrder4.setId("cx"+new ObjectId());
        productionConfirmOrder4.setProductionConfirmOrderCode("PC10000004");
        productionConfirmOrder4.setDocumentTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionConfirmOrder4.setProductionOrderId("cx5cdd42d8abac563e18d9d582");
        productionConfirmOrder4.setCompletionNumber(new BigDecimal("5000"));
        productionConfirmOrder4.setCompletionTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionConfirmOrder4.setRemarks("暂无");


        ProductionConfirmOrder productionConfirmOrder5=new ProductionConfirmOrder();
        productionConfirmOrder5.setId("cx"+new ObjectId());
        productionConfirmOrder5.setProductionConfirmOrderCode("PC10000005");
        productionConfirmOrder5.setDocumentTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionConfirmOrder5.setProductionOrderId("cx5cdd42d8abac563e18d9d583");
        productionConfirmOrder5.setCompletionNumber(new BigDecimal("5000"));
        productionConfirmOrder5.setCompletionTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionConfirmOrder5.setRemarks("暂无");


        ProductionConfirmOrder productionConfirmOrder6=new ProductionConfirmOrder();
        productionConfirmOrder6.setId("cx"+new ObjectId());
        productionConfirmOrder6.setProductionConfirmOrderCode("PC10000006");
        productionConfirmOrder6.setDocumentTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionConfirmOrder6.setProductionOrderId("cx5cdd42d8abac563e18d9d584");
        productionConfirmOrder6.setCompletionNumber(new BigDecimal("5000"));
        productionConfirmOrder6.setCompletionTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        productionConfirmOrder6.setRemarks("暂无");


        MongoUtil.insert(productionConfirmOrder);
        MongoUtil.insert(productionConfirmOrder5);
        MongoUtil.insert(productionConfirmOrder6);
        MongoUtil.insert(productionConfirmOrder2);
        MongoUtil.insert(productionConfirmOrder3);
        MongoUtil.insert(productionConfirmOrder4);


    }


}
