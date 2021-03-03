package com.wuyiz.sportplay.mapper;

import com.wuyiz.sportplay.entity.MainMenu;
import com.wuyiz.sportplay.entity.vo.MainMenuVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 3:11
 * @description: TODO
 */
public interface MenuMapper {

    /**
     * 获取菜单标题和其他信息 [弃用]
     * @return
     */
    List<MainMenu> getMenus();

    /**
     * 获取主菜单、子菜单以及各个菜单图标
     * @return
     */
    List<MainMenuVO> getMenusAndIcon();
}
