/**
 * Project Name: icpForCitln
 * File Name: SaleOrderController
 * Package Name: icp.icpForCitln.order.controller
 * Date: 2019/5/7 17:56
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.order.dto.SaleOrderInfoDTO;
import icp.icpForCitln.order.service.SaleOrderService;
import icp.icpForCitln.order.vo.SaleOrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/saleOrder")
public class SaleOrderController {
    @Autowired
    private SaleOrderService saleOrderService;


    /**
     * @author: Hujh
     * @date: 2019/5/7 18:26
     * @since: JDK 1.8
     *
     * @description: 销售订单分页查询
     * @param: [searchField, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/saleOrderFindByPage")
    public PageResult saleOrderFindByPage(
            @RequestParam(value = "searchField") String searchField,
            @RequestParam(value = "pageIndex") Integer pageIndex,
            @RequestParam(value = "pageSize") Integer pageSize){
        List<SaleOrderInfoVO> list = saleOrderService.saleOrderFindByPage(searchField,pageIndex,pageSize);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,list);
    }

    /**
     * @author: Hujh
     * @date: 2019/5/8 11:05
     * @since: JDK 1.8
     *
     * @description: 创建销售订单
     * @param: [saleOrderInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/saleOrderSave")
    public PageResult saleOrderSave(@RequestBody SaleOrderInfoDTO saleOrderInfoDTO) {
        try {
            if(saleOrderInfoDTO != null && saleOrderInfoDTO.getSaleOrderDetailInfoDTOS() != null){
                saleOrderService.saleOrderSave(saleOrderInfoDTO);
            }
        } catch (Exception ex) {
            ex.toString();
        }
        return PageResult.returnResult(PageResult.SUCCESS_CODE,"订单创建成功！");
    }

}
