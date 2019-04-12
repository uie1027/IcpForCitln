/**
 * Project Name: icpForCitln
 * File Name: MongoOperationControlle
 * Package Name: icp.icpForCitln.mongoTest.controller
 * Date: 2019-04-11 下午 4:54
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.mongoTest.controller;

import icp.icpForCitln.mongoTest.service.MongoOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class MongoOperationControlle {
    @Autowired
    private MongoOperationService mongoOperationService;

    @RequestMapping("/test")
    public String test(){
        return mongoOperationService.test();
    }
}
