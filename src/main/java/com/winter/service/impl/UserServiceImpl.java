package com.winter.service.impl;

import com.github.pagehelper.PageHelper;
import com.winter.constant.ResponseStatus;
import com.winter.exception.UserException;
import com.winter.mapper.UserMapper;
import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getById(Integer userId) throws UserException {
        User user = userMapper.selectByPrimaryKey(userId);
        Integer age = user.getAge();
        if (age == null) {
            throw new UserException(ResponseStatus.FAIL, "该用户不存在年龄");
        } else if (age < 18) {
            throw new UserException(ResponseStatus.FAIL, "年龄小于18周岁");
        }
        return user;
    }

    @Override
    public List<User> getAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getAllUser();
    }

    @Override
    @Transactional
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

}
