/**
 * Project Name: icpForCitln
 * File Name: CompanyInfo
 * Package Name: icp.icpForCitln.company.eneity
 * Date: 2019-04-29 下午 1:49
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.company.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "COMPANY_INFO")  //公司信息表
@ToString(callSuper = true)
public class CompanyInfo extends BaseEntity {
    @Field("COMPANY_CODE")
    private String companyCode;     //公司编码

    @Field("COMPANY_NAME")
    private String companyName;     //公司名称

    @Field("ENTERPRISE_INFO_ID")
    private String enterpriseInfoId;    //集团ID

    @Field("COMPANY_SHORT_NAME")
    private String companyShortName;    //公司简称

    @Field("COMPANY_TYPE")
    private String companyType;     //公司类型

    @Field("COMPANY_BUSINESS_SCOPE")
    private String companyBusinessScope;    //经营范围

    @Field("COMPANY_CONTACT")
    private String companyContact;      //公司联系人

    @Field("COMPANY_TELEPHONE")
    private String companyTelephone;    //公司座机

    @Field("COMPANY_MAIL")
    private String companyMail;     //公司邮箱

    @Field("COMPANY_FAX")
    private String companyFax;  //公司传真

    @Field("COUNTRY_CODE")
    private String countryCode;     //国家

    @Field("PROVINCE_CODE")
    private String provinceCode;    //省

    @Field("CITY_CODE")
    private String cityCode;    //市

    @Field("DISTRICT_CODE")
    private String districtCode;    //区

    @Field("COMPANY_ADDRESS")
    private String companyAddress;  //详细地址

    @Field("COMPANY_LEGAL_PERSON")
    private String companyLegalPerson;      //公司法人

    @Field("COMPANY_REGISTERED_CAPITAL")
    private BigDecimal companyRegisteredCapital;    //注册资金

    @Field("CURRENCY_ID")
    private String currencyId;   //币种

    @Field("COMPANY_ESTABLISHMENT_DATE")
    private Date companyEstablishmentDate;  //公司成立日期

    @Field("TAXPAYER_TYPE_ID")
    private String taxpayerTypeId;  //纳瑞人类型

    @Field("UNIFIED_SOCIAL_CREDIT_CODE")
    private String unifiedSocialCreditCode;     //统一社会信用代码

    @Field("COMPANY_BANK")
    private String companyBank;     //开户行

    @Field("BANK_COUNTRY_CODE")
    private String bankCountryCode;     //开户行国家

    @Field("COMPANY_BANK_ACCOUNT")
    private String companyBankAccount;  //开户行帐号

    @Field("COMPANY_BANK_ACCOUNT_HOLDER")
    private String companyBankAccountHolder;    //账户持有人

    @Field("COMPANY_BANK_REMARK")
    private String companyBankRemark;   //备注

    @Field("AUTHENTICATION_QUALIFICATION_NAME")
    private String authenticationQualificationName;     //资质名称

    @Field("AUTHENTICATION_CERTIFICATE_NUMBER")
    private String authenticationCertificateNumber;     //证书编号

    @Field("AUTHENTICATION_CERTIFICATION_AUTHORITY")
    private String authenticationCertificationAuthority;    //发证机构

    @Field("AUTHENTICATION_CERTIFICATION_CREATE_DATE")
    private Date authenticationCertificationCreateDate;     //发证日期

    @Field("AUTHENTICATION_CERTIFICATION_START_DATE")
    private Date authenticationCertificationStartDate;  //生效日期

    @Field("AUTHENTICATION_CERTIFICATION_END_DATE")
    private Date authenticationCertificationEndDate;        //失效日期

    @Field("AUTHENTICATION_REMARK")
    private String authenticationRemark;    //资质备注
}
