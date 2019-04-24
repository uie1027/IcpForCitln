/**
 * Project Name: icpForCitln
 * File Name: PlatformUnitInfo
 * Package Name: icp.icpForCitln.platform.eneity
 * Date: 2019-04-12 下午 4:44
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "PLATFORM_UNIT_INFO")   //平台基本单位
public class PlatformUnitInfo extends CommonField implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PLATFORM_UNIT_INFO";

    @Field("UNIT_CODE")
    private String unitCode;    //单位编码

    @Field("UNIT_VARIETY")
    private Integer unitVariety;    //单位种类   1代表基本单位、2代表币种、3代表税率

    @Field("UNIT_VALUE")
    private String unitValue;   //单位属性值  例：m

    @Field("UNIT_DESCRIPTION")
    private String unitDescription; //单位描述  例：米

    public String redisKey() {        //获取 Redis 存储键名
        return this.unitCode;
    }

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY  + "_" + this.unitVariety;
    }
}
