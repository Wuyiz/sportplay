package com.wuyiz.sportplay.entity;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-02 2:54
 * @description: 分支菜单栏实体类
 */
public class SubMenu {
    private Integer id;
    private String title;
    private String path;

    @Override
    public String toString() {
        return "SubMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
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
}
