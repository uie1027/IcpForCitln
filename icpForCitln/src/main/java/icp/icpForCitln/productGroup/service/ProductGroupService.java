/**
 * Project Name: icpForCitln
 * File Name: ProductGroupService
 * Package Name: icp.icpForCitln.productGroup.service
 * Date: 2019-05-05 下午 2:37
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.service;

import icp.icpForCitln.productGroup.dto.ProductGroupInfoAddDTO;

public interface ProductGroupService {
    void productGroupSave(ProductGroupInfoAddDTO productGroupInfoAddDTO);       //新建产品组
}
