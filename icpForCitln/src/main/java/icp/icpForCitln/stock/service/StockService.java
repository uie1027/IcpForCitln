package icp.icpForCitln.stock.service;

import icp.icpForCitln.stock.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptListDTO;

import java.util.List;

public interface StockService {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
}
