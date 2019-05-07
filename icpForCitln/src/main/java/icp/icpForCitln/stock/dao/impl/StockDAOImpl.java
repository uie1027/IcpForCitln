/**
 * Project Name: icpForCitln
 * File Name: StockDAOImpl
 * Package Name: icp.icpForCitln.stock.dao.impl
 * Date: 19/05/06 18:57
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dao.impl;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.produce.entity.ProductionOrder;
import icp.icpForCitln.stock.dao.StockDAO;
import icp.icpForCitln.stock.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptListDTO;
import icp.icpForCitln.stock.dto.PurchaseReceiptFindDTO;
import icp.icpForCitln.stock.dto.PurchaseReceiptListDTO;
import icp.icpForCitln.stock.entity.ProductionReceipt;
import icp.icpForCitln.stock.entity.PurchaseReceipt;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StockDAOImpl implements StockDAO {
    @Autowired
    MongoTemplate mongoTemplate;

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
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(FactoryInfo.class);
        minorClass.add(ProductionOrder.class);
        return MongoUtil.aggregateSelect(minorClass, ProductionReceipt.class,productionReceiptFindDTO,ProductionReceiptListDTO.class,pageIndex,pageSize);
    }

    /**
     * @author: guoxs
     * @date: 19/05/07 13:39
     * @since: JDK 1.8
     *
     * @description: 采购入库单列表
     * @param: [pageIndex, pageSize, purchaseReceiptFindDTO]
     * @return: java.util.List<icp.icpForCitln.stock.dto.PurchaseReceiptListDTO>
     */
    public List<PurchaseReceiptListDTO> purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO){
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(PurchaseOrderInfo.class);
        minorClass.add(SupplierInfo.class);
        return MongoUtil.aggregateSelect(minorClass, PurchaseReceipt.class,purchaseReceiptFindDTO,PurchaseReceiptListDTO.class,pageIndex,pageSize);
    }
}
