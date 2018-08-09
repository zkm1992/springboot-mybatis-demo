package com.winter.model;

import com.alibaba.fastjson.JSON;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {

    private Integer userId;

    @NotNull(message = "用户名不能为空")
    private String userName;

    private String password;

    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "未成年人禁止入内")
    private Integer age;

    private String cupSize;

    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize == null ? null : cupSize.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}