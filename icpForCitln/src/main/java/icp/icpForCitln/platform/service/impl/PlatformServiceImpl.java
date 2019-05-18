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
import icp.icpForCitln.platform.dto.*;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttribute;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.platform.service.PlatformService;
import icp.icpForCitln.platform.view.MenuInfoListView;
import icp.icpForCitln.platform.view.PlantformDirectoryInfoListView;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 18:35
     * @since: JDK 1.8
     *
     * @description: 通过 ID 获取目录信息
     * @param: [plantformDirectoryInfoEditDTO]
     * @return: icp.icpForCitln.platform.entity.PlantformDirectoryInfo
     */
    @Override
    public PlantformDirectoryInfo plantformDirectoryInfoEdit(PlantformDirectoryInfoEditDTO plantformDirectoryInfoEditDTO) {
        PlantformDirectoryInfo plantformDirectoryInfo = BeanCopyUtil.copy(plantformDirectoryInfoEditDTO, PlantformDirectoryInfo.class);
        List<PlantformDirectoryInfo> plantformDirectoryInfoList = MongoUtil.select(plantformDirectoryInfo);
       if(!CollectionUtils.isEmpty(plantformDirectoryInfoList)){
           return plantformDirectoryInfoList.get(0);
       } else {
           return null;
       }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 18:46
     * @since: JDK 1.8
     *
     * @description: 目录编辑保存
     * @param: [plantformDirectoryInfoEditSaveDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryInfoEditSave(PlantformDirectoryInfoEditSaveDTO plantformDirectoryInfoEditSaveDTO) {
        PlantformDirectoryInfo plantformDirectoryInfo = BeanCopyUtil.copy(plantformDirectoryInfoEditSaveDTO, PlantformDirectoryInfo.class);
        MongoUtil.upsert(plantformDirectoryInfo, plantformDirectoryInfoEditSaveDTO.getFlag());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:02
     * @since: JDK 1.8
     *
     * @description: 目录属性新增
     * @param: [pantformDirectoryAttributeAdd]
     * @return: void
     */
    @Override
    public void plantformDirectoryAttributeAdd(PlantformDirectoryAttributeAddDTO pantformDirectoryAttributeAdd) {
        PlantformDirectoryAttribute plantformDirectoryAttribute = BeanCopyUtil.copy(pantformDirectoryAttributeAdd, PlantformDirectoryAttribute.class);
        plantformDirectoryAttribute.setPlantformAttributeCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(plantformDirectoryAttribute);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:11
     * @since: JDK 1.8
     *
     * @description: 目录属性删除
     * @param: [plantformDirectoryAttributeDeleteDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryAttributeDelete(PlantformDirectoryAttributeDeleteDTO plantformDirectoryAttributeDeleteDTO) {
        PlantformDirectoryAttribute plantformDirectoryAttribute = BeanCopyUtil.copy(plantformDirectoryAttributeDeleteDTO, PlantformDirectoryAttribute.class);
        MongoUtil.delete(plantformDirectoryAttribute);
    }
}
