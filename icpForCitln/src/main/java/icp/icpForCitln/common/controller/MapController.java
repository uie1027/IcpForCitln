/**
 * Project Name: icpForCitln
 * File Name: MapController
 * Package Name: icp.icpForCitln.common.controller
 * Date: 19/04/28 17:56
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.controller;

import icp.icpForCitln.common.util.GetPropertiesUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {

    /**
     * @author: guoxs
     * @date: 19/04/28 17:58
     * @since: JDK 1.8
     *
     * @description: 获取省市区三级联动
     * @param: []
     * @return: java.lang.String
     */
    @RequestMapping(value = "/getmap")
    public String getMap(){
        return GetPropertiesUtil.getPropertiesVal("config","json");
    }
}
