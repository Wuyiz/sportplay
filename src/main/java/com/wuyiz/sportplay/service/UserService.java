package com.wuyiz.sportplay.service;

import com.wuyiz.sportplay.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 17:04
 * @description: 用户功能业务层接口
 */
public interface UserService {

    /**
     * 登录模块，用于查询登录用户是否存在
     * @param user
     * @return
     */
    User queryUserExist(User user);

    /**
     * 查询所有用户信息列表,如果搜索条件存在，则进行条件查询
     * @param query
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<User> queryUserInfoList(String query, Integer pageNum, Integer pageSize);

    /**
     * 更新用户的状态信息
     * @param id
     * @param state
     * @return
     */
    int updateUserState(Integer id, Boolean state);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    int saveUser(User user);
}
