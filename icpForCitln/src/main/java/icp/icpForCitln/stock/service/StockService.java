package icp.icpForCitln.stock.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.dto.*;

public interface StockService {
    MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    boolean purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO);
    MongoResult OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
    boolean salesDeliverySave(SalesDeliverySaveDTO salesDeliverySaveDTO);
    MongoResult salesDeliveryListFind(Integer pageIndex, Integer pageSize, SalesDeliveryFindDTO salesDeliveryFindDTO);
}
