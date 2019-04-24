/**
 * Project Name: icpForCitln
 * File Name: PlatformBrandInfo
 * Package Name: icp.icpForCitln.platform.eneity
 * Date: 2019-04-24 下午 3:48
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "PLATFORM_BRAND_INFO")   //品牌信息表
public class PlatformBrandInfo extends CommonField implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PLATFORM_BRAND_INFO";

    @Field("BRAND_CODE")
    private String brandCode;   //品牌编码

    @Field("BRAND_NAME")
    private String brandName;   //品牌名称

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return this.brandCode;
    }
}
