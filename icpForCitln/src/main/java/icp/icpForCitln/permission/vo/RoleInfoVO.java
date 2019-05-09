/**
 * Project Name: icpForCitln
 * File Name: RoleInfoVO
 * Package Name: icp.icpForCitln.permission.vo
 * Date: 2019/5/9 9:44
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.permission.vo;

import lombok.Data;

import java.util.List;

@Data
public class RoleInfoVO {   //角色列表返回
    private List<RoleInfoGetListVO> roleInfoGetListVOList;      //角色列表信息

    private Long count;      //总数
}
