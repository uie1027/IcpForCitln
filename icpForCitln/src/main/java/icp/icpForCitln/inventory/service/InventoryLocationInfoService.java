package icp.icpForCitln.inventory.service;

import icp.icpForCitln.inventory.dto.InventoryLocationInfoSaveDTO;
import icp.icpForCitln.inventory.dto.InventoryLocationInfoUpdateDTO;
import icp.icpForCitln.inventory.entity.InventoryLocationInfo;
import icp.icpForCitln.inventory.vo.InventoryLocationInfoGetListVO;

import java.util.List;

public interface InventoryLocationInfoService {
    void InventoryLocationInfoSave(InventoryLocationInfoSaveDTO inventoryLocationInfoSaveDTO);   //工厂库存地点新增

    void InventoryLocationInfoUpdate(InventoryLocationInfoUpdateDTO inventoryLocationInfoUpdateDTO);   //工厂库存地点更新

    List<InventoryLocationInfo> InventoryLocationInfoGetList(InventoryLocationInfoGetListVO inventoryLocationInfoGetListVO);   //工厂库存地点列表 带分页
}
