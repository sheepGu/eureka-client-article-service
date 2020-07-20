package com.example.demo.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname FeignConfiguration
 * @Description 配置feign的日志等级，
 * @Date 2020/5/31 1:34
 * @Created by gumei
 * @Author: lepua
 */
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
