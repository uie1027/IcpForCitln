/**
 * Project Name: icpForCitln
 * File Name: SysconfController
 * Package Name: icp.icpForCitln.sysconf.controller
 * Date: 2019-04-30 上午 9:25
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.sysconf.dto.SystemDictionaryInfoGetListDTO;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.service.SysconfService;
import icp.icpForCitln.sysconf.vo.SystemDictionaryInfoGetListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysconf")
public class SysconfController {
    @Autowired
    private SysconfService sysconfService;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 上午 10:18
     * @since: JDK 1.8
     *
     * @description: 字典下拉列表
     * @param: [systemDictionaryInfoGetListDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/systemDictionaryInfoListFindByPage")
    public PageResult systemDictionaryInfoListFindByPage(SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO){
        List<SystemDictionaryInfo> systemDictionaryInfoList = sysconfService.systemDictionaryInfoListFindByPage(systemDictionaryInfoGetListDTO);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, BeanCopyUtil.copy(systemDictionaryInfoList, SystemDictionaryInfoGetListVO.class));
    }
}
