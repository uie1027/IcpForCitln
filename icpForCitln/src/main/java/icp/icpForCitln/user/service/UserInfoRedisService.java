/**
 * Project Name: icpForCitln
 * File Name: UserInfoRedisService
 * Package Name: icp.icpForCitln.user.service
 * Date: 2019-04-17 上午 10:34
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.user.service;

import icp.icpForCitln.user.eneity.UserInfo;

public interface UserInfoRedisService {
    void put(UserInfo userInfo);    //Redis 存储用户信息
    UserInfo get(UserInfo userInfo);    //Redis 获取用户信息
    void delete(UserInfo userInfo);    //Redis 删除用户信息
}
