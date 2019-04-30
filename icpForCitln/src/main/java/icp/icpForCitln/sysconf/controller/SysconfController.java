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
import icp.icpForCitln.common.util.RedisUtil;
import icp.icpForCitln.sysconf.dto.SystemDictionaryInfoGetListDTO;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import icp.icpForCitln.sysconf.vo.SystemDictionaryInfoGetListVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysconf")
public class SysconfController {
    @PostMapping("/systemDictionaryInfoListFindByPage")
    public PageResult systemDictionaryInfoListFindByPage(SystemDictionaryInfoGetListDTO systemDictionaryInfoGetListDTO){
        List<Object> objectList = RedisUtil.getList(BeanCopyUtil.copy(systemDictionaryInfoGetListDTO, SystemDictionaryInfo.class));
        List<SystemDictionaryInfoGetListVO> systemDictionaryInfoGetListVOList = BeanCopyUtil.copy(objectList, SystemDictionaryInfoGetListVO.class);
        return PageResult.returnResult(PageResult.SUCCESS_CODE, systemDictionaryInfoGetListVOList);
    }
}
