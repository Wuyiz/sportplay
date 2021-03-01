package com.wuyiz.sportplay.controller;

import com.wuyiz.sportplay.entity.User;
import com.wuyiz.sportplay.service.UserService;
import com.wuyiz.sportplay.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 16:45
 * @description: 用户登录
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("login")
    public Result login(@RequestBody User user) {
        User res = userService.queryUserExist(user);
        if (res == null) {
            return Result.userLoginError();
        }
        return Result.success(res);
    }
}
