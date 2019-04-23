package icp.icpForCitln.supplier.service;

import icp.icpForCitln.supplier.dto.SupplierInfoDTO;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.vo.SupplierInfoVO;
import icp.icpForCitln.supplier.vo.SupplierListVO;

import java.util.List;

public interface SupplierInfoService {
    void saveTest(SupplierInfo supplierInfo); //保存类测试
    List<SupplierListVO> supplierListByPage(Integer pageIndex, Integer pageSize,String CodeOrName); //取供应商列表
    void updateSupplierInfo(SupplierInfoDTO supplierInfoDto); //修改供应商信息
    void saveSupplierInfo(SupplierInfoDTO supplierInfoDto); //保存供应商信息
    SupplierInfoVO supplierInfoById(SupplierInfoDTO supplierInfoDto); //查询供应商详情
    void deleteSupplierInfo(SupplierInfoDTO supplierInfoDto);  //删除供应商
    void frozenSupplierInfo(SupplierInfoDTO supplierInfoDto); //冻结供应商
    void thawSupplierInfo(SupplierInfoDTO supplierInfoDto); //解冻供应商
}
