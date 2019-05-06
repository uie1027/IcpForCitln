/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfoTest
 * Package Name: icp.icpForCitln.redisInitializeTest
 * Date: 2019/5/6 16:02
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.redisInitializeTest;

import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductGroupInfoTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019/5/6 16:03
     * @since: JDK 1.8
     *
     * @description: Redis 存产品组假数据
     * @param: []
     * @return: void
     */
    @Test
    public void redisPut(){
        List<ProductGroupInfo> productGroupInfoList = mongoTemplate.findAll(ProductGroupInfo.class);
        for(ProductGroupInfo productGroupInfo : productGroupInfoList){
            RedisUtil.put(productGroupInfo);
        }
    }
}
