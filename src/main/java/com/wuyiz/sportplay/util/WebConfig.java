package com.wuyiz.sportplay.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: suhai
 * @create: 2021-02-25 17:33
 * @description: 全局配置类，配置跨域请求工具类
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * 1.访问路径
         * 2.请求来源
         * 3.方法
         * 3.允许携带信息，例如token
         * 5.响应时间
         */
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080", "null")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
