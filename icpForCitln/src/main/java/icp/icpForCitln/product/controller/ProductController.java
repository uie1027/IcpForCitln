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
import icp.icpForCitln.product.dto.ProductInfoDTO;
import icp.icpForCitln.product.dto.ProductInfoFindDTO;
import icp.icpForCitln.product.dto.ProductInfoSaveDTO;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/productInfoFind")
    public PageResult productInfoFind(ProductInfoFindDTO productInfoFindDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,productService.productInfoFind(BeanCopyUtil.copy(productInfoFindDTO, ProductInfo.class)));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/7 9:33
     * @since: JDK 1.8
     *
     * @description: 产品新增
     * @param: [productInfoSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/productInfoSave")
    public PageResult productInfoSave(@RequestBody ProductInfoSaveDTO productInfoSaveDTO){
        productService.productInfoSave(productInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "产品保存成功");
    }

    @GetMapping("/productListGet")
    public PageResult productListGet(ProductInfoDTO productInfoDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,productService.productListGet(productInfoDTO));
    }
}
