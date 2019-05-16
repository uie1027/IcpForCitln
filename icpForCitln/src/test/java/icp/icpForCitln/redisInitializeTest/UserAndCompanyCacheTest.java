/**
 * Project Name: icpForCitln
 * File Name: UserAndCompanyCacheTest
 * Package Name: icp.icpForCitln.redisInitializeTest
 * Date: 2019/5/7 14:43
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.redisInitializeTest;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.enetity.UserAndCompanyInfo;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.enterprise.EnterpriseInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAndCompanyCacheTest {

    /**
     * @author: 方瑞冬
     * @date: 2019/5/7 15:27
     * @since: JDK 1.8
     *
     * @description: UserAndCompanyCache 存假数据
     * @param: []
     * @return: void
     */
    @Test
    public void userAndCompanyCachePut(){
        EnterpriseInfo enterpriseInfo = new EnterpriseInfo();
        enterpriseInfo.setId("cx5cc80779ba4b702bb01f3680");
        enterpriseInfo.setCreater("cx5cc80779ba4b702bb01f3679");
        enterpriseInfo.setCreateTime(new Date());
        enterpriseInfo.setLastMondifier("cx5cc80779ba4b702bb01f3679");
        enterpriseInfo.setLastModificationTime(new Date());
        enterpriseInfo.setIsDelete(2);
        enterpriseInfo.setIsDisplay(1);
        enterpriseInfo.setEnterpriseCode(GeneratedCodeUtil.generatedCode());
        enterpriseInfo.setEnterpriseName("知名企业");

        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setId("cx5cd269507aeecb391cee17c8");
        companyInfo.setCreater("cx5cc80779ba4b702bb01f3679");
        companyInfo.setCreateTime(new Date());
        companyInfo.setLastMondifier("cx5cc80779ba4b702bb01f3679");
        companyInfo.setLastModificationTime(new Date());
        companyInfo.setIsDelete(2);
        companyInfo.setIsDisplay(1);
        companyInfo.setCompanyCode(GeneratedCodeUtil.generatedCode());
        companyInfo.setCompanyName("知名公司");
        companyInfo.setEnterpriseInfoId("cx5cc80779ba4b702bb01f3680");
        companyInfo.setCompanyName("名公");
        companyInfo.setCompanyType("民营");
        companyInfo.setCompanyBusinessScope("各种");
        companyInfo.setCompanyContact("小明");
        companyInfo.setCompanyTelephone("1254-1234354");
        companyInfo.setCompanyMail("35464@gmail.com");
        companyInfo.setCompanyFax("3416534-565");
        companyInfo.setCountryCode("中国");
        companyInfo.setProvinceCode("上海");
        companyInfo.setCityCode("上海");
        companyInfo.setDistrictCode("浦东");
        companyInfo.setCompanyAddress("xx路xx号");
        companyInfo.setCompanyLegalPerson("小红");

        UserAndCompanyInfo userAndCompanyInfo = new UserAndCompanyInfo();
        userAndCompanyInfo.setUserNum("12138");
        userAndCompanyInfo.setUserCode(GeneratedCodeUtil.generatedCode());
        userAndCompanyInfo.setUserPassword("1d236987asd45!@#$");
        userAndCompanyInfo.setUserName("小明");
        userAndCompanyInfo.setUserPhone("13253658542");
        userAndCompanyInfo.setUserEmail("151512321@gmail.com");
        userAndCompanyInfo.setUserType(1);
        userAndCompanyInfo.setEnterpriseInfo(enterpriseInfo);
        userAndCompanyInfo.setCompanyInfo(companyInfo);

        userAndCompanyInfo.setId("cx5cc80779ba4b702bb01f3679");
        userAndCompanyInfo.setCreater("cx5cc80779ba4b702bb01f3679");
        userAndCompanyInfo.setCreateTime(new Date());
        userAndCompanyInfo.setLastMondifier("cx5cc80779ba4b702bb01f3679");
        userAndCompanyInfo.setLastModificationTime(new Date());
        userAndCompanyInfo.setIsDelete(2);
        userAndCompanyInfo.setIsDisplay(1);

        UserAndCompanyCache.put(userAndCompanyInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/7 15:27
     * @since: JDK 1.8
     *
     * @description: 测试获取
     * @param: []
     * @return: void
     */
    @Test
    public void getUserAndCompanyCache(){
        System.out.println(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")));
    }
}
