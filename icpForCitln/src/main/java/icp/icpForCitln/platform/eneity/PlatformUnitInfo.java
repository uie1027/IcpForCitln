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

@Data
@Document(collection = "PLATFORM_UNIT_INFO")   //平台基本单位
public class PlatformUnitInfo extends CommonField {

    @Field("UNIT_CODE")
    private String unitCode;    //单位编码

    @Field("UNIT_VARIETY")
    private Integer unitVariety;    //单位种类 1，2，3，4

    @Field("UNIT_VALUE")
    private String unitValue;   //单位属性值  例：m

    @Field("UNIT_DESCRIPTION")
    private String unitDescription; //单位描述  例：米
}
