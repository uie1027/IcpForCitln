package icp.icpForCitln.priceSale.dao;

import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;

import java.util.List;

public interface PriceSaleProductGroupDAO {
    void priceSaleProductGroupSaveTest(PriceSaleProductGroup priceSaleProductGroup); //存储测试接口
    void priceSaleProductGroupDel(List<String> idParam);
    void priceSaleProductGroupUpdate(List<PriceSaleProductGroup> list);
    List<PriceSaleProductGroup> priceSaleProductGroupListByPage(Integer pageIndex, Integer pageSize);
}
