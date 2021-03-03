package com.wuyiz.sportplay.service.impl;

import com.github.pagehelper.PageInfo;
import com.wuyiz.sportplay.SportplayApplication;
import com.wuyiz.sportplay.entity.User;
import com.wuyiz.sportplay.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SportplayApplication.class)
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void queryUserInfoList() {
        System.out.println(userService.queryUserInfoList("0", 1, 2));
        PageInfo<List<User>> page = new PageInfo<>();
        System.out.println(page);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUsername("wuyiz");
        user.setPassword("woaini520");
        user.setEmail("wuyiz@foxmail.com");
        user.setRole("普通用户");
        user.setState(false);
        System.out.println(userService.saveUser(user));

    }
}