/**
 * Project Name: icpForCitln
 * File Name: GetPropertiesUtil
 * Package Name: icp.icpForCitln.common
 * Date: 2019-04-11 下午 4:15
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.util;

import icp.icpForCitln.IcpForCitlnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

public class GetPropertiesUtil {
    private final static Logger logger = LoggerFactory.getLogger(IcpForCitlnApplication.class);

    /**
     * @author: 方瑞冬
     * @date: 2019-04-15 下午 4:32
     * @since: JDK 1.8
     *
     * @description: 获取properties中键对应的值
     * @param: [fileName, key]
     * @return: java.lang.String
     */
    public static String getPropertiesVal(String fileName, String key){
        ResourceBundle resourceBundle;
        String propertiesVal;

        try{
            resourceBundle = ResourceBundle.getBundle(fileName);
        } catch (Exception e){
            logger.error("找不到 " + fileName + ".properties 文件");
            return null;
        }
        try{
            propertiesVal = resourceBundle.getString(key);
        } catch (Exception e){
            logger.error(fileName + ".properties 文件中没有找到 " + key + " 对应的值");
            return null;
        }
        return propertiesVal;
    }
}
