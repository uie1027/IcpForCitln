package icp.icpForCitln.stock.dao;

import icp.icpForCitln.stock.dto.*;

import java.util.List;

public interface StockDAO {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    List<PurchaseReceiptListDTO> purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO);
    List<OtherOutboundListDTO> OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
}
