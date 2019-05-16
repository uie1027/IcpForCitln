/**
 * Project Name: icpForCitln
 * File Name: SaleOrderServiceImpl
 * Package Name: icp.icpForCitln.order.service.impl
 * Date: 2019/5/7 17:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service.impl;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.enetity.UserAndCompanyInfo;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.order.dao.SaleOrderDao;
import icp.icpForCitln.order.dto.SaleOrderInfoDTO;
import icp.icpForCitln.order.entity.SaleOrderDetailInfo;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import icp.icpForCitln.order.service.SaleOrderService;
import icp.icpForCitln.order.view.SaleOrderDetailView;
import icp.icpForCitln.order.view.SaleOrderView;
import icp.icpForCitln.order.vo.SaleOrderDetailVO;
import icp.icpForCitln.order.vo.SaleOrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SaleOrderServiceImpl implements SaleOrderService {
    @Autowired
    private SaleOrderDao saleOrderDao;

    /**
     * @author: Hujh
     * @date: 2019/5/7 18:24
     * @since: JDK 1.8
     *
     * @description: 销售订单分页查询
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.order.vo.SaleOrderInfoVO>
     */
    @Override
    public MongoResult saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        return saleOrderDao.saleOrderFindByPage(searchField,pageIndex,pageSize);
    }


    /**
     * @author: Hujh
     * @date: 2019/5/8 11:06
     * @since: JDK 1.8
     *
     * @description: 创建销售订单
     * @param: [saleOrderInfoDTO]
     * @return: void
     */
    @Override
    @Transactional
    public void saleOrderSave(SaleOrderInfoDTO saleOrderInfoDTO) {
        List<SaleOrderDetailInfo> saleOrderDetilInfos
                = BeanCopyUtil.copy(saleOrderInfoDTO.getSaleOrderDetailInfoDTOS(),SaleOrderDetailInfo.class);

        //计算订单总金额
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (SaleOrderDetailInfo saleOrderDetilInfo :saleOrderDetilInfos){
            totalAmount = totalAmount.add(
                    saleOrderDetilInfo.getUnitPrice().multiply(new BigDecimal(saleOrderDetilInfo.getSaleOrderQuantity())));
        }
        SaleOrderInfo saleOrderInfo = BeanCopyUtil.copy(saleOrderInfoDTO,SaleOrderInfo.class);
        saleOrderInfo.setTotalAmount(totalAmount);
        UserAndCompanyInfo userAndCompanyInfo = UserAndCompanyCache.get(SessionUtil.getByKey("userNum"));
        saleOrderInfo.setCreater(userAndCompanyInfo.getId()); //用户ID
        saleOrderInfo.setCompanyInfoId(userAndCompanyInfo.getCompanyInfo().getId());//公司ID
        MongoUtil.insert(saleOrderInfo);
        for (SaleOrderDetailInfo saleOrderDetilInfo :saleOrderDetilInfos){
            saleOrderDetilInfo.setSaleOrderInfoId(saleOrderInfo.getId());
        }
        MongoUtil.insert(saleOrderDetilInfos);
    }


    /**
     * @author:
     * date: 2019/5/15 9:48
     * @since: JDK 1.8
     *
     * @description: 查询销售订单明细
     * @param: [saleOrderInfoDTO]
     * @return: icp.icpForCitln.order.vo.SaleOrderInfoVO
     */
    @Override
    public SaleOrderInfoVO saleOrderFindById(SaleOrderInfoDTO saleOrderInfoDTO) {
        if(!StringUtil.isEmpty(saleOrderInfoDTO)){
            List<SaleOrderView> resList =
                    MongoUtil.select(BeanCopyUtil.copy(saleOrderInfoDTO,SaleOrderView.class));
            if(resList == null || resList.size() ==0 ) return null;
            SaleOrderView saleOrderView = resList.get(0);
            SaleOrderDetailView saleOrderDetailView = new SaleOrderDetailView();
            saleOrderDetailView.setSaleOrderInfoId(saleOrderView.getId());
            List<SaleOrderDetailView> orderDetailViews = MongoUtil.select(saleOrderDetailView);
            if(orderDetailViews == null || orderDetailViews.size() == 0) return null;

            SaleOrderInfoVO saleOrderInfoVO = BeanCopyUtil.copy(saleOrderView,SaleOrderInfoVO.class);
            saleOrderInfoVO.setOrderInfoDetailVOS(BeanCopyUtil.copy(orderDetailViews, SaleOrderDetailVO.class));
            return saleOrderInfoVO;
        }
        return null;
    }


    /**
     * @author:
     * date: 2019/5/15 16:06
     * @since: JDK 1.8
     *
     * @description: 销售订单修改
     * @param: [saleOrderInfoDTO]
     * @return: void
     */
    @Override
    @Transactional
    public void saleOrderUpdate(SaleOrderInfoDTO saleOrderInfoDTO) {
        SaleOrderInfo saleOrderInfo = BeanCopyUtil.copy(saleOrderInfoDTO,SaleOrderInfo.class);
        List<SaleOrderDetailInfo> orderDetailInfos
                = BeanCopyUtil.copy(saleOrderInfoDTO.getSaleOrderDetailInfoDTOS(),SaleOrderDetailInfo.class);
        MongoUtil.upsert(saleOrderInfo,1);
        MongoUtil.upsert(orderDetailInfos,1);
    }

}
