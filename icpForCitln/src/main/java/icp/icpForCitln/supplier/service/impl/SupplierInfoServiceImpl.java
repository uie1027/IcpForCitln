/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoServiceImpl
 * Package Name: icp.icpForCitln.supplier.service.impl
 * Date: 2019/4/12 16:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.service.impl;

import icp.icpForCitln.supplier.dao.SupplierInfoDao;
import icp.icpForCitln.supplier.dto.SupplierInfoDto;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.service.SupplierInfoService;
import icp.icpForCitln.supplier.vo.SupplierInfoVO;
import icp.icpForCitln.supplier.vo.SupplierListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<SupplierListVO> supplierListByPage(Integer pageIndex, Integer pageSize,String CodeOrName){
        List<SupplierInfo> supplierInfos;
        if (CodeOrName!="" && CodeOrName!=null){
            supplierInfos = supplierInfoDao.supplierListByCodeOrName(pageIndex,pageSize,CodeOrName);
        }else {
            supplierInfos = supplierInfoDao.supplierListByPage(pageIndex,pageSize);
        }

        if(supplierInfos!=null && supplierInfos.size()>0) {
            List<SupplierListVO> supplierListVOS = new ArrayList<>();
        for (SupplierInfo supplierInfo:supplierInfos){
            SupplierListVO supplierListVO = new SupplierListVO();
            BeanUtils.copyProperties(supplierInfo,supplierListVO);
            supplierListVOS.add(supplierListVO);
        }
            return supplierListVOS;
        }
        return null;
    }

    @Override
    public void updataSupplierInfo(SupplierInfoDto supplierInfoDto){
        /**
         * @author: guoxs  
         * @date: 19/04/18 10:04
         * @since: JDK 1.8
         * 
         * @description: 修改供应商信息 
         * @param: [supplierInfoDto]
         * @return: void
         */
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.updataSupplierInfo(supplierInfo);
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
    public void saveSupplierInfo(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.saveSupplierInfo(supplierInfo);
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
    public SupplierInfoVO supplierInfoById(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        SupplierInfoVO supplierInfoVO = new SupplierInfoVO();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfo = supplierInfoDao.supplierInfoById(supplierInfo);

        BeanUtils.copyProperties(supplierInfo,supplierInfoVO);

        return supplierInfoVO;
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
    public void deleteSupplierInfo(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.deleteSupplierInfo(supplierInfo);
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
    public void frozenSupplierInfo(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

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
    public void thawSupplierInfo(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.thawSupplierInfo(supplierInfo);
    }
}
