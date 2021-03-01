package com.wuyiz.sportplay.mapper;

import com.wuyiz.sportplay.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 18:26
 * @description: TODO
 */
public interface UserMapper {
    @Select("SELECT * FROM easyuser WHERE username=#{username} AND password=#{password} AND state=1")
    User queryUser(User user);
}
