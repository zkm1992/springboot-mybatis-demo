package com.winter.controller;

import com.alibaba.fastjson.JSON;
import com.winter.model.User;
import com.winter.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${myName}")
    private String userName;

    @Resource
    private UserService userService;

    @GetMapping("/getById/{userId}")
    public User getById(@PathVariable Integer userId) {
        User user = userService.getById(userId);
        logger.info(user.toString());
        return user;
    }

    @GetMapping("/all/{pageNum}/{pageSize}")
    public List<User> getAllUser(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        List<User> allUser = userService.getAllUser(pageNum, pageSize);
        logger.info(JSON.toJSONString(allUser));
        return allUser;
    }

    @RequestMapping("/test")
    public String test() {
        return userName;
    }

}
