/**
 * Project Name: icpForCitln
 * File Name: ProduceController
 * Package Name: icp.icpForCitln.produce.controller
 * Date: 19/05/05 13:50
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.produce.dto.PlannedOrderSaveDTO;
import icp.icpForCitln.produce.dto.ProductionConfirmOrderFindDTO;
import icp.icpForCitln.produce.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class ProduceController {
    @Autowired
    ProduceService produceService;

    /**
     * @author: guoxs
     * @date: 19/05/07 14:52
     * @since: JDK 1.8
     *
     * @description: 计划订单创建
     * @param: [plannedOrderSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/PlannedOrderSave")
    public PageResult PlannedOrderSave(PlannedOrderSaveDTO plannedOrderSaveDTO){
        produceService.PlannedOrderSave(plannedOrderSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    @GetMapping("/productionConfirmOrderFind")
    public PageResult productionConfirmOrderFind(Integer pageIndex, Integer pageSize, ProductionConfirmOrderFindDTO productionConfirmOrderFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,produceService.productionConfirmOrderFind(pageIndex,pageSize,productionConfirmOrderFindDTO));
    }
}
