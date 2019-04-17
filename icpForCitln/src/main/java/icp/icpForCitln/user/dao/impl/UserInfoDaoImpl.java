/**
 * Project Name: icpForCitln
 * File Name: UserInfoDaoImpl
 * Package Name: icp.icpForCitln.user.dao
 * Date: 2019-04-17 上午 10:49
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.dao.impl;

import icp.icpForCitln.user.dao.UserInfoDAO;
import icp.icpForCitln.user.eneity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl implements UserInfoDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 上午 10:53
     * @since: JDK 1.8
     *
     * @description: 保存 userInfo 测试
     * @param: [userInfo]
     * @return: void
     */
    @Override
    public void saveTest(UserInfo userInfo) {
        mongoTemplate.save(userInfo);
    }
}
