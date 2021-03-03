package com.wuyiz.sportplay.controller;

import com.github.pagehelper.PageInfo;
import com.wuyiz.sportplay.entity.User;
import com.wuyiz.sportplay.service.UserService;
import com.wuyiz.sportplay.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("login")
    public Result login(@RequestBody User user) {
        User res = userService.queryUserExist(user);
        if (res == null) {
            return Result.userLoginError();
        }
        return Result.success(res);
    }

    @GetMapping("list")
    public Result queryAllUserInfoList(
            @RequestParam String query,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "5") Integer pageSize
    ) {
        List<User> users = userService.queryUserInfoList(query, pageNum, pageSize);
        return Result.success(new PageInfo<>(users));
    }

    @PutMapping("state")
    public Result updateUserState(
            @RequestParam Integer id,
            @RequestParam Boolean state
    ) {
        int i = userService.updateUserState(id, state);
        if (i == 0) {
            return Result.failure();
        }
        return Result.success();
    }

    @PostMapping("save")
    public Result saveUser(@RequestBody User user) {
        int i = userService.saveUser(user);
        if (i == 0) {
            return Result.failure();
        }
        return Result.success();
    }
}
