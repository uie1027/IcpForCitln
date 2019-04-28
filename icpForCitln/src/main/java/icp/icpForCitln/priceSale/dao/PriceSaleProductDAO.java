package icp.icpForCitln.priceSale.dao;

import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;

import java.util.List;

public interface PriceSaleProductDAO {
    void priceSaleProductSave(PriceSaleProduct priceSaleProduct); //存储测试接口

    void priceSaleProductDelete(List<String> idParam);

    void priceSaleProductUpdate(List<PriceSaleProduct> list);

    List<PriceSaleProduct> priceSaleProductListByPage(Integer pageIndex, Integer pageSize);
}
