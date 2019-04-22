/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.priceSale.controller
 * Date: 19/04/12 16:11
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.controller;


import icp.icpForCitln.common.exception.BusinessException;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductDto;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductGroupDto;
import icp.icpForCitln.priceSale.dto.PriceSaleProductDto;
import icp.icpForCitln.priceSale.dto.PriceSaleProductGroupDto;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
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

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/priceSale")
public class PriceSaleController {
    private final static Logger logger = LoggerFactory.getLogger(PriceSaleController.class);

    @Autowired
    private PriceSaleService priceSaleService;

    /**
     * @author: guoxs
     * date: 19/04/12 16:30
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProduct 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/priceSaleProductSaveTest")
    public void priceSaleProductSaveTest(){
        PriceSaleProduct priceSaleProduct = new PriceSaleProduct();
        priceSaleProduct.setId("test");
        priceSaleProduct.setEach(1);
        priceSaleProduct.setBasicUnit("个");
        priceSaleProduct.setCurrency("CNY");
        priceSaleProduct.setProductCode("12");
        priceSaleProduct.setProductPriceCodeSale("11");
        priceSaleProduct.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleProduct.setTaxRate("22");
        priceSaleProduct.setCreater("1");
        priceSaleProduct.setCreateTime(new Date());
        priceSaleProduct.setIsDelete(0);
        priceSaleProduct.setLastModificationTime(new Date());
        priceSaleProduct.setLastMondifier("2");
        priceSaleService.priceSaleProductSaveTest(priceSaleProduct);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/15 17:30
     * @since: JDK 1.8
     *
     * @description: 根据ID删除删除行项目（IS_DELETE=1）
     * @param: [ids]
     * @return: void
     */
    @GetMapping("/priceSaleProductDel")
    public void priceSaleProductDel(@RequestParam(value = "ids") String ids){
        logger.info("ids:" + ids);
        if(StringUtils.isEmpty(ids)){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleProductDel(ids);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 10:33
     * @since: JDK 1.8
     *
     * @description: 更新选择行项目
     * @param: [list]
     * @return: void
     */
    @PostMapping("/priceSaleProductUpdate")
    public void priceSaleProductUpdate(List<PriceSaleProductDto> list){
        logger.info("PriceSaleProductDtoList：" + list.toString());
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
     * @description: 分页查询
     * @param: [pageIndex, pageSize]
     * @return: void
     */
    @GetMapping("/priceSaleProductListByPage")
    public void priceSaleProductListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){

        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleProductVO> list = priceSaleService.priceSaleProductListByPage(pageIndex, pageSize);
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
    @GetMapping("/priceSaleProductGroupSaveTest")
    public void priceSaleProductGroupSaveTest(){
        PriceSaleProductGroup priceSaleProductGroup = new PriceSaleProductGroup();
        priceSaleProductGroup.setId("222222");
        priceSaleProductGroup.setBasicUnit("s");
        priceSaleProductGroup.setCurrency("S");
        priceSaleProductGroup.setEach(1);
        priceSaleProductGroup.setProductGroupCode("111111");
        priceSaleProductGroup.setProductGroupPriceCodeSale("111111");
        priceSaleProductGroup.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleProductGroup.setTaxRate("1");
        priceSaleProductGroup.setCreater("1");
        priceSaleProductGroup.setCreateTime(new Date());
        priceSaleProductGroup.setIsDelete(0);
        priceSaleProductGroup.setLastModificationTime(new Date());
        priceSaleProductGroup.setLastMondifier("2");

        priceSaleService.priceSaleProductGroupSaveTest(priceSaleProductGroup);
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
    @PostMapping("/priceSaleProductGroupDel")
    public void priceSaleProductGroupDel(@RequestParam(value = "ids") String ids){
        logger.info("ids:" + ids);
        if(StringUtils.isEmpty(ids)){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleProductGroupDel(ids);
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
    public void priceSaleProductGroupUpdate(List<PriceSaleProductGroupDto> list){

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
    public void priceSaleProductGroupListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleProductGroupVO> list = priceSaleService.priceSaleProductGroupListByPage(pageIndex, pageSize);
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
    @GetMapping("/priceSaleCustomerProductSaveTest")
    public void priceSaleCustomerProductSaveTest(){
        PriceSaleCustomerProduct priceSaleCustomerProduct = new PriceSaleCustomerProduct();

        priceSaleCustomerProduct.setBasicUnit("2");
        priceSaleCustomerProduct.setCompanyCode("111111");
        priceSaleCustomerProduct.setCurrency("1");
        priceSaleCustomerProduct.setEach(1);
        priceSaleCustomerProduct.setProductCode("111111");
        priceSaleCustomerProduct.setProductPriceCodeSale("111111");
        priceSaleCustomerProduct.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleCustomerProduct.setTaxRate("!");
        priceSaleCustomerProduct.setCreater("1");
        priceSaleCustomerProduct.setCreateTime(new Date());
        priceSaleCustomerProduct.setId("!");
        priceSaleCustomerProduct.setIsDelete(0);
        priceSaleCustomerProduct.setLastModificationTime(new Date());
        priceSaleCustomerProduct.setLastMondifier("2");

        priceSaleService.priceSaleCustomerProductSaveTest(priceSaleCustomerProduct);
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
    @GetMapping("/priceSaleCustomerProductDel")
    public void priceSaleCustomerProductDel(@RequestParam(value = "ids") String ids){
        logger.info("ids:" + ids);
        if(StringUtils.isEmpty(ids)){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleCustomerProductDel(ids);
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
    public void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProductDto> list){
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
    public void priceSaleCustomerProductListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0" ) Integer pageIndex,
            @RequestParam(value = "pageSize" , defaultValue = "10") Integer pageSize){
        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleCustomerProductVO> list
                = priceSaleService.priceSaleCustomerProductListByPage(pageIndex, pageSize);
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
    @GetMapping("/priceSaleCustomerProductGroupSaveTest")
    public void priceSaleCustomerProductGroupSaveTest(){
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup = new PriceSaleCustomerProductGroup();

        priceSaleCustomerProductGroup.setBasicUnit("2");
        priceSaleCustomerProductGroup.setCompanyCode("111111");
        priceSaleCustomerProductGroup.setCurrency("!");
        priceSaleCustomerProductGroup.setEach(1);
        priceSaleCustomerProductGroup.setProductGroupCode("111111");
        priceSaleCustomerProductGroup.setProductGroupPriceCodeSale("111111");
        priceSaleCustomerProductGroup.setTaxIncludedPrice(new BigDecimal(1));
        priceSaleCustomerProductGroup.setTaxRate("!");
        priceSaleCustomerProductGroup.setCreater("1");
        priceSaleCustomerProductGroup.setCreateTime(new Date());
        priceSaleCustomerProductGroup.setId("!");
        priceSaleCustomerProductGroup.setIsDelete(0);
        priceSaleCustomerProductGroup.setLastModificationTime(new Date());
        priceSaleCustomerProductGroup.setLastMondifier("2");

        priceSaleService.priceSaleCustomerProductGroupSaveTest(priceSaleCustomerProductGroup);
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
    @GetMapping("/priceSaleCustomerProductGroupDel")
    public void priceSaleCustomerProductGroupDel(@RequestParam(value = "ids") String ids){
        logger.info("ids:" + ids);
        if(StringUtils.isEmpty(ids)){
            //TODO 异常信息修改
            throw  new BusinessException("参数不正确");
        }
        priceSaleService.priceSaleCustomerProductGroupDel(ids);
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
    public void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroupDto> list){

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
    public void priceSaleCustomerProductGroupListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0") Integer pageIndex,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        logger.info("pageIndex:" + pageIndex +";pageSize:" + pageSize );
        List<PriceSaleCustomerProductGroupVO> list
                = priceSaleService.priceSaleCustomerProductGroupListByPage(pageIndex, pageSize);
    }


}
