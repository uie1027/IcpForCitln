package icp.icpForCitln.supplier.dao;

import icp.icpForCitln.supplier.entity.SupplierInfo;

import java.util.List;

public interface SupplierInfoDao {
    void saveTest(SupplierInfo supplierInfo); ////存储测试接口
    List<SupplierInfo> supplierListByPage(Integer pageIndex,Integer pageSize);
    List<SupplierInfo> supplierListByCodeOrName(Integer pageIndex,Integer pageSize,String CodeOrName);
    void updataSupplierInfo(SupplierInfo supplierInfo);
    SupplierInfo supplierInfoById(SupplierInfo supplierInfo);
    void deleteSupplierInfo(SupplierInfo supplierInfo);

}
