/**
 * Project Name: icpForCitln
 * File Name: PlatformDiretoryController
 * Package Name: icp.icpForCitln.platformDirectory.controller
 * Date: 2019-04-12 下午 2:06
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platformDirectory.controller;

import icp.icpForCitln.platformDirectory.eneity.PlatformDirectory;
import icp.icpForCitln.platformDirectory.service.PlatformDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platformDirectory")
public class PlatformDiretoryController {
    @Autowired
    private PlatformDirectoryService platformDirectoryService;

    /**
     * @author: 方瑞冬
     * date: 2019-04-12 下午 2:12
     * @since: JDK 1.8
     *
     * @description: 测试 platformDirectory 保存
     * @param: []
     * @return: void
     */
    @GetMapping("/saveTest")
    public void saveTest(){
        PlatformDirectory platformDirectory = new PlatformDirectory();
        platformDirectory.setId("testId");
        platformDirectory.setPlatformDirectoryCode("testCode");
        platformDirectory.setPlatformDirectoryLevel(1);
        platformDirectory.setPlatformDirectoryName("testName");
        platformDirectoryService.saveTest(platformDirectory);
    }
}
