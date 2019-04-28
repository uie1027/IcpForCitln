package icp.icpForCitln.priceSale.dao;

import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;

import java.util.List;

public interface PriceSaleCustomerProductGroupDAO {
    void priceSaleCustomerProductGroupSave(PriceSaleCustomerProductGroup priceSaleCustomerProductGroup); //存储测试接口
    void priceSaleCustomerProducGrouptDelete(List<String> idParam);
    void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroup> list);
    List<PriceSaleCustomerProductGroup> priceSaleCustomerProductGroupListByPage(Integer pageIndex, Integer pageSize);
}
