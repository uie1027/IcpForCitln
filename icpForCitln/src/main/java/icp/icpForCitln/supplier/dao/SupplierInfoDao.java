package icp.icpForCitln.supplier.dao;

import icp.icpForCitln.supplier.entity.SupplierInfo;

import java.util.List;

public interface SupplierInfoDao {
    void saveTest(SupplierInfo supplierInfo); ////存储测试接口
    void saveSupplierInfo(SupplierInfo supplierInfo);
    List<SupplierInfo> supplierListByPage(Integer pageIndex,Integer pageSize);  //取供应商列表
    List<SupplierInfo> supplierListByCodeOrName(Integer pageIndex,Integer pageSize,String CodeOrName); //根据供应商编码或供应商名称查询供应商列表
    void updataSupplierInfo(SupplierInfo supplierInfo); //修改供应商信息
    SupplierInfo supplierInfoById(SupplierInfo supplierInfo);  //查询供应商详情
    void deleteSupplierInfo(SupplierInfo supplierInfo); //删除供应商
    void frozenSupplierInfo(SupplierInfo supplierInfo); //冻结供应商
    void thawSupplierInfo(SupplierInfo supplierInfo); //解冻供应商
}
