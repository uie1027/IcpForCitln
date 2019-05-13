/**
 * Project Name: icpForCitln
 * File Name: ProduceService
 * Package Name: icp.icpForCitln.produce.service
 * Date: 19/05/06 10:48
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.produce.dto.PlannedOrderSaveDTO;
import icp.icpForCitln.produce.dto.ProductionConfirmOrderFindDTO;
import icp.icpForCitln.produce.dto.ProductionOrderFindDTO;

public interface ProduceService {
    void PlannedOrderSave(PlannedOrderSaveDTO plannedOrderSaveDTO);
    MongoResult productionConfirmOrderFind(Integer pageIndex, Integer pageSize, ProductionConfirmOrderFindDTO productionConfirmOrderFindDTO);
    MongoResult productionOrderFind(Integer pageIndex, Integer pageSize, ProductionOrderFindDTO productionOrderFindDTO);
}
