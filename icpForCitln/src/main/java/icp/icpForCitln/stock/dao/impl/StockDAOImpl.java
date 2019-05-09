/**
 * Project Name: icpForCitln
 * File Name: StockDAOImpl
 * Package Name: icp.icpForCitln.stock.dao.impl
 * Date: 19/05/06 18:57
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.stock.dao.StockDAO;
import icp.icpForCitln.stock.view.OtherOutboundFindView;
import icp.icpForCitln.stock.view.ProductionReceiptFindView;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;
import org.springframework.stereotype.Repository;

@Repository
public class StockDAOImpl implements StockDAO {

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
    @Override
    public MongoResult OtherOutboundListFind(Integer pageIndex, Integer pageSize, OtherOutboundFindView otherOutboundFindView){
        return MongoUtil.select(pageIndex,pageSize,otherOutboundFindView);
    }
}
