package com.winter.constant;

public enum ResponseStatus {

    SUCCESS(0, "成功"), FAIL(1, "失败"), SYSTEM_ERROR(2, "系统异常"), UNKNOWN_ERROR(-1, "未知错误");

    private Integer statusCode;
    private String statusName;

    ResponseStatus(Integer statusCode, String statusName) {
        this.statusName = statusName;
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public static void main(String[] args) {
        for (ResponseStatus responseStatus : ResponseStatus.values()) {
            System.out.println(responseStatus.getStatusCode() + "_" + responseStatus.getStatusName());
        }
    }

}
