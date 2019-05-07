/**
 * Project Name: icpForCitln
 * File Name: ProductGroupService
 * Package Name: icp.icpForCitln.productGroup.service
 * Date: 2019-05-05 下午 2:37
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.service;

import icp.icpForCitln.productGroup.dto.ProductGroupInfoAddDTO;
import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeDTO;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.vo.ProductGroupSystemAttributeVO;

import java.util.List;

public interface ProductGroupService {
    void productGroupSave(ProductGroupInfoAddDTO productGroupInfoAddDTO);       //新建产品组
    List<ProductGroupInfo> productGroupInfoGetList();   //获取产品组列表
    List<ProductGroupSystemAttributeVO> productGroupAttributeFindByPage(ProductGroupSystemAttributeDTO productGroupSystemAttributeDTO);  //新建产品查询产品组属性
}
