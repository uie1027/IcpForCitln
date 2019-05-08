/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDetailServiceImpl
 * Package Name: icp.icpForCitln.order.service.impl
 * Date: 2019/5/5 17:56
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.service.impl;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.order.entity.PurchaseOrderDetailInfo;
import icp.icpForCitln.order.service.PurchaseOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchaseOrderDetailServiceImpl implements PurchaseOrderDetailService {

    @Override
    public void  createOrderDetail(List<PurchaseOrderDetailInfo> purchaseOrderDetailInfos) {
        MongoUtil.insert(purchaseOrderDetailInfos);
    }
}
