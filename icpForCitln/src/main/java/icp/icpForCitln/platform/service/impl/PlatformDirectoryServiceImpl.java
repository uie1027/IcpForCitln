/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryServiceImpl
 * Package Name: icp.icpForCitln.platformDirectory.service.impl
 * Date: 2019-04-12 下午 2:04
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platformDirectory.service.impl;

import icp.icpForCitln.platformDirectory.dao.PlatformDirectoryDAO;
import icp.icpForCitln.platformDirectory.eneity.PlatformDirectory;
import icp.icpForCitln.platformDirectory.service.PlatformDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformDirectoryServiceImpl implements PlatformDirectoryService {
    @Autowired
    private PlatformDirectoryDAO platformDirectoryDAO;

    /**
     * @author: 方瑞冬
     * date: 2019-04-12 下午 2:14
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectory 保存
     * @param: [platformDirectory]
     * @return: void
     */
    @Override
    public void saveTest(PlatformDirectory platformDirectory) {
        platformDirectoryDAO.saveTest(platformDirectory);
    }
}
