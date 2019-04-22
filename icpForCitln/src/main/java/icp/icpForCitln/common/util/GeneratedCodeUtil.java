/**
 * Project Name: icpForCitln
 * File Name: GeneratedCodeUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 2019-04-22 上午 10:17
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GeneratedCodeUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random random = new Random();

    /**
     * @author: 方瑞冬
     * @date: 2019-04-22 上午 10:26
     * @since: JDK 1.8
     *
     * @description: 自动生成编码 年月日时分秒 + 五位随机数
     * @param: []
     * @return: java.lang.String
     */
    public static String generatedCode(){
        int randomStr;
        String nowTime;

        try {
            randomStr = random.nextInt(89999) + 10000;
            nowTime = simpleDateFormat.format(new Date());
        } catch (Exception e){
            logger.error("自动生成编码出错！");
            return null;
        }

        return nowTime + randomStr;
    }
}
