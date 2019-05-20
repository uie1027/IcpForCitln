/**
 * Project Name: icpForCitln
 * File Name: PlatformServiceImpl
 * Package Name: icp.icpForCitln.platform.service.impl
 * Date: 2019-04-30 上午 10:38
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.service.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.platform.dto.*;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttribute;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.platform.service.PlatformService;
import icp.icpForCitln.platform.view.MenuInfoListView;
import icp.icpForCitln.platform.view.PlantformDirectoryInfoListView;
import icp.icpForCitln.platform.vo.PlantformDirectoryAttributeGetListVO;
import icp.icpForCitln.platform.vo.PlantformDirectoryAttributeValueGetListVO;
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

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:18
     * @since: JDK 1.8
     *
     * @description: 目录属性列表
     * @param: [plantformDirectoryAttributeGetListDTO]
     * @return: java.util.List<icp.icpForCitln.platform.entity.PlantformDirectoryAttribute>
     */
    @Override
    public MongoResult plantformDirectoryAttributeGetList(PlantformDirectoryAttributeGetListDTO plantformDirectoryAttributeGetListDTO) {
        PlantformDirectoryAttribute plantformDirectoryAttribute = BeanCopyUtil.copy(plantformDirectoryAttributeGetListDTO, PlantformDirectoryAttribute.class);
        MongoResult mongoResult = MongoUtil.select(plantformDirectoryAttributeGetListDTO.getPageIndex(), plantformDirectoryAttributeGetListDTO.getPageSize(), plantformDirectoryAttribute);
        List<PlantformDirectoryAttributeGetListVO> plantformDirectoryAttributeGetListVOList = BeanCopyUtil.copy(mongoResult.getResultList(), PlantformDirectoryAttributeGetListVO.class);
        mongoResult.setResultList(plantformDirectoryAttributeGetListVOList);
        return mongoResult;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:31
     * @since: JDK 1.8
     *
     * @description: 目录属性编辑显示
     * @param: [plantformDirectoryAttributeEditDTO]
     * @return: icp.icpForCitln.platform.entity.PlantformDirectoryAttribute
     */
    @Override
    public PlantformDirectoryAttribute plantformDirectoryAttributeEdit(PlantformDirectoryAttributeEditDTO plantformDirectoryAttributeEditDTO) {
        PlantformDirectoryAttribute plantformDirectoryAttribute = BeanCopyUtil.copy(plantformDirectoryAttributeEditDTO, PlantformDirectoryAttribute.class);
        List<PlantformDirectoryAttribute> plantformDirectoryAttributeList = MongoUtil.select(plantformDirectoryAttribute);
        if(!CollectionUtils.isEmpty(plantformDirectoryAttributeList)){
            return plantformDirectoryAttributeList.get(0);
        } else {
            return null;
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:42
     * @since: JDK 1.8
     *
     * @description: 目录属性编辑保存
     * @param: [plantformDirectoryAttributeEditSaveDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryAttributeEditSave(PlantformDirectoryAttributeEditSaveDTO plantformDirectoryAttributeEditSaveDTO) {
        PlantformDirectoryAttribute plantformDirectoryAttribute = BeanCopyUtil.copy(plantformDirectoryAttributeEditSaveDTO, PlantformDirectoryAttribute.class);
        MongoUtil.upsert(plantformDirectoryAttribute, plantformDirectoryAttributeEditSaveDTO.getFlag());
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 19:53
     * @since: JDK 1.8
     *
     * @description: 目录属性值新增
     * @param: [plantformDirectoryAttributeValueAddDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryAttributeValueAdd(PlantformDirectoryAttributeValueAddDTO plantformDrectoryAttributeValueAddDTO) {
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = BeanCopyUtil.copy(plantformDrectoryAttributeValueAddDTO, PlantformDirectoryAttributeValue.class);
        plantformDirectoryAttributeValue.setPlantformAttributeCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(plantformDirectoryAttributeValue);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:01
     * @since: JDK 1.8
     *
     * @description: 目录属性值删除
     * @param: [plantformDirectoryAttributeValueDeleteDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryAttributeValueDelete(PlantformDirectoryAttributeValueDeleteDTO plantformDirectoryAttributeValueDeleteDTO) {
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = BeanCopyUtil.copy(plantformDirectoryAttributeValueDeleteDTO, PlantformDirectoryAttributeValue.class);
        MongoUtil.delete(plantformDirectoryAttributeValue);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:08
     * @since: JDK 1.8
     *
     * @description: 目录属性值列表获取
     * @param: [plantformDirectoryAttributeValueGetListDTO]
     * @return: java.util.List<icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue>
     */
    @Override
    public MongoResult plantformDirectoryAttributeValueGetList(PlantformDirectoryAttributeValueGetListDTO plantformDirectoryAttributeValueGetListDTO) {
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = BeanCopyUtil.copy(plantformDirectoryAttributeValueGetListDTO, PlantformDirectoryAttributeValue.class);
        MongoResult mongoResult = MongoUtil.select(plantformDirectoryAttributeValueGetListDTO.getPageIndex(), plantformDirectoryAttributeValueGetListDTO.getPageSize(), plantformDirectoryAttributeValue);
        List<PlantformDirectoryAttributeValueGetListVO> plantformDirectoryAttributeValueGetListVOList =  BeanCopyUtil.copy(mongoResult.getResultList(), PlantformDirectoryAttributeValueGetListVO.class);
        mongoResult.setResultList(plantformDirectoryAttributeValueGetListVOList);
        return mongoResult;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:18
     * @since: JDK 1.8
     *
     * @description: 目录属性值编辑显示
     * @param: [plantformDirectoryAttributeValueEditDTO]
     * @return: icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue
     */
    @Override
    public PlantformDirectoryAttributeValue plantformDirectoryAttributeValueEdit(PlantformDirectoryAttributeValueEditDTO plantformDirectoryAttributeValueEditDTO) {
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = BeanCopyUtil.copy(plantformDirectoryAttributeValueEditDTO, PlantformDirectoryAttributeValue.class);
        List<PlantformDirectoryAttributeValue> plantformDirectoryAttributeValueList = MongoUtil.select(plantformDirectoryAttributeValue);
        if(!CollectionUtils.isEmpty(plantformDirectoryAttributeValueList)){
            return plantformDirectoryAttributeValueList.get(0);
        } else {
            return null;
        }
    }

    /**
     * @author: 方瑞冬
     * @date: 2019/5/18 20:28
     * @since: JDK 1.8
     *
     * @description: 目录属性值编辑保存
     * @param: [plantformDirectoryAttributeValueEditSaveDTO]
     * @return: void
     */
    @Override
    public void plantformDirectoryAttributeValueEditSave(PlantformDirectoryAttributeValueEditSaveDTO plantformDirectoryAttributeValueEditSaveDTO) {
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = BeanCopyUtil.copy(plantformDirectoryAttributeValueEditSaveDTO, PlantformDirectoryAttributeValue.class);
        MongoUtil.upsert(plantformDirectoryAttributeValue, plantformDirectoryAttributeValueEditSaveDTO.getFlag());
    }
}
