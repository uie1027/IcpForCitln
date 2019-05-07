/**
 * Project Name: icpForCitln
 * File Name: ProductGroupSystemAttributeFindDTO
 * Package Name: icp.icpForCitln.productGroup.dto
 * Date: 2019/5/6 17:43
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.dto;

import icp.icpForCitln.sysconf.entity.SystemProductAttribuitValue;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class ProductGroupSystemAttributeFindDTO {

    @Id
    private String id;

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_NAME")
    private String systemProductAttribuitName;  //产品属性名称

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_TYPE")
    private Integer systemProductAttribuitType;  //产品属性类型   1定性 2定量

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_VALUES")
    private List<SystemProductAttribuitValue> systemProductAttribuitValueList;
}
