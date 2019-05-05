/**
 * Project Name: icpForCitln
 * File Name: ProductGroupController
 * Package Name: icp.icpForCitln.productGroup.controller
 * Date: 2019-05-05 下午 2:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.productGroup.dto.ProductGroupInfoAddDTO;
import icp.icpForCitln.productGroup.service.ProductGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productGroup")
public class ProductGroupController {
    @Autowired
    private ProductGroupService productGroupService;

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 2:35
     * @since: JDK 1.8
     *
     * @description: 新建产品组
     * @param: [productGroupInfoAddDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/productGroupSave")
    public PageResult productGroupSave(ProductGroupInfoAddDTO productGroupInfoAddDTO){
        productGroupService.productGroupSave(productGroupInfoAddDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "新建产品组成功");
    }
}
