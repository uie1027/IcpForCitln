/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service;


import icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PriceSaleService {
    List<PriceSaleProductGroupVO>  priceSaleProductGroupFindByPage(String searchField,Integer pageIndex ,Integer pageSize);
    List<PriceSaleProductVO>  priceSaleProductFindByPage(String searchField, Integer pageIndex , Integer pageSize);
    List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupFindByPage(String customerInfo,String productGroupInfo,Integer pageIndex, Integer pageSize);
    List<PriceSaleCustomerProductVO> priceSaleCustomerProductFindByPage(String customerInfo,String productInfo,Integer pageIndex, Integer pageSize);
}
