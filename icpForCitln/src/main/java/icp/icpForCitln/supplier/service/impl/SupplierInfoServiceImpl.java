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

//    @Override
//    public List<SupplierListVO> supplierListByPage(Integer pageIndex, Integer pageSize){
//        List<SupplierInfo> supplierInfos = supplierInfoDao.supplierListByPage(pageIndex,pageSize);
//        if(supplierInfos!=null && supplierInfos.size()>0) {
//            List<SupplierListVO> supplierListVOS = new ArrayList<>();
//            for (SupplierInfo supplierInfo : supplierInfos) {
//                SupplierListVO supplierListVO = new SupplierListVO();
//                BeanUtils.copyProperties(supplierInfo, supplierListVO);
//                supplierListVOS.add(supplierListVO);
//            }
//            return supplierListVOS;
//        }
//        return null;
//    }

    @Override
    public List<SupplierListVO> supplierListByPage(Integer pageIndex, Integer pageSize,String CodeOrName){
        List<SupplierInfo> supplierInfos = new ArrayList<>();
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
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.updataSupplierInfo(supplierInfo);
    }

    @Override
    public void saveSupplierInfo(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.saveTest(supplierInfo);
    }

    @Override
    public SupplierInfoVO supplierInfoById(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        SupplierInfoVO supplierInfoVO = new SupplierInfoVO();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfo = supplierInfoDao.supplierInfoById(supplierInfo);

        BeanUtils.copyProperties(supplierInfo,supplierInfoVO);

        return supplierInfoVO;
    }

    @Override
    public void deleteSupplierInfo(SupplierInfoDto supplierInfoDto){
        SupplierInfo supplierInfo = new SupplierInfo();
        BeanUtils.copyProperties(supplierInfoDto,supplierInfo);

        supplierInfoDao.deleteSupplierInfo(supplierInfo);
    }
}
