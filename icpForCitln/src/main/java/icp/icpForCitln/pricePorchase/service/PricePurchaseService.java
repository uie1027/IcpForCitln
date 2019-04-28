/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseService
 * Package Name: icp.icpForCitln.pricePorchase.service
 * Date: 2019-04-15 下午 3:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.service;

import icp.icpForCitln.pricePorchase.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO;

import java.util.List;

public interface PricePurchaseService {
    void pricePurchaseProductSupplierSave(
            PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO);     //存储测试

    void pricePurchaseProductSupplierUpdate(PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO);


    void pricePurchaseProductSupplierDelete(List<PricePurchaseProductSupplierDTO> list);


    List<PricePurchaseProductSupplierVO> pricePurchaseProductSupplierFindByPage(
            PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO ,
            Integer pageIndex,Integer pageSize);
}
