/**
 * Project Name: icpForCitln
 * File Name: StockTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/05/07 13:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.entity.OtherOutbound;
import icp.icpForCitln.stock.entity.PurchaseReceiptDetail;
import icp.icpForCitln.stock.entity.SalesDeliveryDetail;
import icp.icpForCitln.stock.service.StockService;
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
public class StockTest {
    @Autowired
    StockService stockService;

    @Test
    public void test(){
        PurchaseReceiptSaveDTO saveDTO = new PurchaseReceiptSaveDTO();
        PurchaseReceiptDetail purchaseReceiptDetail = new PurchaseReceiptDetail();

        saveDTO.setDocumentType("55");
        saveDTO.setOrderCreateTime(new Date());
        saveDTO.setPurchaseOrderInfoId("1");
        saveDTO.setRemark("12");
        saveDTO.setSupplierInfoId("11");
        saveDTO.setReceiptStatus(1);

        purchaseReceiptDetail.setInventoryLocationId("!");
        purchaseReceiptDetail.setPurchaseOrderDetailInfoId("1");
        purchaseReceiptDetail.setReceivingFactoryId("2");
        purchaseReceiptDetail.setUnstockedNumber(new BigDecimal("22"));
        purchaseReceiptDetail.setWarehouseNumber(new BigDecimal("22"));

        List<PurchaseReceiptDetail> list = new ArrayList<>();
        list.add(purchaseReceiptDetail);

        PurchaseReceiptDetail purchaseReceiptDetail1 = purchaseReceiptDetail;
        list.add(purchaseReceiptDetail1);
        saveDTO.setPurchaseReceiptDetailList(list);

        stockService.purchaseReceiptSave(saveDTO);
    }

    @Test
    public void outbound(){
        OtherOutbound otherOutbound = new OtherOutbound();
        otherOutbound.setDocumentTime(new Date());
        otherOutbound.setDocumentType(1);
        otherOutbound.setFactoryInfoId("cx5ccfa71da898f237b4eba0c5");
        otherOutbound.setInventoryLocationId("1");
        otherOutbound.setOtherOutboundCode(GeneratedCodeUtil.generatedCode());
        otherOutbound.setReceiptStatus(1);
        otherOutbound.setRemark("@1");
        otherOutbound.setProductInfoId("cx5cd24b5babac561c7c3731f4");
        otherOutbound.setOutboundNumber(new BigDecimal("22"));
        for (int i=0;i<100;i++) {
            MongoUtil.insert(otherOutbound);
        }
    }

    @Test
    public void salesSave(){
        SalesDeliverySaveDTO salesDeliverySaveDTO = new SalesDeliverySaveDTO();

        salesDeliverySaveDTO.setCompanyInfoId("cx5cd269507aeecb391cee17c8");
        salesDeliverySaveDTO.setCustomerInfoId("cx5cd1142837db1c3460b01355");
        salesDeliverySaveDTO.setDocumentTime(new Date());
        salesDeliverySaveDTO.setRemark("222");

        SalesDeliveryDetail salesDeliveryDetail = new SalesDeliveryDetail();

        salesDeliveryDetail.setDeliveryFactoryId("cx5ccfa71da898f237b4eba0c5");
        salesDeliveryDetail.setDeliveryNumber(new BigDecimal("12"));
        salesDeliveryDetail.setInventoryLocationId("111");
        salesDeliveryDetail.setSaleOrderDetilInfoId("cx5cd289de7aeecb1678b8a345");
        salesDeliveryDetail.setSaleOrderInfoId("cx5cd289dd7aeecb1678b8a344");

        List<SalesDeliveryDetail> list = new ArrayList<>();
        list.add(salesDeliveryDetail);

        salesDeliverySaveDTO.setDetailList(list);

        for (int j = 0;j<5;j++){
            stockService.salesDeliverySave(salesDeliverySaveDTO);
        }
    }

    @Test
    public void infotest(){
        PurchaseReceiptUpdateDTO purchaseReceiptUpdateDTO = new PurchaseReceiptUpdateDTO();
        purchaseReceiptUpdateDTO.setFlag(1);
        purchaseReceiptUpdateDTO.setId("cx5cd118f9a898f220b829c30d");
        purchaseReceiptUpdateDTO.setRemark("updateTest");

        PurchaseReceiptDetailUpdateDTO purchaseReceiptDetail  = new PurchaseReceiptDetailUpdateDTO();
        purchaseReceiptDetail.setId("cx5cd118faa898f220b829c30e");
        purchaseReceiptDetail.setWarehouseNumber(new BigDecimal("77895462"));

        List<PurchaseReceiptDetailUpdateDTO>purchaseReceiptDetailUpdateDTOS = new ArrayList<>();

        purchaseReceiptDetailUpdateDTOS.add(purchaseReceiptDetail);

        stockService.purchaseReceiptUpdate(purchaseReceiptUpdateDTO,purchaseReceiptDetailUpdateDTOS);
    }

    @Test
    public void updateTest(){
        ProductionReceiptUpdateDTO productionReceiptUpdateDTO = new ProductionReceiptUpdateDTO();
        productionReceiptUpdateDTO.setId("cx5cd3e164a898f23a34ebfde2");
        productionReceiptUpdateDTO.setFlag(1);
        productionReceiptUpdateDTO.setRemark("test");
        productionReceiptUpdateDTO.setWarehouseNumber(new BigDecimal("55565"));

        stockService.productionReceiptUpdate(productionReceiptUpdateDTO);
    }

}
