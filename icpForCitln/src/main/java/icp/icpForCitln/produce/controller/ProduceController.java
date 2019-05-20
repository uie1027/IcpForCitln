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
import icp.icpForCitln.produce.dto.ProductionOrderFindDTO;
import icp.icpForCitln.produce.dto.ProductionOrderSaveDTO;
import icp.icpForCitln.produce.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * @author: guoxs
     * @date: 19/05/13 14:04
     * @since: JDK 1.8
     *
     * @description: 生产确认订单列表
     * @param: [pageIndex, pageSize, productionConfirmOrderFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/productionConfirmOrderFind")
    public PageResult productionConfirmOrderFind(Integer pageIndex, Integer pageSize, ProductionConfirmOrderFindDTO productionConfirmOrderFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,produceService.productionConfirmOrderFind(pageIndex,pageSize,productionConfirmOrderFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 14:05
     * @since: JDK 1.8
     *
     * @description: 生产订单列表
     * @param: [pageIndex, pageSize, productionOrderFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/productionOrderFind")
    public PageResult productionOrderFind(Integer pageIndex, Integer pageSize, ProductionOrderFindDTO productionOrderFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,produceService.productionOrderFind(pageIndex,pageSize,productionOrderFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/20 10:17
     * @since: JDK 1.8
     *
     * @description: 生产订单创建
     * @param: [productionOrderSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/productionOrderSave")
    public PageResult productionOrderSave(@RequestBody ProductionOrderSaveDTO productionOrderSaveDTO){
        produceService.productionOrderSave(productionOrderSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }
}
