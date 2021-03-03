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
    public List<User> queryUserInfoList(String query, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        if (!query.trim().isEmpty()) {
            return userMapper.queryAllUserByCondition(query);
        }
        return userMapper.queryAllUser();
    }

    @Override
    public int updateUserState(Integer id, Boolean state) {
        return userMapper.updateUserState(id, state);
    }

    @Override
    public int saveUser(User user) {
        user.setRole("普通用户");
        user.setState(false);
        System.out.println(user);
        return userMapper.insertUser(user);
    }
}
