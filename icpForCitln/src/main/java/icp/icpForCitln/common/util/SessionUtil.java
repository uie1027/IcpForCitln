/**
 * Project Name: icpForCitln
 * File Name: SessionUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 2019-04-17 下午 2:59
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class SessionUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    private static SessionUtil sessionUtil;

    @Autowired
    private HttpServletRequest httpServletRequest;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 3:54
     * @since: JDK 1.8
     *
     * @description: 初始化 httpServletRequest
     * @param: []
     * @return: void
     */
    @PostConstruct
    public void init() {
        sessionUtil = this;
        sessionUtil.httpServletRequest = this.httpServletRequest;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 3:54
     * @since: JDK 1.8
     *
     * @description: session 存
     * @param: [key, value]
     * @return: void
     */
    public static void save(String key, String value){
        if(StringUtils.isEmpty(key)){
            logger.error("传入参数 key 为空，保存失败");
            return;
        }
        if(StringUtils.isEmpty(value)){
            logger.error("传入参数 value 为空，保存失败");
            return;
        }
        HttpSession session = sessionUtil.httpServletRequest.getSession();
        session.setAttribute(key, value);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-17 下午 3:55
     * @since: JDK 1.8
     *
     * @description: session 取
     * @param: [key]
     * @return: java.lang.String
     */
    public static String getByKey(String key){
        HttpSession session = sessionUtil.httpServletRequest.getSession();
        String value;

        SessionUtil.save("userNum", "testUser");

        try{
            value = session.getAttribute(key).toString();
        } catch (NullPointerException e){
            logger.info("session中找不到键名 " + key + " 对应的值");
            return null;
        }
        return value;
    }
}
