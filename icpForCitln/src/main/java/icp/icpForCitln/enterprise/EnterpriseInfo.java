/**
 * Project Name: icpForCitln
 * File Name: EnterpriseInfo
 * Package Name: icp.icpForCitln.enterprise
 * Date: 2019-04-29 下午 2:56
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.enterprise;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "ENTERPRISE_INFO") //企业信息表
@ToString(callSuper = true)
public class EnterpriseInfo extends BaseEntity {
    @Field("ENTERPRISE_CODE")
    private String enterpriseCode;      //企业编码

    @Field("ENTERPRISE_NAME")
    private String enterpriseName;      //企业名称
}
