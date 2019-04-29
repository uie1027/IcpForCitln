/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitValue
 * Package Name: icp.icpForCitln.sysconf.entity
 * Date: 19/04/29 11:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.sysconf.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SYSTEM_PRODUCT_ATTRIBUIT_VALUE") //系统产品属性值表
@ToString(callSuper = true)
public class SystemProductAttribuitValue extends BaseEntity {
    @Field("SYSTEM_PRODUCT_ATTRIBUIT")
    private String systemProductAttribuit; //产品属性编码

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_VALUE_CODE")
    private String systemProductAttribuitValueCode; //产品属性值编码

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_CONTENT")
    private String systemProductAttribuitContent;  //产品属性值内容
}
