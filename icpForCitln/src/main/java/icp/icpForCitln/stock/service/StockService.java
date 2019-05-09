package icp.icpForCitln.stock.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.dto.*;

import java.util.List;

public interface StockService {
    public MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    boolean purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO);
    MongoResult OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
}
