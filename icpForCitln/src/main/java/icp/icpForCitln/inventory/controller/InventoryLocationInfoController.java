/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfoController
 * Package Name: icp.icpForCitln.inventory.controller
 * Date: 2019/5/13 17:36
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.controller;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.inventory.dto.FactoryInventoryLocationListGetDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoGetListDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoSaveDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoUpdateDTO;
import icp.icpForCitln.inventory.entity.InventoryLocationInfo;
import icp.icpForCitln.inventory.service.InventoryLocationInfoService;
import icp.icpForCitln.inventory.vo.InventoryLocationInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryLocationInfoController {
    @Autowired
    private InventoryLocationInfoService inventoryLocationInfoService;

    /**
     * @author: 汪明月
     * date: 2019/5/14 9:27
     * @since: JDK 1.8
     *
     * @description: 库存地点新增
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/inventoryLocationInfoSave")
    public  PageResult InventoryLocationInfoSave(@RequestBody InventoryLocationInfoSaveDTO inventoryLocationInfoSaveDTO){
        inventoryLocationInfoService.InventoryLocationInfoSave(inventoryLocationInfoSaveDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "库存地点增加成功");
    }

    /**
     * @author: 汪明月
     * date: 2019/5/14 9:58
     * @since: JDK 1.8
     *
     * @description: 库存地点更新
     * @param: [inventoryLocationInfoUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/inventoryLocationInfoUpdate")
    public  PageResult inventoryLocationInfoUpdate(@RequestBody InventoryLocationInfoUpdateDTO inventoryLocationInfoUpdateDTO){
        inventoryLocationInfoService.InventoryLocationInfoUpdate(inventoryLocationInfoUpdateDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, "库存地点更新成功");
    }
    /**
     * @author: 汪明月
     * date: 2019/5/13 17:39
     * @since: JDK 1.8
     *
     * @description: 库存地点信息列表
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/inventoryLocationInfoGetListByPage")
    public PageResult inventoryLocationInfoGetListByPage(@RequestBody InventoryLocationInfoGetListDTO inventoryLocationInfoGetListDTO){
        MongoResult inventoryLocationInfoGetList = inventoryLocationInfoService.InventoryLocationInfoGetList(inventoryLocationInfoGetListDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, inventoryLocationInfoGetList);

    }

    @GetMapping("/inventoryListGet")
    public PageResult inventoryListGet(FactoryInventoryLocationListGetDTO factoryInventoryLocationListGetDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,inventoryLocationInfoService.inventoryListGet(factoryInventoryLocationListGetDTO));
    }


    /**
     * @author:
     * date: 2019/5/17 10:40
     * @since: JDK 1.8
     *
     * @description: 获取库存地点数据（无条件查询）
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/inventoryLocationList")
    public PageResult inventoryLocationList(){
        return PageResult.returnResult(
                PageResult.SUCCESS_CODE, BeanCopyUtil.copy(MongoUtil.select(new InventoryLocationInfo()),InventoryLocationInfoVO.class));
    }
}
