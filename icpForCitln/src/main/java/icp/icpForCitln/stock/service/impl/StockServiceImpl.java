/**
 * Project Name: icpForCitln
 * File Name: StockServiceImpl
 * Package Name: icp.icpForCitln.stock.service.impl
 * Date: 19/05/06 18:58
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.stock.dao.StockDAO;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.entity.PurchaseReceipt;
import icp.icpForCitln.stock.entity.PurchaseReceiptDetail;
import icp.icpForCitln.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockDAO stockDAO;

    /**
     * @author: guoxs
     * @date: 19/05/06 19:02
     * @since: JDK 1.8
     *
     * @description: 生产入库单列表
     * @param: [pageIndex, pageSize, productionReceiptFindDTO]
     * @return: java.util.List<icp.icpForCitln.stock.dto.ProductionReceiptListDTO>
     */
    public List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        List<ProductionReceiptListDTO> listDTOS= stockDAO.productionReceiptListFind(pageIndex,pageSize,productionReceiptFindDTO);
        if (listDTOS.size()>0){
            for (ProductionReceiptListDTO productionReceiptListDTO:listDTOS){
                if (productionReceiptListDTO.getFactoryInfo()!=null) {
                    productionReceiptListDTO.setFactoryName(productionReceiptListDTO.getFactoryInfo().getFactoryName());
                }
                if (productionReceiptListDTO.getProductionOrder()!=null) {
                    productionReceiptListDTO.setOrderCode(productionReceiptListDTO.getProductionOrder().getOrderNumber());
                }
            }
        }
        return listDTOS;
    }

    /**
     * @author: guoxs
     * @date: 19/05/07 10:47
     * @since: JDK 1.8
     *
     * @description: 采购入库单创建
     * @param: [purchaseReceiptSaveDTO]
     * @return: boolean
     */
    public boolean purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO){
        purchaseReceiptSaveDTO.setPurchaseReceiptCode(GeneratedCodeUtil.generatedCode());
        PurchaseReceipt purchaseReceipt = BeanCopyUtil.copy(purchaseReceiptSaveDTO, PurchaseReceipt.class);
        MongoUtil.insert(purchaseReceipt);
        if (!CollectionUtils.isEmpty(purchaseReceiptSaveDTO.getPurchaseReceiptDetailList())) {
            for (PurchaseReceiptDetail purchaseReceiptDetail : purchaseReceiptSaveDTO.getPurchaseReceiptDetailList()) {
                purchaseReceiptDetail.setPurchaseReceiptId(purchaseReceipt.getId());
                MongoUtil.insert(purchaseReceiptDetail);
            }
        }
        return true;
    }

    /**
     * @author: guoxs
     * @date: 19/05/07 13:38
     * @since: JDK 1.8
     *
     * @description: 采购入库单列表
     * @param: [pageIndex, pageSize, purchaseReceiptFindDTO]
     * @return: java.util.List<icp.icpForCitln.stock.dto.PurchaseReceiptListDTO>
     */
    public List<PurchaseReceiptListDTO> purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO){
        List<PurchaseReceiptListDTO> dtos = stockDAO.purchaseReceiptListFind(pageIndex,pageSize,purchaseReceiptFindDTO);
        if (dtos.size()>0){
            for (PurchaseReceiptListDTO purchaseReceiptListDTO:dtos){
                if (purchaseReceiptListDTO.getPurchaseOrderInfo()!=null) {
                    purchaseReceiptListDTO.setPurchaseOrderInfoCode(purchaseReceiptListDTO.getPurchaseOrderInfo().getPurchaseOrderCode());
                }
                if (purchaseReceiptListDTO.getSupplierInfo()!=null) {
                    purchaseReceiptListDTO.setSupplierInfoName(purchaseReceiptListDTO.getSupplierInfo().getSupplierName());
                }
            }
        }
        return dtos;
    }
}
