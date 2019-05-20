/**
 * Project Name: icpForCitln
 * File Name: ProduceServiceImpl
 * Package Name: icp.icpForCitln.produce.service.impl
 * Date: 19/05/06 10:49
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.produce.dto.PlannedOrderSaveDTO;
import icp.icpForCitln.produce.dto.ProductionConfirmOrderFindDTO;
import icp.icpForCitln.produce.dto.ProductionOrderFindDTO;
import icp.icpForCitln.produce.dto.ProductionOrderSaveDTO;
import icp.icpForCitln.produce.entity.*;
import icp.icpForCitln.produce.service.ProduceService;
import icp.icpForCitln.produce.view.ProductionConfirmOrderFindView;
import icp.icpForCitln.produce.view.ProductionOrderFindView;
import icp.icpForCitln.produce.vo.ProductionOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProduceServiceImpl implements ProduceService {
    @Autowired
    MongoTemplate mongoTemplate;
    /**
     * @author: guoxs
     * @date: 19/05/07 14:50
     * @since: JDK 1.8
     *
     * @description: 计划订单创建
     * @param: [plannedOrderSaveDTO]
     * @return: void
     */
    @Override
    public void PlannedOrderSave(PlannedOrderSaveDTO plannedOrderSaveDTO){
        plannedOrderSaveDTO.setPlannedOrderCode(GeneratedCodeUtil.generatedCode());
        PlannedOrder plannedOrder = BeanCopyUtil.copy(plannedOrderSaveDTO,PlannedOrder.class);
        MongoUtil.insert(plannedOrder);
        if (!CollectionUtils.isEmpty(plannedOrderSaveDTO.getDetailList())){
            for (PlannedOrderDetail detail:plannedOrderSaveDTO.getDetailList()){
                detail.setPlannedOrderId(plannedOrder.getId());
                detail.setPlannedOrderDetailCode(GeneratedCodeUtil.generatedCode());
                MongoUtil.insert(detail);
            }
        }

    }

    /**
     * @author: guoxs
     * @date: 19/05/13 13:11
     * @since: JDK 1.8
     *
     * @description: 生产确认订单列表
     * @param: [pageIndex, pageSize, productionConfirmOrderFindDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult productionConfirmOrderFind(Integer pageIndex, Integer pageSize, ProductionConfirmOrderFindDTO productionConfirmOrderFindDTO){
        return MongoUtil.select(pageIndex,pageSize,BeanCopyUtil.copy(productionConfirmOrderFindDTO, ProductionConfirmOrderFindView.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/20 09:48
     * @since: JDK 1.8
     *
     * @description: 生产订单列表
     * @param: [pageIndex, pageSize, productionOrderFindDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult productionOrderFind(Integer pageIndex, Integer pageSize, ProductionOrderFindDTO productionOrderFindDTO){
        MongoResult mongoResult = MongoUtil.select(pageIndex,pageSize,BeanCopyUtil.copy(productionOrderFindDTO, ProductionOrderFindView.class));
        List<ProductionOrderFindView> list = mongoResult.getResultList();
        for (ProductionOrderFindView productionOrderFindView:list){
            BigDecimal numbers = new BigDecimal("0");
            for (ProductionConfirmOrder productionConfirmOrder:productionOrderFindView.getProductionConfirmOrders()){
                    numbers = numbers.add(productionConfirmOrder.getCompletionNumber());
            }
            productionOrderFindView.setCompletionNumber(numbers);
        }

        mongoResult.setResultList(BeanCopyUtil.copy(list, ProductionOrderVO.class));
        return mongoResult;
    }


    /**
     * @author: guoxs
     * @date: 19/05/20 10:16
     * @since: JDK 1.8
     *
     * @description: 生产订单创建
     * @param: [productionOrderSaveDTO]
     * @return: void
     */
    @Override
    public void productionOrderSave(ProductionOrderSaveDTO productionOrderSaveDTO){
        ProductionOrder productionOrder = BeanCopyUtil.copy(productionOrderSaveDTO,ProductionOrder.class);
        productionOrder.setProductionOrderCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(productionOrder);

        List<ProductionOrderDetail> detailList = productionOrderSaveDTO.getProductionOrderDetails();

        for (int i=0;i<detailList.size();i++){
            detailList.get(i).setProductionOrderId(productionOrder.getId());
        }
        MongoUtil.insert(detailList);
    }

}
