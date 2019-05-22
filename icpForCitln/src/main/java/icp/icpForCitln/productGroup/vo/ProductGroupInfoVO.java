/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfoVO
 * Package Name: icp.icpForCitln.productGroup.vo
 * Date: 2019/5/6 15:54
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.vo;

import lombok.Data;

@Data
public class ProductGroupInfoVO {
    private String id;      //ID

    private String	productGroupCode;     //产品组编码

    private String	productGroupName;     //产品组名称

    private String basicUnitId;  //单位ID
}
