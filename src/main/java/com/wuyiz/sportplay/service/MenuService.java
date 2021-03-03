package com.wuyiz.sportplay.service;

import com.wuyiz.sportplay.entity.MainMenu;
import com.wuyiz.sportplay.entity.vo.MainMenuVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 4:07
 * @description: 菜单服务层接口
 */
public interface MenuService {
    /**
     * 获取菜单信息
     * @return
     */
    List<MainMenu> getMenus();

    /**
     * 获取菜单信息并加载图标
     * @return
     */
    List<MainMenuVO> getMenusAndIcon();
}
