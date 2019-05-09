/**
 * Project Name: icpForCitln
 * File Name: ProduceTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/05/05 16:12
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.dto.PlannedOrderSaveDTO;
import icp.icpForCitln.produce.entity.PlannedOrderDetail;
import icp.icpForCitln.produce.entity.ProductionOrder;
import icp.icpForCitln.produce.service.ProduceService;
import icp.icpForCitln.stock.entity.ProductionReceipt;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduceTest {
    @Autowired
    ProduceService produceService;
    @Test
    public void productionReceiptSaveTest(){
        ProductionReceipt productionReceiptInfoDTO = new ProductionReceipt();

        productionReceiptInfoDTO.setDocumentType(1);
        productionReceiptInfoDTO.setProductionReceiptCode("1233");
        productionReceiptInfoDTO.setFactoryInfoId("22");
        productionReceiptInfoDTO.setProductionOrderId("33");
        productionReceiptInfoDTO.setRemark("2222");
        productionReceiptInfoDTO.setCompanyInfoId("111");
        productionReceiptInfoDTO.setInventoryLocationId("2s");
        productionReceiptInfoDTO.setProductInfoId("22");
        productionReceiptInfoDTO.setReceivingFactoryId("22");
        productionReceiptInfoDTO.setUnstockedNumber(new BigDecimal("345"));
        productionReceiptInfoDTO.setWarehouseNumber(new BigDecimal("44"));
        productionReceiptInfoDTO.setReceiptStatus(1);
        productionReceiptInfoDTO.setOrderCreateTime(new Date());

        MongoUtil.insert(productionReceiptInfoDTO);
    }

    @Test
    public void productionOrderSaveTest(){
        ProductionOrder productionOrder = new ProductionOrder();

        productionOrder.setProductionOrderCode("222");
        productionOrder.setProductionOrderType("2");

        MongoUtil.insert(productionOrder);
    }


    @Test
    public void mongoTest(){
        List<Class> list = new ArrayList<>();
        list.add(SupplierInfo.class);
        System.out.println(SupplierInfo.class.getSimpleName());
    }

    @Test
    public void test(){
        PlannedOrderSaveDTO plannedOrderSaveDTO = new PlannedOrderSaveDTO();
        PlannedOrderDetail plannedOrderDetail = new PlannedOrderDetail();
        List<PlannedOrderDetail> list = new ArrayList<>();

        plannedOrderSaveDTO.setCompanyInfoId("22");
        plannedOrderSaveDTO.setDocumentType(1);
        plannedOrderSaveDTO.setOrderCreateTime(new Date());
        plannedOrderSaveDTO.setRemark("32");

        plannedOrderDetail.setFactoryId("22");
        plannedOrderDetail.setEndTime(new Date());
        plannedOrderDetail.setOrderQuantity(new BigDecimal("12"));
        plannedOrderDetail.setOrderStatus(1);
        plannedOrderDetail.setProductInfoId("222");
        plannedOrderDetail.setRemark("222");
        plannedOrderDetail.setStartTime(new Date());

        list.add(plannedOrderDetail);
        plannedOrderSaveDTO.setDetailList(list);

        produceService.PlannedOrderSave(plannedOrderSaveDTO);
    }
}
