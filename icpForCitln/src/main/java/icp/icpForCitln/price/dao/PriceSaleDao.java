/**
 * Project Name: icpForCitln
 * File Name: PriceSaleDao
 * Package Name: icp.icpForCitln.price.dao
 * Date: 2019/5/6 19:36
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao;

import icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductVO;

import java.util.List;

public interface PriceSaleDao {
    List<PriceSaleProductGroupDTO> priceSaleProductGroupFindByPage(String searchField, Integer pageIndex , Integer pageSize);

    List<PriceSaleProductDTO>  priceSaleProductFindByPage(String searchField, Integer pageIndex , Integer pageSize);

    List<PriceSaleCustomerProductGroupDTO> priceSaleCustomerProductGroupFindByPage(String customerInfo, String productGroupInfo, Integer pageIndex, Integer pageSize);

    List<PriceSaleCustomerProductDTO> priceSaleCustomerProductFindByPage(String customerInfo, String productInfo, Integer pageIndex, Integer pageSize);
}
