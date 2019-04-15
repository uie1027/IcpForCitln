/**
 * Project Name: icpForCitln
 * File Name: PlantformMailDisplayDAOImpl
 * Package Name: icp.icpForCitln.platform.dao.impl
 * Date: 2019-04-15 上午 11:37
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao.impl;

import icp.icpForCitln.platform.dao.PlantformMailDisplayDAO;
import icp.icpForCitln.platform.eneity.PlantformMailDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlantformMailDisplayDAOImpl implements PlantformMailDisplayDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 上午 11:38
     * @since: JDK 1.8
     *
     * @description: 测试 plantformMailDisplay 保存
     * @param: [plantformMailDisplay]
     * @return: void
     */
    @Override
    public void saveTest(PlantformMailDisplay plantformMailDisplay) {
        mongoTemplate.save(plantformMailDisplay);
    }
}
