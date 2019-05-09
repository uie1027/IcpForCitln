package icp.icpForCitln.user.service;

import icp.icpForCitln.user.dto.UserInfoSaveDTO;
import icp.icpForCitln.user.eneity.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> UserInfoGetList();

    void userInfoSave(UserInfoSaveDTO userInfoSaveDTO);
}
