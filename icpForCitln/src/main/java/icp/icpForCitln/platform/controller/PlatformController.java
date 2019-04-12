/**
 * Project Name: icpForCitln
 * File Name: PlatformDiretoryController
 * Package Name: icp.icpForCitln.platform.controller
 * Date: 2019-04-12 下午 2:06
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.controller;

import icp.icpForCitln.platform.eneity.PlatformDirectory;
import icp.icpForCitln.platform.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/platformDirectory")
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    /**
     * @author: 方瑞冬
     * date: 2019-04-12 下午 2:12
     * @since: JDK 1.8
     *
     * @description: 测试 platform 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/saveTest")
    public void saveTest(){
        PlatformDirectory platformDirectory = new PlatformDirectory();

        platformDirectory.setId("testId");
        platformDirectory.setPlatformDirectoryCode("testCode");
        platformDirectory.setPlatformDirectoryName("testName");
        platformDirectory.setPlatformDirectoryLevel(1);
        platformDirectory.setParenetPlatformDirectoryCode(1);
        platformDirectory.setPlatformDirectoryDescription("备注测试");
        platformDirectory.setCreater("testcreater");
        platformDirectory.setCreateTime(new Date());
        platformDirectory.setLastMondifier("lastman");
        platformDirectory.setLastModificationTime(new Date());

        platformService.saveTest(platformDirectory);
    }
}
