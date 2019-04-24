/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfo
 * Package Name: icp.icpForCitln.productGroup.entity
 * Date: 2019/4/12 15:17
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.entity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "PRODUCT_GROUP_INFO") //产品组基本信息表
public class ProductGroupInfo extends CommonField implements Serializable {
    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PRODUCT_GROUP_INFO";

    @Field("PRODUCT_GROUP_CODE")
    private String productGroupCode;    //产品组编码

    @Field("PRODUCT_GROUP_NAME")
    private String productGroupName;    //产品组名称

    @Field("PLATFORM_FIRST_DIRECTORY")
    private String platformFirstDirectory;  //平台一级目录

    @Field("PLATFORM_SECOND_DIRECTORY")
    private String platformSecondDirectory; //平台二级目录

    @Field("BRAND")
    private String brand;   //品牌

    @Field("PICTURE")
    private String picture;    //图片

    @Field("DETAILED_INFORMATION")
    private String detailedInformation;    //详细信息

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return this.productGroupCode;
    }
}
