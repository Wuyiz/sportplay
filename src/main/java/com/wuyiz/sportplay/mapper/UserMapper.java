package com.wuyiz.sportplay.mapper;

import com.wuyiz.sportplay.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 18:26
 * @description: 用户业务持久层
 */
public interface UserMapper {
    @Select("SELECT * FROM easyuser WHERE username=#{username} AND password=#{password} AND state=1")
    User queryUser(User user);

    @Select("SELECT * FROM easyuser limit #{startNum}, #{pageSize}")
    List<User> queryAllUserByPageNumSize(Integer startNum, Integer pageSize);

    @Select("SELECT * FROM easyuser")
    List<User> queryAllUser();
}
