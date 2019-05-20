/**
 * Project Name: icpForCitln
 * File Name: UserTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 上午 11:05
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.cache.UserAndCompanyCache;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.company.eneity.CompanyAddressInfo;
import icp.icpForCitln.company.eneity.CompanyDepartmentInfo;
import icp.icpForCitln.user.eneity.UserCompanyDepartmentRole;
import icp.icpForCitln.user.eneity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private MongoTemplate mongoTemplate;
    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 12:30
     * @since: JDK 1.8
     *
     * @description: UserInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void userInfoTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setUserCode(GeneratedCodeUtil.generatedCode());
        userInfo.setUserNum("测试帐号");
        userInfo.setUserPassword("测试密码");
        userInfo.setUserName("小明");
        userInfo.setUserPhone("手机号");
        userInfo.setUserEmail("邮箱");
        userInfo.setUserType(1);
        userInfo.setCreater(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getId());
        userInfo.setCreateTime(new Date());
        userInfo.setLastMondifier(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getId());
        userInfo.setLastModificationTime(new Date());
        userInfo.setIsDelete(2);
        userInfo.setIsDisplay(1);

        MongoUtil.insert(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 1:36
     * @since: JDK 1.8
     *
     * @description: UserRole 测试   表结构修改 已经删除
     * @param: []
     * @return: void
     */
//    @Test
//    public void userRoleTest(){
//        UserRole userRole = new UserRole();
//
//        userRole.setUserRoleCode(GeneratedCodeUtil.generatedCode());
//        userRole.setUserInfoId("5cc68b96ba4b701984cc8d5e");
//        userRole.setRoleInfoId("5cc68b96ba4b701984cc8d5e");
//        userRole.setCreater(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getId());
//        userRole.setCreateTime(new Date());
//        userRole.setLastMondifier(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getId());
//        userRole.setLastModificationTime(new Date());
//        userRole.setIsDelete(2);
//        userRole.setIsDisplay(1);
//
//        MongoUtil.insert(userRole);
//    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 1:45
     * @since: JDK 1.8
     *
     * @description: UserCompanyDepartmentRole 测试
     * @param: []
     * @return: void
     */
    @Test
    public void userCompanyTest(){
        UserCompanyDepartmentRole userCompanyDepartmentRole = new UserCompanyDepartmentRole();

        userCompanyDepartmentRole.setUserInfoId("5cc68b96ba4b701984cc8d5e");
        userCompanyDepartmentRole.setCompanyInfoId("5cc68b96ba4b701984cc8d5e");
        userCompanyDepartmentRole.setRoleInfoId("5cc68b96ba4b701984cc8d5e");
        userCompanyDepartmentRole.setCreater(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getId());
        userCompanyDepartmentRole.setCreateTime(new Date());
        userCompanyDepartmentRole.setLastMondifier(UserAndCompanyCache.get(SessionUtil.getByKey("userNum")).getId());
        userCompanyDepartmentRole.setLastModificationTime(new Date());
        userCompanyDepartmentRole.setIsDelete(2);
        userCompanyDepartmentRole.setIsDisplay(1);

        MongoUtil.insert(userCompanyDepartmentRole);
    }


    /**
     * companyDepartmentInfoInsertExample 公司部门表测试数据插入
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例1测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample1(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f2");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e6");
        companyDepartmentInfo.setCompanyDepartmentCode("0001");
        companyDepartmentInfo.setCompanyDepartmentName("销售一部");
        companyDepartmentInfo.setCompanyDepartmentRemark("内销");
        MongoUtil.insert(companyDepartmentInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例2测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample12(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f3");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e6");
        companyDepartmentInfo.setCompanyDepartmentCode("0002");
        companyDepartmentInfo.setCompanyDepartmentName("销售二部");
        companyDepartmentInfo.setCompanyDepartmentRemark("外销");
        MongoUtil.insert(companyDepartmentInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例3测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample13(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f4");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e6");
        companyDepartmentInfo.setCompanyDepartmentCode("0003");
        companyDepartmentInfo.setCompanyDepartmentName("采购部");
        companyDepartmentInfo.setCompanyDepartmentRemark("采购");
        MongoUtil.insert(companyDepartmentInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例4测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample14(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f5");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e7");
        companyDepartmentInfo.setCompanyDepartmentCode("0001");
        companyDepartmentInfo.setCompanyDepartmentName("销售一部");
        companyDepartmentInfo.setCompanyDepartmentRemark("内销");
        MongoUtil.insert(companyDepartmentInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例5测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample15(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f6");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e7");
        companyDepartmentInfo.setCompanyDepartmentCode("0002");
        companyDepartmentInfo.setCompanyDepartmentName("销售二部");
        companyDepartmentInfo.setCompanyDepartmentRemark("外销");
        MongoUtil.insert(companyDepartmentInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例6测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample16(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f7");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e7");
        companyDepartmentInfo.setCompanyDepartmentCode("0003");
        companyDepartmentInfo.setCompanyDepartmentName("采购部");
        companyDepartmentInfo.setCompanyDepartmentRemark("采购");
        MongoUtil.insert(companyDepartmentInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例7测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample17(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f8");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        companyDepartmentInfo.setCompanyDepartmentCode("0001");
        companyDepartmentInfo.setCompanyDepartmentName("销售一部");
        companyDepartmentInfo.setCompanyDepartmentRemark("内销");
        MongoUtil.insert(companyDepartmentInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例8测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample18(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4f9");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        companyDepartmentInfo.setCompanyDepartmentCode("0002");
        companyDepartmentInfo.setCompanyDepartmentName("销售二部");
        companyDepartmentInfo.setCompanyDepartmentRemark("外销");
        MongoUtil.insert(companyDepartmentInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:12
     * @since: JDK 1.8
     *
     * @description: 公司部门表实例9测试数据插入
     * @param: []
     * @return: void
     */
    @Test
    public void companyDepartmentInfoInsertExample19(){
        CompanyDepartmentInfo companyDepartmentInfo=new CompanyDepartmentInfo();
        companyDepartmentInfo.setId("cx5cdd42d8abac563e18d9d4fa");
        companyDepartmentInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        companyDepartmentInfo.setCompanyDepartmentCode("0003");
        companyDepartmentInfo.setCompanyDepartmentName("采购部");
        companyDepartmentInfo.setCompanyDepartmentRemark("采购");
        MongoUtil.insert(companyDepartmentInfo);
    }


    /**
     *CompanyAddressInfoInsertExample   公司地址信息插入实例
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:29
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfoInsertExample 公司地址信息插入实例1
     * @param:
     * @return:
     */


    @Test
    public void CompanyAddressInfoInsertExample1(){
        CompanyAddressInfo companyAddressInfo=new CompanyAddressInfo();
        companyAddressInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e6");
        companyAddressInfo.setCompanyAddress("浙江省温州市瑞安市莘塍镇工业园区");
        MongoUtil.insert(companyAddressInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:29
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfoInsertExample 公司地址信息插入实例2
     * @param:
     * @return:
     */


    @Test
    public void CompanyAddressInfoInsertExample2(){
        CompanyAddressInfo companyAddressInfo=new CompanyAddressInfo();
        companyAddressInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e7");
        companyAddressInfo.setCompanyAddress("上海市金山区月工路1111号");
        MongoUtil.insert(companyAddressInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:29
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfoInsertExample 公司地址信息插入实例3
     * @param:
     * @return:
     */


    @Test
    public void CompanyAddressInfoInsertExample3(){
        CompanyAddressInfo companyAddressInfo=new CompanyAddressInfo();
        companyAddressInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        companyAddressInfo.setCompanyAddress("上海市金山区亭卫南路888号");
        MongoUtil.insert(companyAddressInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:29
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfoInsertExample 公司地址信息插入实例4
     * @param:
     * @return:
     */


    @Test
    public void CompanyAddressInfoInsertExample4(){
        CompanyAddressInfo companyAddressInfo=new CompanyAddressInfo();
        companyAddressInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e9");
        companyAddressInfo.setCompanyAddress("上海市金山工业区月工路1369号");
        MongoUtil.insert(companyAddressInfo);
    }





    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:29
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfoInsertExample 公司地址信息插入实例5
     * @param:
     * @return:
     */
    @Test
    public void CompanyAddressInfoInsertExample5(){
        CompanyAddressInfo companyAddressInfo=new CompanyAddressInfo();
        companyAddressInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4ea");
        companyAddressInfo.setCompanyAddress("重庆市涪陵区白涛化工园区武陵大道66号");
        MongoUtil.insert(companyAddressInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:29
     * @since: JDK 1.8
     *
     * @description: CompanyAddressInfoInsertExample 公司地址信息插入实例6
     * @param:
     * @return:
     */
    @Test
    public void CompanyAddressInfoInsertExample6(){
        CompanyAddressInfo companyAddressInfo=new CompanyAddressInfo();
        companyAddressInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4eb");
        companyAddressInfo.setCompanyAddress("浙江省瑞安经济开发区开发区大道1688号");
        MongoUtil.insert(companyAddressInfo);
    }


}
