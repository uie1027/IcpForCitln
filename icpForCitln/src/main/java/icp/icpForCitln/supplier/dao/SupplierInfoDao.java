package icp.icpForCitln.supplier.dao;

import icp.icpForCitln.supplier.entity.SupplierInfo;

public interface SupplierInfoDao {
    void saveTest(SupplierInfo supplierInfo); ////存储测试接口
    void frozenSupplierInfo(SupplierInfo supplierInfo); //冻结供应商
    void thawSupplierInfo(SupplierInfo supplierInfo); //解冻供应商
}
