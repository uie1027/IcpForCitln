/**
 * Project Name: icpForCitln
 * File Name: CustomerInfoVO
 * Package Name: icp.icpForCitln.customer.vo
 * Date: 19/05/05 09:50
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.vo;

import lombok.Data;

@Data
public class CustomerInfoVO {
    private String unifiedSocialCreditCode;  //统一社会信用代码

    private String customerName;  //公司名称

    private String customerShortName;  //公司简称

    private String customerFax;  //公司传真

    private String customerEmail;  //公司邮箱

    private String customerContact;  //公司联系人

    private String customerContactPhone;  //联系人手机号

    private String customerTelephone;  //公司座机

    private String countryCode;  //国家

    private String provinceCode;  //省

    private String cityCode;  //市

    private String districtCode;  //区

    private String customerAddress;  //公司详细地址

    private String customerIntroduction;  //公司介绍

    private String customerPicture;  //图片

    private String bankName;  //开户行

    private String currencyId;  //币种

    private String bankAccount;  //开户行账户

    private String id;  //主键
}
