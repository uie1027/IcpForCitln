/**
 * Project Name: icpForCitln
 * File Name: DateUtil
 * Package Name: icp.icpForCitln.common
 * Date: 2019-04-11 下午 4:15
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 3:46
     * @since: JDK 1.8
     *
     * @description: 字符串时间转 Date 时间，需要传入对应的时间模版
     * @param: [dateStr, pattern]
     * @return: java.util.Date
     */
    public static Date stringToDate(String dateStr, String pattern){
        Date date;
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            date = simpleDateFormat.parse(dateStr);
        } catch (Exception e){
            date = null;
            logger.error("字符串转时间出错，请检查时间：" + dateStr + " 与模版：" + pattern + " 是否对应");
        }
        return date;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 3:48
     * @since: JDK 1.8
     *
     * @description: 格式化时间，返回字符串
     * @param: [date, pattern]
     * @return: java.lang.String
     */
    public static String formatDateToString(Date date, String pattern){
        String dateStr;
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            dateStr = simpleDateFormat.format(date);
        } catch (Exception e){
            dateStr = null;
            logger.error("时间格式化出错，请检查传入参数是否规范");
        }
        return dateStr;
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 3:49
     * @since: JDK 1.8
     *
     * @description: 格式化时间，返回 Date
     * @param: [date, pattern]
     * @return: java.util.Date
     */
    public static Date formatDateToDate(Date date, String pattern){
        String dateStr = DateUtil.formatDateToString(date, pattern);
        if(dateStr == null){
            return null;
        }
        return DateUtil.stringToDate(dateStr, pattern);
    }

}
