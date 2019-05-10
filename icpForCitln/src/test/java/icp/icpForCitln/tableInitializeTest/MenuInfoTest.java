/**
 * Project Name: icpForCitln
 * File Name: MenuInfoTest
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/10 13:49
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;

import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.platform.entity.MenuInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuInfoTest {
    @Test
    public void menuInfoTest(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                MenuInfo menuInfo = new MenuInfo();

                menuInfo.setMenuName("测试名称" + new Random().nextInt(100));
                menuInfo.setMenuCode(GeneratedCodeUtil.generatedCode());
                menuInfo.setMenuUrl("测试地址" + new Random().nextInt(100));
                menuInfo.setMenuLevel(i + 1);
                menuInfo.setParentMenuInfoId("0");

                MongoUtil.insert(menuInfo);
            }
        }
    }
}
