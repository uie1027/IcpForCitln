/**
 * Project Name: icpForCitln
 * File Name: PlatformServiceImpl
 * Package Name: icp.icpForCitln.platform.service.impl
 * Date: 2019-04-30 上午 10:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoSaveDTO;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.service.PlatformService;
import org.springframework.stereotype.Service;

@Service
public class PlatformServiceImpl implements PlatformService {
    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:40
     * @since: JDK 1.8
     *
     * @description: 目录新增
     * @param: [plantformDirectoryInfoSaveDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryInfoSave(PlantformDirectoryInfoSaveDTO plantformDirectoryInfoSaveDTO) {
        PlantformDirectoryInfo plantformDirectoryInfo = BeanCopyUtil.copy(plantformDirectoryInfoSaveDTO, PlantformDirectoryInfo.class);

        plantformDirectoryInfo.setPlantformDirectoryCode(GeneratedCodeUtil.generatedCode());

        MongoUtil.insert(plantformDirectoryInfo);
    }
}
