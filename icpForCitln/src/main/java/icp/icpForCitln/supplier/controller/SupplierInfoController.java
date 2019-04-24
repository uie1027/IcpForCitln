/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoController
 * Package Name: icp.icpForCitln.supplier.controller
 * Date: 2019/4/12 16:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.controller;


import icp.icpForCitln.common.result.CommonResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedUtil;
import icp.icpForCitln.supplier.dto.SupplierInfoDTO;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierInfoService;
import icp.icpForCitln.supplier.vo.SupplierInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/supplierInfo")
public class SupplierInfoController {
    @Autowired
    private SupplierInfoService supplierInfoService;
    @RequestMapping("/supplierInfoSaveTest")
    public void supplierInfoSaveTest(){
        SupplierInfo supplierInfo = new SupplierInfo();
        supplierInfo.setId("TEST");
        supplierInfo.setCompanyCode("123456");
        supplierInfo.setUnifiedSocialCreditCode("1234567980");
        supplierInfo.setCompanyName("华峰创享");
        supplierInfo.setCompanyShortName("创享");
        supplierInfo.setCompanyFax("021-1234567");
        supplierInfo.setCompanyEmail("chuangxiang@668.com");
        supplierInfo.setCompanyContact("小明");
        supplierInfo.setCompanyContactPhone("1234456790");
        supplierInfo.setCompanyTelephone("021-1234567");
        supplierInfo.setCurrency("中国");
        supplierInfo.setProvince("上海");
        supplierInfo.setCity("上海");
        supplierInfo.setDistrict("浦东新区");
        supplierInfo.setCompanyAddress("上海浦东康桥");
        supplierInfo.setCompanyIntroduction("公司介绍");
        supplierInfo.setCompanyPicture("AAAAAAAAAAAAAA");
        supplierInfo.setBankName("中国银行");
        supplierInfo.setCurrency("17%");
        supplierInfo.setBankAccount("6222121346546456456");
        supplierInfo.setFrozen(1);
        supplierInfo.setHandelCode("101.10.2335.66.5656.1111.00");
        supplierInfo.setCreater("TEST");
        supplierInfo.setCreateTime(new Date());
        supplierInfo.setLastMondifier("TEST");
        supplierInfo.setLastModificationTime(new Date());
        supplierInfo.setIsDelete(1);
        supplierInfoService.saveTest(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/24 17:30
     * @since: JDK 1.8
     *
     * @description: 获取供应商信息
     * @param: [pageIndex, pageSize, supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/supplierListByPage")
    public CommonResult supplierListByPage(
            @RequestParam(value = "pageIndex" , defaultValue = "0" ) Integer pageIndex,
            @RequestParam(value = "pageSize" , defaultValue = "10") Integer pageSize, SupplierInfoDTO supplierInfoDTO){
        return CommonResult.returnResult(CommonResult.ERROR_CODE,supplierInfoService.supplierListByPage(pageIndex,pageSize,supplierInfoDTO));
    }


    /**
     * @author: guoxs
     * @date: 19/04/24 17:30
     * @since: JDK 1.8
     *
     * @description: 保存供应商信息
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @PostMapping("/saveSupplierInfo")
    public CommonResult saveSupplierInfo(SupplierInfoDTO supplierInfoDto){
        supplierInfoDto.setCompanyCode(GeneratedUtil.generatedCode());
        supplierInfoService.saveSupplierInfo(supplierInfoDto);
        return CommonResult.returnResult(CommonResult.ERROR_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/04/24 17:30
     * @since: JDK 1.8
     *
     * @description: 冻结供应商
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @PostMapping("/frozenSupplierInfo")
    public CommonResult frozenSupplierInfo(SupplierInfoDTO supplierInfoDto){
        supplierInfoService.frozenSupplierInfo(supplierInfoDto);
        return CommonResult.returnResult(CommonResult.ERROR_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/04/24 17:29
     * @since: JDK 1.8
     *
     * @description: 解冻供应商
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @PostMapping("/thawSupplierInfo")
    public CommonResult thawSupplierInfo(SupplierInfoDTO supplierInfoDto){
        supplierInfoService.thawSupplierInfo(supplierInfoDto);
        return CommonResult.returnResult(CommonResult.ERROR_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/04/24 17:29
     * @since: JDK 1.8
     *
     * @description: 编辑供应商信息
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @PostMapping("/updateSupplierInfo")
    public CommonResult updateSupplierInfo(SupplierInfoDTO supplierInfoDto){
        supplierInfoService.updateSupplierInfo(supplierInfoDto);
        return CommonResult.returnResult(CommonResult.ERROR_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/04/24 17:29
     * @since: JDK 1.8
     *
     * @description: 获取供应商详情
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/supplierInfoById")
    public CommonResult supplierInfoById(SupplierInfoDTO supplierInfoDto){
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE,BeanCopyUtil.copy(supplierInfoService.supplierInfoById(supplierInfoDto), SupplierInfoVO.class));
    }


    /**
     * @author: guoxs
     * @date: 19/04/24 17:29
     * @since: JDK 1.8
     *
     * @description: 删除供应商信息
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @PostMapping("/deleteSupplierInfo")
    public CommonResult deleteSupplierInfo(SupplierInfoDTO supplierInfoDto){
        supplierInfoService.deleteSupplierInfo(supplierInfoDto);
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE,null);
    }
}
