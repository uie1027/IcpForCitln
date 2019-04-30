/**
 * Project Name: icpForCitln
 * File Name: SystemDictionaryInfoGetListVO
 * Package Name: icp.icpForCitln.sysconf.vo
 * Date: 2019-04-30 上午 10:07
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.vo;

import lombok.Data;

@Data
public class SystemDictionaryInfoGetListVO {        //返回字典列表
    private String id;      //ID

    private String systemDictionaryCode; //字典编码

    private String systemDictionaryValue;  //字典内容

    private String systemDictionaryDescription;  //字典描述
}
