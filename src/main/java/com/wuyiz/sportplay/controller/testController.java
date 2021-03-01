package com.wuyiz.sportplay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-02-28 18:51
 * @description: 控制层测试类
 */
@RestController
public class testController {

    @PostMapping("login")
    public String login() {
        return "ok";
    }

}
