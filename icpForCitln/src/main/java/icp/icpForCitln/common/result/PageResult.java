/**
 * Project Name: icpForCitln
 * File Name: PageResult
 * Package Name: icp.icpForCitln.common.result
 * Date: 2019/4/18 15:58
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.result;

import lombok.Data;

@Data
public class PageResult {
    public static final int SUCCESS_CODE = 200;
    public static final int ERROR_CODE = 404;

    private int code; //返回页面状态码
    private Object data;

    /**
     * @author: Hujh
     * @date: 2019/4/18 16:03
     * @since: JDK 1.8
     *
     * @description: 返回结果方法
     * @param: [code, result]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    public static PageResult returnResult(int code, Object result){
        PageResult commonResult = new PageResult();
        commonResult.setCode(code);
        commonResult.setData(result);
        return commonResult;
    }

}
