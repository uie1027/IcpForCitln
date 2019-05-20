/**
 * Project Name: icpForCitln
 * File Name: SystemDictionaryInfoTest
 * Package Name: icp.icpForCitln.redisInitializeTest
 * Date: 2019-04-30 上午 9:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.redisInitializeTest;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.cache.SystemDictionaryInfoAll;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemDictionaryInfoTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:00
     * @since: JDK 1.8
     *
     * @description: 字典表存假数据
     * @param: []
     * @return: void
     */
    @Test
    public void mongoInsert(){
        SystemDictionaryInfo systemDictionaryInfo1 = new SystemDictionaryInfo();

        systemDictionaryInfo1.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo1.setSystemDictionaryCategory(1);
        systemDictionaryInfo1.setSystemDictionaryValue("米");
        systemDictionaryInfo1.setSystemDictionaryDescription("米描述");

        MongoUtil.insert(systemDictionaryInfo1);

        SystemDictionaryInfo systemDictionaryInfo2 = new SystemDictionaryInfo();

        systemDictionaryInfo2.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo2.setSystemDictionaryCategory(1);
        systemDictionaryInfo2.setSystemDictionaryValue("厘米");
        systemDictionaryInfo2.setSystemDictionaryDescription("厘米描述");

        MongoUtil.insert(systemDictionaryInfo2);

        SystemDictionaryInfo systemDictionaryInfo3 = new SystemDictionaryInfo();

        systemDictionaryInfo3.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo3.setSystemDictionaryCategory(2);
        systemDictionaryInfo3.setSystemDictionaryValue("10%税率");
        systemDictionaryInfo3.setSystemDictionaryDescription("10%税率描述");

        MongoUtil.insert(systemDictionaryInfo3);

        SystemDictionaryInfo systemDictionaryInfo4 = new SystemDictionaryInfo();

        systemDictionaryInfo4.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo4.setSystemDictionaryCategory(2);
        systemDictionaryInfo4.setSystemDictionaryValue("20%税率");
        systemDictionaryInfo4.setSystemDictionaryDescription("20%税率描述");

        MongoUtil.insert(systemDictionaryInfo4);

        SystemDictionaryInfo systemDictionaryInfo5 = new SystemDictionaryInfo();

        systemDictionaryInfo5.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo5.setSystemDictionaryCategory(3);
        systemDictionaryInfo5.setSystemDictionaryValue("RMB人民币");
        systemDictionaryInfo5.setSystemDictionaryDescription("RMB描述");

        MongoUtil.insert(systemDictionaryInfo5);

        SystemDictionaryInfo systemDictionaryInfo6 = new SystemDictionaryInfo();

        systemDictionaryInfo6.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo6.setSystemDictionaryCategory(3);
        systemDictionaryInfo6.setSystemDictionaryValue("美元");
        systemDictionaryInfo6.setSystemDictionaryDescription("美元描述");

        MongoUtil.insert(systemDictionaryInfo6);

        SystemDictionaryInfo systemDictionaryInfo7 = new SystemDictionaryInfo();

        systemDictionaryInfo7.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo7.setSystemDictionaryCategory(4);
        systemDictionaryInfo7.setSystemDictionaryValue("付款方式1");
        systemDictionaryInfo7.setSystemDictionaryDescription("付款方式1描述");

        MongoUtil.insert(systemDictionaryInfo7);

        SystemDictionaryInfo systemDictionaryInfo8 = new SystemDictionaryInfo();

        systemDictionaryInfo8.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo8.setSystemDictionaryCategory(4);
        systemDictionaryInfo8.setSystemDictionaryValue("付款方式2");
        systemDictionaryInfo8.setSystemDictionaryDescription("付款方式2描述");

        MongoUtil.insert(systemDictionaryInfo8);

        SystemDictionaryInfo systemDictionaryInfo9 = new SystemDictionaryInfo();

        systemDictionaryInfo9.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo9.setSystemDictionaryCategory(5);
        systemDictionaryInfo9.setSystemDictionaryValue("采购订单类型1");
        systemDictionaryInfo9.setSystemDictionaryDescription("采购订单类型1描述");

        MongoUtil.insert(systemDictionaryInfo9);

        SystemDictionaryInfo systemDictionaryInfo10 = new SystemDictionaryInfo();

        systemDictionaryInfo10.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo10.setSystemDictionaryCategory(5);
        systemDictionaryInfo10.setSystemDictionaryValue("采购订单类型2");
        systemDictionaryInfo10.setSystemDictionaryDescription("采购订单类型2描述");

        MongoUtil.insert(systemDictionaryInfo10);

        SystemDictionaryInfo systemDictionaryInfo11 = new SystemDictionaryInfo();

        systemDictionaryInfo11.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo11.setSystemDictionaryCategory(6);
        systemDictionaryInfo11.setSystemDictionaryValue("销售订单类型1");
        systemDictionaryInfo11.setSystemDictionaryDescription("销售订单类型1描述");

        MongoUtil.insert(systemDictionaryInfo11);

        SystemDictionaryInfo systemDictionaryInfo12 = new SystemDictionaryInfo();

        systemDictionaryInfo12.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo12.setSystemDictionaryCategory(6);
        systemDictionaryInfo12.setSystemDictionaryValue("销售订单类型2");
        systemDictionaryInfo12.setSystemDictionaryDescription("销售订单类型2描述");

        MongoUtil.insert(systemDictionaryInfo12);

        SystemDictionaryInfo systemDictionaryInfo13 = new SystemDictionaryInfo();

        systemDictionaryInfo13.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo13.setSystemDictionaryCategory(7);
        systemDictionaryInfo13.setSystemDictionaryValue("生产入库单凭证类型1");
        systemDictionaryInfo13.setSystemDictionaryDescription("生产入库单凭证类型1描述");

        MongoUtil.insert(systemDictionaryInfo13);

        SystemDictionaryInfo systemDictionaryInfo14 = new SystemDictionaryInfo();

        systemDictionaryInfo14.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo14.setSystemDictionaryCategory(7);
        systemDictionaryInfo14.setSystemDictionaryValue("生产入库单凭证类型2");
        systemDictionaryInfo14.setSystemDictionaryDescription("生产入库单凭证类型2描述");

        MongoUtil.insert(systemDictionaryInfo14);

        SystemDictionaryInfo systemDictionaryInfo15 = new SystemDictionaryInfo();

        systemDictionaryInfo15.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo15.setSystemDictionaryCategory(8);
        systemDictionaryInfo15.setSystemDictionaryValue("采购入库凭证类型1");
        systemDictionaryInfo15.setSystemDictionaryDescription("采购入库凭证类型1描述");

        MongoUtil.insert(systemDictionaryInfo15);

        SystemDictionaryInfo systemDictionaryInfo16 = new SystemDictionaryInfo();

        systemDictionaryInfo16.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo16.setSystemDictionaryCategory(8);
        systemDictionaryInfo16.setSystemDictionaryValue("采购入库凭证类型2");
        systemDictionaryInfo16.setSystemDictionaryDescription("采购入库凭证类型2描述");

        MongoUtil.insert(systemDictionaryInfo16);

        SystemDictionaryInfo systemDictionaryInfo17 = new SystemDictionaryInfo();

        systemDictionaryInfo17.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo17.setSystemDictionaryCategory(9);
        systemDictionaryInfo17.setSystemDictionaryValue("其他出库凭证类型1");
        systemDictionaryInfo17.setSystemDictionaryDescription("其他出库凭证类型1描述");

        MongoUtil.insert(systemDictionaryInfo17);

        SystemDictionaryInfo systemDictionaryInfo18 = new SystemDictionaryInfo();

        systemDictionaryInfo18.setSystemDictionaryCode(GeneratedCodeUtil.generatedCode());
        systemDictionaryInfo18.setSystemDictionaryCategory(9);
        systemDictionaryInfo18.setSystemDictionaryValue("其他出库凭证类型2");
        systemDictionaryInfo18.setSystemDictionaryDescription("其他出库凭证类型2描述");

        MongoUtil.insert(systemDictionaryInfo18);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:06
     * @since: JDK 1.8
     *
     * @description: redis 存假数据
     * @param: []
     * @return: void
     */
    @Test
    public void redisPut(){
        List<SystemDictionaryInfo> systemDictionaryInfoList = mongoTemplate.findAll(SystemDictionaryInfo.class);
        for(SystemDictionaryInfo systemDictionaryInfo : systemDictionaryInfoList){
            RedisUtil.put(systemDictionaryInfo);
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/20 11:36
     * @since: JDK 1.8
     *
     * @description: 通过 ID 获取数据字典 合在一起的数据
     * @param: []
     * @return: void
     */
    @Test
    public void systemDictionaryInfoAllRedisPut(){
        List<SystemDictionaryInfo> systemDictionaryInfoList = mongoTemplate.findAll(SystemDictionaryInfo.class);
        List<SystemDictionaryInfoAll> systemDictionaryInfoAllList = BeanCopyUtil.copy(systemDictionaryInfoList, SystemDictionaryInfoAll.class);
        for(SystemDictionaryInfoAll systemDictionaryInfoAll : systemDictionaryInfoAllList){
            RedisUtil.put(systemDictionaryInfoAll);
        }
    }
}
