/**
 * Project Name: icpForCitln
 * File Name: ProduceTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/05/05 16:12
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.entity.ProductionOrder;
import icp.icpForCitln.produce.entity.ProductionReceipt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduceTest {
    @Test
    public void productionReceiptSaveTest(){
        ProductionReceipt productionReceiptInfoDTO = new ProductionReceipt();

        productionReceiptInfoDTO.setDocumentType(1);
        productionReceiptInfoDTO.setFactoryId("22");
        productionReceiptInfoDTO.setProductionOrderId("33");
        productionReceiptInfoDTO.setRemark("2222");
        productionReceiptInfoDTO.setCompanyInfoId("111");
        productionReceiptInfoDTO.setInventoryLocationId("2s");
        productionReceiptInfoDTO.setProductId("22");
        productionReceiptInfoDTO.setReceivingFactoryId("22");
        productionReceiptInfoDTO.setUnstockedNumber(new BigDecimal("345"));
        productionReceiptInfoDTO.setWarehouseNumber(new BigDecimal("44"));
        productionReceiptInfoDTO.setOrderCreateTime(new Date());

        MongoUtil.insert(productionReceiptInfoDTO);
    }

    @Test
    public void productionOrderSaveTest(){
        ProductionOrder productionOrder = new ProductionOrder();

        productionOrder.setOrderNumber("222");
        productionOrder.setOrderType("2");

        MongoUtil.insert(productionOrder);
    }
}
