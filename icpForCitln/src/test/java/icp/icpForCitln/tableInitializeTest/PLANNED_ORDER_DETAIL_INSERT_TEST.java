/**
 * Project Name: icpForCitln
 * File Name: PLANNED_ORDER_DETAIL_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/22 10:29
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.DateUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.entity.PlannedOrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PLANNED_ORDER_DETAIL_INSERT_TEST {

    /**
     * PLANNED_ORDER_DETAIL_INSERT_EXAMPLE 计划订单详情表测试数据插入
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/22 10:30
     * @since: JDK 1.8
     *
     * @description: PLANNED_ORDER_DETAIL_INSERT_EXAMPLE 计划订单详情表测试数据插入实例
     * @param:
     * @return:
     */

    @Test
    public void plannedOrderDetailInsertExample(){
        PlannedOrderDetail plannedOrderDetail=new PlannedOrderDetail();
        plannedOrderDetail.setId("cx5cdd42d8abac563e18d9d585");
        plannedOrderDetail.setPlannedOrderDetailCode("0001");
        plannedOrderDetail.setPlannedOrderId("cx5cdd42d8abac563e18d9d579");
        plannedOrderDetail.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        plannedOrderDetail.setOrderQuantity(new BigDecimal("100000"));
        plannedOrderDetail.setStartTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrderDetail.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        plannedOrderDetail.setFactoryId("cx5cdd42d8abac563e18d9d5b");
        plannedOrderDetail.setOrderStatus(2);
        plannedOrderDetail.setRemark("暂无");
        plannedOrderDetail.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:00","yyyy/MM/dd HH:mm:ss"));
        plannedOrderDetail.setLastModificationTime(DateUtil.stringToDate("2019/5/2 9:00:00","yyyy/MM/dd HH:mm:ss"));



        PlannedOrderDetail plannedOrderDetail2=new PlannedOrderDetail();
        plannedOrderDetail2.setId("cx5cdd42d8abac563e18d9d586");
        plannedOrderDetail2.setPlannedOrderDetailCode("0002");
        plannedOrderDetail2.setPlannedOrderId("cx5cdd42d8abac563e18d9d57a");
        plannedOrderDetail2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        plannedOrderDetail2.setOrderQuantity(new BigDecimal("100000"));
        plannedOrderDetail2.setStartTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrderDetail2.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        plannedOrderDetail2.setFactoryId("cx5cdd42d8abac563e18d9d5c");
        plannedOrderDetail2.setOrderStatus(2);
        plannedOrderDetail2.setRemark("暂无");
        plannedOrderDetail2.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:10","yyyy/MM/dd HH:mm:ss"));
        plannedOrderDetail2.setLastModificationTime(DateUtil.stringToDate("2019/5/2 9:05:00","yyyy/MM/dd HH:mm:ss"));



        PlannedOrderDetail plannedOrderDetail3=new PlannedOrderDetail();
        plannedOrderDetail3.setId("cx5cdd42d8abac563e18d9d587");
        plannedOrderDetail3.setPlannedOrderDetailCode("0003");
        plannedOrderDetail3.setPlannedOrderId("cx5cdd42d8abac563e18d9d57b");
        plannedOrderDetail3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        plannedOrderDetail3.setOrderQuantity(new BigDecimal("100000"));
        plannedOrderDetail3.setStartTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrderDetail3.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        plannedOrderDetail3.setFactoryId("cx5cdd42d8abac563e18d9d5c");
        plannedOrderDetail3.setOrderStatus(2);
        plannedOrderDetail3.setRemark("暂无");
        plannedOrderDetail3.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:20","yyyy/MM/dd HH:mm:ss"));
        plannedOrderDetail3.setLastModificationTime(DateUtil.stringToDate("2019/5/2 9:10:00","yyyy/MM/dd HH:mm:ss"));



        PlannedOrderDetail plannedOrderDetail4=new PlannedOrderDetail();
        plannedOrderDetail4.setId("cx5cdd42d8abac563e18d9d588");
        plannedOrderDetail4.setPlannedOrderDetailCode("0004");
        plannedOrderDetail4.setPlannedOrderId("cx5cdd42d8abac563e18d9d57c");
        plannedOrderDetail4.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        plannedOrderDetail4.setOrderQuantity(new BigDecimal("100000"));
        plannedOrderDetail4.setStartTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrderDetail4.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        plannedOrderDetail4.setFactoryId("cx5cdd42d8abac563e18d9d5b");
        plannedOrderDetail4.setOrderStatus(3);
        plannedOrderDetail4.setRemark("暂无");
        plannedOrderDetail4.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:30","yyyy/MM/dd HH:mm:ss"));
        plannedOrderDetail4.setLastModificationTime(DateUtil.stringToDate("2019/5/1 9:10:00","yyyy/MM/dd HH:mm:ss"));




        PlannedOrderDetail plannedOrderDetail5=new PlannedOrderDetail();
        plannedOrderDetail5.setId("cx5cdd42d8abac563e18d9d589");
        plannedOrderDetail5.setPlannedOrderDetailCode("0005");
        plannedOrderDetail5.setPlannedOrderId("cx5cdd42d8abac563e18d9d57d");
        plannedOrderDetail5.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        plannedOrderDetail5.setOrderQuantity(new BigDecimal("100000"));
        plannedOrderDetail5.setStartTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrderDetail5.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        plannedOrderDetail5.setFactoryId("cx5cdd42d8abac563e18d9d5b");
        plannedOrderDetail5.setOrderStatus(1);
        plannedOrderDetail5.setRemark("暂无");
        plannedOrderDetail5.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:40","yyyy/MM/dd HH:mm:ss"));
        //plannedOrderDetail5.setLastModificationTime(DateUtil.stringToDate("2019/5/2 9:00:00","yyyy/MM/dd HH:mm:ss"));



        PlannedOrderDetail plannedOrderDetail6=new PlannedOrderDetail();
        plannedOrderDetail6.setId("cx5cdd42d8abac563e18d9d58a");
        plannedOrderDetail6.setPlannedOrderDetailCode("0006");
        plannedOrderDetail6.setPlannedOrderId("cx5cdd42d8abac563e18d9d57e");
        plannedOrderDetail6.setProductInfoId("cx5cdd42d8abac563e18d9d562");
        plannedOrderDetail6.setOrderQuantity(new BigDecimal("100000"));
        plannedOrderDetail6.setStartTime(DateUtil.stringToDate("2019/5/1","yyyy/MM/dd"));
        plannedOrderDetail6.setEndTime(DateUtil.stringToDate("2019/5/10","yyyy/MM/dd"));
        plannedOrderDetail6.setFactoryId("cx5cdd42d8abac563e18d9d5b");
        plannedOrderDetail6.setOrderStatus(1);
        plannedOrderDetail6.setRemark("暂无");
        plannedOrderDetail6.setCreateTime(DateUtil.stringToDate("2019/5/1 9:00:50","yyyy/MM/dd HH:mm:ss"));
        //plannedOrderDetail6.setLastModificationTime(DateUtil.stringToDate("2019/5/2 9:00:00","yyyy/MM/dd HH:mm:ss"));

        MongoUtil.insert(plannedOrderDetail);
        MongoUtil.insert(plannedOrderDetail2);
        MongoUtil.insert(plannedOrderDetail3);
        MongoUtil.insert(plannedOrderDetail4);
        MongoUtil.insert(plannedOrderDetail5);
        MongoUtil.insert(plannedOrderDetail6);


    }


}
