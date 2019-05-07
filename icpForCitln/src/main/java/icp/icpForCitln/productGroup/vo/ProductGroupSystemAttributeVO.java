/**
 * Project Name: icpForCitln
 * File Name: ProductGroupSystemAttributeVO
 * Package Name: icp.icpForCitln.productGroup.vo
 * Date: 2019/5/6 17:22
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.vo;

import icp.icpForCitln.sysconf.dto.SystemProductAttribuitValueDTO;
import lombok.Data;

import java.util.List;

@Data
public class ProductGroupSystemAttributeVO {
    private String id;  //ID

    private String systemProductAttribuitName;  //产品属性名称

    private Integer systemProductAttribuitType;  //产品属性类型   1定性 2定量

    private List<SystemProductAttribuitValueDTO> systemProductAttribuitValueDTOList;  //产品属性值
}
