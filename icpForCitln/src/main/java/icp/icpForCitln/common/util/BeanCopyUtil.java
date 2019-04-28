/**
 * Project Name: icpForCitln
 * File Name: BeanCopyUtil
 * Package Name: icp.icpForCitln.common.util
 * Date: 2019/4/22 9:31
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.util;

import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.vo.PriceSaleProductVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanCopyUtil {

    private static final Logger logger = LoggerFactory.getLogger(BeanCopyUtil.class);

    static final Map<String, BeanCopier> BEAN_COPIERS = new HashMap<String, BeanCopier>();

    public static void main(String[] args) {
        PriceSaleProduct src = new PriceSaleProduct();
        src.setBasicUnit("件");
        src.setTaxIncludedPrice(new BigDecimal("12.8"));
        PriceSaleProductVO dest = BeanCopyUtil.copy(src, PriceSaleProductVO.class);
        System.out.println(dest.getBasicUnit() + dest.getTaxIncludedPrice());
    }

    /**
     * @author: Hujh
     * @date: 2019/4/22 10:46
     * @since: JDK 1.8
     *
     * @description: 对象值Copy
     * @param: [s, t]
     * @return: T
     */
    public static <S, T> T copy(S s, Class<T> t) {
        if (s == null || t == null) {
            return null;
        }
        try {
            T nt = t.newInstance();
            String key = genKey(s.getClass(), t.getClass());
            BeanCopier copier = null;
            if (!BEAN_COPIERS.containsKey(key)) {
                copier = BeanCopier.create(s.getClass(), nt.getClass(), false);
                BEAN_COPIERS.put(key, copier);
            } else {
                copier = BEAN_COPIERS.get(key);
            }
            copier.copy(s, nt, null);
            return nt;
        } catch (Exception e) {
            logger.error(GetPropertiesUtil.getPropertiesVal(
                    "message.properties","BeanCopyUtil.Bean.newInstance.Exception"), e.toString());
            return null;
        }
    }

    private static String genKey(Class<?> srcClazz, Class<?> destClazz) {
        return srcClazz.getName() + destClazz.getName();
    }


    /**
     * 对象拷贝操作
     * 反射机制，所以效率一般
     *
     * @param s 要拷贝的源对象
     * @param t 要拷贝的目标对象的类型
     * @return 返回目标对象
     */
    public static <S, T> T copyProperties(S s, Class<T> t) {
        if (s == null || t == null) {
            return null;
        }
        try {
            T nt = t.newInstance();
            BeanUtils.copyProperties(s, nt);
            return nt;
        } catch (InstantiationException e) {
            //TODO 异常信息
            logger.error(GetPropertiesUtil.getPropertiesVal(
                    "message.properties","BeanCopyUtil.Bean.newInstance.Exception"), e.toString());
            return null;
        } catch (IllegalAccessException e) {
            //TODO 异常信息
            logger.error(GetPropertiesUtil.getPropertiesVal(
                    "message.properties","BeanCopyUtil.Bean.UnauthorizedAccess.Exception"), e.toString());
            return null;
        } catch (Exception e) {
            //TODO 异常信息
            logger.error(GetPropertiesUtil.getPropertiesVal(
                    "message.properties","BeanCopyUtil.Bean.CopyBean.Exception"), new Object[]{s.getClass(), t, e.toString()});
            return null;
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/22 10:51
     * @since: JDK 1.8
     *
     * @description: 集合拷贝操作
     * @param: [s, t]
     * @return: java.util.List<T>
     */
    public static <S, T> List<T> copy(List<S> s, Class<T> t) {

        List<T> lnt = new ArrayList<T>();
        if (null == s) {
            return lnt;
        }
        for (S ss : s) {
            lnt.add(copyProperties(ss, t));
        }
        return lnt;
    }
}
