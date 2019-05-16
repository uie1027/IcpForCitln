/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderServiceImpl
 * Package Name: icp.icpForCitln.order.service.impl
 * Date: 2019/5/5 17:06
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service.impl;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.enetity.UserAndCompanyInfo;
import icp.icpForCitln.common.util.*;
import icp.icpForCitln.order.dao.PurchaseOrderDao;
import icp.icpForCitln.order.dto.PurchaseOrderDTO;
import icp.icpForCitln.order.entity.PurchaseOrderDetailInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.service.PurchaseOrderDetailService;
import icp.icpForCitln.order.service.PurchaseOrderService;
import icp.icpForCitln.order.view.PurchaseOrderDetailView;
import icp.icpForCitln.order.view.PurchaseOrderView;
import icp.icpForCitln.order.vo.PurchaseOrderDetailVO;
import icp.icpForCitln.order.vo.PurchaseOrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

    @Autowired
    private PurchaseOrderDetailService purchaseOrderDetailService;

    @Autowired
    private PurchaseOrderDao purchaseOrderDao;


    /**
     * @author: Hujh
     * @date: 2019/5/5 18:42
     * @since: JDK 1.8
     *
     * @description: 创建采购订单
     * @param: [purchaseOrderDTO]
     * @return: void
     */
    @Override
    @Transactional
    public void purchaseOrderSave(PurchaseOrderDTO purchaseOrderDTO) {
        //生成采购订单编码
        PurchaseOrderInfo purchaseOrderInfo = BeanCopyUtil.copy(purchaseOrderDTO,PurchaseOrderInfo.class );
        purchaseOrderInfo.setPurchaseOrderCode(GeneratedCodeUtil.generatedCode());


        //获取行项目信息
        List<PurchaseOrderDetailInfo> list = BeanCopyUtil.copy(
                purchaseOrderDTO.getPurchaseOrderDetailDTOS(),PurchaseOrderDetailInfo.class);

        //计算订单总金额与行项目金额
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (PurchaseOrderDetailInfo purchaseOrderDetailInfo : list){
            purchaseOrderDetailInfo.setAmount(
                    purchaseOrderDetailInfo.getUnitPrice().multiply(new BigDecimal(purchaseOrderDetailInfo.getQuantity())));
            totalAmount = totalAmount.add(purchaseOrderDetailInfo.getAmount());
        }
        try {
            //设置订单总金额 保存订单
            purchaseOrderInfo.setTotalAmount(totalAmount);
            UserAndCompanyInfo userAndCompanyInfo = UserAndCompanyCache.get(SessionUtil.getByKey("userNum"));
            purchaseOrderInfo.setCreater(userAndCompanyInfo.getId()); //用户ID
            purchaseOrderInfo.setCompanyInfoId(userAndCompanyInfo.getCompanyInfo().getId());//公司ID
            purchaseOrderDao.purchaseOrderSave(purchaseOrderInfo);
            for (PurchaseOrderDetailInfo purchaseOrderDetailInfo : list){
                purchaseOrderDetailInfo.setPurchaseOrderInfoId(purchaseOrderInfo.getId());
                purchaseOrderDetailInfo.setCreater(userAndCompanyInfo.getId());
                purchaseOrderDetailInfo.setLastMondifier(userAndCompanyInfo.getId());
            }
            purchaseOrderDetailService.createOrderDetail(list);
        }catch (Exception ex){
            throw  new RuntimeException(ex.toString());
        }
    }


    /**
     * @author: Hujh
     * @date: 2019/5/5 18:43
     * @since: JDK 1.8
     *
     * @description: 采购订单分页查询
     * @param: [searchField, pageable]
     * @return: java.util.List<icp.icpForCitln.order.vo.PurchaseOrderInfoVO>
     */
    @Override
    public MongoResult purchaseOrderListFindByPage(String searchField, Integer pageIndex , Integer pageSize) {
        return purchaseOrderDao.purchaseOrderFindByPage(searchField, pageIndex , pageSize);
    }

    /**
     * @author:
     * date: 2019/5/15 17:49
     * @since: JDK 1.8
     *
     * @description: 通过ID查询采购订单
     * @param: [purchaseOrderDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @Override
    public PurchaseOrderInfoVO purchaseOrderFindById(PurchaseOrderDTO purchaseOrderDTO) {
        if(!StringUtil.isEmpty(purchaseOrderDTO)){
            List<PurchaseOrderView> resList =
                    MongoUtil.select(BeanCopyUtil.copy(purchaseOrderDTO,PurchaseOrderView.class));
            if(resList == null || resList.size() ==0 ) return null;
            PurchaseOrderView purchaseOrderView = resList.get(0);
            PurchaseOrderDetailView purchaseOrderDetailView = new PurchaseOrderDetailView();
            purchaseOrderDetailView.setPurchaseOrderInfoId(purchaseOrderView.getId());
            List<PurchaseOrderDetailView> purchaseOrderDetailViews = MongoUtil.select(purchaseOrderDetailView);
            if(purchaseOrderDetailViews == null || purchaseOrderDetailViews.size() == 0) return null;

            PurchaseOrderInfoVO purchaseOrderVO = BeanCopyUtil.copy(purchaseOrderView,PurchaseOrderInfoVO.class);
            purchaseOrderVO.setPurchaseOrderDetailVOS(BeanCopyUtil.copy(purchaseOrderDetailViews, PurchaseOrderDetailVO.class));
            return purchaseOrderVO;
        }
        return null;
    }

    /**
     * @author:
     * date: 2019/5/16 9:29
     * @since: JDK 1.856874
     *
     * @description: 采购订单修改
     * @param: [purchaseOrderDTO]
     * @return: void
     */
    @Override
    @Transactional
    public void purchaseOrderUpdate(PurchaseOrderDTO purchaseOrderDTO) {
        PurchaseOrderInfo purchaseOrderInfo = BeanCopyUtil.copy(purchaseOrderDTO,PurchaseOrderInfo.class);
        List<PurchaseOrderDetailInfo> purchaseOrderDetailInfos
                = BeanCopyUtil.copy(purchaseOrderDTO.getPurchaseOrderDetailDTOS(),PurchaseOrderDetailInfo.class);
        MongoUtil.upsert(purchaseOrderInfo,1);
        MongoUtil.upsert(purchaseOrderDetailInfos,1);
    }
}
