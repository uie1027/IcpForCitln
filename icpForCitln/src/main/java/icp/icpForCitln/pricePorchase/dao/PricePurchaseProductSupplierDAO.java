/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplierDAO
 * Package Name: icp.icpForCitln.pricePorchase.dao
 * Date: 2019-04-15 下午 3:34
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.dao;

import icp.icpForCitln.pricePorchase.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.pricePorchase.eneity.PricePurchaseProductSupplier;
import icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO;

import java.util.List;

public interface PricePurchaseProductSupplierDAO {

    void pricePurchaseProductSupplierSave(
            PricePurchaseProductSupplier pricePurchaseProductSupplier);

    void pricePurchaseProductSupplierUpdate(PricePurchaseProductSupplier pricePurchaseProductSupplier);

    void pricePurchaseProductSupplierDelete(List<PricePurchaseProductSupplier> list);

    List<PricePurchaseProductSupplierVO> pricePurchaseProductSupplierFindByPage(
            PricePurchaseProductSupplier pricePurchaseProductSupplier,Integer pageIndex,Integer pageSize);
}
