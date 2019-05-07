/**
 * Project Name: icpForCitln
 * File Name: UserAndCompanyInfo
 * Package Name: icp.icpForCitln.common.enetity
 * Date: 2019/5/7 14:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.enetity;

import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.enterprise.EnterpriseInfo;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserAndCompanyInfo extends BaseEntity implements Serializable {    //用户 企业 公司 信息缓存

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "USER_AND_COMPANY";

    private String userCode;    //用户编码

    private String userNum;     //用户帐号

    private String userPassword;    //用户密码

    private String userName;    //用户姓名

    private String userPhone;   //用户手机

    private String userEmail;   //用户邮箱

    private Integer userType;   //用户类型 将来开放第三方登录留用

    private EnterpriseInfo enterpriseInfo;      //企业信息

    private CompanyInfo companyInfo;      //公司信息

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return this.userNum;
    }
}
