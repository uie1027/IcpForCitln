/**
 * Project Name: icpForCitln
 * File Name: UserInfoUser
 * Package Name: icp.icpForCitln.user.view
 * Date: 2019/5/9 16:25
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "USER_INFO_USER")
public class UserInfoUser {
    @Id
    private String id;  //主键

    @Field("IS_FORBIDDEN")
    private Integer isForbidden;    //是否禁用 1禁用2不禁用

    @Field("USER_NUM")
    private String userNum;     //用户帐号

    @Field("USER_NAME")
    private String userName;    //用户姓名

    @Field("USER_PHONE")
    private String userPhone;   //用户手机

    @Field("LAST_MODIFIER_USER.USER_NAME")
    private String lastMondifier;   //最后更改人

    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  //最后更改时间
}
