/**
 * Project Name: icpForCitln
 * File Name: SysconfTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 19/04/29 14:23
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuitValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysconfTest {

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: SystemBrandInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void SystemBrandInfoSaveTest(){
        SystemBrandInfo systemBrandInfo = new SystemBrandInfo();
        systemBrandInfo.setSystemBrandCode("2");
        systemBrandInfo.setSystemBrandName("231");

        MongoUtil.insert(systemBrandInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: SystemDictionaryInfo 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void SystemDictionaryInfoSaveTest(){
        SystemDictionaryInfo systemDictionaryInfo = new SystemDictionaryInfo();
        systemDictionaryInfo.setSystemDictionaryCategory(2);
        systemDictionaryInfo.setSystemDictionaryCode("2");
        systemDictionaryInfo.setSystemDictionaryDescription("3");
        systemDictionaryInfo.setSystemDictionaryValue("w");

        MongoUtil.insert(systemDictionaryInfo);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: SystemProductAttribuitValue 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void SystemProductAttribuitValueSaveTest(){
        SystemProductAttribuitValue systemProductAttribuitValue = new SystemProductAttribuitValue();

        systemProductAttribuitValue.setSystemProductAttribuit("2");
        systemProductAttribuitValue.setSystemProductAttribuitContent("2");
        systemProductAttribuitValue.setSystemProductAttribuitValueCode("2");

        MongoUtil.insert(systemProductAttribuitValue);
    }

    /**
     * @author: guoxs
     * @date: 19/04/29 14:42
     * @since: JDK 1.8
     *
     * @description: SystemProductAttribuit 保存测试
     * @param: []
     * @return: void
     */
    @Test
    public void SystemProductAttribuitSaveTest(){
        SystemProductAttribuit systemProductAttribuit = new SystemProductAttribuit();

        systemProductAttribuit.setBasicUnitId("2");
        systemProductAttribuit.setSystemProductAttribuitCode("@");
        systemProductAttribuit.setSystemProductAttribuitName("2");
        systemProductAttribuit.setSystemProductAttribuitType("2");

        MongoUtil.insert(systemProductAttribuit);
    }
}
