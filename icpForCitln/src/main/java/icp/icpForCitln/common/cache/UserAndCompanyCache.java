/**
 * Project Name: icpForCitln
 * File Name: getUserInfo
 * Package Name: icp.icpForCitln.common.cache
 * Date: 2019-04-17 上午 11:28
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.cache;

import icp.icpForCitln.IcpForCitlnApplication;
import icp.icpForCitln.common.enetity.UserAndCompanyInfo;
import icp.icpForCitln.common.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class UserAndCompanyCache {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 1:30
     * @since: JDK 1.8
     *
     * @description: Redis 存用户信息
     * @param: [userInfo]
     * @return: void
     */
    public static void put(UserAndCompanyInfo userAndCompanyInfo) {
        RedisUtil.put(userAndCompanyInfo);
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
    public static UserAndCompanyInfo get(String userNum){
        if(StringUtils.isEmpty(userNum)){
            logger.error("传入参数 userNum 为空，查询用户信息失败");
            return null;
        }

        UserAndCompanyInfo userAndCompanyInfo = new UserAndCompanyInfo();

        userAndCompanyInfo.setUserNum(userNum);

        UserAndCompanyInfo userAndCompanyInfoResult = (UserAndCompanyInfo) RedisUtil.get(userAndCompanyInfo);
        if(userAndCompanyInfoResult == null){
            logger.info("未查询到 " + userNum + " 用户信息");
            return null;
        } else {
            return userAndCompanyInfoResult;
        }
    }

    public static void delete(String userNum){
        if(StringUtils.isEmpty(userNum)){
            logger.error("传入参数 userNum 为空，删除缓存失败");
        }

        UserAndCompanyInfo userAndCompanyInfo = new UserAndCompanyInfo();

        userAndCompanyInfo.setUserNum(userNum);

        RedisUtil.delete(userAndCompanyInfo);
    }
}
