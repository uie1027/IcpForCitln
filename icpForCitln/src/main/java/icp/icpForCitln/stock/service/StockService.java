package icp.icpForCitln.stock.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;

import java.util.List;

public interface StockService {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    boolean purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindView purchaseReceiptFindView);
    List<OtherOutboundListDTO> OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
}
