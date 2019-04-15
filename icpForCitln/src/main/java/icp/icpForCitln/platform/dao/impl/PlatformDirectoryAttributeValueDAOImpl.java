/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryAttributeValueDAOImpl
 * Package Name: icp.icpForCitln.platform.dao.impl
 * Date: 2019-04-12 下午 4:24
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao.impl;

import icp.icpForCitln.platform.dao.PlatformDirectoryAttributeValueDAO;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttributeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformDirectoryAttributeValueDAOImpl implements PlatformDirectoryAttributeValueDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:31
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryAttributeValue 保存
     * @param: [platformDirectoryAttributeValue]
     * @return: void
     */
    @Override
    public void saveTest(PlatformDirectoryAttributeValue platformDirectoryAttributeValue) {
        mongoTemplate.save(platformDirectoryAttributeValue);
    }
}
