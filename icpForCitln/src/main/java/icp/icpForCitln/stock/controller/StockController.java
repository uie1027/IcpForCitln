/**
 * Project Name: icpForCitln
 * File Name: StockController
 * Package Name: icp.icpForCitln.stock.controller
 * Date: 19/05/06 19:00
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.entity.OtherOutbound;
import icp.icpForCitln.stock.entity.ProductionReceipt;
import icp.icpForCitln.stock.service.StockService;
import icp.icpForCitln.stock.view.PurchaseReceiptFindView;
import icp.icpForCitln.stock.vo.OtherOutboundListVO;
import icp.icpForCitln.stock.vo.ProductionReceiptListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockService;

    /**
     * @author: guoxs
     * @date: 19/05/06 19:01
     * @since: JDK 1.8
     *
     * @description: 生产入库单创建
     * @param: [productionReceiptInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/productionReceiptSave")
    public PageResult productionReceiptSave(ProductionReceiptInfoDTO productionReceiptInfoDTO){
        MongoUtil.insert(BeanCopyUtil.copy(productionReceiptInfoDTO, ProductionReceipt.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/06 19:01
     * @since: JDK 1.8
     *
     * @description: 生产入库单列表
     * @param: [pageIndex, pageSize, productionReceiptFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/productionReceiptListFindByPage")
    public PageResult productionReceiptListFindByPage(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        List<ProductionReceiptListDTO> dtos = stockService.productionReceiptListFind(pageIndex,pageSize,productionReceiptFindDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(dtos, ProductionReceiptListVO.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/07 10:47
     * @since: JDK 1.8
     *
     * @description: 采购入库单创建
     * @param: [purchaseReceiptSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/purchaseReceiptSave")
    public PageResult purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO){
        if(stockService.purchaseReceiptSave(purchaseReceiptSaveDTO)){
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/07 13:18
     * @since: JDK 1.8
     *
     * @description: 采购入库单列表
     * @param: [pageIndex, pageSize, purchaseReceiptFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/purchaseReceiptListFindByPage")
    public PageResult purchaseReceiptListFindByPage(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.purchaseReceiptListFind(pageIndex,pageSize,purchaseReceiptFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/08 14:19
     * @since: JDK 1.8
     *
     * @description: 其他出库创建
     * @param: [otherOutboundSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/otherOutboundSave")
    public PageResult otherOutboundSave(OtherOutboundSaveDTO otherOutboundSaveDTO){
        otherOutboundSaveDTO.setOtherOutboundCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(BeanCopyUtil.copy(otherOutboundSaveDTO, OtherOutbound.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/08 14:54
     * @since: JDK 1.8
     *
     * @description: 其他出库列表
     * @param: [pageIndex, pageSize, otherOutboundFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/otherOutboundListFindByPage")
    public PageResult otherOutboundListFindByPage(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(stockService.OtherOutboundListFind(pageIndex,pageSize,otherOutboundFindDTO), OtherOutboundListVO.class));
    }
}
