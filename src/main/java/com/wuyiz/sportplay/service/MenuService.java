package com.wuyiz.sportplay.service;

import com.wuyiz.sportplay.entity.MainMenu;
import com.wuyiz.sportplay.entity.vo.MainMenuVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 4:07
 * @description: TODO
 */
public interface MenuService {
    List<MainMenu> getMenus();

    List<MainMenuVO> getMenusAndIcon();
}
