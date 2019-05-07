/**
 * Project Name: icpForCitln
 * File Name: ProductGroupDAO
 * Package Name: icp.icpForCitln.productGroup.dao
 * Date: 2019/5/6 17:42
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.dao;

import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeDTO;
import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeFindDTO;

import java.util.List;

public interface ProductGroupDAO {
    List<ProductGroupSystemAttributeFindDTO> productGroupAttributeFindByPage(ProductGroupSystemAttributeDTO productGroupSystemAttributeDTO);    //新建产品查询产品组属性
}
