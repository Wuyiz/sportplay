package com.wuyiz.sportplay.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 2:56
 * @description: 主菜单实体类
 */
public class MainMenu {
    private Integer id;
    private String title;
    private String path;
    private List<SubMenu> subMenuList;

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", subMenuList=" + subMenuList +
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

    public List<SubMenu> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<SubMenu> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
