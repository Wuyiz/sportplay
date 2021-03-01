package com.wuyiz.sportplay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.wuyiz.sportplay.mapper")
public class SportplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportplayApplication.class, args);
    }

}
