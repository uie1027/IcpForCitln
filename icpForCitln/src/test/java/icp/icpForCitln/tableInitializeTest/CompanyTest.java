/**
 * Project Name: icpForCitln
 * File Name: CompanyTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 下午 2:14
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.company.eneity.CompanyAddressInfo;
import icp.icpForCitln.company.eneity.CompanyDepartmentInfo;
import icp.icpForCitln.company.eneity.CompanyFactory;
import icp.icpForCitln.company.eneity.CompanyInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 2:33
     * @since: JDK 1.8
     *
     * @description: CompanyInfo 测试
     * @param: []
     * @return: void
     */
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

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 2:34
     * @since: JDK 1.8
     *
     * @description: CompanyDepartmentInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoTest(){
        CompanyDepartmentInfo companyDepartmentInfo = new CompanyDepartmentInfo();

        companyDepartmentInfo.setCompanyInfoId("sdad");
        companyDepartmentInfo.setCompanyDepartmentCode("dsfasfd");
        companyDepartmentInfo.setCompanyDepartmentName("faffFSDF");
        companyDepartmentInfo.setCompanyDepartmentRemark("DFSDFSADFSA");
        companyDepartmentInfo.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyDepartmentInfo.setCreateTime(new Date());
        companyDepartmentInfo.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyDepartmentInfo.setLastModificationTime(new Date());
        companyDepartmentInfo.setIsDelete(2);
        companyDepartmentInfo.setIsDisplay(1);

        MongoUtil.insert(companyDepartmentInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 2:43
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void companyAddressInfoTest(){
        CompanyAddressInfo companyAddressInfo = new CompanyAddressInfo();

        companyAddressInfo.setCompanyInfoId("asdasd");
        companyAddressInfo.setCompanyAddress("456");
        companyAddressInfo.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyAddressInfo.setCreateTime(new Date());
        companyAddressInfo.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyAddressInfo.setLastModificationTime(new Date());
        companyAddressInfo.setIsDelete(2);
        companyAddressInfo.setIsDisplay(1);

        MongoUtil.insert(companyAddressInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 2:51
     * @since: JDK 1.8
     *
     * @description: CompanyFactory 测试
     * @param: []
     * @return: void
     */
    @Test
    public void companyFactoryTest(){
        CompanyFactory companyFactory = new CompanyFactory();

        companyFactory.setCompyInfoId("45652");
        companyFactory.setFactoryInfoId("544");
        companyFactory.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyFactory.setCreateTime(new Date());
        companyFactory.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        companyFactory.setLastModificationTime(new Date());
        companyFactory.setIsDelete(2);
        companyFactory.setIsDisplay(1);

        MongoUtil.insert(companyFactory);
    }
}
