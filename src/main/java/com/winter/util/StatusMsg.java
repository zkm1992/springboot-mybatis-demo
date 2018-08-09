package com.winter.util;

import com.winter.constant.ResponseStatus;

/**
 * 全局状态响应消息实体
 */
public class StatusMsg {

    //状态码
    private int status;
    //返回信息
    private String msg;

    public StatusMsg() {
        this.status = ResponseStatus.SUCCESS.getStatusCode();
        this.msg = "";
    }

    public StatusMsg(ResponseStatus responseStatus) {
        this.status = responseStatus.getStatusCode();
        this.msg = responseStatus.getStatusName();
    }

    public StatusMsg(ResponseStatus responseStatus, String msg) {
        this.status = responseStatus.getStatusCode();
        this.msg = msg;
    }

    public StatusMsg(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
