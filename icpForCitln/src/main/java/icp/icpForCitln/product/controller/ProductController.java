/**
 * Project Name: icpForCitln
 * File Name: ProductController
 * Package Name: icp.icpForCitln.product.controller
 * Date: 19/05/05 16:41
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.product.dto.ProductInfoFindDTO;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/productInfoFind")
    public PageResult productInfoFind(ProductInfoFindDTO productInfoFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,productService.productInfoFind(BeanCopyUtil.copy(productInfoFindDTO, ProductInfo.class)));
    }
}
