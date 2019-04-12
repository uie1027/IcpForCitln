/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryServiceImpl
 * Package Name: icp.icpForCitln.platform.service.impl
 * Date: 2019-04-12 下午 2:04
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service.impl;

import icp.icpForCitln.platform.dao.PlatformDirectoryAttributeDAO;
import icp.icpForCitln.platform.dao.PlatformDirectoryInfoDAO;
import icp.icpForCitln.platform.eneity.PlatformDirectoryInfo;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttribute;
import icp.icpForCitln.platform.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformServiceImpl implements PlatformService {
    @Autowired
    private PlatformDirectoryInfoDAO platformDirectoryDAO;
    @Autowired
    private PlatformDirectoryAttributeDAO platformDirectoryAttributeDAO;

    /**
     * @author: 方瑞冬
     * date: 2019-04-12 下午 2:14
     * @since: JDK 1.8
     *
     * @description: 测试 platform 保存
     * @param: [platform]
     * @return: void
     */
    @Override
    public void platformDirectorySaveTest(PlatformDirectoryInfo platformDirectoryInfo) {
        platformDirectoryDAO.saveTest(platformDirectoryInfo);
    }

    @Override
    public void platformDirectoryAttributeSaveTest(PlatformDirectoryAttribute platformDirectoryAttribute) {
        platformDirectoryAttributeDAO.saveTest(platformDirectoryAttribute);
    }
}
