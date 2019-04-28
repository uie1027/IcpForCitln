/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplierDAOImpl
 * Package Name: icp.icpForCitln.pricePorchase.dao.impl
 * Date: 2019-04-15 下午 3:35
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.dao.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.pricePorchase.dao.PricePurchaseProductSupplierDAO;
import icp.icpForCitln.pricePorchase.eneity.PricePurchaseProductSupplier;
import icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PricePurchaseProductSupplierDAOImpl implements PricePurchaseProductSupplierDAO {
    /**
     * @author: Hujh
     * @date: 2019/4/24 16:48
     * @since: JDK 1.8
     *
     * @description: 供应商产品价格保存
     * @param: [pricePurchaseProductSupplier]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierSave(PricePurchaseProductSupplier pricePurchaseProductSupplier) {
        MongoUtil.insert(pricePurchaseProductSupplier);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:48
     * @since: JDK 1.8
     *
     * @description: 供应商产品价格更新
     * @param: [pricePurchaseProductSupplier]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierUpdate(PricePurchaseProductSupplier pricePurchaseProductSupplier) {
        MongoUtil.upsert(pricePurchaseProductSupplier);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:48
     * @since: JDK 1.8
     *
     * @description: 供应商产品价格删除
     * @param: [list]
     * @return: void
     */
    @Override
    public void pricePurchaseProductSupplierDelete(List<PricePurchaseProductSupplier> list) {
        MongoUtil.delete(list);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:48
     * @since: JDK 1.8
     *
     * @description: 供应商产品价格分页查询
     * @param: [pricePurchaseProductSupplier, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO>
     */
    @Override
    public List<PricePurchaseProductSupplierVO> pricePurchaseProductSupplierFindByPage(
            PricePurchaseProductSupplier pricePurchaseProductSupplier, Integer pageIndex, Integer pageSize) {
        List<PricePurchaseProductSupplier>  list = MongoUtil.select(pageIndex,pageSize,pricePurchaseProductSupplier);
        return BeanCopyUtil.copy(list,PricePurchaseProductSupplierVO.class);
    }
}
