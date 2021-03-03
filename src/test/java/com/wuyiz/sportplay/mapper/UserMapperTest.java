package com.wuyiz.sportplay.mapper;

import com.wuyiz.sportplay.SportplayApplication;
import com.wuyiz.sportplay.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SportplayApplication.class)
class UserMapperTest {
    @Resource
    UserMapper userMapper;

    @Test
    void test1() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        System.out.println(userMapper.queryUser(user));
    }

    @Test
    void test2() {
        System.out.println(userMapper.queryAllUserByPageNumSize(2, 2));
    }

    @Test
    void updateUserState() {
        System.out.println(userMapper.updateUserState(1, true));
    }

    @Test
    void queryAllUserByCondition() {
        System.out.println(userMapper.queryAllUserByCondition("0"));
    }
}