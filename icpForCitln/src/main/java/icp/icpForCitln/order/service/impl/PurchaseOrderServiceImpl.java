/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderServiceImpl
 * Package Name: icp.icpForCitln.order.service.impl
 * Date: 2019/5/5 17:06
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.order.dao.PurchaseOrderDao;
import icp.icpForCitln.order.dto.PurchaseOrderDTO;
import icp.icpForCitln.order.entity.PurchaseOrderDetailInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.service.PurchaseOrderDetailService;
import icp.icpForCitln.order.service.PurchaseOrderService;
import icp.icpForCitln.order.vo.PurchaseOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
        //生成采购合同编号
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
            purchaseOrderDao.createOrder(purchaseOrderInfo);
            purchaseOrderDetailService.createOrderDetail(list,purchaseOrderInfo.getId());
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
     * @return: java.util.List<icp.icpForCitln.order.vo.PurchaseOrderVO>
     */
    @Override
    public List<PurchaseOrderVO> purchaseOrderListFindByPage(String searchField, Integer pageIndex ,Integer pageSize) {
        List<PurchaseOrderDTO> resList = purchaseOrderDao.getOrderListFindByPage(searchField, pageIndex , pageSize);
        if(resList != null && resList.size() >0 ){
            for (PurchaseOrderDTO purchaseOrderDTO:resList){
                if(!StringUtil.isEmpty(purchaseOrderDTO.getSupplierInfo())){
                    purchaseOrderDTO.setSupplierName(purchaseOrderDTO.getSupplierInfo().getSupplierName());
                }
            }
            return BeanCopyUtil.copy(resList,PurchaseOrderVO.class);
        }
        return null;
    }
}
