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
import icp.icpForCitln.stock.dto.PurchaseReceiptSaveDTO;
import icp.icpForCitln.stock.entity.OtherOutbound;
import icp.icpForCitln.stock.entity.PurchaseReceiptDetail;
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

        saveDTO.setDocumentType(1);
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
        otherOutbound.setFactoryInfoId("@");
        otherOutbound.setInventoryLocationId("1");
        otherOutbound.setOtherOutboundCode(GeneratedCodeUtil.generatedCode());
        otherOutbound.setReceiptStatus(1);
        otherOutbound.setRemark("@1");
        otherOutbound.setProductInfoId("1");
        otherOutbound.setOutboundNumber(new BigDecimal("22"));
        otherOutbound.setSystemDictionaryInfoId("1");

        MongoUtil.insert(otherOutbound);
    }

}
