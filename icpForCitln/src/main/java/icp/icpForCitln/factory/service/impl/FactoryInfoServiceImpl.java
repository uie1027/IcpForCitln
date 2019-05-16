/**
 * Project Name: icpForCitln
 * File Name: FactoryInfoServiceImpl
 * Package Name: icp.icpForCitln.factory.service.impl
 * Date: 2019/5/13 9:28
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.factory.service.impl;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.company.eneity.CompanyFactory;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.factory.dto.FactoryInfoSaveDTO;
import icp.icpForCitln.factory.dto.FactoryInfoUpdateDTO;
import icp.icpForCitln.factory.dto.OranizationInfoGetListDTO;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.factory.service.FactoryInfoService;
import icp.icpForCitln.factory.view.CompanyFactoryView;
import icp.icpForCitln.factory.view.OranizationView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryInfoServiceImpl implements FactoryInfoService {
    /**
     * @author: 汪明月
     * date: 2019/5/13 9:35
     * @since: JDK 1.8
     *
     * @description: 新增工厂
     * @param: [factoryInfoSaveDTO]
     * @return: void
     */
    @Override
    public void factoryInfoSave(FactoryInfoSaveDTO factoryInfoSaveDTO) {
        FactoryInfo factoryInfo=BeanCopyUtil.copy(factoryInfoSaveDTO, FactoryInfo.class);
        factoryInfo.setFactoryCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(factoryInfo);
        CompanyFactory companyFactory = new CompanyFactory();
        companyFactory.setCompanyInfoId(factoryInfoSaveDTO.getCompanyFactoryId());
        companyFactory.setFactoryInfoId(factoryInfo.getId());
        MongoUtil.insert(companyFactory);


    }
    /**
     * @author: 汪明月
     * date: 2019/5/13 15:04
     * @since: JDK 1.8
     *
     * @description: 更新工厂信息
     * @param: [factoryInfoUpdateDTO]
     * @return: void
     */

    @Override
    public void factoryInfoIpdate(FactoryInfoUpdateDTO factoryInfoUpdateDTO) {
        FactoryInfo factoryInfo = BeanCopyUtil.copy(factoryInfoUpdateDTO, FactoryInfo.class);
        MongoUtil.upsert(factoryInfo, factoryInfoUpdateDTO.getFlag());

    }
    /**
     * @author: 汪明月
     * date: 2019/5/14 17:16
     * @since: JDK 1.8
     *
     * @description: 组织信息列表  分页
     * @param: [oranizationInfoGetListDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult oranizationInfoGetListByPage(OranizationInfoGetListDTO oranizationInfoGetListDTO) {
        OranizationView oranizationView = BeanCopyUtil.copy(oranizationInfoGetListDTO, OranizationView.class);
        return MongoUtil.select(oranizationInfoGetListDTO.getPageIndex(), oranizationInfoGetListDTO.getPageSize(), oranizationView);
    }


    /**
     * @author: guoxs
     * @date: 19/05/16 13:43
     * @since: JDK 1.8
     *
     * @description: 获取工厂
     * @param: []
     * @return: java.util.List<icp.icpForCitln.factory.view.CompanyFactoryView>
     */
    @Override
    public List<CompanyFactoryView> factoryListGet(){
        CompanyInfo companyInfo = UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getCompanyInfo();
        if (companyInfo == null){
            return null;
        }
        CompanyFactory companyFactory = new CompanyFactory();
        companyFactory.setCompanyInfoId(companyInfo.getId());
        List<CompanyFactoryView> list = MongoUtil.select(BeanCopyUtil.copy(companyFactory,CompanyFactoryView.class));

        return list;
    }
}
