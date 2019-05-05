/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoVO
 * Package Name: icp.icpForCitln.supplier.vo
 * Date: 19/05/05 10:05
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.vo;

import lombok.Data;

@Data
public class SupplierInfoVO {
    private String supplierCode;    //供应商编码

    private String unifiedSocialCreditCode;    //统一社会信用代码

    private String supplierName;    //公司名称

    private String supplierShortName;    //公司简称

    private String supplierFax;    //公司传真

    private String supplierEmail;    //公司邮箱

    private String supplierContact;    //公司联系人

    private String supplierContactPhone;    //联系人手机号

    private String supplierTelephone;    //公司座机

    private String countryCode;    //国家

    private String provinceCode;    //省

    private String cityCode;    //市

    private String districtCode;    //区

    private String supplierAddress;    //公司详细地址

    private String supplierIntroduction;    //公司介绍

    private String supplierPicture;    //图片

    private String bankName;    //开户行

    private String currencyId;    //币种ID

    private String bankAccount;    //开户行账户

    private String id; //ID
}
