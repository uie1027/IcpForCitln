/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.price.service.PriceSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/priceSupplier")
public class PriceSupplierController {
    @Autowired
    private PriceSupplierService priceSupplierService;


    /**
     * @author: Hujh
     * @date: 2019/5/9 13:25
     * @since: JDK 1.8
     *
     * @description: 采购价格-供应商产品价格
     * @param: [supplierInfo, productInfo, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSupplierFindByPage")
    public PageResult priceSupplierFindByPage(@RequestParam(value = "supplierInfo") String supplierInfo,
                            @RequestParam(value = "productInfo") String productInfo,
                            @RequestParam(value = "pageIndex") Integer pageIndex,
                            @RequestParam(value = "pageSize") Integer pageSize ){
        return  PageResult.returnResult(PageResult.SUCCESS_CODE,
                priceSupplierService.priceSupplierFindByPage(supplierInfo,productInfo,pageIndex,pageSize));
    }
}
