/**
 * Project Name: icpForCitln
 * File Name: PLANNED_ORDER_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/22 9:31
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.DateUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.entity.PlannedOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PLANNED_ORDER_INSERT_TEST {


    /**
     * PLANNED_ORDER_INSERT_TEST  计划订单列表测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/22 9:32
     * @since: JDK 1.8
     *
     * @description:  PLANNED_ORDER_INSERT_EXAMPLE 计划订单列表测试数据插入实例
     * @param:
     * @return:
     */


    @Test
    public void plannedOrderInsertExample(){
        PlannedOrder plannedOrder=new PlannedOrder();
        plannedOrder.setId("cx5cdd42d8abac563e18d9d579");
        plannedOrder.setDocumentType(1);
        plannedOrder.setPlannedOrderCode("PL10000001");
        plannedOrder.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        plannedOrder.setOrderCreateTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrder.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:00 ","yyyy/MM/dd HH:mm:ss"));
        plannedOrder.setRemark("暂无");


        PlannedOrder plannedOrder2=new PlannedOrder();
        plannedOrder2.setId("cx5cdd42d8abac563e18d9d57a");
        plannedOrder2.setDocumentType(1);
        plannedOrder2.setPlannedOrderCode("PL10000002");
        plannedOrder2.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        plannedOrder2.setOrderCreateTime(DateUtil.stringToDate("2019/5/2","yyyy/MM/dd"));
        plannedOrder2.setCreateTime(DateUtil.stringToDate("2019/5/1 10:00:00 ","yyyy/MM/dd HH:mm:ss"));
        plannedOrder2.setRemark("暂无");


        PlannedOrder plannedOrder3=new PlannedOrder();
        plannedOrder3.setId("cx5cdd42d8abac563e18d9d57b");
        plannedOrder3.setDocumentType(1);
        plannedOrder3.setPlannedOrderCode("PL10000003");
        plannedOrder3.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        plannedOrder3.setOrderCreateTime(DateUtil.stringToDate("2019/4/30","yyyy/MM/dd"));
        plannedOrder3.setCreateTime(DateUtil.stringToDate("2019/5/1 11:00:00","yyyy/MM/dd HH:mm:ss"));
        plannedOrder3.setRemark("暂无");



        PlannedOrder plannedOrder4=new PlannedOrder();
        plannedOrder4.setId("cx5cdd42d8abac563e18d9d57c");
        plannedOrder4.setDocumentType(1);
        plannedOrder4.setPlannedOrderCode("PL10000004");
        plannedOrder4.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        plannedOrder4.setOrderCreateTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrder4.setCreateTime(DateUtil.stringToDate("2019/5/1 12:00:00","yyyy/MM/dd HH:mm:ss"));
        plannedOrder4.setRemark("暂无");



        PlannedOrder plannedOrder5=new PlannedOrder();
        plannedOrder5.setId("cx5cdd42d8abac563e18d9d57d");
        plannedOrder5.setDocumentType(1);
        plannedOrder5.setPlannedOrderCode("PL10000005");
        plannedOrder5.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        plannedOrder5.setOrderCreateTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrder5.setCreateTime(DateUtil.stringToDate("2019/5/1 13:00:00","yyyy/MM/dd HH:mm:ss"));
        plannedOrder5.setRemark("暂无");



        PlannedOrder plannedOrder6=new PlannedOrder();
        plannedOrder6.setId("cx5cdd42d8abac563e18d9d57e");
        plannedOrder6.setDocumentType(1);
        plannedOrder6.setPlannedOrderCode("PL10000006");
        plannedOrder6.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        plannedOrder6.setOrderCreateTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrder6.setCreateTime(DateUtil.stringToDate("2019/5/1 14:00:00","yyyy/MM/dd HH:mm:ss"));
        plannedOrder6.setRemark("暂无");


        MongoUtil.insert(plannedOrder);
        MongoUtil.insert(plannedOrder2);
        MongoUtil.insert(plannedOrder3);
        MongoUtil.insert(plannedOrder4);
        MongoUtil.insert(plannedOrder5);
        MongoUtil.insert(plannedOrder6);

    }



}
