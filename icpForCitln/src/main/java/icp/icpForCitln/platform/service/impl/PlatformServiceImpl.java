/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryServiceImpl
 * Package Name: icp.icpForCitln.platform.service.impl
 * Date: 2019-04-12 下午 2:04
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service.impl;

import icp.icpForCitln.platform.dao.PlatformDirectoryAttributeDAO;
import icp.icpForCitln.platform.dao.PlatformDirectoryAttributeValueDAO;
import icp.icpForCitln.platform.dao.PlatformDirectoryInfoDAO;
import icp.icpForCitln.platform.dao.PlatformUnitInfoDAO;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttributeValue;
import icp.icpForCitln.platform.eneity.PlatformDirectoryInfo;
import icp.icpForCitln.platform.eneity.PlatformDirectoryAttribute;
import icp.icpForCitln.platform.eneity.PlatformUnitInfo;
import icp.icpForCitln.platform.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformServiceImpl implements PlatformService {
    @Autowired
    private PlatformDirectoryInfoDAO platformDirectoryDAO;
    @Autowired
    private PlatformDirectoryAttributeDAO platformDirectoryAttributeDAO;
    @Autowired
    private PlatformDirectoryAttributeValueDAO platformDirectoryAttributeValueDAO;
    @Autowired
    private PlatformUnitInfoDAO platformUnitInfoDAO;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 2:14
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryInfo 保存
     * @param: [platformDirectoryInfo]
     * @return: void
     */
    @Override
    public void platformDirectoryInfoSaveTest(PlatformDirectoryInfo platformDirectoryInfo) {
        platformDirectoryDAO.saveTest(platformDirectoryInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:32
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryAttribute 保存
     * @param: [platformDirectoryAttribute]
     * @return: void
     */
    @Override
    public void platformDirectoryAttributeSaveTest(PlatformDirectoryAttribute platformDirectoryAttribute) {
        platformDirectoryAttributeDAO.saveTest(platformDirectoryAttribute);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:32
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectoryAttributeValue 保存
     * @param: [platformDirectoryAttributeValue]
     * @return: void
     */
    @Override
    public void platformDirectoryAttributeValueSaveTest(PlatformDirectoryAttributeValue platformDirectoryAttributeValue) {
        platformDirectoryAttributeValueDAO.saveTest(platformDirectoryAttributeValue);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-12 下午 4:57
     * @since: JDK 1.8
     *
     * @description: 测试 platformUnitInfo 保存
     * @param: [platformUnitInfo]
     * @return: void
     */
    @Override
    public void platformUnitInfoSaveTest(PlatformUnitInfo platformUnitInfo) {
        platformUnitInfoDAO.saveTest(platformUnitInfo);
    }
}
