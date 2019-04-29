/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuit
 * Package Name: icp.icpForCitln.sysconf.entity
 * Date: 19/04/29 11:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.sysconf.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SYSTEM_PRODUCT_ATTRIBUIT") //系统产品属性表
@ToString(callSuper = true)
public class SystemProductAttribuit extends BaseEntity {
    @Field("SYSTEM_PRODUCT_ATTRIBUIT_CODE")
    private String systemProductAttribuitCode; //产品属性编码

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_TYPE")
    private String systemProductAttribuitType;  //产品属性类型

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_NAME")
    private String systemProductAttribuitName;  //产品属性名称

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位id
}