/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.price.service.PriceSaleService;
import icp.icpForCitln.price.vo.PricePurchaseProductSupplierVO;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/priceSale")
public class PriceSaleController {
    @Autowired
    private PriceSaleService priceSaleService;

    /**
     * @author: Hujh
     * @date: 2019/5/6 19:28
     * @since: JDK 1.8
     *
     * @description: 商品组价格分页查询(销售)
     * @param: [searchField, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleProductGroupFindByPage")
    public PageResult priceSaleProductGroupFindByPage(@RequestParam(value = "searchField") String searchField,
                                              @RequestParam(value = "pageIndex") Integer pageIndex,
                                              @RequestParam(value = "pageSize") Integer pageSize ){
        List<PriceSaleProductGroupVO> list =
                priceSaleService.priceSaleProductGroupFindByPage(searchField,pageIndex,pageSize);
        return  PageResult.returnResult(PageResult.SUCCESS_CODE, list);
    }

    /**
     * @author: Hujh
     * @date: 2019/5/6 19:45
     * @since: JDK 1.8
     *
     * @description: 商品组价格分页查询(销售)
     * @param: [searchField, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleProductFindByPage")
    public PageResult priceSaleProductFindByPage(@RequestParam(value = "searchField") String searchField,
                                              @RequestParam(value = "pageIndex") Integer pageIndex,
                                              @RequestParam(value = "pageSize") Integer pageSize ){
        List<PriceSaleProductVO> list =
                priceSaleService.priceSaleProductFindByPage(searchField,pageIndex,pageSize);
        return  PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(list, PriceSaleProductVO.class));
    }




    /**
     * @author: Hujh
     * @date: 2019/5/7 9:41
     * @since: JDK 1.8
     *
     * @description: 客户产品组价格分页查询（销售）
     * @param: [customerInfo, productGroupInfo, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleCustomerProductGroupFindByPage")
    public PageResult priceSaleCustomerProductGroupFindByPage(
            @RequestParam(value = "customerInfo") String customerInfo,
            @RequestParam(value = "productGroupInfo") String productGroupInfo,
            @RequestParam(value = "pageIndex") Integer pageIndex,
            @RequestParam(value = "pageSize") Integer pageSize ){
        List<PriceSaleProductVO> list =
                priceSaleService.priceSaleProductFindByPage(customerInfo,pageIndex,pageSize);
        return  PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(list, PricePurchaseProductSupplierVO.class));
    }


    /**
     * @author: Hujh
     * @date: 2019/5/7 9:41
     * @since: JDK 1.8
     *
     * @description: 客户产品价格分页查询（销售）
     * @param: [customerInfo, productInfo, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleCustomerProductFindByPage")
    public PageResult priceSaleCustomerProductFindByPage(
            @RequestParam(value = "customerInfo") String customerInfo,
            @RequestParam(value = "productInfo") String productInfo,
            @RequestParam(value = "pageIndex") Integer pageIndex,
            @RequestParam(value = "pageSize") Integer pageSize ){
        List<PriceSaleProductVO> list =
                priceSaleService.priceSaleProductFindByPage(customerInfo,pageIndex,pageSize);
        return  PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(list, PricePurchaseProductSupplierVO.class));
    }

}
