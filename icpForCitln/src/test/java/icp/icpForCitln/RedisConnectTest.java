/**
 * Project Name: icpForCitln
 * File Name: RedisConnectTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-16 下午 3:31
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConnectTest {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 3:33
     * @since: JDK 1.8
     *
     * @description: Redis 连接测试
     * @param: []
     * @return: void
     */
    @Test
    public void test(){
        redisTemplate.opsForValue().set("redis-state","success");
        System.out.println(redisTemplate.opsForValue().get("redis-state"));
    }
}
