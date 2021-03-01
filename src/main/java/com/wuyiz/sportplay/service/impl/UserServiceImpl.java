package com.wuyiz.sportplay.service.impl;

import com.wuyiz.sportplay.entity.User;
import com.wuyiz.sportplay.mapper.UserMapper;
import com.wuyiz.sportplay.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 18:23
 * @description: TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserExist(User user) {
        return userMapper.queryUser(user);
    }
}
