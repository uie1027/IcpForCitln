/**
 * Project Name: icpForCitln
 * File Name: PlatformMailDisplayDAOImpl
 * Package Name: icp.icpForCitln.platform.dao.impl
 * Date: 2019-04-15 上午 11:37
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao.impl;

import icp.icpForCitln.platform.dao.PlatformMailDisplayDAO;
import icp.icpForCitln.platform.eneity.PlatformMailDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformMailDisplayDAOImpl implements PlatformMailDisplayDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 上午 11:38
     * @since: JDK 1.8
     *
     * @description: 测试 platformMailDisplay 保存
     * @param: [platformMailDisplay]
     * @return: void
     */
    @Override
    public void saveTest(PlatformMailDisplay platformMailDisplay) {
        mongoTemplate.save(platformMailDisplay);
    }
}
