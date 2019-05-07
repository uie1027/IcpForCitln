/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderController
 * Package Name: icp.icpForCitln.order.controller
 * Date: 2019/5/5 14:12
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.order.dto.PurchaseOrderDTO;
import icp.icpForCitln.order.service.PurchaseOrderService;
import icp.icpForCitln.order.vo.PurchaseOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchaseOrder")
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;


    /**
     * @author: Hujh
     * @date: 2019/5/6 10:10
     * @since: JDK 1.8
     *
     * @description: 创建采购订单
     * @param: [purchaseOrderDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/createOrder")
    public PageResult createOrder(@RequestBody PurchaseOrderDTO purchaseOrderDTO){
        if(purchaseOrderDTO == null
                || purchaseOrderDTO.getPurchaseOrderDetailDTOS() == null){
            //TODO 未处理项
            return  PageResult.returnResult(PageResult.ERROR_CODE,null);
        }else{
            purchaseOrderService.purchaseOrderSave(purchaseOrderDTO);
            return  PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
    }


    /**
     * @author: Hujh
     * @date: 2019/5/5 18:36
     * @since: JDK 1.8
     *
     * @description: 分页查询采购订单
     * @param: [orderNo, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/purchaseOrderListFindByPage")
    public PageResult purchaseOrderListFindByPage(@RequestParam(value = "searchField") String searchField,
                                             @RequestParam(value = "pageIndex") Integer pageIndex,
                                             @RequestParam(value = "pageSize") Integer pageSize){
        List<PurchaseOrderVO> list = purchaseOrderService.purchaseOrderListFindByPage(searchField,pageIndex,pageSize);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,list);
    }

}
