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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/purchaseOrderSave")
    public PageResult purchaseOrderSave(@RequestBody PurchaseOrderDTO purchaseOrderDTO){
        if(purchaseOrderDTO == null
                || purchaseOrderDTO.getPurchaseOrderDetailDTOS() == null){
            //TODO 未处理项
            return  PageResult.returnResult(PageResult.ERROR_CODE,"订单创建失败，为获取到数据！");
        }else{
            purchaseOrderService.purchaseOrderSave(purchaseOrderDTO);
            return  PageResult.returnResult(PageResult.SUCCESS_CODE,"订单创建成功！");
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
        return  PageResult.returnResult(PageResult.SUCCESS_CODE,
                purchaseOrderService.purchaseOrderListFindByPage(searchField,pageIndex,pageSize));
    }

    /**
     * @author:
     * date: 2019/5/16 9:25
     * @since: JDK 1.8
     *
     * @description: 通过ID查询采购订单
     * @param: [purchaseOrderDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/purchaseOrderFindById")
    public PageResult purchaseOrderFindById(@RequestBody PurchaseOrderDTO purchaseOrderDTO){
        return PageResult.returnResult(
                PageResult.SUCCESS_CODE,purchaseOrderService.purchaseOrderFindById(purchaseOrderDTO));
    }

    /**
     * @author:
     * date: 2019/5/16 9:27
     * @since: JDK 1.8
     *
     * @description: 更新采购订单
     * @param: [purchaseOrderDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/purchaseOrderUpdate")
    public PageResult purchaseOrderUpdate(@RequestBody PurchaseOrderDTO purchaseOrderDTO){
        try {
            purchaseOrderService.purchaseOrderUpdate(purchaseOrderDTO);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }catch (Exception ex){
            return PageResult.returnResult(PageResult.ERROR_CODE,ex.toString());
        }
    }

}
