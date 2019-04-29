/**
 * Project Name: icpForCitln
 * File Name: Enterprise
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019-04-29 下午 3:01
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.cache.UserInfoCache;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.SessionUtil;
import icp.icpForCitln.enterprise.EnterpriseInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Enterprise {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-29 下午 3:03
     * @since: JDK 1.8
     *
     * @description: EnterpriseInfo 测试
     * @param: []
     * @return: void
     */
    @Test
    public void enterpriseInfoTest(){
        EnterpriseInfo enterpriseInfo = new EnterpriseInfo();

        enterpriseInfo.setEnterpriseCode("65465+4");
        enterpriseInfo.setEnterpriseName("sadasdad");
        enterpriseInfo.setCreater(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        enterpriseInfo.setCreateTime(new Date());
        enterpriseInfo.setLastMondifier(UserInfoCache.get(SessionUtil.getByKey("userNum")).getId());
        enterpriseInfo.setLastModificationTime(new Date());
        enterpriseInfo.setIsDelete(2);
        enterpriseInfo.setIsDisplay(1);

        MongoUtil.insert(enterpriseInfo);
    }
}
