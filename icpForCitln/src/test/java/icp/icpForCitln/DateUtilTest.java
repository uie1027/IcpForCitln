/**
 * Project Name: icpForCitln
 * File Name: DateUtilTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-16 上午 11:44
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.common.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DateUtilTest {

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 3:55
     * @since: JDK 1.8
     *
     * @description: 字符串转日期测试
     * @param: []
     * @return: void
     */
    @Test
    public void stringToDateTest(){
        Date date = DateUtil.stringToDate("2019-10月.25", "yyyy-MM月.dd");
        System.out.println(date);
        Date date1 = DateUtil.stringToDate("2019-10月.25", "yyyy-MM月dd");
        System.out.println(date1);
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 4:03
     * @since: JDK 1.8
     *
     * @description: 时间格式化测试,返回字符串
     * @param: []
     * @return: void
     */
    @Test
    public void formatDateToStringTest(){
        System.out.println(DateUtil.formatDateToString(new Date(), "yyyy-MM-dd HH:mm:ss:SSS"));
        System.out.println(DateUtil.formatDateToString(new Date(), "sdadad fsfsafasf@#!$@#$"));
    }

    /**
     * @author: 方瑞冬
     * @date: 2019-04-16 下午 4:07
     * @since: JDK 1.8
     *
     * @description: 时间格式化测试，范湖 Date
     * @param: []
     * @return: void
     */
    @Test
    public void formatDateToDateTest(){
        System.out.println(DateUtil.formatDateToDate(new Date(), "yyyy-MM-dd HH:mm:ss:SSS"));
        System.out.println(DateUtil.formatDateToDate(new Date(), "sdadad fsfsafasf@#!$@#$"));
    }
}
