/**
 * Project Name: icpForCitln
 * File Name: PlantformDirectoryInfoTest
 * Package Name: icp.icpForCitln.redisInitializeTest
 * Date: 2019-04-30 上午 11:18
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.redisInitializeTest;

import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlantformDirectoryInfoTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 11:22
     * @since: JDK 1.8
     *
     * @description: Redis 存假数据
     * @param: []
     * @return: void
     */
    @Test
    public void redisPut(){
        List<PlantformDirectoryInfo> plantformDirectoryInfoList = mongoTemplate.findAll(PlantformDirectoryInfo.class);
        for (PlantformDirectoryInfo plantformDirectoryInfo : plantformDirectoryInfoList){
            RedisUtil.put(plantformDirectoryInfo);
        }
    }
}
