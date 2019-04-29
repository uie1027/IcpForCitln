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
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "USER_INFO")  //用户信息表
public class UserInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "USER_INFO";

    @Field("USER_CODE")
    private String userCode;    //用户编码

    @Field("USER_NUM")
    private String userNum;     //用户帐号

    @Field("USER_PASSWORD")
    private String userPassword;    //用户密码

    @Field("USER_NAME")
    private String userName;        //用户姓名

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return this.userNum;
    }
}
