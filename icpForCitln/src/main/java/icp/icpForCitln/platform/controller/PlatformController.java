/**
 * Project Name: icpForCitln
 * File Name: PlatformController
 * Package Name: icp.icpForCitln.platform.controller
 * Date: 2019-04-30 上午 10:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoDeleteDTO;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoSaveDTO;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.platform.service.PlatformService;
import icp.icpForCitln.platform.vo.PlantformMailDisplayVO;
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
    
}
