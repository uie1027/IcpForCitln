/**
 * Project Name: icpForCitln
 * File Name: COMPANY_FACTORY_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/21 9:46
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.company.eneity.CompanyFactory;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class COMPANY_FACTORY_INSERT_TEST {


    /**
     * COMPANY_FACTORY_INSERT   公司工厂表测试数据插入
     */


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:46
     * @since: JDK 1.8
     *
     * @description: COMPANY_FACTORY_INSERT_EXAMPLE   公司工厂表测试数据插入实例1
     * @param:
     * @return:
     */

    @Test
    public void companyFactoryInsertExample1(){
        CompanyFactory companyFactory=new CompanyFactory();
        companyFactory.setId("cx" + new ObjectId());
        companyFactory.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e6");
        companyFactory.setFactoryInfoId("cx5cdd42d8abac563e18d9d507");
        MongoUtil.insert(companyFactory);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:46
     * @since: JDK 1.8
     *
     * @description: COMPANY_FACTORY_INSERT_EXAMPLE   公司工厂表测试数据插入实例2
     * @param:
     * @return:
     */

    @Test
    public void companyFactoryInsertExample2(){
        CompanyFactory companyFactory=new CompanyFactory();
        companyFactory.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e6");
        companyFactory.setFactoryInfoId("cx5cdd42d8abac563e18d9d508");
        MongoUtil.insert(companyFactory);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:46
     * @since: JDK 1.8
     *
     * @description: COMPANY_FACTORY_INSERT_EXAMPLE   公司工厂表测试数据插入实例3
     * @param:
     * @return:
     */

    @Test
    public void companyFactoryInsertExample3(){
        CompanyFactory companyFactory=new CompanyFactory();
        companyFactory.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e7");
        companyFactory.setFactoryInfoId("cx5cdd42d8abac563e18d9d509");
        MongoUtil.insert(companyFactory);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:46
     * @since: JDK 1.8
     *
     * @description: COMPANY_FACTORY_INSERT_EXAMPLE   公司工厂表测试数据插入实例4
     * @param:
     * @return:
     */

    @Test
    public void companyFactoryInsertExample4(){
        CompanyFactory companyFactory=new CompanyFactory();
        companyFactory.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e7");
        companyFactory.setFactoryInfoId("cx5cdd42d8abac563e18d9d5a");
        MongoUtil.insert(companyFactory);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:46
     * @since: JDK 1.8
     *
     * @description: COMPANY_FACTORY_INSERT_EXAMPLE   公司工厂表测试数据插入实例5
     * @param:
     * @return:
     */

    @Test
    public void companyFactoryInsertExample5(){
        CompanyFactory companyFactory=new CompanyFactory();
        companyFactory.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        companyFactory.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        MongoUtil.insert(companyFactory);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/21 9:46
     * @since: JDK 1.8
     *
     * @description: COMPANY_FACTORY_INSERT_EXAMPLE   公司工厂表测试数据插入实例6
     * @param:
     * @return:
     */

    @Test
    public void companyFactoryInsertExample6(){
        CompanyFactory companyFactory=new CompanyFactory();
        companyFactory.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        companyFactory.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        MongoUtil.insert(companyFactory);
    }



}
