/**
 * Project Name: icpForCitln
 * File Name: getUserInfo
 * Package Name: icp.icpForCitln.common.cache
 * Date: 2019-04-17 上午 11:28
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.cache;

import icp.icpForCitln.IcpForCitlnApplication;
import icp.icpForCitln.common.util.RedisCommonUtil;
import icp.icpForCitln.user.eneity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class UserInfoCache {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    private static UserInfoCache userInfoCache;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 1:30
     * @since: JDK 1.8
     *
     * @description: Redis 存用户信息
     * @param: [userInfo]
     * @return: void
     */
    public static void put(UserInfo userInfo) {
        RedisCommonUtil.put(userInfo);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 1:51
     * @since: JDK 1.8
     *
     * @description: Redis 取用户信息
     * @param: [userNum]
     * @return: icp.icpForCitln.user.eneity.UserInfo
     */
    public static UserInfo get(String userNum){
        if(StringUtils.isEmpty(userNum)){
            logger.error("传入参数 userNum 为空，查询用户信息失败");
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setUserNum(userNum);

        UserInfo userInfoResult = (UserInfo) RedisCommonUtil.get(userInfo);
        if(userInfoResult == null){
            logger.info("未查询到 " + userNum + " 用户信息");
            return null;
        } else {
            return userInfoResult;
        }
    }

    public static void delete(String userNum){
        if(StringUtils.isEmpty(userNum)){
            logger.error("传入参数 userNum 为空，删除缓存失败");
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setUserNum(userNum);

        RedisCommonUtil.delete(userInfo);
    }
}
