package icp.icpForCitln.inventory.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.inventory.dto.FactoryInventoryLocationListGetDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoGetListDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoSaveDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoUpdateDTO;
import icp.icpForCitln.inventory.view.FactoryInventoryLocationView;

import java.util.List;

public interface InventoryLocationInfoService {
    void InventoryLocationInfoSave(InventoryLocationInfoSaveDTO inventoryLocationInfoSaveDTO);   //工厂库存地点新增

    void InventoryLocationInfoUpdate(InventoryLocationInfoUpdateDTO inventoryLocationInfoUpdateDTO);   //工厂库存地点更新

    MongoResult InventoryLocationInfoGetList(InventoryLocationInfoGetListDTO inventoryLocationInfoGetListDTO);   //工厂库存地点列表 带分页
    List<FactoryInventoryLocationView> inventoryListGet(FactoryInventoryLocationListGetDTO factoryInventoryLocationListGetDTO);
}
