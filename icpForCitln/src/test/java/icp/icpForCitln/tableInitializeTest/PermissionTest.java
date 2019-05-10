/**
 * Project Name: icpForCitln
 * File Name: PermissionTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/04/29 14:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.permission.entity.PermissionInfo;
import icp.icpForCitln.permission.entity.RoleInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionTest {

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: PermissionInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void PermissionInfoSaveTest(){
        PermissionInfo permissionInfo = new PermissionInfo();

        permissionInfo.setMenuInfoId("32");
        permissionInfo.setRoleInfoId("1");

        MongoUtil.insert(permissionInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: RoleInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void RoleInfoSaveTest(){
        RoleInfo roleInfo = new RoleInfo();

        roleInfo.setRoleCode("2");
        roleInfo.setRoleDescription("5465");
        roleInfo.setRoleName("sdf");

        MongoUtil.insert(roleInfo);
    }
}
