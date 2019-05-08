/**
 * Project Name: icpForCitln
 * File Name: ProductServiceImpl
 * Package Name: icp.icpForCitln.product.service.impl
 * Date: 19/05/05 17:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.product.dao.ProductDAO;
import icp.icpForCitln.product.dto.ProductInfoDTO;
import icp.icpForCitln.product.dto.ProductInfoSaveDTO;
import icp.icpForCitln.product.eneity.ProductAttribuit;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.service.ProductService;
import icp.icpForCitln.product.vo.ProductInfoFindVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<ProductInfoFindVO> productInfoFind(ProductInfo productInfo){
        List<ProductInfoDTO> dtos = productDAO.productInfoFind(productInfo);
        for (ProductInfoDTO productInfoDTO:dtos){
            productInfoDTO.setBasicUnit(productInfoDTO.getInfo().getSystemDictionaryValue());
        }
         List<ProductInfoFindVO> list=BeanCopyUtil.copy(dtos,ProductInfoFindVO.class);
        return list;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/7 9:34
     * @since: JDK 1.8
     *
     * @description: 产品新增
     * @param: [productInfoSaveDTO]
     * @return: void
     */
    @Override
    public void productInfoSave(ProductInfoSaveDTO productInfoSaveDTO) {
        List<ProductAttribuit> productAttribuitList = productInfoSaveDTO.getProductAttribuitList();
        ProductInfo productInfo = BeanCopyUtil.copy(productInfoSaveDTO, ProductInfo.class);

        productInfo.setProductCode(GeneratedCodeUtil.generatedCode());
        productInfo.setFrozen(2);

        MongoUtil.insert(productInfo);

        for (int i = 0; i < productAttribuitList.size(); i++){
            productAttribuitList.get(i).setProductInfoId(productInfo.getId());
        }
        MongoUtil.insert(productAttribuitList);
    }
}
