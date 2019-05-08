package icp.icpForCitln.company.service;

import icp.icpForCitln.company.dto.CompanySaveDTO;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.company.vo.CompanyInfoVO;

import java.util.List;

public interface CompanyService {
    void companySave(CompanySaveDTO companySaveDTO);  //保存公司信息

    List<CompanyInfo> companyInfoGetList();  //公司信息列表
}
