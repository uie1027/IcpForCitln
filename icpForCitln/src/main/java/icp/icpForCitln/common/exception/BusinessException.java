/**
 * Project Name: icpForCitln
 * File Name: BusinessException
 * Package Name: icp.icpForCitln.common.exception
 * Date: 2019/4/15 15:02
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.exception;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 5151669876695986575L;

    private Integer code = 200;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
