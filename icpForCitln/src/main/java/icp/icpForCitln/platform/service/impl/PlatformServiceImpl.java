/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryServiceImpl
 * Package Name: icp.icpForCitln.platform.service.impl
 * Date: 2019-04-12 下午 2:04
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.platform.dao.*;
import icp.icpForCitln.platform.dto.PlatformDirectoryInfoAddDTO;
import icp.icpForCitln.platform.eneity.*;
import icp.icpForCitln.platform.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformServiceImpl implements PlatformService {
    @Autowired
    private PlatformDirectoryInfoDAO platformDirectoryInfoDAO;
    @Autowired
    private PlatformDirectoryAttributeDAO platformDirectoryAttributeDAO;
    @Autowired
    private PlatformDirectoryAttributeValueDAO platformDirectoryAttributeValueDAO;
    @Autowired
    private PlatformUnitInfoDAO platformUnitInfoDAO;
    @Autowired
    private PlatformMailDisplayDAO platformMailDisplayDAO;

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
        platformDirectoryInfoDAO.saveTest(platformDirectoryInfo);
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

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 上午 11:40
     * @since: JDK 1.8
     *
     * @description: 测试 platformMailDisplay 保存
     * @param: [platformMailDisplay]
     * @return: void
     */
    @Override
    public void platformMailDisplaySaveTest(PlatformMailDisplay platformMailDisplay) {
        platformMailDisplayDAO.saveTest(platformMailDisplay);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-22 下午 1:57
     * @since: JDK 1.8
     *
     * @description: 获取平台目录所有信息列表
     * @param: []
     * @return: java.util.List<icp.icpForCitln.platform.eneity.PlatformDirectoryInfo>
     */
    @Override
    public List<PlatformDirectoryInfo> getPlatformDirectoryInfoList() {
        PlatformDirectoryInfo platformDirectoryInfo = new PlatformDirectoryInfo();
        platformDirectoryInfo.setPlatformDirectoryCode("45616");
        return MongoUtil.select(platformDirectoryInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-23 上午 9:35
     * @since: JDK 1.8
     *
     * @description: 新增目录
     * @param: [platformDirectoryInfoAddDTO]
     * @return: void
     */
    @Override
    public void addPlatformDirectoryInfo(PlatformDirectoryInfoAddDTO platformDirectoryInfoAddDTO) {
        PlatformDirectoryInfo platformDirectoryInfo = BeanCopyUtil.copy(platformDirectoryInfoAddDTO, PlatformDirectoryInfo.class);
        platformDirectoryInfo.setPlatformDirectoryCode(GeneratedUtil.generatedCode());
        MongoUtil.insert(platformDirectoryInfo);
    }
}
