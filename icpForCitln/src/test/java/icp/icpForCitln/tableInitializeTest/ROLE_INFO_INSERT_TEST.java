/**
 * Project Name: icpForCitln
 * File Name: ROLE_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/20 15:46
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.permission.entity.RoleInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ROLE_INFO_INSERT_TEST {


    /**
     * ROLE_INFO_INSERT   角色画面表测试数据插入!!
     */

    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:48
     * @since: JDK 1.8
     *
     * @description: roleInfoInsertExample1 角色画面表数据插入实例1
     * @param:
     * @return:
     */
    @Test
    public void roleInfoInsertExample1(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setId("cx5cdd42d8abac563e18d9d4fb");
        roleInfo.setRoleCode("0001");
        roleInfo.setRoleName("销售员");
        roleInfo.setRoleDescription("销售业务");
        roleInfo.setIsForbidden(2);
        MongoUtil.insert(roleInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:48
     * @since: JDK 1.8
     *
     * @description: roleInfoInsertExample1 角色画面表数据插入实例2
     * @param:
     * @return:
     */
    @Test
    public void roleInfoInsertExample2(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setId("cx5cdd42d8abac563e18d9d4fc");
        roleInfo.setRoleCode("0002");
        roleInfo.setRoleName("采购员");
        roleInfo.setRoleDescription("采购业务");
        roleInfo.setIsForbidden(2);
        MongoUtil.insert(roleInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:48
     * @since: JDK 1.8
     *
     * @description: roleInfoInsertExample1 角色画面表数据插入实例3
     * @param:
     * @return:
     */
    @Test
    public void roleInfoInsertExample3(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setId("cx5cdd42d8abac563e18d9d4fd");
        roleInfo.setRoleCode("0003");
        roleInfo.setRoleName("公司管理员");
        roleInfo.setRoleDescription("公司配置维护");
        roleInfo.setIsForbidden(2);
        MongoUtil.insert(roleInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:48
     * @since: JDK 1.8
     *
     * @description: roleInfoInsertExample1 角色画面表数据插入实例4
     * @param:
     * @return:
     */
    @Test
    public void roleInfoInsertExample4(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setId("cx5cdd42d8abac563e18d9d4fe");
        roleInfo.setRoleCode("0004");
        roleInfo.setRoleName("销售经理");
        roleInfo.setRoleDescription("销售审批、报表");
        roleInfo.setIsForbidden(2);
        MongoUtil.insert(roleInfo);
    }





    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:48
     * @since: JDK 1.8
     *
     * @description: roleInfoInsertExample1 角色画面表数据插入实例5
     * @param:
     * @return:
     */
    @Test
    public void roleInfoInsertExample5(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setId("cx5cdd42d8abac563e18d9d4ff");
        roleInfo.setRoleCode("0005");
        roleInfo.setRoleName("采购经理");
        roleInfo.setRoleDescription("采购审批、报表");
        roleInfo.setIsForbidden(2);
        MongoUtil.insert(roleInfo);
    }





    /**
     * @author: Wangzq
     * @date: 2019/5/20 15:48
     * @since: JDK 1.8
     *
     * @description: roleInfoInsertExample1 角色画面表数据插入实例6
     * @param:
     * @return:
     */
    @Test
    public void roleInfoInsertExample6(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setId("cx5cdd42d8abac563e18d9d500");
        roleInfo.setRoleCode("0006");
        roleInfo.setRoleName("财务专员 ");
        roleInfo.setRoleDescription("财务业务");
        roleInfo.setIsForbidden(2);
        MongoUtil.insert(roleInfo);
    }





}
