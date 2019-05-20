/**
 * Project Name: icpForCitln
 * File Name: PlatformController
 * Package Name: icp.icpForCitln.platform.controller
 * Date: 2019-04-30 上午 10:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.controller;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.platform.dto.*;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttribute;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.platform.service.PlatformService;
import icp.icpForCitln.platform.view.MenuInfoListView;
import icp.icpForCitln.platform.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platform")
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:41
     * @since: JDK 1.8
     *
     * @description: 目录新增接口
     * @param: [plantformDirectoryInfoSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryInfoSave")
    public PageResult plantformDirectoryInfoSave(@RequestBody PlantformDirectoryInfoSaveDTO plantformDirectoryInfoSaveDTO){
        platformService.plantformDirectoryInfoSave(plantformDirectoryInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录保存成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 11:06
     * @since: JDK 1.8
     *
     * @description: 目录列表获取
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/plantformDirectoryInfoGetList")
    public PageResult plantformDirectoryInfoGetList(){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, platformService.plantformDirectoryInfoGetList());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 11:59
     * @since: JDK 1.8
     *
     * @description: 删除目录
     * @param: [plantformDirectoryInfoDeleteDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryInfoDelete")
    public PageResult plantformDirectoryInfoDelete(@RequestBody PlantformDirectoryInfoDeleteDTO plantformDirectoryInfoDeleteDTO){
        platformService.plantformDirectoryInfoDelete(plantformDirectoryInfoDeleteDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "删除目录成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 1:43
     * @since: JDK 1.8
     *
     * @description: 商城展示多选
     * @param: []`
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/plantformMailDisplayGetList")
    public PageResult plantformMailDisplayGetList(){
        List<PlantformMailDisplay> plantformMailDisplayList = platformService.plantformMailDisplayGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(plantformMailDisplayList, PlantformMailDisplayVO.class));
    }


    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 16:28
     * @since: JDK 1.8
     *
     * @description: 菜单列表获取
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/menuInfoGetList")
    public PageResult menuInfoGetList(){
        List<MenuInfoListView> menuInfoListViewList = platformService.menuInfoGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, menuInfoListViewList);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 18:34
     * @since: JDK 1.8
     *
     * @description: 目录编辑显示
     * @param: [plantformDirectoryInfoEditDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryInfoEdit")
    public PageResult plantformDirectoryInfoEdit(@RequestBody PlantformDirectoryInfoEditDTO plantformDirectoryInfoEditDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(platformService.plantformDirectoryInfoEdit(plantformDirectoryInfoEditDTO), PlantformDirectoryInfoEditVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 18:54
     * @since: JDK 1.8
     *
     * @description: 目录编辑保存
     * @param: [plantformDirectoryInfoEditSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryInfoEditSave")
    public PageResult plantformDirectoryInfoEditSave(@RequestBody PlantformDirectoryInfoEditSaveDTO plantformDirectoryInfoEditSaveDTO){
        platformService.plantformDirectoryInfoEditSave(plantformDirectoryInfoEditSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录编辑成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:01
     * @since: JDK 1.8
     *
     * @description: 目录属性新增
     * @param: [plantformDirectoryAttributeAdd]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeAdd")
    public PageResult plantformDirectoryAttributeAdd(@RequestBody PlantformDirectoryAttributeAddDTO pantformDirectoryAttributeAdd){
        platformService.plantformDirectoryAttributeAdd(pantformDirectoryAttributeAdd);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录属性新增成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:10
     * @since: JDK 1.8
     *
     * @description: 目录属性删除
     * @param: [plantformDirectoryAttributeDeleteDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeDelete")
    public PageResult plantformDirectoryAttributeDelete(@RequestBody PlantformDirectoryAttributeDeleteDTO plantformDirectoryAttributeDeleteDTO){
        platformService.plantformDirectoryAttributeDelete(plantformDirectoryAttributeDeleteDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录属性删除");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:16
     * @since: JDK 1.8
     *
     * @description: 目录属性列表显示
     * @param: [plantformDirectoryAttributeGetListDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeGetList")
    public PageResult plantformDirectoryAttributeGetList(@RequestBody PlantformDirectoryAttributeGetListDTO plantformDirectoryAttributeGetListDTO){
        MongoResult mongoResult = platformService.plantformDirectoryAttributeGetList(plantformDirectoryAttributeGetListDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, mongoResult);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:30
     * @since: JDK 1.8
     *
     * @description: 目录属性编辑显示
     * @param: [plantformDirectoryAttributeEditDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeEdit")
    public PageResult plantformDirectoryAttributeEdit(@RequestBody PlantformDirectoryAttributeEditDTO plantformDirectoryAttributeEditDTO){
        PlantformDirectoryAttribute plantformDirectoryAttribute = platformService.plantformDirectoryAttributeEdit(plantformDirectoryAttributeEditDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(plantformDirectoryAttribute, PlantformDirectoryAttributeEditVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:39
     * @since: JDK 1.8
     *
     * @description: 目录属性编辑保存
     * @param: [plantformDirectoryAttributeEditSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeEditSave")
    public PageResult plantformDirectoryAttributeEditSave(@RequestBody PlantformDirectoryAttributeEditSaveDTO plantformDirectoryAttributeEditSaveDTO){
        platformService.plantformDirectoryAttributeEditSave(plantformDirectoryAttributeEditSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录属性编辑成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:51
     * @since: JDK 1.8
     *
     * @description: 目录属性值新增
     * @param: [plantformDirectoryAttributeValueAddDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeValueAdd")
    public PageResult plantformDirectoryAttributeValueAdd(@RequestBody PlantformDirectoryAttributeValueAddDTO plantformDirectoryAttributeValueAddDTO){
        platformService.plantformDirectoryAttributeValueAdd(plantformDirectoryAttributeValueAddDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录属性值新增成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:59
     * @since: JDK 1.8
     *
     * @description: 目录属性值删除
     * @param: [plantformDirectoryAttributeValueDeleteDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeValueDelete")
    public PageResult plantformDirectoryAttributeValueDelete(@RequestBody PlantformDirectoryAttributeValueDeleteDTO plantformDirectoryAttributeValueDeleteDTO){
        platformService.plantformDirectoryAttributeValueDelete(plantformDirectoryAttributeValueDeleteDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录属性值删除成功");
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:05
     * @since: JDK 1.8
     *
     * @description: 目录属性值列表
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeValueGetList")
    public PageResult plantformDirectoryAttributeValueGetList(@RequestBody PlantformDirectoryAttributeValueGetListDTO plantformDirectoryAttributeValueGetListDTO){
        MongoResult mongoResult = platformService.plantformDirectoryAttributeValueGetList(plantformDirectoryAttributeValueGetListDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, mongoResult);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:17
     * @since: JDK 1.8
     *
     * @description: 目录属性值编辑显示
     * @param: [plantformDirectoryAttributeValueEditDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeValueEdit")
    public PageResult plantformDirectoryAttributeValueEdit(@RequestBody PlantformDirectoryAttributeValueEditDTO plantformDirectoryAttributeValueEditDTO){
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = platformService.plantformDirectoryAttributeValueEdit(plantformDirectoryAttributeValueEditDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(plantformDirectoryAttributeValue, PlantformDirectoryAttributeValueEditVO.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:25
     * @since: JDK 1.8
     *
     * @description: 目录属性值编辑保存
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/plantformDirectoryAttributeValueEditSave")
    public PageResult plantformDirectoryAttributeValueEditSave(@RequestBody PlantformDirectoryAttributeValueEditSaveDTO plantformDirectoryAttributeValueEditSaveDTO){
        platformService.plantformDirectoryAttributeValueEditSave(plantformDirectoryAttributeValueEditSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "产品属性值编辑保存");
    }
}
