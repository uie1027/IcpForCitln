/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseServiceImpl
 * Package Name: icp.icpForCitln.pricePorchase.service.impl
 * Date: 2019-04-15 下午 3:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedUtil;
import icp.icpForCitln.pricePorchase.dao.PricePurchaseProductSupplierDAO;
import icp.icpForCitln.pricePorchase.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.pricePorchase.eneity.PricePurchaseProductSupplier;
import icp.icpForCitln.pricePorchase.service.PricePurchaseService;
import icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricePurchaseServiceImpl implements PricePurchaseService {
    @Autowired
    private PricePurchaseProductSupplierDAO pricePurchaseProductSupplierDAO;

    /**
     * @author: Hujh
     * @date: 2019/4/24 17:07
     * @since: JDK 1.8
     *
     * @description: 供应商商品价格保存
     * @param: [pricePurchaseProductSupplierDTO]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierSave(PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO) {
        pricePurchaseProductSupplierDTO.setProductPriceCodeSupplier(GeneratedUtil.generatedCode());
        pricePurchaseProductSupplierDAO.pricePurchaseProductSupplierSave(
            BeanCopyUtil.copy(pricePurchaseProductSupplierDTO,PricePurchaseProductSupplier.class)
        );
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 17:07
     * @since: JDK 1.8
     *
     * @description: 供应商商品价格更新
     * @param: [pricePurchaseProductSupplierDTO]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierUpdate(PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO) {
        pricePurchaseProductSupplierDAO.pricePurchaseProductSupplierUpdate(
                BeanCopyUtil.copy(pricePurchaseProductSupplierDTO,PricePurchaseProductSupplier.class)
        );
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 17:07
     * @since: JDK 1.8
     *
     * @description: 供应商商品价格删除
     * @param: [list]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierDelete(List<PricePurchaseProductSupplierDTO> list) {
        pricePurchaseProductSupplierDAO.pricePurchaseProductSupplierDelete(
                BeanCopyUtil.copy(list,PricePurchaseProductSupplier.class)
        );
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 17:08
     * @since: JDK 1.8
     *
     * @description: 供应商商品价格查询
     * @param: [pricePurchaseProductSupplierDTO, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO>
     */
    @Override
    public List<PricePurchaseProductSupplierVO> pricePurchaseProductSupplierFindByPage(
            PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO, Integer pageIndex, Integer pageSize) {
        PricePurchaseProductSupplier pricePurchaseProductSupplier =
                BeanCopyUtil.copy(pricePurchaseProductSupplierDTO,PricePurchaseProductSupplier.class);
        return  pricePurchaseProductSupplierDAO.pricePurchaseProductSupplierFindByPage(
                pricePurchaseProductSupplier,pageIndex,pageSize);
    }

}
