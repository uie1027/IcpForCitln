/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryDAOImpl
 * Package Name: icp.icpForCitln.platformDirectory.dao.impl
 * Date: 2019-04-12 下午 1:58
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platformDirectory.dao.impl;

import icp.icpForCitln.platformDirectory.dao.PlatformDirectoryDAO;
import icp.icpForCitln.platformDirectory.eneity.PlatformDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformDirectoryDAOImpl implements PlatformDirectoryDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * date: 2019-04-12 下午 2:13
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectory 保存
     * @param: [platformDirectory]
     * @return: void
     */
    @Override
    public void saveTest(PlatformDirectory platformDirectory) {
        mongoTemplate.save(platformDirectory);
    }
}
