package icp.icpForCitln.priceSale.service;

import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductDto;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductGroupDto;
import icp.icpForCitln.priceSale.dto.PriceSaleProductDto;
import icp.icpForCitln.priceSale.dto.PriceSaleProductGroupDto;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductVO;

import java.util.List;

public interface PriceSaleService {
    void priceSaleProductSaveTest(PriceSaleProduct priceSaleProduct); //存储测试接口
    void priceSaleProductDel(String ids);
    void priceSaleProductUpdate(List<PriceSaleProductDto> list);
    List<PriceSaleProductVO> priceSaleProductListByPage(Integer pageIndex,Integer pageSize);


    void priceSaleProductGroupSaveTest(PriceSaleProductGroup priceSaleProductGroup); //存储测试接口
    void priceSaleProductGroupDel(String ids);
    void priceSaleProductGroupUpdate(List<PriceSaleProductGroupDto> list);
    List<PriceSaleProductGroupVO> priceSaleProductGroupListByPage(Integer pageIndex, Integer pageSize);


    void priceSaleCustomerProductSaveTest(PriceSaleCustomerProduct priceSaleCustomerProduct); //存储测试接口
    void priceSaleCustomerProductDel(String ids);
    void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProductDto> list);
    List<PriceSaleCustomerProductVO> priceSaleCustomerProductListByPage(Integer pageIndex, Integer pageSize);


    void priceSaleCustomerProductGroupSaveTest(PriceSaleCustomerProductGroup priceSaleCustomerProductGroup); //存储测试接口
    void priceSaleCustomerProductGroupDel(String ids);
    void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroupDto> list);
    List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupListByPage(Integer pageIndex, Integer pageSize);
}
