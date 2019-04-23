/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryDAOImpl
 * Package Name: icp.icpForCitln.platform.dao.impl
 * Date: 2019-04-12 下午 1:58
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao.impl;

import icp.icpForCitln.platform.dao.PlatformDirectoryInfoDAO;
import icp.icpForCitln.platform.eneity.PlatformDirectoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformDirectoryInfoDAOImpl implements PlatformDirectoryInfoDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 2:13
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryInfo 保存
     * @param: [platformDirectoryInfo]
     * @return: void
     */
    @Override
    public void saveTest(PlatformDirectoryInfo platformDirectoryInfo) {
        mongoTemplate.save(platformDirectoryInfo);
    }
}
