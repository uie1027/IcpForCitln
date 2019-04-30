/**
 * Project Name: icpForCitln
 * File Name: PlatformController
 * Package Name: icp.icpForCitln.platform.controller
 * Date: 2019-04-30 上午 10:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoSaveDTO;
import icp.icpForCitln.platform.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public PageResult plantformDirectoryInfoSave(PlantformDirectoryInfoSaveDTO plantformDirectoryInfoSaveDTO){
        platformService.plantformDirectoryInfoSave(plantformDirectoryInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "目录保存成功");
    }
}
