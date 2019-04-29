/**
 * Project Name: icpForCitln
 * File Name: SystemBrandInfo
 * Package Name: icp.icpForCitln.sysconf.entity
 * Date: 19/04/29 13:13
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.sysconf.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SYSTEM_BRAND_INFO") //品牌信息表
@ToString(callSuper = true)
public class SystemBrandInfo extends BaseEntity {
    @Field("SYSTEM_BRAND_CODE")
    private String systemBrandCode;  //品牌编码

    @Field("SYSTEM_BRAND_NAME")
    private String systemBrandName;  //品牌名称
}
