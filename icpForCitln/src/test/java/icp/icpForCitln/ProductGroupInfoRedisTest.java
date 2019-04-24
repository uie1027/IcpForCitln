/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfoRedisTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-24 下午 1:57
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.util.RedisCommonUtil;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductGroupInfoRedisTest {

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 2:10
     * @since: JDK 1.8
     *
     * @description: Redis 存储产品组信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void putTest(){
        ProductGroupInfo productGroupInfo = new ProductGroupInfo();

        productGroupInfo.setId("TEST");
        productGroupInfo.setProductGroupCode("ProductGroupCode");
        productGroupInfo.setProductGroupName("ProductGroupName");
        productGroupInfo.setPlatformFirstDirectory("PlatformFirstDirectory");
        productGroupInfo.setPlatformSecondDirectory("PlatformSecondDirectory");
        productGroupInfo.setBrand("Brand");
        productGroupInfo.setPicture("Picture");
        productGroupInfo.setDetailedInformation("DetailedInformation");
        productGroupInfo.setCreater("TEST");
        productGroupInfo.setCreateTime(new Date());
        productGroupInfo.setLastMondifier("TEST");
        productGroupInfo.setLastModificationTime(new Date());
        productGroupInfo.setIsDelete(1);

        RedisCommonUtil.put(productGroupInfo);

        ProductGroupInfo productGroupInfoT = new ProductGroupInfo();

        productGroupInfoT.setId("TEST");
        productGroupInfoT.setProductGroupCode("ProductGroupCodeT");
        productGroupInfoT.setProductGroupName("ProductGroupName");
        productGroupInfoT.setPlatformFirstDirectory("PlatformFirstDirectory");
        productGroupInfoT.setPlatformSecondDirectory("PlatformSecondDirectory");
        productGroupInfoT.setBrand("Brand");
        productGroupInfoT.setPicture("Picture");
        productGroupInfoT.setDetailedInformation("DetailedInformation");
        productGroupInfoT.setCreater("TEST");
        productGroupInfoT.setCreateTime(new Date());
        productGroupInfoT.setLastMondifier("TEST");
        productGroupInfoT.setLastModificationTime(new Date());
        productGroupInfoT.setIsDelete(1);

        RedisCommonUtil.put(productGroupInfoT);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 2:12
     * @since: JDK 1.8
     *
     * @description: Redis 取产品组信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getTest(){
        ProductGroupInfo productGroupInfo = new ProductGroupInfo();

        productGroupInfo.setProductGroupCode("ProductGroupCode");

        System.out.println(RedisCommonUtil.get(productGroupInfo));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 2:14
     * @since: JDK 1.8
     *
     * @description: Redis 删产品组信息 测试
     * @param: []
     * @return: void
     */
    @Test
    public void deleteTest(){
        ProductGroupInfo productGroupInfo = new ProductGroupInfo();

        productGroupInfo.setProductGroupCode("ProductGroupCode");

        RedisCommonUtil.delete(productGroupInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-24 下午 2:16
     * @since: JDK 1.8
     *
     * @description: Redis 获取产品组信息列表 测试
     * @param: []
     * @return: void
     */
    @Test
    public void getList(){
        System.out.println(RedisCommonUtil.getList(new ProductGroupInfo()));
    }
}
