/**
 * Project Name: icpForCitln
 * File Name: PriceSupplierController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.price.dao.PriceSupplierDao;
import icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.price.entity.PricePurchaseProductSupplier;
import icp.icpForCitln.price.service.PriceSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceSupplierServiceImpl implements PriceSupplierService {
    @Autowired
    private PriceSupplierDao priceSupplierDao;

    /**
     * @author: Hujh
     * @date: 2019/5/6 15:51
     * @since: JDK 1.8
     *
     * @description: 分页查询供应商产品价格
     * @param: [supplierInfo, productInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PricePurchaseProductSupplierDTO>
     */
    @Override
    public List<PricePurchaseProductSupplierDTO> priceSupplierFindByPage(
            String supplierInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        List<PricePurchaseProductSupplierDTO> list =
                priceSupplierDao.priceSupplierFindByPage(supplierInfo,productInfo,pageIndex,pageSize);
        if(list != null && list.size() > 0){
            for (PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO :list){
                if(!StringUtil.isEmpty(pricePurchaseProductSupplierDTO.getSupplierInfo())){
                    pricePurchaseProductSupplierDTO.setSupplierInfoId(
                            pricePurchaseProductSupplierDTO.getSupplierInfo().getId()
                    );
                    pricePurchaseProductSupplierDTO.setSupplierCode(
                            pricePurchaseProductSupplierDTO.getSupplierInfo().getSupplierCode()
                    );
                    pricePurchaseProductSupplierDTO.setSupplierName(
                            pricePurchaseProductSupplierDTO.getSupplierInfo().getSupplierName()
                    );
                }

                if(!StringUtil.isEmpty(pricePurchaseProductSupplierDTO.getProcutInfo())){
                    pricePurchaseProductSupplierDTO.setProductInfoId(
                            pricePurchaseProductSupplierDTO.getProcutInfo().getId()
                    );
                    pricePurchaseProductSupplierDTO.setProductCode(
                            pricePurchaseProductSupplierDTO.getProcutInfo().getProductCode()
                    );
                    pricePurchaseProductSupplierDTO.setProductName(
                            pricePurchaseProductSupplierDTO.getProcutInfo().getProductName()
                    );
                }
            }
        }
        return list;
    }
}
