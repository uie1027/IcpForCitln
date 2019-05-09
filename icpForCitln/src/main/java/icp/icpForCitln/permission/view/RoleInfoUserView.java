/**
 * Project Name: icpForCitln
 * File Name: RoleInfoUserView
 * Package Name: icp.icpForCitln.permission.view
 * Date: 2019/5/9 10:22
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "ROLE_INFO_USER")        //角色列表视图
public class RoleInfoUserView {
    @Id
    private String id;  //ID

    @Field("IS_FORBIDDEN")
    private Integer isForbidden;    //是否禁用 1禁用2不禁用

    @Field("ROLE_NAME")
    private String roleName;  //角色名称

    @Field("ROLE_DESCRIPTION")
    private String roleDescription;  //角色描述

    @Field("LAST_MODIFIER_USER.USER_NAME")
    private String lastMondifier;   //最后更改人

    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  //最后更改时间
}
