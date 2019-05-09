/**
 * Project Name: icpForCitln
 * File Name: UserInfoVO
 * Package Name: icp.icpForCitln.user.vo
 * Date: 2019/5/8 14:40
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.user.vo;

import lombok.Data;

@Data
public class UserInfoVO {

    private Integer pageIndex;    //第几页

    private Integer pageSize;    //每页条数

    private String userCode;    //用户编码

    private String userNum;     //用户帐号

    private String userName;    //用户姓名



}
