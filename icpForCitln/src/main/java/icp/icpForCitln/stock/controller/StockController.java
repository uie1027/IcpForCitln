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
import icp.icpForCitln.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public PageResult productionReceiptSave(@RequestBody ProductionReceiptInfoDTO productionReceiptInfoDTO){
        stockService.productionReceiptSave(productionReceiptInfoDTO);
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
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.productionReceiptListFind(pageIndex,pageSize,productionReceiptFindDTO));
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
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.OtherOutboundListFind(pageIndex,pageSize,otherOutboundFindDTO));
    }


    /**
     * @author: guoxs
     * @date: 19/05/09 17:44
     * @since: JDK 1.8
     *
     * @description: 销售发货单 保存
     * @param: [salesDeliverySaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/salesDeliverySave")
    public PageResult salesDeliverySave(SalesDeliverySaveDTO salesDeliverySaveDTO){
        if (stockService.salesDeliverySave(salesDeliverySaveDTO)){
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/09 18:34
     * @since: JDK 1.8
     *
     * @description: 销售发货单列表
     * @param: [pageIndex, pageSize, salesDeliveryFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/salesDeliveryListFind")
    public PageResult salesDeliveryListFind(Integer pageIndex, Integer pageSize, SalesDeliveryFindDTO salesDeliveryFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.salesDeliveryListFind(pageIndex,pageSize,salesDeliveryFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 09:50
     * @since: JDK 1.8
     *
     * @description: 销售出库单列表
     * @param: [pageIndex, pageSize, salesOutboundFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/salesOutboundListFind")
    public PageResult salesOutboundListFind(Integer pageIndex, Integer pageSize, SalesOutboundFindDTO salesOutboundFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.salesOutboundListFind(pageIndex,pageSize,salesOutboundFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 19:07
     * @since: JDK 1.8
     *
     * @description: 采购入库详情获取
     * @param: [purchaseReceiptFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/purchaseReceiptInfo")
    public PageResult purchaseReceiptInfo(PurchaseReceiptFindDTO purchaseReceiptFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.purchaseReceiptInfo(purchaseReceiptFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 19:08
     * @since: JDK 1.8
     *
     * @description: 采购入库编辑
     * @param: [purchaseReceiptUpdateDTO, purchaseReceiptDetailUpdateDTOList]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/purchaseReceiptUpdate")
    public PageResult purchaseReceiptUpdate(PurchaseReceiptUpdateDTO purchaseReceiptUpdateDTO, List<PurchaseReceiptDetailUpdateDTO> purchaseReceiptDetailUpdateDTOList){
        stockService.purchaseReceiptUpdate(purchaseReceiptUpdateDTO,purchaseReceiptDetailUpdateDTOList);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 19:37
     * @since: JDK 1.8
     *
     * @description: 其它出库详情
     * @param: [otherOutboundFindDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/otherOutboundInfo")
    public PageResult otherOutboundInfo(OtherOutboundFindDTO otherOutboundFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.otherOutboundInfo(otherOutboundFindDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/13 19:44
     * @since: JDK 1.8
     *
     * @description: 其它出库编辑
     * @param: [otherOutboundUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/otherOutboundUpdate")
    public PageResult otherOutboundUpdate(OtherOutboundUpdateDTO otherOutboundUpdateDTO){
        stockService.otherOutboundUpdate(otherOutboundUpdateDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/14 15:47
     * @since: JDK 1.8
     *
     * @description: 生产入库单详情
     * @param: [productionReceiptUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/productionReceiptInfo")
    public PageResult productionReceiptInfo(ProductionReceiptUpdateDTO productionReceiptUpdateDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,stockService.productionReceiptInfo(productionReceiptUpdateDTO));
    }

    /**
     * @author: guoxs
     * @date: 19/05/14 15:49
     * @since: JDK 1.8
     *
     * @description: 生产入库单编辑
     * @param: [productionReceiptUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/productionReceiptUpdate")
    public PageResult productionReceiptUpdate(ProductionReceiptUpdateDTO productionReceiptUpdateDTO){
        stockService.productionReceiptUpdate(productionReceiptUpdateDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }
}
