package com.wuyiz.sportplay.mapper;

import com.wuyiz.sportplay.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * @author: suhai
 * @date: 2021-03-01 18:26
 * @description: 用户业务持久层
 */
public interface UserMapper {
    /**
     * 查询单个user是否存在
     * @param user
     * @return
     */
    @Select("SELECT * FROM easyuser WHERE username=#{username} AND password=#{password} AND state=1")
    User queryUser(User user);

    /**
     * 分页查询所有用户信息   [弃用，已使用pagehelp分页工具替代]
     * @param startNum
     * @param pageSize
     * @return
     */
    @Select("SELECT * FROM easyuser limit #{startNum}, #{pageSize}")
    List<User> queryAllUserByPageNumSize(Integer startNum, Integer pageSize);

    /**
     * 查询所有用户信息，配合pagehelper分页工具使用
     * @return
     */
    @Select("SELECT * FROM easyuser")
    List<User> queryAllUser();

    /**
     * 更新用户state字段信息
     * @param id
     * @param state
     * @return
     */
    @Update("update easyuser set state=#{state} where id=#{id}")
    int updateUserState(Integer id, Boolean state);

    /**
     * 根据搜索条件模糊查询符合条件的用户信息
     * @param query
     * @return
     */
    @Select("select * from easyuser where username like concat('%', #{query}, '%')")
    List<User> queryAllUserByCondition(String query);

    /**
     * 新增一条用户信息
     * @param user
     * @return
     */
    @Insert("insert into easyuser (username, password, email, role, state) " +
            "values(#{username}, #{password}, #{email}, #{role}, #{state})")
    int insertUser(User user);
}
