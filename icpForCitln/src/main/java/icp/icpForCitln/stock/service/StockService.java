package icp.icpForCitln.stock.service;

import icp.icpForCitln.stock.dto.*;

import java.util.List;

public interface StockService {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    boolean purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO);
    List<PurchaseReceiptListDTO> purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO);
}
