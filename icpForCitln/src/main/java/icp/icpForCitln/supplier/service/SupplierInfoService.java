package icp.icpForCitln.supplier.service;

import icp.icpForCitln.supplier.dto.SupplierInfoDto;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.vo.SupplierInfoVO;
import icp.icpForCitln.supplier.vo.SupplierListVO;

import java.util.List;

public interface SupplierInfoService {
    void saveTest(SupplierInfo supplierInfo); //保存类测试
    List<SupplierListVO> supplierListByPage(Integer pageIndex, Integer pageSize,String CodeOrName);
    void updataSupplierInfo(SupplierInfoDto supplierInfoDto);
    void saveSupplierInfo(SupplierInfoDto supplierInfoDto);
    SupplierInfoVO supplierInfoById(SupplierInfoDto supplierInfoDto);
    void deleteSupplierInfo(SupplierInfoDto supplierInfoDto);
}
