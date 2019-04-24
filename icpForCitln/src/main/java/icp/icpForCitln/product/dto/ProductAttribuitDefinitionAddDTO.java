/**
 * Project Name: icpForCitln
 * File Name: ProductAttribuitDefinitionAddDTO
 * Package Name: icp.icpForCitln.product.dto
 * Date: 2019-04-24 下午 5:10
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.product.dto;

import lombok.Data;

@Data
public class ProductAttribuitDefinitionAddDTO {     //新建产品属性

    private String productAttribuitDefinitionType; //企业产品属性类型

    private String productAttribuitDefinitionName; //企业产品属性名称

    private String unitCode; //单位编码
}
