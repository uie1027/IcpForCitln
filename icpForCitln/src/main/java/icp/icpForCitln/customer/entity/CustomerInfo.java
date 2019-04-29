/**
 * Project Name: icpForCitln
 * File Name: CustomerInfo
 * Package Name: icp.icpForCitln.customer.entity
 * Date: 19/04/29 13:26
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "CUSTOMER_INFO") //客户信息表
@ToString(callSuper = true)
public class CustomerInfo extends BaseEntity {
    @Field("CUSTOMER_CODE")
    private String customerCode;  //客户编码

    @Field("UNIFIED_SOCIAL_CREDIT_CODE")
    private String unifiedSocialCreditCode;  //统一社会信用代码

    @Field("CUSTOMER_NAME")
    private String customerName;  //公司名称

    @Field("CUSTOMER_SHORT_NAME")
    private String customerShortName;  //公司简称

    @Field("CUSTOMER_FAX")
    private String customerFax;  //公司传真

    @Field("CUSTOMER_EMAIL")
    private String customerEmail;  //公司邮箱

    @Field("CUSTOMER_CONTACT")
    private String customerContact;  //公司联系人

    @Field("CUSTOMER_CONTACT_PHONE")
    private String customerContactPhone;  //联系人手机号

    @Field("CUSTOMER_TELEPHONE")
    private String customerTelephone;  //公司座机

    @Field("COUNTRY_CODE")
    private String countryCode;  //国家

    @Field("PROVINCE_CODE")
    private String provinceCode;  //省

    @Field("CITY_CODE")
    private String cityCode;  //市

    @Field("DISTRICT_CODE")
    private String districtCode;  //区

    @Field("CUSTOMER_ADDRESS")
    private String customerAddress;  //公司详细地址

    @Field("CUSTOMER_INTRODUCTION")
    private String customerIntroduction;  //公司介绍

    @Field("CUSTOMER_PICTURE")
    private String customerPicture;  //图片

    @Field("BANK_NAME")
    private String bankName;  //开户行

    @Field("CURRENCY_ID")
    private String currencyId;  //币种

    @Field("BANK_ACCOUNT")
    private String bankAccount;  //开户行账户

    @Field("FROZEN")
    private Integer frozen;  //冻结标识 1冻结 2不冻结
}
