/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoDto
 * Package Name: icp.icpForCitln.supplier.dto
 * Date: 19/04/17 11:39
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierInfoDto {
    private String companyCode;    //供应商编码
    private String unifiedSocialCreditCode;    //统一社会信用代码
    private String companyName;    //公司名称
    private String companyShortName;    //公司简称
    private String companyFax;    //公司传真
    private String companyEmail;    //公司邮箱
    private String companyContact;    //公司联系人
    private String companyContactPhone;    //联系人手机号
    private String companyTelephone;    //公司座机
    private String country;    //国家
    private String province;    //省
    private String city;    //市
    private String district;    //区
    private String companyAddress;    //公司详细地址
    private String companyIntroduction;    //公司介绍
    private String companyPicture;    //图片
    private String bankName;    //开户行
    private String currency;    //币种
    private String bankAccount;    //开户行账户
    private Integer frozen;    //冻结标识
    private String handelCode;    //handle编码
    private String id;
    private String creater;
    private Date createTime;    //创建时间
    private String lastMondifier;   //最后更改人
    private Date lastModificationTime;
}
