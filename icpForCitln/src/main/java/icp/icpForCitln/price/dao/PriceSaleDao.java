/**
 * Project Name: icpForCitln
 * File Name: PriceSaleDao
 * Package Name: icp.icpForCitln.price.dao
 * Date: 2019/5/6 19:36
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao;

import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;

import java.util.List;

public interface PriceSaleDao {
    List<PriceSaleProductGroupDTO> priceSaleProductGroupFindByPage(String searchField, Integer pageIndex , Integer pageSize);

    List<PriceSaleProductDTO>  priceSaleProductFindByPage(String searchField, Integer pageIndex , Integer pageSize);
}
