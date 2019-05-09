package icp.icpForCitln.company.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.company.dto.CompanyInfoGetListDTO;
import icp.icpForCitln.company.dto.CompanySaveDTO;
import icp.icpForCitln.company.eneity.CompanyInfo;

import java.util.List;

public interface CompanyService {
    void companySave(CompanySaveDTO companySaveDTO);  //保存公司信息

    List<CompanyInfo> companyInfoGetList();  //公司信息列表

    List<CompanyInfo> companyInfoFindByEnterpriseId();   //通过企业id查公司信息

    MongoResult companyInfoListFindByPage(CompanyInfoGetListDTO companyInfoGetListDTO);       //公司列表查询 带分页 带条件
}
