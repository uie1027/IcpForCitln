package icp.icpForCitln.priceSale.service;

import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleProductDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductVO;

import java.util.List;

public interface PriceSaleService {
    void priceSaleProductSave(PriceSaleProductDTO priceSaleProductDto);
    void priceSaleProductDelete(List<String> idList);
    void priceSaleProductUpdate(List<PriceSaleProductDTO> list);
    List<PriceSaleProductVO> priceSaleProductListByPage(Integer pageIndex,Integer pageSize);


    void priceSaleProductGroupSave(PriceSaleProductGroupDTO priceSaleProductGroupDto);
    void priceSaleProductGroupDelete(List<String> idList);
    void priceSaleProductGroupUpdate(List<PriceSaleProductGroupDTO> list);
    List<PriceSaleProductGroupVO> priceSaleProductGroupListByPage(Integer pageIndex, Integer pageSize);


    void priceSaleCustomerProductSave(PriceSaleCustomerProductDTO priceSaleCustomerProductDto);
    void priceSaleCustomerProductDelete(List<String> idList);
    void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProductDTO> list);
    List<PriceSaleCustomerProductVO> priceSaleCustomerProductListByPage(Integer pageIndex, Integer pageSize);


    void priceSaleCustomerProductGroupSave(PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDto);
    void priceSaleCustomerProductGroupDelete(List<String> idList);
    void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroupDTO> list);
    List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupListByPage(Integer pageIndex, Integer pageSize);
}
