/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfo
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/4/29 16:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(value = "PRODUCT_GROUP_INFO")     //产品组基本信息表
@ToString(callSuper = true)
public class ProductGroupInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PRODUCT_GROUP_INFO";

    @Field("PRODUCT_GROUP_CODE")
    private String	productGroupCode;     //产品组编码

    @Field("PRODUCT_GROUP_NAME")
    private String	productGroupName;     //产品组名称

    @Field("PLANTFORM_FIRST_DIRECTORY")
    private String	plantformFirstDirectory;      //系统一级目录

    @Field("PLANTFORM_SECOND_DIRECTORY")
    private String	plantformSecondDirectory;     //系统二级目录

    @Field("SYSTEM_BRAND_INFO_ID")
    private String	systemBrandInfoId;   //品牌ID

    @Field("PRODUCT_GROUP_DETAILED_INFORMATION")
    private String	productGroupDetailedInformation; //详细信息

    @Field("BASIC_UNIT_ID")
    private String basicUnitId;  //单位ID

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return super.getId();
    }
}
