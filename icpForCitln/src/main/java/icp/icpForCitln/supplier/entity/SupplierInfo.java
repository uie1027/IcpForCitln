/**
 * Project Name: icpForCitln
 * File Name: SupplierInfo
 * Package Name: icp.icpForCitln.supplier
 * Date: 2019-04-29 下午 3:46
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.supplier;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SUPPLIER_INFO") //供应商信息表
@ToString(callSuper = true)
public class SupplierInfo extends BaseEntity {
    @Field("SUPPLIER_CODE")
    private String supplierCode;    //供应商编码
    
    @Field("UNIFIED_SOCIAL_CREDIT_CODE")
    private String unifiedSocialCreditCode;    //统一社会信用代码
    
    @Field("SUPPLIER_NAME")
    private String supplierName;    //公司名称

    @Field("SUPPLIER_SHORT_NAME")
    private String supplierShortName;    //公司简称

    @Field("SUPPLIER_FAX")
    private String supplierFax;    //公司传真

    @Field("SUPPLIER_EMAIL")
    private String supplierEmail;    //公司邮箱

    @Field("SUPPLIER_CONTACT")
    private String supplierContact;    //公司联系人

    @Field("SUPPLIER_CONTACT_PHONE")
    private String supplierContactPhone;    //联系人手机号

    @Field("SUPPLIER_TELEPHONE")
    private String supplierTelephone;    //公司座机

    @Field("COUNTRY_CODE")
    private String countryCode;    //国家

    @Field("PROVINCE_CODE")
    private String provinceCode;    //省

    @Field("CITY_CODE")
    private String cityCode;    //市

    @Field("DISTRICT_CODE")
    private String districtCode;    //区

    @Field("SUPPLIER_ADDRESS")
    private String supplierAddress;    //公司详细地址

    @Field("SUPPLIER_INTRODUCTION")
    private String supplierIntroduction;    //公司介绍

    @Field("SUPPLIER_PICTURE")
    private String supplierPicture;    //图片

    @Field("BANK_NAME")
    private String bankName;    //开户行

    @Field("CURRENCY_ID")
    private String currencyId;    //币种ID

    @Field("BANK_ACCOUNT")
    private String bankAccount;    //开户行账户

    @Field("FROZEN")
    private Integer frozen;    //冻结标识 1冻结 2不冻结
}
