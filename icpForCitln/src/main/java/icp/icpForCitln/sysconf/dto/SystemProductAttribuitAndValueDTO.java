/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitAndValueDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019-04-30 下午 1:22
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import icp.icpForCitln.common.enetity.BaseEntity;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuitValue;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class SystemProductAttribuitAndValueDTO  extends BaseEntity {
    @Field("SYSTEM_PRODUCT_ATTRIBUIT_CODE")
    private String systemProductAttribuitCode; //产品属性编码

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_TYPE")
    private Integer systemProductAttribuitType;  //产品属性类型   1定性 2定量

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_NAME")
    private String systemProductAttribuitName;  //产品属性名称

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //基本单位id

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_VALUES")
    private List<SystemProductAttribuitValue> systemProductAttribuitValueList;  //定性产品属性值
}
