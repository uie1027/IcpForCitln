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

@Data
@Document(collection = "PRODUCT_GROUP_INFO") //产品组基本信息表
public class ProductGroupInfo extends CommonField {
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
}
