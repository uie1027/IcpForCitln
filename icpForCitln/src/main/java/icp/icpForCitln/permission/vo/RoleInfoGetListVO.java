/**
 * Project Name: icpForCitln
 * File Name: RoleInfoGetListVO
 * Package Name: icp.icpForCitln.permission.vo
 * Date: 2019/5/9 9:33
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.vo;

import lombok.Data;

import java.util.Date;

@Data
public class RoleInfoGetListVO {       //角色列表返回信息
    private String id;  //主键

    private Integer isForbidden;    //是否禁用 1禁用2不禁用

    private String roleName;  //角色名称

    private String roleDescription;  //角色描述

    private String lastMondifier;   //最后更改人

    private Date lastModificationTime;  //最后更改时间
}
