package com.wuyiz.sportplay.entity.vo;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 16:15
 * @description: 增加了主菜单标题图标的传输实体类
 */
public class MainMenuVO {
    private Integer id;
    private String title;
    private String path;
    private String icon;
    private List<SubMenuVO> subMenuVOS;

    @Override
    public String toString() {
        return "MainMenuVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", icon='" + icon + '\'' +
                ", subMenuVOS=" + subMenuVOS +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<SubMenuVO> getSubMenuVOS() {
        return subMenuVOS;
    }

    public void setSubMenuVOS(List<SubMenuVO> subMenuVOS) {
        this.subMenuVOS = subMenuVOS;
    }
}
