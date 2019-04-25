/**
 * Project Name: icpForCitln
 * File Name: RedisCommonUtilTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-24 上午 11:56
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisCommonUtil;
import icp.icpForCitln.platform.eneity.PlatformBrandInfo;
import icp.icpForCitln.platform.eneity.PlatformDirectoryInfo;
import icp.icpForCitln.platform.eneity.PlatformMailDisplay;
import icp.icpForCitln.product.eneity.ProductAttribuitDefinition;
import icp.icpForCitln.user.eneity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCommonUtilTest {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:35
     * @since: JDK 1.8
     *
     * @description: Redis 存 测试
     * @param: []
     * @return: void
     */
    @Test
    public void putTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setId("testId1");
        userInfo.setUserCode("1111");
        userInfo.setUserNum("num12");
        userInfo.setUserPassword("pwd1");
        userInfo.setUserName("uname1");
        userInfo.setCreater("admin");
        userInfo.setCreateTime(new Date());
        userInfo.setLastMondifier("lastman");
        userInfo.setLastModificationTime(new Date());
        userInfo.setIsDelete(2);

        RedisCommonUtil.put(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:36
     * @since: JDK 1.8
     *
     * @description: Redis 获取对象 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setUserNum("num12");

        userInfo = (UserInfo) RedisCommonUtil.get(userInfo);

        System.out.println(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:36
     * @since: JDK 1.8
     *
     * @description: Redis 删除 测试
     * @param: []
     * @return: void
     */
    @Test
    public void deleteTest(){
        UserInfo userInfo = new UserInfo();

        userInfo.setUserNum("num12");

        RedisCommonUtil.delete(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 1:37
     * @since: JDK 1.8
     *
     * @description: Redis 获取列表 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getListTest(){
        List<UserInfo> userInfoList = BeanCopyUtil.copy(RedisCommonUtil.getList(new UserInfo()), UserInfo.class);
        System.out.println(userInfoList);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 2:51
     * @since: JDK 1.8
     *
     * @description: 平台目录 Redis 存储测试
     * @param: []
     * @return: void
     */
    @Test
    public void platformDirectoryInfoPutTest(){
        PlatformDirectoryInfo platformDirectoryInfo = new PlatformDirectoryInfo();

        platformDirectoryInfo.setId("testId");
        platformDirectoryInfo.setPlatformDirectoryCode("testCode");
        platformDirectoryInfo.setPlatformDirectoryName("testName");
        platformDirectoryInfo.setPlatformDirectoryLevel(1);
        platformDirectoryInfo.setParenetPlatformDirectoryCode("1");
        platformDirectoryInfo.setPlatformDirectoryDescription("备注测试");
        platformDirectoryInfo.setCreater("testcreater");
        platformDirectoryInfo.setCreateTime(new Date());
        platformDirectoryInfo.setLastMondifier("lastman");
        platformDirectoryInfo.setLastModificationTime(new Date());
        platformDirectoryInfo.setIsDelete(2);

        RedisCommonUtil.put(platformDirectoryInfo);

        PlatformDirectoryInfo platformDirectoryInfoT = new PlatformDirectoryInfo();

        platformDirectoryInfoT.setId("testId");
        platformDirectoryInfoT.setPlatformDirectoryCode("testCodeT");
        platformDirectoryInfoT.setPlatformDirectoryName("testName");
        platformDirectoryInfoT.setPlatformDirectoryLevel(1);
        platformDirectoryInfoT.setParenetPlatformDirectoryCode("1");
        platformDirectoryInfoT.setPlatformDirectoryDescription("备注测试");
        platformDirectoryInfoT.setCreater("testcreater");
        platformDirectoryInfoT.setCreateTime(new Date());
        platformDirectoryInfoT.setLastMondifier("lastman");
        platformDirectoryInfoT.setLastModificationTime(new Date());
        platformDirectoryInfoT.setIsDelete(2);

        RedisCommonUtil.put(platformDirectoryInfoT);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 4:04
     * @since: JDK 1.8
     *
     * @description: 创建品牌表
     * @param: []
     * @return: void
     */
    @Test
    public void brandInsert(){
        PlatformBrandInfo platformBrandInfo = new PlatformBrandInfo();

        platformBrandInfo.setBrandCode(GeneratedUtil.generatedCode());
        platformBrandInfo.setBrandName("品牌1");

        MongoUtil.insert(platformBrandInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 4:49
     * @since: JDK 1.8
     *
     * @description: 品牌 Redis 测试
     * @param: []
     * @return: void
     */
    @Test
    public void brandRedis(){
        PlatformBrandInfo platformBrandInfo = new PlatformBrandInfo();

        platformBrandInfo.setId(GeneratedUtil.generatedCode());
        platformBrandInfo.setBrandCode(GeneratedUtil.generatedCode());
        platformBrandInfo.setBrandName("品牌1");
        platformBrandInfo.setCreater("testcreater");
        platformBrandInfo.setCreateTime(new Date());
        platformBrandInfo.setLastMondifier("lastman");
        platformBrandInfo.setLastModificationTime(new Date());
        platformBrandInfo.setIsDelete(2);

        RedisCommonUtil.put(platformBrandInfo);

        PlatformBrandInfo platformBrandInfo1 = new PlatformBrandInfo();

        platformBrandInfo1.setId(GeneratedUtil.generatedCode());
        platformBrandInfo1.setBrandCode(GeneratedUtil.generatedCode());
        platformBrandInfo1.setBrandName("品牌1");
        platformBrandInfo1.setCreater("testcreater");
        platformBrandInfo1.setCreateTime(new Date());
        platformBrandInfo1.setLastMondifier("lastman");
        platformBrandInfo1.setLastModificationTime(new Date());
        platformBrandInfo1.setIsDelete(2);

        RedisCommonUtil.put(platformBrandInfo1);
    }


    /**
     * @author: 方瑞冬
     * @date: 2019-04-25 上午 9:59
     * @since: JDK 1.8
     *
     * @description: 产品属性 Redis 测试
     * @param: []
     * @return: void
     */
    @Test
    public void ProductAttribuitDefinitionRedis(){
        ProductAttribuitDefinition productAttribuitDefinition = new ProductAttribuitDefinition();

        productAttribuitDefinition.setProductAttribuitDefinitionCode(GeneratedUtil.generatedCode());
        productAttribuitDefinition.setProductAttribuitDefinitionName("测试产品属性1");
        productAttribuitDefinition.setProductAttribuitDefinitionType("2");
        productAttribuitDefinition.setUnitCode("!");
        productAttribuitDefinition.setCreater("s");
        productAttribuitDefinition.setCreateTime(new Date());
        productAttribuitDefinition.setId("1");
        productAttribuitDefinition.setIsDelete(0);
        productAttribuitDefinition.setLastModificationTime(new Date());
        productAttribuitDefinition.setLastMondifier("w");

        RedisCommonUtil.put(productAttribuitDefinition);

        ProductAttribuitDefinition productAttribuitDefinition1 = new ProductAttribuitDefinition();

        productAttribuitDefinition1.setProductAttribuitDefinitionCode(GeneratedUtil.generatedCode());
        productAttribuitDefinition1.setProductAttribuitDefinitionName("测试产品属性2");
        productAttribuitDefinition1.setProductAttribuitDefinitionType("2");
        productAttribuitDefinition1.setUnitCode("!");
        productAttribuitDefinition1.setCreater("s");
        productAttribuitDefinition1.setCreateTime(new Date());
        productAttribuitDefinition1.setId("1");
        productAttribuitDefinition1.setIsDelete(0);
        productAttribuitDefinition1.setLastModificationTime(new Date());
        productAttribuitDefinition1.setLastMondifier("w");

        RedisCommonUtil.put(productAttribuitDefinition1);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-25 上午 10:14
     * @since: JDK 1.8
     *
     * @description: 商城展示 Redis 测试
     * @param: []
     * @return: void
     */
    @Test
    public void PlatformMailDisplayRedis(){
        PlatformMailDisplay platformMailDisplay = new PlatformMailDisplay();

        platformMailDisplay.setId(GeneratedUtil.generatedCode());
        platformMailDisplay.setMailDisplayCode(GeneratedUtil.generatedCode());
        platformMailDisplay.setMailName("测试工业产品超市");
        platformMailDisplay.setCreater("testcreater");
        platformMailDisplay.setCreateTime(new Date());
        platformMailDisplay.setLastMondifier("lastman");
        platformMailDisplay.setLastModificationTime(new Date());
        platformMailDisplay.setIsDelete(2);

        RedisCommonUtil.put(platformMailDisplay);

        PlatformMailDisplay platformMailDisplay1 = new PlatformMailDisplay();

        platformMailDisplay1.setId(GeneratedUtil.generatedCode());
        platformMailDisplay1.setMailDisplayCode(GeneratedUtil.generatedCode());
        platformMailDisplay1.setMailName("测试集采中心");
        platformMailDisplay1.setCreater("testcreater");
        platformMailDisplay1.setCreateTime(new Date());
        platformMailDisplay1.setLastMondifier("lastman");
        platformMailDisplay1.setLastModificationTime(new Date());
        platformMailDisplay1.setIsDelete(2);

        RedisCommonUtil.put(platformMailDisplay1);
    }
}
