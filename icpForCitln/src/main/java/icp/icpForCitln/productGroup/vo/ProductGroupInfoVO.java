/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfoVO
 * Package Name: icp.icpForCitln.productGroup.vo
 * Date: 2019-04-24 下午 2:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.vo;

import lombok.Data;

@Data
public class ProductGroupInfoVO {   //产品组下拉列表返回
    private String id;  //ID

    private String productGroupCode;    //产品组编码

    private String productGroupName;    //产品组名称

    private String detailedInformation;    //详细信息
}
