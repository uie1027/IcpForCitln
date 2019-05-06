package icp.icpForCitln.produce.dao;

import icp.icpForCitln.produce.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.produce.dto.ProductionReceiptListDTO;

import java.util.List;

public interface ProduceDAO {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
}
