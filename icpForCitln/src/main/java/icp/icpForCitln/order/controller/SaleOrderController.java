/**
 * Project Name: icpForCitln
 * File Name: SaleOrderController
 * Package Name: icp.icpForCitln.order.controller
 * Date: 2019/5/7 17:56
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.order.service.SaleOrderService;
import icp.icpForCitln.order.vo.SaleOrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/saleOrderFindByPage")
    public PageResult saleOrderFindByPage(
            @RequestParam(value = "searchField") String searchField,
            @RequestParam(value = "pageIndex") Integer pageIndex,
            @RequestParam(value = "pageSize") Integer pageSize){
        List<SaleOrderInfoVO> list = saleOrderService.saleOrderFindByPage(searchField,pageIndex,pageSize);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,list);
    }
}
