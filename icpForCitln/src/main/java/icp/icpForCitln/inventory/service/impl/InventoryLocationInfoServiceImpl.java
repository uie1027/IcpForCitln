/**
 * Project Name: icpForCitln
 * File Name: InventoryLocationInfoServiceImpl
 * Package Name: icp.icpForCitln.inventory.service.impl
 * Date: 2019/5/13 13:16
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.inventory.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.company.dto.CompanyInfoGetListDTO;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.factory.entity.FactoryInventoryLocation;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoGetListDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoSaveDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoUpdateDTO;
import icp.icpForCitln.inventory.entity.InventoryLocationInfo;
import icp.icpForCitln.inventory.service.InventoryLocationInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryLocationInfoServiceImpl implements InventoryLocationInfoService {

    /**
     * @author: 汪明月
     * date: 2019/5/13 17:35
     * @since: JDK 1.8
     *
     * @description: 工厂库存信息新增
     * @param: [inventoryLocationInfoSaveDTO]
     * @return: void
     */
    @Override
    public void InventoryLocationInfoSave(InventoryLocationInfoSaveDTO inventoryLocationInfoSaveDTO) {
        InventoryLocationInfo inventoryLocationInfo = BeanCopyUtil.copy(inventoryLocationInfoSaveDTO, InventoryLocationInfo.class);
        inventoryLocationInfo.setInventoryLocationCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(inventoryLocationInfo);

        FactoryInventoryLocation factoryInventoryLocation = new FactoryInventoryLocation();
        factoryInventoryLocation.setInventoryLocationInfoId(inventoryLocationInfo.getId());
        factoryInventoryLocation.setFactoryInfoId(inventoryLocationInfoSaveDTO.getFactoryInfoId());
        MongoUtil.insert(factoryInventoryLocation);
    }
    /**
     * @author: 汪明月
     * date: 2019/5/14 10:36
     * @since: JDK 1.8
     *
     * @description: 工厂库存地点更新
     * @param: [inventoryLocationInfoUpdateDTO]
     * @return: void
     */

    @Override
    public void InventoryLocationInfoUpdate(InventoryLocationInfoUpdateDTO inventoryLocationInfoUpdateDTO) {
        InventoryLocationInfo inventoryLocationInfo = BeanCopyUtil.copy(inventoryLocationInfoUpdateDTO, InventoryLocationInfo.class);
        MongoUtil.upsert(inventoryLocationInfo, inventoryLocationInfoUpdateDTO.getFlag());
    }

    /**
     * @author: 汪明月
     * date: 2019/5/13 17:35
     * @since: JDK 1.8
     *
     * @description: 库存信息列表  带分页
     * @param: []
     * @return: java.util.List<icp.icpForCitln.inventory.entity.InventoryLocationInfo>
     */
    @Override
    public MongoResult InventoryLocationInfoGetList(InventoryLocationInfoGetListDTO inventoryLocationInfoGetListDTO) {
        InventoryLocationInfo inventoryLocationInfo = BeanCopyUtil.copy(inventoryLocationInfoGetListDTO, InventoryLocationInfo.class);
        MongoResult mongoResult = MongoUtil.select(inventoryLocationInfoGetListDTO.getPageIndex(), inventoryLocationInfoGetListDTO.getPageSize(), inventoryLocationInfo);
        return mongoResult;
    }


}
