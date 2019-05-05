/**
 * Project Name: icpForCitln
 * File Name: PlantFormTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/4/30 11:02
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.platform.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlantFormTest {

    @Test
    public void MenuInfoSave(){
        MenuInfo menuInfo = new MenuInfo();
        menuInfo.setMenuName("123");
        menuInfo.setMenuCode("123");
        menuInfo.setMenuUrl("123");
        menuInfo.setMenuLevel("123");
        MongoUtil.insert(menuInfo);
    }

    @Test
    public void PlantformDirectoryAttributeSave(){
        PlantformDirectoryAttribute plantformDirectoryAttribute = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute.setPlantformDirectoryId("123");
        plantformDirectoryAttribute.setPlantformAttributeCode("456");
        plantformDirectoryAttribute.setPlantformAttributeName("AAA");
        MongoUtil.insert(plantformDirectoryAttribute);
    }


    @Test
    public void PlantformDirectoryAttributeValueSave(){
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue.setPlantformAttributeCode("123");
        plantformDirectoryAttributeValue.setPlantformAttributeContent("AAA");
        plantformDirectoryAttributeValue.setPlantformDirectoryAttributeId("456");
        MongoUtil.insert(plantformDirectoryAttributeValue);
    }

    @Test
    public void PlantformDirectoryInfoSave(){
        PlantformDirectoryInfo plantformDirectoryInfo = new PlantformDirectoryInfo();
        plantformDirectoryInfo.setPlantformDirectoryCode("123");
        plantformDirectoryInfo.setPlantformDirectoryName("aaa");
        plantformDirectoryInfo.setPlantformDirectoryLevel(1);
        plantformDirectoryInfo.setPlantformDirectoryId(1);
        plantformDirectoryInfo.setPlantformDirectoryDescription("AAA");
        MongoUtil.insert(plantformDirectoryInfo);
    }

    @Test
    public void PlantformMailDisplaySave(){
        PlantformMailDisplay plantformMailDisplay = new PlantformMailDisplay();
        plantformMailDisplay.setMailDisplayCode("123");
        plantformMailDisplay.setMailName("ABC");
        MongoUtil.insert(plantformMailDisplay);

    }
}
