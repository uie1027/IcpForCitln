/**
 * Project Name: icpForCitln
 * File Name: IcpForCitlnApplicationTests
 * Package Name: icp.icpForCitln
 * Date: 2019-04-12 上午 11:02
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitAndValueDTO;
import icp.icpForCitln.user.eneity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IcpForCitlnApplicationTests {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 3:32
     * @since: JDK 1.8
     *
     * @description: 默认测试方法
     * @param: []
     * @return: void
     */
    @Test
    public void contextLoads() {
        LookupOperation lookupOperation = LookupOperation.newLookup().from("SYSTEM_PRODUCT_ATTRIBUIT_VALUE").localField("_id").foreignField("SYSTEM_PRODUCT_ATTRIBUIT_ID").as("SYSTEM_PRODUCT_ATTRIBUIT_VALUES");
        Aggregation aggregation = Aggregation.newAggregation(
                lookupOperation
                //Aggregation.project("SYSTEM_PRODUCT_ATTRIBUIT_CODE", "SYSTEM_PRODUCT_ATTRIBUIT_VALUES.SYSTEM_PRODUCT_ATTRIBUIT_ID")
                //Aggregation.match(Criteria.where("age").gt(13))
        );

        System.out.println(mongoTemplate.aggregate(aggregation, "SYSTEM_PRODUCT_ATTRIBUIT", SystemProductAttribuitAndValueDTO.class).getMappedResults());
    }

    @Test
    public void test(){
        List<UserInfo> userInfoList = mongoTemplate.findAll(UserInfo.class);
        RedisUtil.put(userInfoList.get(0));

    }
}
