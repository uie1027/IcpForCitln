package icp.icpForCitln.priceSale.dao;

import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;

import java.util.List;

public interface PriceSaleProductDAO {
    void priceSaleProductSaveTest(PriceSaleProduct priceSaleProduct); //存储测试接口

    void priceSaleProductDel(List<String> idParam);

    void priceSaleProductUpdate(List<PriceSaleProduct> list);

    List<PriceSaleProduct> priceSaleProductListByPage(Integer pageIndex, Integer pageSize);
}
