package icp.icpForCitln.priceSale.dao;

import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;

import java.util.List;

public interface PriceSaleCustomerProductDAO {
    void priceSaleCustomerProductSave(PriceSaleCustomerProduct priceSaleCustomerProduct); //存储测试接口
    void priceSaleCustomerProductDelete(List<String> idParam);
    void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProduct> list);
    List<PriceSaleCustomerProduct> priceSaleCustomerProductListByPage(Integer pageIndex, Integer pageSize);
}
