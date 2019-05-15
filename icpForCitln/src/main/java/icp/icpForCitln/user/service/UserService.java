package icp.icpForCitln.user.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.company.eneity.CompanyDepartmentInfo;
import icp.icpForCitln.permission.entity.RoleInfo;
import icp.icpForCitln.user.dto.UserInfoListFindByPageDTO;
import icp.icpForCitln.user.dto.UserInfoSaveDTO;
import icp.icpForCitln.user.eneity.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> UserInfoGetList();

    void userInfoSave(UserInfoSaveDTO userInfoSaveDTO);

    MongoResult userInfoListFindByPage(UserInfoListFindByPageDTO userInfoListFindByPageDTO);    //用户列表 带分页 带条件

    List<CompanyDepartmentInfo> departmentGetList();  //部门下拉
}
