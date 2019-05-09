/**
 * Project Name: icpForCitln
 * File Name: UserInfoListFindByPageDTO
 * Package Name: icp.icpForCitln.user.dto
 * Date: 2019/5/9 16:39
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.dto;

import lombok.Data;

@Data
public class UserInfoListFindByPageDTO {
    private Integer pageIndex;      //页码

    private Integer pageSize;       //每页条数

    private String userName;    //用户姓名
}
