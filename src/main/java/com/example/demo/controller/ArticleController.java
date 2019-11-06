package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname ArticleController
 * @Description TODO
 * @Date 2019/9/1 20:09
 * @Created by gumei
 * @Author: lepua
 */
@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/article/callHello")
    public String callHello(){
        return restTemplate.getForObject("http://localhost:8081/user/hello",String.class);
    }

    @GetMapping("/article/callHello2")
    public String callHello2(){
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);
    }
}
