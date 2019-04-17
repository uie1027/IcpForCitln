/**
 * Project Name: icpForCitln
 * File Name: StringUtil
 * Package Name: icp.icpForCitln.common
 * Date: 2019-04-11 下午 4:14
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.util;

public class StringUtil {

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isEmpty(Object  object) {
        return object == null || "".equals(object);
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

}
