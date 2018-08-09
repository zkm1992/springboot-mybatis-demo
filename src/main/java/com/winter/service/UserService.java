package com.winter.service;

import com.winter.exception.UserException;
import com.winter.model.User;

import java.util.List;

public interface UserService {

    /**
     * 通过userId获取用户信息
     *
     * @param userId
     * @return
     */
    User getById(Integer userId) throws UserException;

    /**
     * 分页查询所有用户
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<User> getAllUser(int pageNum, int pageSize);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

}
