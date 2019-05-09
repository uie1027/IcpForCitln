/**
 * Project Name: icpForCitln
 * File Name: StockDAOImpl
 * Package Name: icp.icpForCitln.stock.dao.impl
 * Date: 19/05/06 18:57
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.produce.entity.ProductionOrder;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.stock.dao.StockDAO;
import icp.icpForCitln.stock.dto.OtherOutboundFindDTO;
import icp.icpForCitln.stock.dto.OtherOutboundListDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptListDTO;
import icp.icpForCitln.stock.entity.OtherOutbound;
import icp.icpForCitln.stock.entity.ProductionReceipt;
import icp.icpForCitln.stock.view.ProductionReceiptFindView;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
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
    @Override
    public MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindView productionReceiptFindView){
        return MongoUtil.select(pageIndex,pageSize,productionReceiptFindView);
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
    @Override
    public MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindView purchaseReceiptFindView){
        return MongoUtil.select(pageIndex,pageSize,purchaseReceiptFindView);
    }

    /**
     * @author: guoxs
     * @date: 19/05/08 14:55
     * @since: JDK 1.8
     *
     * @description: 其它出库列表
     * @param: [pageIndex, pageSize, otherOutboundFindDTO]
     * @return: java.util.List<icp.icpForCitln.stock.dto.OtherOutboundListDTO>
     */
    public List<OtherOutboundListDTO> OtherOutboundListFind(Integer pageIndex, Integer pageSize, OtherOutboundFindDTO otherOutboundFindDTO){
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(FactoryInfo.class);
        minorClass.add(ProductInfo.class);
        minorClass.add(SystemDictionaryInfo.class);
        MongoResult mongoResult = MongoUtil.aggregateSelect(minorClass, OtherOutbound.class,otherOutboundFindDTO,OtherOutboundListDTO.class,pageIndex,pageSize);
        return BeanCopyUtil.copy(mongoResult.getResultList(),OtherOutboundListDTO.class);
    }
}
