/**
 * Project Name: icpForCitln
 * File Name: ProduceServiceImpl
 * Package Name: icp.icpForCitln.produce.service.impl
 * Date: 19/05/06 10:49
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.dto.PlannedOrderSaveDTO;
import icp.icpForCitln.produce.entity.PlannedOrder;
import icp.icpForCitln.produce.entity.PlannedOrderDetail;
import icp.icpForCitln.produce.service.ProduceService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProduceServiceImpl implements ProduceService {
    /**
     * @author: guoxs
     * @date: 19/05/07 14:50
     * @since: JDK 1.8
     *
     * @description: 计划订单创建
     * @param: [plannedOrderSaveDTO]
     * @return: void
     */
    public void PlannedOrderSave(PlannedOrderSaveDTO plannedOrderSaveDTO){
        plannedOrderSaveDTO.setPlannedOrderCode(GeneratedCodeUtil.generatedCode());
        PlannedOrder plannedOrder = BeanCopyUtil.copy(plannedOrderSaveDTO,PlannedOrder.class);
        MongoUtil.insert(plannedOrder);
        if (!CollectionUtils.isEmpty(plannedOrderSaveDTO.getDetailList())){
            for (PlannedOrderDetail detail:plannedOrderSaveDTO.getDetailList()){
                detail.setPlannedOrderId(plannedOrder.getId());
                detail.setPlannedOrderDetailCode(GeneratedCodeUtil.generatedCode());
                MongoUtil.insert(detail);
            }
        }

    }
}
