package com.example.demo;

import com.example.demo.configuration.FeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.example.demo.api.client",defaultConfiguration = FeignConfiguration.class)
public class EurekaClientArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientArticleServiceApplication.class, args);
    }

}
