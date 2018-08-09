package com.winter.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.winter.model.User;

/**
 * Json工具类
 */
public class TransJsonUtil {

    private static JSONObject RESULT;

    /**
     * 对象转Json字符串
     *
     * @param obj
     * @param statusMsg
     * @return
     */
    public static String Obj2Json(Object obj, StatusMsg statusMsg) {
        RESULT = JSONObject.parseObject(JSON.toJSONString(statusMsg));
        RESULT.put("data", obj);
        return RESULT.toJSONString();
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUserId(123);
        user.setUserName("张三");
        user.setPassword("123456");
        user.setPhone("18852555545");
        System.out.println(Obj2Json(user, new StatusMsg()));
    }

}
