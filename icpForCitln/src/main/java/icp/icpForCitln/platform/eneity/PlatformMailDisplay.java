/**
 * Project Name: icpForCitln
 * File Name: PlatformMailDisplay
 * Package Name: icp.icpForCitln.platform.eneity
 * Date: 2019-04-15 上午 11:33
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.eneity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PLATFORM_MAIL_DISPLAY")  //商城展示表
public class PlatformMailDisplay extends CommonField {

    @Field("MAIL_DISPLAY_CODE")
    private String mailDisplayCode;     //商城展示编码

    @Field("MAIL_NAME")
    private String mailName;        //商城名称
}