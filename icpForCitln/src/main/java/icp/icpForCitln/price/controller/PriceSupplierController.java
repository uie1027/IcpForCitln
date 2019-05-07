/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.price.service.PriceSupplierService;
import icp.icpForCitln.price.vo.PricePurchaseProductSupplierVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/priceSupplier")
public class PriceSupplierController {
    @Autowired
    private PriceSupplierService priceSupplierService;

    @GetMapping("/priceSupplierFindByPage")
    public PageResult priceSupplierFindByPage(@RequestParam(value = "supplierInfo") String supplierInfo,
                            @RequestParam(value = "productInfo") String productInfo,
                            @RequestParam(value = "pageIndex") Integer pageIndex,
                            @RequestParam(value = "pageSize") Integer pageSize ){
        List<PricePurchaseProductSupplierDTO> list =
                priceSupplierService.priceSupplierFindByPage(supplierInfo,productInfo,pageIndex,pageSize);

        return  PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(list, PricePurchaseProductSupplierVO.class));
    }
}
