/**
 * Project Name: icpForCitln
 * File Name: ProductGroupServiceImpl
 * Package Name: icp.icpForCitln.productGroup.service.impl
 * Date: 2019-05-05 下午 2:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.productGroup.dto.ProductGroupInfoAddDTO;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import icp.icpForCitln.productGroup.entity.ProductGroupSystemAttribute;
import icp.icpForCitln.productGroup.service.ProductGroupService;
import org.springframework.stereotype.Service;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {
    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 2:41
     * @since: JDK 1.8
     *
     * @description: 新建产品组
     * @param: [productGroupInfoAddDTO]
     * @return: void
     */
    @Override
    public void productGroupSave(ProductGroupInfoAddDTO productGroupInfoAddDTO) {
        ProductGroupInfo productGroupInfo = BeanCopyUtil.copy(productGroupInfoAddDTO, ProductGroupInfo.class);
        productGroupInfo.setProductGroupCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(productGroupInfo);

        String[] productGroupSystemAttributeIdList = productGroupInfoAddDTO.getProductGroupSystemAttributeIdList();
        String[] productGroupMailDisplayIdList = productGroupInfoAddDTO.getProductGroupMailDisplayIdList();

        ProductGroupSystemAttribute productGroupSystemAttribute = new ProductGroupSystemAttribute();
        productGroupSystemAttribute.setProductGroupInfoId(productGroupInfo.getId());
        for (int i = 0; i < productGroupSystemAttributeIdList.length; i++){
            productGroupSystemAttribute.setSystemProductAttribuitId(productGroupSystemAttributeIdList[i]);
            MongoUtil.insert(productGroupSystemAttribute);
        }

        ProductGroupMailDisplay productGroupMailDisplay = new ProductGroupMailDisplay();
        productGroupMailDisplay.setProductGroupInfoId(productGroupInfo.getId());
        for(int j = 0; j < productGroupMailDisplayIdList.length; j++){
            productGroupMailDisplay.setPlantformMailDisplayId(productGroupMailDisplayIdList[j]);
            MongoUtil.insert(productGroupMailDisplay);
        }
    }
}
