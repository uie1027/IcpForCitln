/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitDefinitionVO
 * Package Name: icp.icpForCitln.product.vo
 * Date: 2019-04-25 上午 9:30
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.product.vo;

import lombok.Data;

@Data
public class ProductAttribuitDefinitionVO {     //产品属性 多选 返回
    private String id;  //ID

    private String productAttribuitDefinitionCode; //企业产品属性编码

    private String productAttribuitDefinitionName; //企业产品属性名称
}
