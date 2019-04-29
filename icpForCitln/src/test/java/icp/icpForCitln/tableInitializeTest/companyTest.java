/**
 * Project Name: icpForCitln
 * File Name: companyTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 下午 2:14
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.company.eneity.CompanyInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class companyTest {
    @Test
    public void companyInfoTest(){
        CompanyInfo companyInfo = new CompanyInfo();

        companyInfo.setCompanyCode("sda");
        companyInfo.setCompanyName("dsad");
        companyInfo.setEnterpriseInfoId("asda");
        companyInfo.setCompanyShortName("sda");
        companyInfo.setCompanyType("sad");
        companyInfo.setCompanyBusinessScope("sad");
        companyInfo.setCompanyContact("dasd");
        companyInfo.setCompanyTelephone("asdsad");
        companyInfo.setCompanyMail("dsadas");
        companyInfo.setCompanyFax("asdas");
        companyInfo.setCountryCode("sdas");
        companyInfo.setProvinceCode("sad");
        companyInfo.setCityCode("Asd");
        companyInfo.setDistrictCode("sad");
        companyInfo.setCompanyAddress("dfsfd");
        companyInfo.setCompanyLegalPerson("Sdfdsf");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("65465"));
        companyInfo.setCurrencyId("dasd");
        companyInfo.setCompanyEstablishmentDate(new Date());
        companyInfo.setTaxpayerTypeId("sada");
        companyInfo.setUnifiedSocialCreditCode("asd");
        companyInfo.setCompanyBank("fasfa");
        companyInfo.setBankCountryCode("fsdgdf");
        companyInfo.setCompanyBankAccount("fasdf");
        companyInfo.setCompanyBankAccountHolder("asdfas");
        companyInfo.setCompanyBankRemark("fewrqw");
        companyInfo.setAuthenticationQualificationName("WQeqwe");
        companyInfo.setAuthenticationCertificateNumber("QWeqwe");
        companyInfo.setAuthenticationCertificationAuthority("gsd");
        companyInfo.setAuthenticationCertificationCreateDate(new Date());
        companyInfo.setAuthenticationCertificationStartDate(new Date());
        companyInfo.setAuthenticationCertificationEndDate(new Date());
        companyInfo.setAuthenticationRemark("agdrgdg");
        companyInfo.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyInfo.setCreateTime(new Date());
        companyInfo.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyInfo.setLastModificationTime(new Date());
        companyInfo.setIsDelete(2);
        companyInfo.setIsDisplay(1);

        MongoUtil.insert(companyInfo);
    }
}
