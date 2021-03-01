package com.wuyiz.sportplay.service;

import com.wuyiz.sportplay.entity.User;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 17:04
 * @description: 用户功能业务层
 */
public interface UserService {

    User queryUserExist(User user);
}
