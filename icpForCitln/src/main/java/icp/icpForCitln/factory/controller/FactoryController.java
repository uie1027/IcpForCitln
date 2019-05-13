/**
 * Project Name: icpForCitln
 * File Name: FactoryController
 * Package Name: icp.icpForCitln.factory.controller
 * Date: 2019/5/13 9:34
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.factory.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.factory.dto.FactoryInfoSaveDTO;
import icp.icpForCitln.factory.service.FactoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {
    @Autowired
    private FactoryInfoService factoryInfoService;

    /**
     * @author: 汪明月
     * date: 2019/5/13 9:38
     * @since: JDK 1.8
     *
     * @description: 工厂新增
     * @param: [factoryInfoSaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/factoryInfoSave")
    public PageResult factoryInfoSave(@RequestBody FactoryInfoSaveDTO factoryInfoSaveDTO){
        factoryInfoService.factoryInfoSave(factoryInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "工厂增加成功");

    }


}
