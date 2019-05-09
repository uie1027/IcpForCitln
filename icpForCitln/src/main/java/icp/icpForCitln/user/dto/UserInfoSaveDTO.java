/**
 * Project Name: icpForCitln
 * File Name: UserInfoSaveDTO
 * Package Name: icp.icpForCitln.user.dto
 * Date: 2019/5/8 15:25
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.user.dto;

import icp.icpForCitln.user.eneity.UserCompanyDepartmentRole;
import lombok.Data;

import java.util.List;

@Data
public class UserInfoSaveDTO {
    private String userNum;     //用户帐号

    private String userName;    //用户姓名

    private String userPhone;   //用户手机

    private String userEmail;   //用户邮箱

    private List<UserCompanyDepartmentRole> userCompanyDepartmentRoleList;   //用户角色



}
