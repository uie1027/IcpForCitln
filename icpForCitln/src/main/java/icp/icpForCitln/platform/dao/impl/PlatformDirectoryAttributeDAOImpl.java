/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryAttributeDAOImpl
 * Package Name: icp.icpForCitln.platform.dao.impl
 * Date: 2019-04-12 下午 3:57
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao.impl;

import icp.icpForCitln.platform.dao.PlatformDirectoryAttributeDAO;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformDirectoryAttributeDAOImpl implements PlatformDirectoryAttributeDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 3:58
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryAttribute 保存
     * @param: [platformDirectoryAttribute]
     * @return: void
     */
    @Override
    public void saveTest(PlatformDirectoryAttribute platformDirectoryAttribute) {
        mongoTemplate.save(platformDirectoryAttribute);
    }
}
