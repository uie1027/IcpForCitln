/**
 * Project Name: icpForCitln
 * File Name: PlatformDirectoryAttribute
 * Package Name: icp.icpForCitln.platform.eneity
 * Date: 2019-04-12 下午 3:51
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PLATFORM_DIRECTORY_ATTRIBUTE")  //平台目录属性表
public class PlatformDirectoryAttribute extends CommonField {

    @Field("PLATFORM_DIRECTORY_CODE")
    private String platformDirectoryCode;   //平台目录编码

    @Field("PLATFORM_ATTRIBUTE_CODE")
    private String platformAttributeCode;   //平台属性编码

    @Field("PLATFORM_ATTRIBUTE_NAME")
    private String platformAttributeName;   //平台属性名称
}
