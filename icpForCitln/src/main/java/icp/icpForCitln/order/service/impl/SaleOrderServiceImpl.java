/**
 * Project Name: icpForCitln
 * File Name: SaleOrderServiceImpl
 * Package Name: icp.icpForCitln.order.service.impl
 * Date: 2019/5/7 17:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.order.dao.SaleOrderDao;
import icp.icpForCitln.order.dto.SaleOrderInfoDTO;
import icp.icpForCitln.order.service.SaleOrderService;
import icp.icpForCitln.order.vo.SaleOrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<SaleOrderInfoVO> saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        List<SaleOrderInfoDTO> resList = saleOrderDao.saleOrderFindByPage(searchField,pageIndex,pageSize);
        if(resList == null) return null;
        for (SaleOrderInfoDTO saleOrderInfoDTO :resList){
            if(!StringUtil.isEmpty(saleOrderInfoDTO.getCustomerInfo())){
                saleOrderInfoDTO.setCustomerCode(saleOrderInfoDTO.getCustomerInfo().getCustomerCode());
                saleOrderInfoDTO.setCustomerName(saleOrderInfoDTO.getCustomerInfo().getCustomerName());
            }
        }
        return BeanCopyUtil.copy(resList,SaleOrderInfoVO.class);
    }
}
