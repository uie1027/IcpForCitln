/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryAttributeValue
 * Package Name: icp.icpForCitln.platform.eneity
 * Date: 2019-04-12 下午 4:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PLATFORM_DIRECTORY_ATTRIBUTE_VALUE")    //平台目录属性值表
public class PlatformDirectoryAttributeValue extends CommonField {

    @Field("PLATFORM_ATTRIBUTE_CODE")
    private String platformAttributeCode;   //平台属性编码

    @Field("PLATFORM_ATTRIBUTE_CONTENT")
    private String platformAttributeContent;    //平台属性值内容
}
