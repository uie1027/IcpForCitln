/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDao
 * Package Name: icp.icpForCitln.order.dao
 * Date: 2019/5/7 18:03
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.customer.entity.CustomerInfo;
import icp.icpForCitln.order.dao.SaleOrderDao;
import icp.icpForCitln.order.dto.SaleOrderInfoDTO;
import icp.icpForCitln.order.dto.SaleOrderInfoSearchDTO;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SaleOrderDaoImpl implements SaleOrderDao{

    /**
     * @author: Hujh
     * @date: 2019/5/7 18:15
     * @since: JDK 1.8
     *
     * @description: 销售订单列表分页查询
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.order.dto.SaleOrderInfoDTO>
     */
    @Override
    public List<SaleOrderInfoDTO> saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        //关联表
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(CustomerInfo.class); //客户表关联
        //查询条件赋值
        SaleOrderInfoSearchDTO saleOrderInfoSearchDTO = new SaleOrderInfoSearchDTO();
        saleOrderInfoSearchDTO.setCustomerInfo_customerCode(searchField);
        saleOrderInfoSearchDTO.setCustomerInfo_customerName(searchField);
        saleOrderInfoSearchDTO.setSaleOrderCode(searchField);
        MongoResult mongoResult = MongoUtil.aggregateSelect(minorClass, SaleOrderInfo.class,saleOrderInfoSearchDTO,SaleOrderInfoDTO.class,pageIndex,pageSize);
        return BeanCopyUtil.copy(mongoResult.getResultList(),SaleOrderInfoDTO.class);
    }
}
