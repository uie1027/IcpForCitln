/**
 * Project Name: icpForCitln
 * File Name: PlatformDiretoryController
 * Package Name: icp.icpForCitln.platform.controller
 * Date: 2019-04-12 下午 2:06
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.controller;

import icp.icpForCitln.common.result.CommonResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.RedisCommonUtil;
import icp.icpForCitln.platform.dto.PlatformDirectoryInfoAddDTO;
import icp.icpForCitln.platform.dto.PlatformDirectoryInfoDeleteDTO;
import icp.icpForCitln.platform.eneity.*;
import icp.icpForCitln.platform.service.PlatformService;
import icp.icpForCitln.platform.vo.PlatformBrandInfoVO;
import icp.icpForCitln.platform.vo.PlatformDirectoryInfoVO;
import icp.icpForCitln.platform.vo.PlatformMailDisplayVO;
import icp.icpForCitln.platform.vo.PlatformUnitInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/platform")
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 2:12
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectory 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/platformDirectoryInfoSaveTest")
    public void platformDirectoryInfoSaveTest(){
        PlatformDirectoryInfo platformDirectoryInfo = new PlatformDirectoryInfo();

        platformDirectoryInfo.setId("testId");
        platformDirectoryInfo.setPlatformDirectoryCode("testCode");
        platformDirectoryInfo.setPlatformDirectoryName("testName");
        platformDirectoryInfo.setPlatformDirectoryLevel(1);
        platformDirectoryInfo.setParenetPlatformDirectoryCode("1");
        platformDirectoryInfo.setPlatformDirectoryDescription("备注测试");
        platformDirectoryInfo.setCreater("testcreater");
        platformDirectoryInfo.setCreateTime(new Date());
        platformDirectoryInfo.setLastMondifier("lastman");
        platformDirectoryInfo.setLastModificationTime(new Date());
        platformDirectoryInfo.setIsDelete(2);

        platformService.platformDirectoryInfoSaveTest(platformDirectoryInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:42
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryAttribute 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/platformDirectoryAttributeSaveTest")
    public void platformDirectoryAttributeSaveTest(){
        PlatformDirectoryAttribute platformDirectoryAttribute = new PlatformDirectoryAttribute();

        platformDirectoryAttribute.setId("testId");
        platformDirectoryAttribute.setPlatformDirectoryCode("testdcode");
        platformDirectoryAttribute.setPlatformAttributeCode("testacode");
        platformDirectoryAttribute.setPlatformAttributeName("testname");
        platformDirectoryAttribute.setCreater("testcreater");
        platformDirectoryAttribute.setCreateTime(new Date());
        platformDirectoryAttribute.setLastMondifier("lastman");
        platformDirectoryAttribute.setLastModificationTime(new Date());
        platformDirectoryAttribute.setIsDelete(2);

        platformService.platformDirectoryAttributeSaveTest(platformDirectoryAttribute);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:43
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryAttributeValue 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/platformDirectoryAttributeValueSaveTest")
    public void platformDirectoryAttributeValueSaveTest(){
        PlatformDirectoryAttributeValue platformDirectoryAttributeValue = new PlatformDirectoryAttributeValue();

        platformDirectoryAttributeValue.setId("testId");
        platformDirectoryAttributeValue.setPlatformAttributeCode("testacode");
        platformDirectoryAttributeValue.setPlatformAttributeContent("testacontent");
        platformDirectoryAttributeValue.setCreater("testcreater");
        platformDirectoryAttributeValue.setCreateTime(new Date());
        platformDirectoryAttributeValue.setLastMondifier("lastman");
        platformDirectoryAttributeValue.setLastModificationTime(new Date());
        platformDirectoryAttributeValue.setIsDelete(2);

        platformService.platformDirectoryAttributeValueSaveTest(platformDirectoryAttributeValue);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:43
     * @since: JDK 1.8
     *
     * @description: 测试 platformUnitInfo 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/platformUnitInfoSaveTest")
    public void platformUnitInfoSaveTest(){
        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();

        platformUnitInfo.setId("testId");
        platformUnitInfo.setUnitCode("testucode");
        platformUnitInfo.setUnitVariety(1);
        platformUnitInfo.setUnitValue("testvalue");
        platformUnitInfo.setUnitDescription("testdescription");
        platformUnitInfo.setCreater("testcreater");
        platformUnitInfo.setCreateTime(new Date());
        platformUnitInfo.setLastMondifier("lastman");
        platformUnitInfo.setLastModificationTime(new Date());
        platformUnitInfo.setIsDelete(2);

        platformService.platformUnitInfoSaveTest(platformUnitInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 上午 11:44
     * @since: JDK 1.8
     *
     * @description: 测试 platformMailDisplay 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/platformMailDisplaySaveTest")
    public void platformMailDisplaySaveTest(){
        PlatformMailDisplay platformMailDisplay = new PlatformMailDisplay();

        platformMailDisplay.setId("testId");
        platformMailDisplay.setMailDisplayCode("testcode");
        platformMailDisplay.setMailName("name");
        platformMailDisplay.setCreater("testcreater");
        platformMailDisplay.setCreateTime(new Date());
        platformMailDisplay.setLastMondifier("lastman");
        platformMailDisplay.setLastModificationTime(new Date());
        platformMailDisplay.setIsDelete(2);

        platformService.platformMailDisplaySaveTest(platformMailDisplay);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-22 下午 1:57
     * @since: JDK 1.8
     *
     * @description: 平台目录返显
     * @param: []
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/getPlatformDirectoryInfoList")
    public CommonResult getPlatformDirectoryInfoList(){
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE, BeanCopyUtil.copy(RedisCommonUtil.getList(new PlatformDirectoryInfo()), PlatformDirectoryInfoVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-23 下午 2:35
     * @since: JDK 1.8
     *
     * @description: 平台目录新增
     * @param: [platformDirectoryInfoAddDTO]
     * @return: void
     */
    @PostMapping("/addPlatformDirectoryInfo")
    public void addPlatformDirectoryInfo(PlatformDirectoryInfoAddDTO platformDirectoryInfoAddDTO){
        platformService.addPlatformDirectoryInfo(platformDirectoryInfoAddDTO);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-23 下午 3:31
     * @since: JDK 1.8
     *
     * @description: 删除目录
     * @param: [platformDirectoryInfoDeleteDTO]
     * @return: void
     */
    @PostMapping("/deletePlatformDirectoryInfo")
    public void deletePlatformDirectoryInfo(PlatformDirectoryInfoDeleteDTO platformDirectoryInfoDeleteDTO){
        platformService.deletePlatformDirectoryInfo(platformDirectoryInfoDeleteDTO);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 上午 11:06
     * @since: JDK 1.8
     *
     * @description: 获取基本单位下拉列表信息
     * @param: []
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/getPlatformBaseUnitList")
    public CommonResult getPlatformBaseUnitList(){
        PlatformUnitInfo platformUnitInfo = new PlatformUnitInfo();
        platformUnitInfo.setUnitVariety(1);

        return CommonResult.returnResult(CommonResult.SUCCESS_CODE, BeanCopyUtil.copy(RedisCommonUtil.getList(platformUnitInfo), PlatformUnitInfoVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 4:41
     * @since: JDK 1.8
     *
     * @description: 品牌下拉列表获取
     * @param: []
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/getPlatformBrandInfoList")
    public CommonResult getPlatformBrandInfoList(){
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE, BeanCopyUtil.copy(RedisCommonUtil.getList(new PlatformBrandInfo()), PlatformBrandInfoVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-25 上午 10:25
     * @since: JDK 1.8
     *
     * @description: 商城展示多选 获取
     * @param: []
     * @return: icp.icpForCitln.common.result.CommonResult
     */
    @GetMapping("/getPlatformMailDisplayList")
    public CommonResult getPlatformMailDisplayList(){
        return CommonResult.returnResult(CommonResult.SUCCESS_CODE, BeanCopyUtil.copy(RedisCommonUtil.getList(new PlatformMailDisplay()), PlatformMailDisplayVO.class));
    }
}
