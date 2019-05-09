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
import icp.icpForCitln.stock.dto.OtherOutboundFindDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.stock.dto.PurchaseReceiptFindDTO;
import icp.icpForCitln.stock.dto.PurchaseReceiptSaveDTO;
import icp.icpForCitln.stock.entity.PurchaseReceipt;
import icp.icpForCitln.stock.entity.PurchaseReceiptDetail;
import icp.icpForCitln.stock.service.StockService;
import icp.icpForCitln.stock.view.OtherOutboundFindView;
import icp.icpForCitln.stock.view.ProductionReceiptFindView;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
}
