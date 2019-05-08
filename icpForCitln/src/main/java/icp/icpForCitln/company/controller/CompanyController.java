/**
 * Project Name: icpForCitln
 * File Name: CompanyController
 * Package Name: icp.icpForCitln.company.controller
 * Date: 2019/5/8 13:43
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.company.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.company.dto.CompanySaveDTO;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.company.service.CompanyService;
import icp.icpForCitln.company.vo.CompanyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    /**
     * @author: 汪明月
     * date: 2019/5/8 13:47
     * @since: JDK 1.8
     *
     * @description: 保存公司信息
     * @param: [companySaveDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/companySave")
    public PageResult companySave(@RequestBody CompanySaveDTO companySaveDTO){
        companyService.companySave(companySaveDTO);
        return  PageResult.returnResult(PageResult.SUCCESS_CODE, "");
    }
    /**
     * @author: 汪明月
     * date: 2019/5/8 14:37
     * @since: JDK 1.8
     *
     * @description: 公司信息列表
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/companyInfoGetList")
    public PageResult companyInfoGetList(){
        List<CompanyInfo> companyInfoList = companyService.companyInfoGetList();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, companyInfoList);
    }
    /**
     * @author: 汪明月
     * date: 2019/5/8 16:15
     * @since: JDK 1.8
     *
     * @description: 这里用一句话描述这个方法的作用
     * @param: []
     * @return: icp.icpForCitln.common.result.PageResult
     */

    @GetMapping("/companyInfoFindByEnterpriseId")
    public PageResult companyInfoFindByEnterpriseId(){
        List<CompanyInfo> companyId = companyService.companyInfoFindByEnterpriseId();
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(companyId, CompanyVO.class));
    }
}
