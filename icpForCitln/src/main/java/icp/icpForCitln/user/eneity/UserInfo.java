/**
 * Project Name: icpForCitln
 * File Name: UserInfo
 * Package Name: icp.icpForCitln.user.eneity
 * Date: 2019-04-17 上午 9:41
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.eneity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "USER_INFO")  //用户信息表
@ToString(callSuper = true)
public class UserInfo extends BaseEntity {
    @Field("USER_CODE")
    private String userCode;    //用户编码

    @Field("USER_NUM")
    private String userNum;     //用户帐号

    @Field("USER_PASSWORD")
    private String userPassword;    //用户密码

    @Field("USER_NAME")
    private String userName;    //用户姓名

    @Field("USER_PHONE")
    private String userPhone;   //用户手机

    @Field("USER_EMAIL")
    private String userEmail;   //用户邮箱

    @Field("USER_TYPE")
    private Integer userType;   //用户类型 将来开放第三方登录留用

    @Field("IS_FORBIDDEN")
    private Integer isForbidden;    //是否禁用 1禁用2不禁用
}
