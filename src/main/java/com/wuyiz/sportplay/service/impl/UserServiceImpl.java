package com.wuyiz.sportplay.service.impl;

import com.github.pagehelper.PageHelper;
import com.wuyiz.sportplay.entity.User;
import com.wuyiz.sportplay.mapper.UserMapper;
import com.wuyiz.sportplay.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 18:23
 * @description: 用户服务层
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserExist(User user) {
        return userMapper.queryUser(user);
    }

    @Override
    public List<User> queryAllUserInfoList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.queryAllUser();
    }
}
