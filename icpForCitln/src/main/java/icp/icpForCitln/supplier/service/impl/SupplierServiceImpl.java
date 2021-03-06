/**
 * Project Name: icpForCitln
 * File Name: SupplierServiceImpl
 * Package Name: icp.icpForCitln.supplier.service.impl
 * Date: 19/05/10 13:14
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.supplier.dto.SupplierInfoDTO;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierService;
import icp.icpForCitln.supplier.view.SupplierInfoFindView;
import icp.icpForCitln.supplier.vo.SupplierListGetVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    /**
     * @author: guoxs
     * @date: 19/05/10 13:22
     * @since: JDK 1.8
     *
     * @description: 供应商列表
     * @param: [pageIndex, pageSize, supplierInfoDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult supplierInfoListFind(Integer pageIndex, Integer pageSize, SupplierInfoDTO supplierInfoDTO){
        return MongoUtil.select(pageIndex,pageSize, BeanCopyUtil.copy(supplierInfoDTO, SupplierInfoFindView.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/16 16:56
     * @since: JDK 1.8
     *
     * @description: 供应商下拉列表
     * @param: []
     * @return: java.util.List<icp.icpForCitln.supplier.vo.SupplierListGetVO>
     */
    @Override
    public List<SupplierListGetVO> supplierListGet(){
        return BeanCopyUtil.copy(MongoUtil.select(new SupplierInfo()),SupplierListGetVO.class);
    }
}
