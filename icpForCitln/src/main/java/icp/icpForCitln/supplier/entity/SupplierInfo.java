/**
 * Project Name: icpForCitln
 * File Name: SupplierInfo
 * Package Name: icp.icpForCitln.supplier.entity
 * Date: 2019/4/12 16:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.entity;

import icp.icpForCitln.common.enetity.CommonField;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "SUPPLIER_INFO")  //供应商信息
public class SupplierInfo extends CommonField {

    @Field("COMPANY_CODE")
    private String companyCode;    //供应商编码
    @Field("UNIFIED_SOCIAL_CREDIT_CODE")
    private String unifiedSocialCreditCode;    //统一社会信用代码
    @Field("COMPANY_NAME")
    private String companyName;    //公司名称
    @Field("COMPANY_SHORT_NAME")
    private String companyShortName;    //公司简称
    @Field("COMPANY_FAX")
    private String companyFax;    //公司传真
    @Field("COMPANY_EMAIL")
    private String companyEmail;    //公司邮箱
    @Field("COMPANY_CONTACT")
    private String companyContact;    //公司联系人
    @Field("COMPANY_CONTACT_PHONE")
    private String companyContactPhone;    //联系人手机号
    @Field("COMPANY_TELEPHONE")
    private String companyTelephone;    //公司座机
    @Field("COUNTRY")
    private String country;    //国家
    @Field("PROVINCE")
    private String province;    //省
    @Field("CITY")
    private String city;    //市
    @Field("DISTRICT")
    private String district;    //区
    @Field("COMPANY_ADDRESS")
    private String companyAddress;    //公司详细地址
    @Field("COMPANY_INTRODUCTION")
    private String companyIntroduction;    //公司介绍
    @Field("COMPANY_PICTURE")
    private String companyPicture;    //图片
    @Field("BANK_NAME")
    private String bankName;    //开户行
    @Field("CURRENCY")
    private String currency;    //币种
    @Field("BANK_ACCOUNT")
    private String bankAccount;    //开户行账户
    @Field("FROZEN")
    private Integer frozen;    //冻结标识
    @Field("HANDEL_CODE")
    private String handelCode;    //handle编码
}
