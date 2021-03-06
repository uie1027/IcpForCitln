/**
 * Project Name: icpForCitln
 * File Name: CustomerServiceImpl
 * Package Name: icp.icpForCitln.customer.service.impl
 * Date: 19/05/10 11:23
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.customer.dto.CustomerInfoDTO;
import icp.icpForCitln.customer.service.CustomerServicce;
import icp.icpForCitln.customer.view.CustomerInfoFindView;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerServicce {

    /**
     * @author: guoxs
     * @date: 19/05/10 13:23
     * @since: JDK 1.8
     *
     * @description: 客户主数据
     * @param: [pageIndex, pageSize, customerInfoDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult customerInfoListFind(Integer pageIndex, Integer pageSize, CustomerInfoDTO customerInfoDTO){
        return MongoUtil.select(pageIndex,pageSize, BeanCopyUtil.copy(customerInfoDTO, CustomerInfoFindView.class));
    }
}
