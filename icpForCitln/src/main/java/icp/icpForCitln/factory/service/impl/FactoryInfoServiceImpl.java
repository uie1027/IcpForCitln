/**
 * Project Name: icpForCitln
 * File Name: FactoryInfoServiceImpl
 * Package Name: icp.icpForCitln.factory.service.impl
 * Date: 2019/5/13 9:28
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.factory.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.company.eneity.CompanyFactory;
import icp.icpForCitln.factory.dto.FactoryInfoSaveDTO;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.factory.service.FactoryInfoService;
import org.springframework.stereotype.Service;

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
        companyFactory.setCompyInfoId(factoryInfoSaveDTO.getCompanyFactoryId());
        companyFactory.setFactoryInfoId(factoryInfo.getId());
        MongoUtil.insert(companyFactory);


    }
}
