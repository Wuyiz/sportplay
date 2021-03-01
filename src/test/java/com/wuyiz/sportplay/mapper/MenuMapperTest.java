package com.wuyiz.sportplay.mapper;

import com.wuyiz.sportplay.SportplayApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SportplayApplication.class)
class MenuMapperTest {
    @Resource
    MenuMapper menuMapper;

    @Test
    void test1() {
        System.out.println(menuMapper.getMenus());
    }
}