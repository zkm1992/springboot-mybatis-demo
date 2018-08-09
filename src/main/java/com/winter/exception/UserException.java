package com.winter.exception;

import com.winter.constant.ResponseStatus;

/**
 * 统一异常处理
 */
public class UserException extends RuntimeException {

    private Integer code;

    public UserException(ResponseStatus responseStatus) {
        super(responseStatus.getStatusName());
        this.code = responseStatus.getStatusCode();
    }

    public UserException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public UserException(ResponseStatus responseStatus, String msg) {
        super(msg);
        this.code = responseStatus.getStatusCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
