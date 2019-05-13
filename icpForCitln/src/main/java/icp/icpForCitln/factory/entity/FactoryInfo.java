/**
 * Project Name: icpForCitln
 * File Name: FactoryInfo
 * Package Name: icp.icpForCitln.factory.entity
 * Date: 19/04/29 11:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.factory.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "FACTORY_INFO") //工厂信息表
@ToString(callSuper = true)
public class FactoryInfo extends BaseEntity {
    @Field("FACTORY_CODE")
    private String factoryCode;  //工厂编码

    @Field("FACTORY_NAME")
    private String factoryName; //工厂名称

    @Field("FACTORY_REMARK")
    private String factoryRemark;   //工厂描述
}
