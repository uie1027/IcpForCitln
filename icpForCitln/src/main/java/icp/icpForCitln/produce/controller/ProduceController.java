/**
 * Project Name: icpForCitln
 * File Name: ProduceController
 * Package Name: icp.icpForCitln.produce.controller
 * Date: 19/05/05 13:50
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.dto.ProductionOrderInfoDTO;
import icp.icpForCitln.produce.dto.ProductionReceiptInfoDTO;
import icp.icpForCitln.produce.entity.ProductionOrder;
import icp.icpForCitln.produce.entity.ProductionReceipt;
import icp.icpForCitln.produce.vo.ProductionOrderVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class ProduceController {

    @GetMapping("/productionOrderFind")
    public PageResult productionOrderFind(ProductionOrderInfoDTO productionOrderInfoDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(MongoUtil.select(BeanCopyUtil.copy(productionOrderInfoDTO, ProductionOrder.class)), ProductionOrderVO.class));
    }

    @PostMapping("/productionReceiptSave")
    public PageResult productionReceiptSave(ProductionReceiptInfoDTO productionReceiptInfoDTO){
        MongoUtil.insert(BeanCopyUtil.copy(productionReceiptInfoDTO, ProductionReceipt.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }
}
