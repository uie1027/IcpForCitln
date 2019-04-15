/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoDAOImpl
 * Package Name: icp.icpForCitln.platform.dao.impl
 * Date: 2019-04-12 下午 4:49
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.dao.impl;

import icp.icpForCitln.platform.dao.PlatformUnitInfoDAO;
import icp.icpForCitln.platform.eneity.PlatformUnitInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformUnitInfoDAOImpl implements PlatformUnitInfoDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:56
     * @since: JDK 1.8
     *
     * @description: 测试 platformUnitInfo 保存
     * @param: [platformUnitInfo]
     * @return: void
     */
    @Override
    public void saveTest(PlatformUnitInfo platformUnitInfo) {
        mongoTemplate.save(platformUnitInfo);
    }
}
