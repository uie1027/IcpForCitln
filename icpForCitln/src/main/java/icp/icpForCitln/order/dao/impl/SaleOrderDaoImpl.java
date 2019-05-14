/**
 * Project Name: icpForCitln
 * File Name: SaleOrderDao
 * Package Name: icp.icpForCitln.order.dao
 * Date: 2019/5/7 18:03
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.order.dao.SaleOrderDao;
import icp.icpForCitln.order.view.SaleOrderView;
import org.springframework.stereotype.Repository;
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
    public MongoResult saleOrderFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        SaleOrderView saleOrderView = new SaleOrderView();
        saleOrderView.setSaleOrderCode(searchField);
        saleOrderView.setCustomerName(searchField);
        return MongoUtil.select(pageIndex,pageSize,saleOrderView);
    }
}
