/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.priceSale.controller
 * Date: 19/04/12 16:11
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.priceSale.controller;


import icp.icpForCitln.common.exception.BusinessException;
import icp.icpForCitln.common.result.CommonResult;
import icp.icpForCitln.common.util.GetPropertiesUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleProductDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.priceSale.service.PriceSaleService;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductVO;
import io.micrometer.core.instrument.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priceSale")
public class PriceSaleController {
    private final static Logger logger = LoggerFactory.getLogger(PriceSaleController.class);

    @Autowired
    private PriceSaleService priceSaleService;

    /**
     * @author: Hujh
     * @date: 2019/4/23 10:13
     * @since: JDK 1.8
     *
     * @description: 商品价格保存
     * @param: [priceSaleProductDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @PostMapping("/priceSaleProductSave")
    public CommonResult priceSaleProductSave(@RequestBody PriceSaleProductDTO priceSaleProductDto){
        logger.info("priceSaleProductSave：-> PriceSaleProductDTO：" + priceSaleProductDto.toString());
        if(!StringUtil.isEmpty(priceSaleProductDto)){
            priceSaleService.priceSaleProductSave(priceSaleProductDto);
            return CommonResult.returnResult(CommonResult.SUCCESS_CODE,
                    GetPropertiesUtil.getPropertiesVal(
                            "message.properties","SAVE_SUCCESS") );
        }else{
            return CommonResult.returnResult(CommonResult.ERROR_CODE,
                    GetPropertiesUtil.getPropertiesVal(
                            "message.properties","REQUEST_PARAMETER_VILIDATION_ERROR") );
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/15 17:30
     * @since: JDK 1.8
     *
     * @description: 商品价格删除（IS_DELETE=1）
     * @param: [ids]
     * @return: void
     */
    @PostMapping(value = "/priceSaleProductDelete")
    public CommonResult priceSaleProductDelete(@RequestBody List<String>  idList){
        logger.info("priceSaleProductDelete -> idList:" + idList);
        if(StringUtil.isEmpty(idList)){
            throw  new BusinessException(GetPropertiesUtil.getPropertiesVal(
                    "message.properties","REQUEST_PARAMETER_VILIDATION_ERROR"));
        }else{
            priceSaleService.priceSaleProductDelete(idList);
        }
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE,"数据删除已成功！");
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 10:33
     * @since: JDK 1.8
     *
     * @description: 商品价格更新
     * @param: [list]
     * @return: void
     */
    @PostMapping("/priceSaleProductUpdate")
    public void priceSaleProductUpdate(List<PriceSaleProductDTO> list){
        logger.info("priceSaleProductUpdate -> PriceSaleProductDtoList：" + list.toString());
        if(list == null || list.size() == 0 ){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleProductUpdate(list);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:49
     * @since: JDK 1.8
     *
     * @description: 分页查询商品价格
     * @param: [pageIndex, pageSize]
     * @return: void
     */
    @GetMapping("/priceSaleProductListByPage")
    @ResponseBody
    public CommonResult priceSaleProductListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        logger.info("priceSaleProductListByPage -> pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleProductVO> list = priceSaleService.priceSaleProductListByPage(pageIndex, pageSize);
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE,list);
    }



    /**
     * @author: guoxs
     * date: 19/04/12 16:36
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProductGroup 保存
     * @param: []
     * @return: void
     */
    @PostMapping("/priceSaleProductGroupSave")
    public CommonResult priceSaleProductGroupSave(@RequestBody PriceSaleProductGroupDTO priceSaleProductGroupDto){
        logger.info("priceSaleProductGroupSave：-> PriceSaleProductGroupDTO：" + priceSaleProductGroupDto.toString());
        if(!StringUtil.isEmpty(priceSaleProductGroupDto)){
            priceSaleService.priceSaleProductGroupSave(priceSaleProductGroupDto);
            return CommonResult.returnResult(CommonResult.SUCCESS_CODE,
                    GetPropertiesUtil.getPropertiesVal(
                            "message.properties","SAVE_SUCCESS") );
        }else{
            return CommonResult.returnResult(CommonResult.ERROR_CODE,
                    GetPropertiesUtil.getPropertiesVal(
                            "message.properties","REQUEST_PARAMETER_VILIDATION_ERROR"));
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 删除选择行项目（IS_DELETE=1）
     * @param: [ids]
     * @return: void
     */
    @PostMapping("/priceSaleProductGroupDelete")
    public void priceSaleProductGroupDelete(@RequestBody List<String>  idList){
        logger.info("priceSaleProductGroupDelete -> idList:" + idList);
        if(StringUtil.isEmpty(idList)){
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleProductGroupDelete(idList);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 更新选择行项目
     * @param: [list]
     * @return: void
     */
    @PostMapping("/priceSaleProductGroupUpdate")
    public void priceSaleProductGroupUpdate(List<PriceSaleProductGroupDTO> list){

        logger.info("PriceSaleProductDtoList：" + list.toString());
        if(list == null || list.size() == 0 ){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleProductGroupUpdate(list);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 分页查询
     * @param: [pageIndex, pageSize]
     * @return: void
     */
    @GetMapping("/priceSaleProductGroupListByPage")
    public CommonResult priceSaleProductGroupListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleProductGroupVO> list = priceSaleService.priceSaleProductGroupListByPage(pageIndex, pageSize);
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE,list);
    }



    /**
     * @author: guoxs
     * date: 19/04/12 16:40
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProduct 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductSave")
    public void priceSaleCustomerProductSave(@RequestBody PriceSaleCustomerProductDTO priceSaleCustomerProductDto){
        priceSaleService.priceSaleCustomerProductSave(priceSaleCustomerProductDto);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 删除选择行项目（IS_DELETE=1）
     * @param: [ids]
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductDelete")
    public void priceSaleCustomerProductDelete(List<String> idList){
        logger.info("priceSaleCustomerProductDelete ->idList:" + idList);
        if(StringUtil.isEmpty(idList)){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleCustomerProductDelete(idList);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 更新选择行项目
     * @param: [list]
     * @return: void
     */
    @PostMapping("/priceSaleCustomerProductUpdate")
    public void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProductDTO> list){
        logger.info("PriceSaleProductDtoList：" + list.toString());
        if(list == null || list.size() == 0 ){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleCustomerProductUpdate(list);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 分页查询
     * @param: [pageIndex, pageSize]
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductListByPage")
    public CommonResult priceSaleCustomerProductListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0" ) Integer pageIndex,
            @RequestParam(value = "pageSize" , defaultValue = "10") Integer pageSize){
        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleCustomerProductVO> list
                = priceSaleService.priceSaleCustomerProductListByPage(pageIndex, pageSize);
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE,list);
    }



    /**
     * @author: guoxs
     * date: 19/04/12 16:44
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProductGroup 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductGroupSave")
    public void priceSaleCustomerProductGroupSave(@RequestBody PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDto){
        priceSaleService.priceSaleCustomerProductGroupSave(priceSaleCustomerProductGroupDto);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 删除选择行项目（IS_DELETE=1）
     * @param: [ids]
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductGroupDelete")
    public void priceSaleCustomerProductGroupDelete(@RequestBody List<String> idList){
        logger.info("priceSaleCustomerProductGroupDelete -> idList:" + idList);
        if(StringUtil.isEmpty(idList)){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleCustomerProductGroupDelete(idList);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 更新选择行项目
     * @param: [list]
     * @return: void
     */
    @PostMapping("/priceSaleCustomerProductGroupUpdate")
    public void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroupDTO> list){

        logger.info("PriceSaleProductDtoList：" + list.toString());
        if(list == null || list.size() == 0 ){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleCustomerProductGroupUpdate(list);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:53
     * @since: JDK 1.8
     *
     * @description: 分页查询
     * @param: [pageIndex, pageSize]
     * @return: void
     */
    @GetMapping("/priceSaleCustomerProductGroupListByPage")
    public CommonResult priceSaleCustomerProductGroupListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleCustomerProductGroupVO> list
                = priceSaleService.priceSaleCustomerProductGroupListByPage(pageIndex, pageSize);
        return  CommonResult.returnResult(CommonResult.SUCCESS_CODE,list);
    }


}
