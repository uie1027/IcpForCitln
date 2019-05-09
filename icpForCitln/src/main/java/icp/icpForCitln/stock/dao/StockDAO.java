package icp.icpForCitln.stock.dao;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;

import java.util.List;

public interface StockDAO {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindView purchaseReceiptFindView);
    List<OtherOutboundListDTO> OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
}
