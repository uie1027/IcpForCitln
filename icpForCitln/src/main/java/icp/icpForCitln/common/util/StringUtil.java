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

    public static String toMongoDBField(String str) {
        if(isEmpty(str)) return null;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i= 0 ;i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                stringBuilder.append("_"+c);
            }else if(Character.isLowerCase(c)){
                stringBuilder.append(String.valueOf(c).toUpperCase());
            }
        }
        return stringBuilder.toString();
    }

    public static String toInitialUpperCase(String str) {
        if(isEmpty(str)) return null;
        if(str.length() ==1 ){
            return str.toUpperCase();
        }
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1,str.length());
    }


    /**
     * @author: Hujh
     * @date: 2019/5/6 15:41
     * @since: JDK 1.8
     *
     * @description: 将类名转成表名
     * @param: [className]
     * @return: java.lang.String
     */
    public static String ToTableName(String className) {
        if(isEmpty(className)) return null;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i= 0 ;i < className.length(); i++){
            char c = className.charAt(i);
            if(Character.isUpperCase(c) && i == 0 ) {
                stringBuilder.append(c);
            }else if(Character.isUpperCase(c)){
                stringBuilder.append("_"+c);
            }else if(Character.isLowerCase(c)){
                stringBuilder.append(String.valueOf(c).toUpperCase());
            }
        }
        return stringBuilder.toString();
    }

}
