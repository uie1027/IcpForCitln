/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service;


import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;

import java.util.List;

public interface PriceSaleService {
    MongoResult priceSaleProductGroupFindByPage(String searchField, Integer pageIndex , Integer pageSize);
    MongoResult  priceSaleProductFindByPage(String searchField, Integer pageIndex , Integer pageSize);
    MongoResult priceSaleCustomerProductGroupFindByPage(String customerInfo,String productGroupInfo,Integer pageIndex, Integer pageSize);
    MongoResult priceSaleCustomerProductFindByPage(String customerInfo,String productInfo,Integer pageIndex, Integer pageSize);

    void priceSaleProductGroupSave(PriceSaleProductGroupDTO priceSaleProductGroupDTO);
    void priceSaleProductSave(PriceSaleProductDTO priceSaleProductDTO);
    void priceSaleCustomerProductGroupSave(PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDTO);
    void priceSaleCustomerProductSave(PriceSaleCustomerProductDTO priceSaleProductGroupDTO);


    List<PriceSaleProductVO> priceSaleProductFindById(List<PriceSaleProductDTO> priceSaleProductDTOS);
    List<PriceSaleProductGroupVO> priceSaleProductGroupFindById(List<PriceSaleProductGroupDTO> priceSaleProductGroupDTOS);
    List<PriceSaleCustomerProductVO> priceSaleCustomerProductFindById(List<PriceSaleCustomerProductDTO> priceSaleCustomerProductDTOS);
    List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupFindById(List<PriceSaleCustomerProductGroupDTO> priceSaleCustomerProductGroupDTOS);

}
