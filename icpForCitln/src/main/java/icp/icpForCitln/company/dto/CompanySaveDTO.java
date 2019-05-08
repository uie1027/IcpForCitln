/**
 * Project Name: icpForCitln
 * File Name: CompanySaveDTO
 * Package Name: icp.icpForCitln.company.dto
 * Date: 2019/5/8 13:40
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.company.dto;

import icp.icpForCitln.company.eneity.CompanyAddressInfo;
import icp.icpForCitln.company.eneity.CompanyDepartmentInfo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class CompanySaveDTO {
    private String companyName;     //公司名称

    private String companyShortName;    //公司简称

    private String companyType;     //公司类型

    private String companyBusinessScope;    //经营范围

    private String companyContact;      //公司联系人

    private String companyTelephone;    //公司座机

    private String companyMail;     //公司邮箱

    private String companyFax;  //公司传真

    private String companyLegalPerson;      //公司法人

    private BigDecimal companyRegisteredCapital;    //注册资金

    private String currencyId;   //币种

    private Date companyEstablishmentDate;  //公司成立日期

    private String taxpayerTypeId;  //纳税人类型

    private String companyBank;     //开户行

    private String bankCountryCode;     //开户行国家

    private String companyBankAccount;  //开户行帐号

    private String companyBankAccountHolder;    //账户持有人

    private String companyBankRemark;   //备注

    private String authenticationQualificationName;     //资质名称

    private String authenticationCertificateNumber;     //证书编号

    private String authenticationCertificationAuthority;    //发证机构

    private Date authenticationCertificationCreateDate;     //发证日期

    private Date authenticationCertificationStartDate;  //生效日期

    private Date authenticationCertificationEndDate;        //失效日期

    private String authenticationRemark;    //资质备注

    private List<CompanyDepartmentInfo> companyDepartmentInfoList;   //公司部门

    private List<CompanyAddressInfo> companyAddressInfoList;  //公司地址

}
