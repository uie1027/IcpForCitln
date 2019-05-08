/**
 * Project Name: icpForCitln
 * File Name: SaleOrderServiceImpl
 * Package Name: icp.icpForCitln.order.service.impl
 * Date: 2019/5/7 17:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service.impl;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.UserAndCompanyInfo;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.order.dao.SaleOrderDao;
import icp.icpForCitln.order.dto.SaleOrderInfoDTO;
import icp.icpForCitln.order.entity.SaleOrderDetilInfo;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import icp.icpForCitln.order.service.SaleOrderService;
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
        List<SaleOrderDetilInfo> saleOrderDetilInfos
                = BeanCopyUtil.copy(saleOrderInfoDTO.getSaleOrderDetailInfoDTOS(),SaleOrderDetilInfo.class);

        //计算订单总金额
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (SaleOrderDetilInfo saleOrderDetilInfo :saleOrderDetilInfos){
            totalAmount = totalAmount.add(
                    saleOrderDetilInfo.getUnitPrice().multiply(new BigDecimal(saleOrderDetilInfo.getSaleOrderQuantity())));
        }
        SaleOrderInfo saleOrderInfo = BeanCopyUtil.copy(saleOrderInfoDTO,SaleOrderInfo.class);
        saleOrderInfo.setTotalAmount(totalAmount);
        UserAndCompanyInfo userAndCompanyInfo = UserAndCompanyCache.get(SessionUtil.getByKey("userNum"));
        saleOrderInfo.setCreater(userAndCompanyInfo.getId()); //用户ID
        saleOrderInfo.setCompanyInfoId(userAndCompanyInfo.getCompanyInfo().getId());//公司ID
        MongoUtil.insert(saleOrderInfo);
        for (SaleOrderDetilInfo saleOrderDetilInfo :saleOrderDetilInfos){
            saleOrderDetilInfo.setSaleOrderInfoId(saleOrderInfo.getId());
        }
        MongoUtil.insert(saleOrderDetilInfos);
    }


}
