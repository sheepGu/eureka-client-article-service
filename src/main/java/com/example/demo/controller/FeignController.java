package com.example.demo.controller;

import com.example.demo.api.client.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname FeignController
 * @Description TODO
 * @Date 2020/5/31 1:28
 * @Created by gumei
 * @Author: lepua
 */
@Controller
public class FeignController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callHello")
    @ResponseBody
    public String callHello(){
        String result=userRemoteClient.hello();
        System.out.println("执行结果是："+result);
        return result;
    }

}
