package com.wuyiz.sportplay.service.impl;

import com.wuyiz.sportplay.entity.MainMenu;
import com.wuyiz.sportplay.entity.vo.MainMenuVO;
import com.wuyiz.sportplay.mapper.MenuMapper;
import com.wuyiz.sportplay.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 4:07
 * @description: TODO
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<MainMenu> getMenus() {
        return menuMapper.getMenus();
    }

    @Override
    public List<MainMenuVO> getMenusAndIcon() {
        return menuMapper.getMenusAndIcon();
    }
}
