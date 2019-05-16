/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitValueVO
 * Package Name: icp.icpForCitln.sysconf.vo
 * Date: 2019-04-30 下午 12:40
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.vo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SYSTEM_PRODUCT_ATTRIBUIT_VALUES")
public class SystemProductAttribuitValueVO {     //产品属性页面返回
    @Field("SYSTEM_PRODUCT_ATTRIBUIT_CONTENT")
    private String systemProductAttribuitContent;  //产品属性值内容
}
