/**
 * Project Name: icpForCitln
 * File Name: USER_INFO_INSERT_TEST
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/20 16:17
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.user.eneity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class USER_INFO_INSERT_TEST {

    /**
     * USER_INFO_INSERT  用户信息表测试数据插入
     */





    /**
     * @author: Wangzq
     * @date: 2019/5/20 16:19
     * @since: JDK 1.8
     *
     * @description: USER_INFO_INSERT_EXAMPLE  用户信息表测试数据插入实例1
     * @param:
     * @return:
     */

    @Test
    public  void userInfoInsertExample1(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId("cx5cdd42d8abac563e18d9d501");
        userInfo.setUserCode("10000001");
        userInfo.setUserNum("lix");
        userInfo.setUserPhone("18752067001");
        userInfo.setUserEmail("18752067001@cx.cn");
        userInfo.setUserPassword("123456");
        userInfo.setUserName("李欣");
        userInfo.setUserType(1);
        userInfo.setIsForbidden(2);
        MongoUtil.insert(userInfo);
    }





    /**
     * @author: Wangzq
     * @date: 2019/5/20 16:19
     * @since: JDK 1.8
     *
     * @description: USER_INFO_INSERT_EXAMPLE  用户信息表测试数据插入实例2
     * @param:
     * @return:
     */

    @Test
    public  void userInfoInsertExample2(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId("cx5cdd42d8abac563e18d9d502");
        userInfo.setUserCode("10000002");
        userInfo.setUserNum("lixz");
        userInfo.setUserPhone("18752067002");
        userInfo.setUserEmail("18752067002@cx.cn");
        userInfo.setUserPassword("123456");
        userInfo.setUserName("李孝忠");
        userInfo.setUserType(1);
        userInfo.setIsForbidden(2);
        MongoUtil.insert(userInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 16:19
     * @since: JDK 1.8
     *
     * @description: USER_INFO_INSERT_EXAMPLE  用户信息表测试数据插入实例3
     * @param:
     * @return:
     */

    @Test
    public  void userInfoInsertExample3(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId("cx5cdd42d8abac563e18d9d503");
        userInfo.setUserCode("10000003");
        userInfo.setUserNum("chengc");
        userInfo.setUserPhone("18752067003");
        userInfo.setUserEmail("18752067003@cx.cn");
        userInfo.setUserPassword("123456");
        userInfo.setUserName("程成");
        userInfo.setUserType(1);
        userInfo.setIsForbidden(2);
        MongoUtil.insert(userInfo);
    }




    /**
     * @author: Wangzq
     * @date: 2019/5/20 16:19
     * @since: JDK 1.8
     *
     * @description: USER_INFO_INSERT_EXAMPLE  用户信息表测试数据插入实例4
     * @param:
     * @return:
     */

    @Test
    public  void userInfoInsertExample4(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId("cx5cdd42d8abac563e18d9d504");
        userInfo.setUserCode("10000004");
        userInfo.setUserNum("Lucy");
        userInfo.setUserPhone("18752067004");
        userInfo.setUserEmail("18752067004@cx.cn");
        userInfo.setUserPassword("123456");
        userInfo.setUserName("路西");
        userInfo.setUserType(1);
        userInfo.setIsForbidden(2);
        MongoUtil.insert(userInfo);
    }


    /**
     * @author: Wangzq
     * @date: 2019/5/20 16:19
     * @since: JDK 1.8
     *
     * @description: USER_INFO_INSERT_EXAMPLE  用户信息表测试数据插入实例5
     * @param:
     * @return:
     */

    @Test
    public  void userInfoInsertExample5(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId("cx5cdd42d8abac563e18d9d505");
        userInfo.setUserCode("10000005");
        userInfo.setUserNum("Tom");
        userInfo.setUserPhone("18752067005");
        userInfo.setUserEmail("18752067005@cx.cn");
        userInfo.setUserPassword("123456");
        userInfo.setUserName("汤姆");
        userInfo.setUserType(1);
        userInfo.setIsForbidden(2);
        MongoUtil.insert(userInfo);
    }



    /**
     * @author: Wangzq
     * @date: 2019/5/20 16:19
     * @since: JDK 1.8
     *
     * @description: USER_INFO_INSERT_EXAMPLE  用户信息表测试数据插入实例6
     * @param:
     * @return:
     */

    @Test
    public  void userInfoInsertExample6(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId("cx5cdd42d8abac563e18d9d506");
        userInfo.setUserCode("10000006");
        userInfo.setUserNum("Jack");
        userInfo.setUserPhone("18752067006");
        userInfo.setUserEmail("18752067006@cx.cn");
        userInfo.setUserPassword("123456");
        userInfo.setUserName("杰克");
        userInfo.setUserType(1);
        userInfo.setIsForbidden(2);
        MongoUtil.insert(userInfo);
    }
}
