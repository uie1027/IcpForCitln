/**
 * Project Name: icpForCitln
 * File Name: ProduceService
 * Package Name: icp.icpForCitln.produce.service
 * Date: 19/05/06 10:48
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.service;

import icp.icpForCitln.produce.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.produce.dto.ProductionReceiptListDTO;

import java.util.List;

public interface ProduceService {
    List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
}
