package icp.icpForCitln.stock.dao;

import icp.icpForCitln.stock.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptListDTO;
import icp.icpForCitln.stock.dto.PurchaseReceiptFindDTO;
import icp.icpForCitln.stock.dto.PurchaseReceiptListDTO;

import java.util.List;

public interface StockDAO {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    List<PurchaseReceiptListDTO> purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO);
}
