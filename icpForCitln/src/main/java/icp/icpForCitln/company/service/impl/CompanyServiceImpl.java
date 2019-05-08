/**
 * Project Name: icpForCitln
 * File Name: CompanyServiceImpl
 * Package Name: icp.icpForCitln.company.service
 * Date: 2019/5/8 13:51
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.company.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.company.dto.CompanySaveDTO;
import icp.icpForCitln.company.eneity.CompanyAddressInfo;
import icp.icpForCitln.company.eneity.CompanyDepartmentInfo;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.company.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    /**
     * @author: 汪明月
     * date: 2019/5/8 13:52
     * @since: JDK 1.8
     *
     * @description: 保存公司信息
     * @param: [companySaveDTO]
     * @return: void
     */
    @Override
    public void companySave(CompanySaveDTO companySaveDTO) {
        List<CompanyDepartmentInfo> companyDepartmentInfoList = companySaveDTO.getCompanyDepartmentInfoList();
        List<CompanyAddressInfo> companyAddressInfoList = companySaveDTO.getCompanyAddressInfoList();

        CompanyInfo companyInfo= BeanCopyUtil.copy(companySaveDTO, CompanyInfo.class);
        companyInfo.setCompanyCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(companyInfo);
        String companyInfoId=companyInfo.getId();
        for(CompanyDepartmentInfo depart:companyDepartmentInfoList){
            depart.setCompanyInfoId(companyInfoId);
            depart.setCompanyDepartmentCode(GeneratedCodeUtil.generatedCode());
            MongoUtil.insert(depart);
        }

        for(CompanyAddressInfo address:companyAddressInfoList){
            address.setCompanyInfoId(companyInfoId);
            MongoUtil.insert(address);
        }

    }
    /**
     * @author: 汪明月
     * date: 2019/5/8 14:35
     * @since: JDK 1.8
     *
     * @description: 公司信息列表
     * @param: []
     * @return: java.util.List<icp.icpForCitln.company.eneity.CompanyInfo>
     */
    @Override
    public List<CompanyInfo> companyInfoGetList() {
        List CompanyInfo = BeanCopyUtil.copy(MongoUtil.select(new CompanyInfo()), CompanyInfo.class);
        return CompanyInfo;
    }
}
