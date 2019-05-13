/**
 * Project Name: icpForCitln
 * File Name: StockServiceImpl
 * Package Name: icp.icpForCitln.stock.service.impl
 * Date: 19/05/06 18:58
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.stock.dao.StockDAO;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.entity.*;
import icp.icpForCitln.stock.service.StockService;
import icp.icpForCitln.stock.view.*;
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
    @Override
    public MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        return stockDAO.productionReceiptListFind(pageIndex,pageSize,BeanCopyUtil.copy(productionReceiptFindDTO, ProductionReceiptFindView.class));
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
    @Override
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
    @Override
    public MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO){
        return stockDAO.purchaseReceiptListFind(pageIndex,pageSize,BeanCopyUtil.copy(purchaseReceiptFindDTO,PurchaseReceiptFindView.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/08 14:54
     * @since: JDK 1.8
     *
     * @description: 其他出库列表
     * @param: [pageIndex, pageSize, otherOutboundFindDTO]
     * @return: java.util.List<icp.icpForCitln.stock.dto.OtherOutboundListDTO>
     */
    @Override
    public MongoResult OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO){
        return stockDAO.OtherOutboundListFind(pageIndex,pageSize,BeanCopyUtil.copy(otherOutboundFindDTO, OtherOutboundFindView.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/09 17:44
     * @since: JDK 1.8
     *
     * @description: 销售发货单 保存
     * @param: [salesDeliverySaveDTO]
     * @return: boolean
     */
    @Override
    public boolean salesDeliverySave(SalesDeliverySaveDTO salesDeliverySaveDTO){
        salesDeliverySaveDTO.setSalesDeliveryCode(GeneratedCodeUtil.generatedCode());
        SalesDelivery salesDelivery = BeanCopyUtil.copy(salesDeliverySaveDTO, SalesDelivery.class);
        MongoUtil.insert(salesDelivery);

        SalesOutbound salesOutbound = new SalesOutbound();
        salesOutbound.setSalesDeliveryId(salesDelivery.getId());
        salesOutbound.setOutboundTypeId("销售出库");
        salesOutbound.setSalesOutbountCode(GeneratedCodeUtil.generatedCode());
        salesOutbound.setOutboundStatus(1);

        MongoUtil.insert(salesOutbound);
        if (!CollectionUtils.isEmpty(salesDeliverySaveDTO.getDetailList())){
            for (SalesDeliveryDetail salesDeliveryDetail:salesDeliverySaveDTO.getDetailList()){
                salesDeliveryDetail.setSalesDeliveryDetailCode(GeneratedCodeUtil.generatedCode());
                salesDeliveryDetail.setSalesDeliverId(salesDelivery.getId());
                MongoUtil.insert(salesDeliveryDetail);
            }
        }
        return true;
    }

    /**
     * @author: guoxs
     * @date: 19/05/09 18:34
     * @since: JDK 1.8
     *
     * @description: 销售发货单列表
     * @param: [pageIndex, pageSize, salesDeliveryFindDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult salesDeliveryListFind(Integer pageIndex, Integer pageSize, SalesDeliveryFindDTO salesDeliveryFindDTO){
        return stockDAO.salesDeliveryListFind(pageIndex,pageSize,BeanCopyUtil.copy(salesDeliveryFindDTO,SalesDeliveryFindView.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 09:51
     * @since: JDK 1.8
     *
     * @description: 销售出库单列表
     * @param: [pageIndex, pageSize, salesOutboundFindDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public  MongoResult salesOutboundListFind(Integer pageIndex,Integer pageSize,SalesOutboundFindDTO salesOutboundFindDTO){
        return MongoUtil.select(pageIndex,pageSize,BeanCopyUtil.copy(salesOutboundFindDTO, SalesOutboundFindView.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 19:06
     * @since: JDK 1.8
     *
     * @description: 采购入库详情获取
     * @param: [purchaseReceiptFindDTO]
     * @return: icp.icpForCitln.stock.view.PurchaseReceiptUpdateView
     */
    @Override
    public PurchaseReceiptUpdateView purchaseReceiptInfo(PurchaseReceiptFindDTO purchaseReceiptFindDTO){
        List<PurchaseReceiptUpdateView> list = MongoUtil.select(BeanCopyUtil.copy(purchaseReceiptFindDTO,PurchaseReceiptUpdateView.class));
        return list.get(0);
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 19:06
     * @since: JDK 1.8
     *
     * @description: 采购入库编辑
     * @param: [purchaseReceiptUpdateDTO, purchaseReceiptDetailUpdateDTOList]
     * @return: void
     */
    @Override
    public void purchaseReceiptUpdate(PurchaseReceiptUpdateDTO purchaseReceiptUpdateDTO,List<PurchaseReceiptDetailUpdateDTO> purchaseReceiptDetailUpdateDTOList){
        if (purchaseReceiptUpdateDTO!=null){
            MongoUtil.upsert(BeanCopyUtil.copy(purchaseReceiptUpdateDTO,PurchaseReceipt.class),purchaseReceiptUpdateDTO.getFlag());
        }

        if (!CollectionUtils.isEmpty(purchaseReceiptDetailUpdateDTOList)){
            MongoUtil.upsert(BeanCopyUtil.copy(purchaseReceiptDetailUpdateDTOList,PurchaseReceiptDetail.class),1);
        }
    }
}
