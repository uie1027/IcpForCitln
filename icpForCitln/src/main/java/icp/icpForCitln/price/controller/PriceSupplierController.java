/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.price.entity.PricePurchaseProductSupplier;
import icp.icpForCitln.price.vo.PricePurchaseProductSupplierVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/priceSupplier")
public class PriceSupplierController {

    @GetMapping("/priceSupplierFindByPage")
    public PageResult priceSupplierFindByPage(@RequestParam(value = "supplierCode") String supplierInfo,
                            @RequestParam(value = "supplierCode") String productInfo,
                            @RequestParam(value = "pageIndex") Integer pageIndex,
                            @RequestParam(value = "pageSize") Integer pageSize ){

        return  PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }
}
