/**
 * Project Name: icpForCitln
 * File Name: SystemBrandInfoVO
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

import java.io.Serializable;

@Data
@Document(collection = "SYSTEM_BRAND_INFO") //品牌信息表
@ToString(callSuper = true)
public class SystemBrandInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "SYSTEM_BRAND_INFO";

    @Field("SYSTEM_BRAND_CODE")
    private String systemBrandCode;  //品牌编码

    @Field("SYSTEM_BRAND_NAME")
    private String systemBrandName;  //品牌名称

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return super.getId();
    }
}
