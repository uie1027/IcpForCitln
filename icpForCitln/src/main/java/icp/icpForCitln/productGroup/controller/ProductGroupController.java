/**
 * Project Name: icpForCitln
 * File Name: ProductGroupEnterpeiseAttributeController
 * Package Name: icp.icpForCitln.productGroup.controller
 * Date: 2019/4/12 15:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.controller;

import icp.icpForCitln.common.result.CommonResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.RedisCommonUtil;
import icp.icpForCitln.productGroup.entity.ProductGroupEnterpeiseAttribute;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import icp.icpForCitln.productGroup.entity.ProductGroupPlatformAttribute;
import icp.icpForCitln.productGroup.service.ProductGroupService;
import icp.icpForCitln.productGroup.vo.ProductGroupInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/ProductGroup")
public class ProductGroupController {

    @Autowired
    private ProductGroupService productGroupService;


    @GetMapping("/productGroupEnterpeiseAttributeSaveTest")
    public void productGroupEnterpeiseAttributeSaveTest(){
        ProductGroupEnterpeiseAttribute
                productGroupEnterpeiseAttribute = new ProductGroupEnterpeiseAttribute();

        productGroupEnterpeiseAttribute.setId("TEST");
        productGroupEnterpeiseAttribute.setProductGroupCode("ProductGroupCode");
        productGroupEnterpeiseAttribute.setPlatformAttributeCode("PlatformAttributeCode");
        productGroupEnterpeiseAttribute.setCreater("TEST");
        productGroupEnterpeiseAttribute.setCreateTime(new Date());
        productGroupEnterpeiseAttribute.setLastMondifier("TEST");
        productGroupEnterpeiseAttribute.setLastModificationTime(new Date());
        productGroupEnterpeiseAttribute.setIsDelete(1);

        productGroupService.productGroupEnterpeiseAttributeSaveTest(productGroupEnterpeiseAttribute);
    }

    @GetMapping("/productGroupInfoSaveTest")
    public void productGroupInfoSaveTest(){
        ProductGroupInfo productGroupInfo = new ProductGroupInfo();
        productGroupInfo.setId("TEST");
        productGroupInfo.setProductGroupCode("ProductGroupCode");
        productGroupInfo.setProductGroupName("ProductGroupName");
        productGroupInfo.setPlatformFirstDirectory("PlatformFirstDirectory");
        productGroupInfo.setPlatformSecondDirectory("PlatformSecondDirectory");
        productGroupInfo.setBrand("Brand");
        productGroupInfo.setPicture("Picture");
        productGroupInfo.setDetailedInformation("DetailedInformation");
        productGroupInfo.setCreater("TEST");
        productGroupInfo.setCreateTime(new Date());
        productGroupInfo.setLastMondifier("TEST");
        productGroupInfo.setLastModificationTime(new Date());
        productGroupInfo.setIsDelete(1);

        productGroupService.productGroupInfoSaveTest(productGroupInfo);
    }

    @GetMapping("/productGroupMailDisplaySaveTest")
    public void productGroupMailDisplaySaveTest(){
        ProductGroupMailDisplay productGroupMailDisplay = new ProductGroupMailDisplay();
        productGroupMailDisplay.setId("TEST");
        productGroupMailDisplay.setProductGroupCode("ProductGroupCode");
        productGroupMailDisplay.setMailDisplayCode("MailDisplayCode");
        productGroupMailDisplay.setCreater("TEST");
        productGroupMailDisplay.setCreateTime(new Date());
        productGroupMailDisplay.setLastMondifier("TEST");
        productGroupMailDisplay.setLastModificationTime(new Date());
        productGroupMailDisplay.setIsDelete(1);

        productGroupService.productGroupMailDisplaySaveTest(productGroupMailDisplay);
    }

    @GetMapping("/productGroupPlatformAttributeSaveTest")
    public void productGroupPlatformAttributeSaveTest(){
        ProductGroupPlatformAttribute
                productGroupPlatformAttribute = new ProductGroupPlatformAttribute();

        productGroupPlatformAttribute.setId("TEST");
        productGroupPlatformAttribute.setProductGroupCode("ProductGroupCode");
        productGroupPlatformAttribute.setPlatformAttributeCode("PlatformAttributeCode");
        productGroupPlatformAttribute.setCreater("TEST");
        productGroupPlatformAttribute.setCreateTime(new Date());
        productGroupPlatformAttribute.setLastMondifier("TEST");
        productGroupPlatformAttribute.setLastModificationTime(new Date());
        productGroupPlatformAttribute.setIsDelete(1);

        productGroupService.productGroupPlatformAttributeSaveTest(productGroupPlatformAttribute);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-25 上午 10:36
     * @since: JDK 1.8
     *
     * @description: 产品组下拉列表获取
     * @param: []
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/getProductGroupInfoList")
    public CommonResult getProductGroupInfoList(){
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE, BeanCopyUtil.copy(RedisCommonUtil.getList(new ProductGroupInfo()), ProductGroupInfoVO.class));
    }
}
