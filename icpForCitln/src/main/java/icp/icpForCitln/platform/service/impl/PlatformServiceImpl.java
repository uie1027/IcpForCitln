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
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoDeleteDTO;
import icp.icpForCitln.platform.dto.PlantformDirectoryInfoSaveDTO;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.platform.service.PlatformService;
import icp.icpForCitln.platform.view.MenuInfoListView;
import icp.icpForCitln.platform.view.PlantformDirectoryInfoListView;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 11:14
     * @since: JDK 1.8
     *
     * @description: 目录列表查询
     * @param: []
     * @return: java.util.List<icp.icpForCitln.platform.entity.PlantformDirectoryInfo>
     */
    @Override
    public List<PlantformDirectoryInfoListView> plantformDirectoryInfoGetList() {
        return MongoUtil.select(new PlantformDirectoryInfoListView());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 11:59
     * @since: JDK 1.8
     *
     * @description: 删除目录
     * @param: [plantformDirectoryInfoDeleteDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryInfoDelete(PlantformDirectoryInfoDeleteDTO plantformDirectoryInfoDeleteDTO) {
        MongoUtil.delete(BeanCopyUtil.copy(plantformDirectoryInfoDeleteDTO, PlantformDirectoryInfo.class));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-05-05 下午 1:46
     * @since: JDK 1.8
     *
     * @description: 商城展示列表获取 Redis
     * @param: []
     * @return: java.util.List<icp.icpForCitln.platform.entity.PlantformMailDisplay>
     */
    @Override
    public List<PlantformMailDisplay> plantformMailDisplayGetList() {
        List list = RedisUtil.getList(new PlantformMailDisplay());
        return BeanCopyUtil.copy(list, PlantformMailDisplay.class);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/10 16:30
     * @since: JDK 1.8
     *
     * @description: 菜单列表获取
     * @param: []
     * @return: java.util.List<icp.icpForCitln.platform.view.MenuInfoListView>
     */
    @Override
    public List<MenuInfoListView> menuInfoGetList() {
        return MongoUtil.select(new MenuInfoListView());
    }
}
