/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfoVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019-04-24 上午 10:58
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;

@Data
public class PlatformUnitInfoVO {       //单位下拉列表返回

    private String id;  //ID

    private String unitCode;    //单位编码

    private String unitValue;   //单位属性值  例：m

    private String unitDescription; //单位描述  例：米
}
