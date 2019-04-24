/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoServiceImpl
 * Package Name: icp.icpForCitln.supplier.service.impl
 * Date: 2019/4/12 16:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.supplier.dao.SupplierInfoDao;
import icp.icpForCitln.supplier.dto.SupplierInfoDTO;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierInfoService;
import icp.icpForCitln.supplier.vo.SupplierListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierInfoServiceImpl implements SupplierInfoService {
    @Autowired
    private SupplierInfoDao supplierInfoDao;

    @Override
    public void saveTest(SupplierInfo supplierInfo) {
        supplierInfoDao.saveTest(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:03
     * @since: JDK 1.8
     *
     * @description: 查询供应商列表
     * @param: [pageIndex, pageSize, CodeOrName]
     * @return: java.util.List<icp.icpForCitln.supplier.vo.SupplierListVO>
     */
    @Override
    public List<SupplierListVO> supplierListByPage(Integer pageIndex, Integer pageSize,SupplierInfoDTO supplierInfoDTO){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDTO,SupplierInfo.class);
        return MongoUtil.select(pageIndex,pageSize,supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:04
     * @since: JDK 1.8
     *
     * @description: 修改供应商信息
     * @param: [supplierInfoDto]
     * @return: void
     */
    @Override
    public void updateSupplierInfo(SupplierInfoDTO supplierInfoDto){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDto,SupplierInfo.class);
        MongoUtil.upsert(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:04
     * @since: JDK 1.8
     *
     * @description: 保存供应商信息
     * @param: [supplierInfoDto]
     * @return: void
     */
    @Override
    public void saveSupplierInfo(SupplierInfoDTO supplierInfoDto){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDto,SupplierInfo.class);
        MongoUtil.insert(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:04
     * @since: JDK 1.8
     *
     * @description: 查询供应商详情
     * @param: [supplierInfoDto]
     * @return: icp.icpForCitln.supplier.vo.SupplierInfoVO
     */
    @Override
    public SupplierInfo supplierInfoById(SupplierInfoDTO supplierInfoDto){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDto,SupplierInfo.class);
        return (SupplierInfo) MongoUtil.select(supplierInfo).get(0);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:04
     * @since: JDK 1.8
     *
     * @description: 删除供应商
     * @param: [supplierInfoDto]
     * @return: void
     */
    @Override
    public void deleteSupplierInfo(SupplierInfoDTO supplierInfoDto){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDto,SupplierInfo.class);
        MongoUtil.delete(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:13
     * @since: JDK 1.8
     *
     * @description: 冻结供应商
     * @param: [supplierInfoDto]
     * @return: void
     */
    @Override
    public void frozenSupplierInfo(SupplierInfoDTO supplierInfoDto){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDto,SupplierInfo.class);
        supplierInfoDao.frozenSupplierInfo(supplierInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/18 10:13
     * @since: JDK 1.8
     *
     * @description: 解冻供应商
     * @param: [supplierInfoDto]
     * @return: void
     */
    @Override
    public void thawSupplierInfo(SupplierInfoDTO supplierInfoDto){
        SupplierInfo supplierInfo = BeanCopyUtil.copy(supplierInfoDto,SupplierInfo.class);
        supplierInfoDao.thawSupplierInfo(supplierInfo);
    }
}
