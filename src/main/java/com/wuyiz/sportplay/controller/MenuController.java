package com.wuyiz.sportplay.controller;

import com.wuyiz.sportplay.entity.vo.MainMenuVO;
import com.wuyiz.sportplay.service.MenuService;
import com.wuyiz.sportplay.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 4:00
 * @description: TODO
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    @Resource
    private MenuService menuService;

    @GetMapping("get")
    public Result getMenus() {
        List<MainMenuVO> res = menuService.getMenusAndIcon();
        if (res == null) {
            return Result.failure();
        }
        return Result.success(res);
    }
}
