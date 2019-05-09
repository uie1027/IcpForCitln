package icp.icpForCitln.stock.dao;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.dto.OtherOutboundFindDTO;
import icp.icpForCitln.stock.dto.OtherOutboundListDTO;
import icp.icpForCitln.stock.view.ProductionReceiptFindView;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;

import java.util.List;

public interface StockDAO {
    public MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindView productionReceiptFindView);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindView purchaseReceiptFindView);
    List<OtherOutboundListDTO> OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
}
