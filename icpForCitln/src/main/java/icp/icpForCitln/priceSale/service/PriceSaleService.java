package icp.icpForCitln.priceSale.service;

import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;

public interface PriceSaleService {
    void priceSaleProductSaveTest(PriceSaleProduct priceSaleProduct); //存储测试接口
    void priceSaleProductGroupSaveTest(PriceSaleProductGroup priceSaleProductGroup); //存储测试接口
    void priceSaleCustomerProductSaveTest(PriceSaleCustomerProduct priceSaleCustomerProduct); //存储测试接口
    void priceSaleCustomerProductGroupSaveTest(PriceSaleCustomerProductGroup priceSaleCustomerProductGroup); //存储测试接口
}
