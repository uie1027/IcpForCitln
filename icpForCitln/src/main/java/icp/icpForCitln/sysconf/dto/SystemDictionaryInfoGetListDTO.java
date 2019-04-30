/**
 * Project Name: icpForCitln
 * File Name: SystemDictionaryInfoGetListDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019-04-30 上午 9:28
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import lombok.Data;

@Data
public class SystemDictionaryInfoGetListDTO {       //根据字典种类查询
    private Integer systemDictionaryCategory;  //字典种类
}
