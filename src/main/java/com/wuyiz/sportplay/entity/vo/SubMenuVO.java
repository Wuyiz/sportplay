package com.wuyiz.sportplay.entity.vo;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 16:16
 * @description: 增加了子菜单标题图标的传输实体类
 */
public class SubMenuVO {
    private Integer id;
    private String title;
    private String path;
    private String subIcon;

    @Override
    public String toString() {
        return "SubMenuVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", subIcon='" + subIcon + '\'' +
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

    public String getSubIcon() {
        return subIcon;
    }

    public void setSubIcon(String subIcon) {
        this.subIcon = subIcon;
    }
}
