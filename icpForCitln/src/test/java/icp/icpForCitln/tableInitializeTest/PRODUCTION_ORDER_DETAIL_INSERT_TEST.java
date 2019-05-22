/**
 * Project Name: icpForCitln
 * File Name: PRODUCTION_ORDER_DETAIL_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/22 13:05
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.entity.ProductionOrderDetail;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PRODUCTION_ORDER_DETAIL_INSERT_TEST {

    /**
     * PRODUCTION_ORDER_DETAIL_INSERT_TEST  生产订单详情表测试数据插入
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/22 13:06
     * @since: JDK 1.8
     *
     * @description: PRODUCTION_ORDER_DETAIL_INSERT_TEST  生产订单详情表测试数据插入实例
     * @param:
     * @return:
     */

    @Test
    public void productionOrderDtailInsertExample(){
        ProductionOrderDetail productionOrderDetail=new ProductionOrderDetail();
        productionOrderDetail.setId("cx"+new ObjectId());
        productionOrderDetail.setProductionOrderDetailCode("0001");
        productionOrderDetail.setProductionOrderId("cx5cdd42d8abac563e18d9d57f");
        productionOrderDetail.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        productionOrderDetail.setSaleOrderDetailInfoId("cx5cdd42d8abac563e18d9d58b");
        productionOrderDetail.setRemark("暂无");


        ProductionOrderDetail productionOrderDetail2=new ProductionOrderDetail();
        productionOrderDetail2.setId("cx"+new ObjectId());
        productionOrderDetail2.setProductionOrderDetailCode("0002");
        productionOrderDetail2.setProductionOrderId("cx5cdd42d8abac563e18d9d580");
        productionOrderDetail2.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d574");
        productionOrderDetail2.setSaleOrderDetailInfoId("cx5cdd42d8abac563e18d9d58b");
        productionOrderDetail2.setRemark("暂无");


        ProductionOrderDetail productionOrderDetail3=new ProductionOrderDetail();
        productionOrderDetail3.setId("cx"+new ObjectId());
        productionOrderDetail3.setProductionOrderDetailCode("0003");
        productionOrderDetail3.setProductionOrderId("cx5cdd42d8abac563e18d9d581");
        productionOrderDetail3.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d575");
        productionOrderDetail3.setSaleOrderDetailInfoId("cx5cdd42d8abac563e18d9d58b");
        productionOrderDetail3.setRemark("暂无");



        ProductionOrderDetail productionOrderDetail4=new ProductionOrderDetail();
        productionOrderDetail4.setId("cx"+new ObjectId());
        productionOrderDetail4.setProductionOrderDetailCode("0001");
        productionOrderDetail4.setProductionOrderId("cx5cdd42d8abac563e18d9d582");
        productionOrderDetail4.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        productionOrderDetail4.setSaleOrderDetailInfoId("cx5cdd42d8abac563e18d9d58c");
        productionOrderDetail4.setRemark("暂无");


        ProductionOrderDetail productionOrderDetail5=new ProductionOrderDetail();
        productionOrderDetail5.setId("cx"+new ObjectId());
        productionOrderDetail5.setProductionOrderDetailCode("0002");
        productionOrderDetail5.setProductionOrderId("cx5cdd42d8abac563e18d9d583");
        productionOrderDetail5.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d574");
        productionOrderDetail5.setSaleOrderDetailInfoId("cx5cdd42d8abac563e18d9d58c");
        productionOrderDetail5.setRemark("暂无");


        ProductionOrderDetail productionOrderDetail6=new ProductionOrderDetail();
        productionOrderDetail6.setId("cx"+new ObjectId());
        productionOrderDetail6.setProductionOrderDetailCode("0003");
        productionOrderDetail6.setProductionOrderId("cx5cdd42d8abac563e18d9d584");
        productionOrderDetail6.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d575");
        productionOrderDetail6.setSaleOrderDetailInfoId("cx5cdd42d8abac563e18d9d58c");
        productionOrderDetail6.setRemark("暂无");

        MongoUtil.insert(productionOrderDetail);

        MongoUtil.insert(productionOrderDetail2);

        MongoUtil.insert(productionOrderDetail3);

        MongoUtil.insert(productionOrderDetail4);

        MongoUtil.insert(productionOrderDetail5);

        MongoUtil.insert(productionOrderDetail6);


    }


}
