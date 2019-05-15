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
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.productGroup.dao.ProductGroupDAO;
import icp.icpForCitln.productGroup.dto.ProductGroupInfoAddDTO;
import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeDTO;
import icp.icpForCitln.productGroup.dto.ProductGroupSystemAttributeFindDTO;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import icp.icpForCitln.productGroup.entity.ProductGroupPicture;
import icp.icpForCitln.productGroup.entity.ProductGroupSystemAttribute;
import icp.icpForCitln.productGroup.service.ProductGroupService;
import icp.icpForCitln.productGroup.vo.ProductGroupSystemAttributeVO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitValueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {
    @Autowired
    private ProductGroupDAO productGroupDAO;

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
        String[] productGroupPictureList = productGroupInfoAddDTO.getProductGroupPicture();

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

        ProductGroupPicture productGroupPicture = new ProductGroupPicture();
        productGroupPicture.setProductGroupInfoId(productGroupInfo.getId());
        for(int k = 0; k < productGroupPictureList.length; k++){
            productGroupPicture.setProductGroupPicture(productGroupPictureList[k]);
            MongoUtil.insert(productGroupPicture);
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/6 15:49
     * @since: JDK 1.8
     *
     * @description: 获取产品组列表 从 Redis
     * @param: []
     * @return: java.util.List<icp.icpForCitln.productGroup.entity.ProductGroupInfo>
     */
    @Override
    public List<ProductGroupInfo> productGroupInfoGetList() {
        List list = RedisUtil.getList(new ProductGroupInfo());
        return BeanCopyUtil.copy(list, ProductGroupInfo.class);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/6 17:37
     * @since: JDK 1.8
     *
     * @description: 新建产品查询产品组属性
     * @param: [productGroupSystemAttributeDTO]
     * @return: java.util.List<icp.icpForCitln.productGroup.vo.ProductGroupSystemAttributeVO>
     */
    @Override
    public List<ProductGroupSystemAttributeVO> productGroupAttributeFindByPage(ProductGroupSystemAttributeDTO productGroupSystemAttributeDTO) {
        List<ProductGroupSystemAttributeFindDTO> productGroupSystemAttributeFindDTOList = productGroupDAO.productGroupAttributeFindByPage(productGroupSystemAttributeDTO);
        List<ProductGroupSystemAttributeVO> productGroupSystemAttributeVOList = new ArrayList<>();
        for(int i = 0; i < productGroupSystemAttributeFindDTOList.size(); i++){
            ProductGroupSystemAttributeVO productGroupSystemAttributeVO = new ProductGroupSystemAttributeVO();
            productGroupSystemAttributeVO.setId(productGroupSystemAttributeFindDTOList.get(i).getId());
            productGroupSystemAttributeVO.setSystemProductAttribuitName(productGroupSystemAttributeFindDTOList.get(i).getSystemProductAttribuitName());
            productGroupSystemAttributeVO.setSystemProductAttribuitType(productGroupSystemAttributeFindDTOList.get(i).getSystemProductAttribuitType());
            List<SystemProductAttribuitValueDTO> productAttribuitValueDTOList = new ArrayList<>();
            for(int j = 0; j < productGroupSystemAttributeFindDTOList.get(i).getSystemProductAttribuitValueList().size(); j++){
                SystemProductAttribuitValueDTO systemProductAttribuitValueDTO = new SystemProductAttribuitValueDTO();
                systemProductAttribuitValueDTO.setId(productGroupSystemAttributeFindDTOList.get(i).getSystemProductAttribuitValueList().get(j).getId());
                systemProductAttribuitValueDTO.setSystemProductAttribuitContent(productGroupSystemAttributeFindDTOList.get(i).getSystemProductAttribuitValueList().get(j).getSystemProductAttribuitContent());
                productAttribuitValueDTOList.add(systemProductAttribuitValueDTO);
            }
            productGroupSystemAttributeVO.setSystemProductAttribuitValueDTOList(productAttribuitValueDTOList);
            productGroupSystemAttributeVOList.add(productGroupSystemAttributeVO);
        }
        return productGroupSystemAttributeVOList;
    }
}
