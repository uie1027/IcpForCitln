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
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.price.entity.PriceSaleCustomerProduct;
import icp.icpForCitln.price.entity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.price.entity.PriceSaleProduct;
import icp.icpForCitln.price.entity.PriceSaleProductGroup;
import icp.icpForCitln.price.service.PriceSaleService;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return  PageResult.returnResult(PageResult.SUCCESS_CODE,
                priceSaleService.priceSaleProductGroupFindByPage(searchField,pageIndex,pageSize));
    }

    /**
     * @author: Hujh
     * @date: 2019/5/6 19:45
     * @since: JDK 1.8
     *
     * @description: 商品价格分页查询(销售)
     * @param: [searchField, pageIndex, pageSize]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleProductFindByPage")
    public PageResult priceSaleProductFindByPage(@RequestParam(value = "searchField") String searchField,
                                              @RequestParam(value = "pageIndex") Integer pageIndex,
                                              @RequestParam(value = "pageSize") Integer pageSize ){
        return  PageResult.returnResult(PageResult.SUCCESS_CODE,
                priceSaleService.priceSaleProductFindByPage(searchField,pageIndex,pageSize));
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
        return  PageResult.returnResult(PageResult.SUCCESS_CODE,
                priceSaleService.priceSaleCustomerProductGroupFindByPage(customerInfo,productGroupInfo,pageIndex,pageSize));
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
        return  PageResult.returnResult(PageResult.SUCCESS_CODE,
                priceSaleService.priceSaleCustomerProductFindByPage(customerInfo,productInfo,pageIndex,pageSize));
    }

    /**
     * @author:
     * date: 2019/5/14 14:12
     * @since: JDK 1.8
     *
     * @description: 商品组价格保存
     * @param: [priceSaleProductGroupDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleProductGroupSave")
    public PageResult priceSaleProductGroupSave(@RequestBody PriceSaleProductGroupDTO priceSaleProductGroupDTO){
        if(priceSaleProductGroupDTO != null){
            priceSaleService.priceSaleProductGroupSave(priceSaleProductGroupDTO);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,"商品组价格保存成功！");
        }else{
            return PageResult.returnResult(PageResult.ERROR_CODE,"保存参数为空！");
        }
    }

    /**
     * @author:
     * date: 2019/5/14 14:12
     * @since: JDK 1.8
     *
     * @description: 商品价格保存
     * @param: [priceSaleProductGroupDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleProductSave")
    public PageResult priceSaleProductSave(@RequestBody  PriceSaleProductDTO priceSaleProductDTO){
        if(priceSaleProductDTO != null){
            priceSaleService.priceSaleProductSave(priceSaleProductDTO);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,"商品价格保存成功！");
        }else{
            return PageResult.returnResult(PageResult.ERROR_CODE,"保存参数为空！");
        }
    }

    /**
     * @author:
     * date: 2019/5/14 14:12
     * @since: JDK 1.8
     *
     * @description: 客户商品组价格保存
     * @param: [priceSaleProductGroupDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleCustomerProductGroupSave")
    public PageResult priceSaleCustomerProductGroupSave(@RequestBody  PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDTO){
        if(priceSaleCustomerProductGroupDTO != null){
            priceSaleService.priceSaleCustomerProductGroupSave(priceSaleCustomerProductGroupDTO);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,"客户商品组价格保存成功！");
        }else{
            return PageResult.returnResult(PageResult.ERROR_CODE,"保存参数为空！");
        }
    }

    /**
     * @author:
     * date: 2019/5/14 14:12
     * @since: JDK 1.8
     *
     * @description: 客户商品价格保存
     * @param: [priceSaleProductGroupDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleCustomerProductSave")
    public PageResult priceSaleProductGroupSave(@RequestBody  PriceSaleCustomerProductDTO priceSaleCustomerProductDTO){
        if(priceSaleCustomerProductDTO != null){
           priceSaleService.priceSaleCustomerProductSave(priceSaleCustomerProductDTO);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,"客户商品价格保存成功！");
        }else{
            return PageResult.returnResult(PageResult.ERROR_CODE,"保存参数为空！");
        }
    }

    /**
     * @author:
     * date: 2019/5/14 17:44
     * @since: JDK 1.8
     *
     * @description: 商品价格查询（ID）
     * @param: [priceSaleProductDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleProductFindById")
    public PageResult priceSaleProductFindById(@RequestBody List<PriceSaleProductDTO> priceSaleProductDTOS){
        if(!StringUtil.isEmpty(priceSaleProductDTOS)){
            List<PriceSaleProductVO> resList = priceSaleService.priceSaleProductFindById(priceSaleProductDTOS);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,resList);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 18:45
     * @since: JDK 1.8
     *
     * @description: 商品组价格查询
     * @param: [priceSaleProductGroupDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleProductGroupFindById")
    public PageResult priceSaleProductGroupFindById(@RequestBody List<PriceSaleProductGroupDTO> priceSaleProductGroupDTOS){
        if(!StringUtil.isEmpty(priceSaleProductGroupDTOS)){
            List<PriceSaleProductGroupVO> resList = priceSaleService.priceSaleProductGroupFindById(priceSaleProductGroupDTOS);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,resList);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 18:44
     * @since: JDK 1.8
     *
     * @description: 客户商品价格查询
     * @param: [priceSaleCustomerProductDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleCustomerProductFindById")
    public PageResult priceSaleCustomerProductFindById(@RequestBody List<PriceSaleCustomerProductDTO> priceSaleCustomerProductDTOS){
        if(!StringUtil.isEmpty(priceSaleCustomerProductDTOS)){
            List<PriceSaleCustomerProductVO> resList = priceSaleService.priceSaleCustomerProductFindById(priceSaleCustomerProductDTOS);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,resList);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 18:44
     * @since: JDK 1.8
     *
     * @description: 客户商品组价格查询
     * @param: [priceSaleCustomerProductGroupDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/priceSaleCustomerProductGroupFindById")
    public PageResult priceSaleCustomerProductGroupFindById(@RequestBody List<PriceSaleCustomerProductGroupDTO> priceSaleCustomerProductGroupDTOS){
        if(!StringUtil.isEmpty(priceSaleCustomerProductGroupDTOS)){
            List<PriceSaleCustomerProductGroupVO> resList = priceSaleService.priceSaleCustomerProductGroupFindById(priceSaleCustomerProductGroupDTOS);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,resList);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 19:00
     * @since: JDK 1.8
     *
     * @description: 产品价格更新
     * @param: [priceSaleProductDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleProductUpdate")
    public PageResult priceSaleProductUpdate(List<PriceSaleProductDTO> priceSaleProductDTOS){
        if(priceSaleProductDTOS != null && priceSaleProductDTOS.size() >0 ){
            List<PriceSaleProduct> list
                    = BeanCopyUtil.copy(priceSaleProductDTOS,PriceSaleProduct.class);
            MongoUtil.upsert(list,1);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 19:00
     * @since: JDK 1.8
     *
     * @description: 产品组价格更新
     * @param: [priceSaleProductGroupDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleProductGroupUpdate")
    public PageResult priceSaleProductGroupUpdate(List<PriceSaleProductGroupDTO> priceSaleProductGroupDTOS){
        if(priceSaleProductGroupDTOS != null && priceSaleProductGroupDTOS.size() >0 ){
            List<PriceSaleProductGroup> list
                    = BeanCopyUtil.copy(priceSaleProductGroupDTOS,PriceSaleProductGroup.class);
            MongoUtil.upsert(list,1);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 19:00
     * @since: JDK 1.8
     *
     * @description: 客户产品价格更新
     * @param: [priceSaleCustomerProductDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleCustomerProductUpdate")
    public PageResult priceSaleCustomerProductUpdate(List<PriceSaleCustomerProductDTO> priceSaleCustomerProductDTOS){
        if(priceSaleCustomerProductDTOS != null && priceSaleCustomerProductDTOS.size() >0 ){
            List<PriceSaleCustomerProduct> list
                    = BeanCopyUtil.copy(priceSaleCustomerProductDTOS,PriceSaleCustomerProduct.class);
            MongoUtil.upsert(list,1);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

    /**
     * @author:
     * date: 2019/5/14 19:01
     * @since: JDK 1.8
     *
     * @description: 客户产品组价格更新
     * @param: [priceSaleCustomerProductGroupDTOS]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/priceSaleCustomerProductGroupUpdate")
    public PageResult priceSaleCustomerProductGroupUpdate(@RequestBody
            List<PriceSaleCustomerProductGroupDTO> priceSaleCustomerProductGroupDTOS){
        if(priceSaleCustomerProductGroupDTOS != null && priceSaleCustomerProductGroupDTOS.size() >0 ){
            List<PriceSaleCustomerProductGroup> list
                    = BeanCopyUtil.copy(priceSaleCustomerProductGroupDTOS,PriceSaleCustomerProductGroup.class);
            MongoUtil.upsert(list,1);
            return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
        }
        return PageResult.returnResult(PageResult.ERROR_CODE,null);
    }

}