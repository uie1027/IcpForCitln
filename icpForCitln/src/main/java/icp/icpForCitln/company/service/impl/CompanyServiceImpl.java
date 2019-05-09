/**
 * Project Name: icpForCitln
 * File Name: CompanyServiceImpl
 * Package Name: icp.icpForCitln.company.service
 * Date: 2019/5/8 13:51
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.company.service.impl;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.company.dto.CompanyInfoGetListDTO;
import icp.icpForCitln.company.dto.CompanySaveDTO;
import icp.icpForCitln.company.eneity.CompanyAddressInfo;
import icp.icpForCitln.company.eneity.CompanyDepartmentInfo;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.company.service.CompanyService;
import icp.icpForCitln.company.view.CompanyInfoUserView;
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
    /**
     * @author: 汪明月
     * date: 2019/5/8 16:16
     * @since: JDK 1.8
     *
     * @description: 根据企业id查公司信息
     * @param: []
     * @return: java.util.List<icp.icpForCitln.company.eneity.CompanyInfo>
     */
    @Override
    public List<CompanyInfo> companyInfoFindByEnterpriseId() {
        CompanyInfo companyInfo=new CompanyInfo();
        companyInfo.setEnterpriseInfoId(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getEnterpriseInfo().getId());
        List<CompanyInfo>  companyInfoList= MongoUtil.select(companyInfo);
        return companyInfoList;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/9 14:37
     * @since: JDK 1.8
     *
     * @description: 公司列表返显  带分页 带查询条件
     * @param: [companyInfoGetListDTO]
     * @return: icp.icpForCitln.common.enetity.MongoResult
     */
    @Override
    public MongoResult companyInfoListFindByPage(CompanyInfoGetListDTO companyInfoGetListDTO) {
        CompanyInfoUserView companyInfoUserView = BeanCopyUtil.copy(companyInfoGetListDTO, CompanyInfoUserView.class);
        return MongoUtil.select(companyInfoGetListDTO.getPageIndex(), companyInfoGetListDTO.getPageSize(), companyInfoUserView);
    }
}
