package icp.icpForCitln.stock.dao;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.view.OtherOutboundView;
import icp.icpForCitln.stock.view.ProductionReceiptFindView;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;
import icp.icpForCitln.stock.view.SalesDeliveryFindView;

public interface StockDAO {
    MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindView productionReceiptFindView);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindView purchaseReceiptFindView);
    MongoResult OtherOutboundListFind(Integer pageIndex, Integer pageSize, OtherOutboundView otherOutboundView);
    MongoResult salesDeliveryListFind(Integer pageIndex, Integer pageSize, SalesDeliveryFindView salesDeliveryFindView);
}
